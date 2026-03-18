
create table cursos(
id serial PRIMARY KEY,
nome varchar(200) unique not null,
preco integer not null,
criado_em timestamp not null

INSERT INTO cursos(nome, preco, criado_em)
VALUES ('Descomplicando Java e Spring', 800, current_timestamp);

SELECT * FROM cursos

SELECT * FROM cursos where criado_em = timestamp '2026-03-18'

UPDATE cursos SET nome = 'curso de Javascript', preco = 0 where id = 2

DELECT FROM cursos WHERE nome = 'Curso de Javascript'
