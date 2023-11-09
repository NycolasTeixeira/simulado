CREATE TABLE gerente
(
    UUID integer NOT NULL,
    name VARCHAR 100,
    email VARCHAR UNIQUE 100,
    senha VARCHAR 100
)