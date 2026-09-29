DROP TYPE IF EXISTS usage;
CREATE TYPE usage AS ENUM (
    'Web Development',
    'Embedded Development',
    'Machine Learning'
);

DROP TYPE IF EXISTS compiler;
CREATE TYPE compiler AS ENUM (
    'Compiled',
    'Interpreted'
);

DROP TYPE IF EXISTS typing;
CREATE TYPE typing AS ENUM (
    'Statically typed',
    'Dynamically typed'
);

DROP TABLE IF EXISTS programming_languages;
DROP TABLE IF EXISTS frameworks;

CREATE TABLE programming_languages (
    id UUID PRIMARY KEY,
    name VARCHAR NOT NULL,
    release_year SMALLINT,
    compiler compiler,
    typing typing,
    desc VARCHAR NOT NULL,
    developer VARCHAR NOT NULL
);


CREATE TABLE frameworks (
    id UUID PRIMARY KEY,
    name VARCHAR NOT NULL,
    release_year SMALLINT,
    usage usage,
    desc VARCHAR NOT NULL,
    developer VARCHAR NOT NULL,
    based_on INT,
    CONSTRAINT fk_frameworks_languages FOREIGN KEY (based_on) REFERENCES programming_languages(id)
);

CREATE EXTENSION IF NOT EXISTS "pgcrypto";
);