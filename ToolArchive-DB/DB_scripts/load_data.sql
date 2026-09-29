INSERT INTO programming_languages(id, name, release_year, compiler, typing, desc, developer)
VALUES
    (gen_random_uuid(), 'C', 1972, 'Compiled', 'Statically typed', 'C is super cool', 'Dennis Ritchie' ),
    (gen_random_uuid(), 'Java', 1995, 'Compiled', 'Statically typed','Java is super cool', 'Oracle'),
    (gen_random_uuid(), 'C#', 2000, 'Compiled', 'Statically typed', 'C# is super cool', 'Microsoft'),
    (gen_random_uuid(), 'Python', 1991, 'Interpreted', 'Dynamically typed', 'Python is super cool', 'Python Software Foundation'),
    (gen_random_uuid(), 'JavaScript', 1995, 'Compiled', 'Dynamically typed', 'JS is super cool', 'Brendan Eich' );


INSERT INTO frameworks (id, name, release_year, usage, desc, developer, based_on)
VALUES
    (gen_random_uuid(), '.NET', 2016, 'Web Development', '.NET is super cool', '.NET Foundation', 3),
    (gen_random_uuid(), 'React', 2013, 'Frontend Development', 'A popular UI library for web and mobile', 'Meta', 5),
    (gen_random_uuid(), 'Django', 2005, 'Web Development', 'High-level Python web framework', 'Django Software Foundation', 4),
    (gen_random_uuid(), 'Spring Boot', 2014, 'Backend Development', 'Java-based framework for microservices', 'VMware', 2),
    (gen_random_uuid(), 'Express', 2010, 'Web Development', 'Fast, unopinionated web framework for Node.js', 'TJ Holowaychuk', 5)
