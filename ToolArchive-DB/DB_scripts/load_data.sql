INSERT INTO programming_languages(id, name, release_year, compiler, typing, desc, developer)
VALUES
    (1, 'C', 1972, 'Compiled', 'Statically typed', 'C is super cool', 'Dennis Ritchie' ),
    (2, 'Java', 1995, 'Compiled', 'Statically typed','Java is super cool', 'Oracle'),
    (3, 'C#', 2000, 'Compiled', 'Statically typed', 'C# is super cool', 'Microsoft'),
    (4, 'Python', 1991, 'Interpreted', 'Dynamically typed', 'Python is super cool', 'Python Software Foundation'),
    (5, 'JavaScript', 1995, 'Compiled', 'Dynamically typed', 'JS is super cool', 'Brendan Eich' );


INSERT INTO frameworks (id, name, release_year, usage, desc, developer, based_on)
VALUES
    (1, '.NET', 2016, 'Web Development', '.NET is super cool', '.NET Foundation', 3),
    (2, 'React', 2013, 'Frontend Development', 'A popular UI library for web and mobile', 'Meta', 5),
    (3, 'Django', 2005, 'Web Development', 'High-level Python web framework', 'Django Software Foundation', 4),
    (4, 'Spring Boot', 2014, 'Backend Development', 'Java-based framework for microservices', 'VMware', 2),
    (5, 'Express', 2010, 'Web Development', 'Fast, unopinionated web framework for Node.js', 'TJ Holowaychuk', 5)
