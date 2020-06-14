

INSERT INTO autor ( lastname_author, name_author) VALUES ( 'Vargas Llosa', 'Mario');
INSERT INTO autor ( lastname_author, name_author) VALUES ( 'Borges', 'Jorge Luis');
INSERT INTO autor ( lastname_author, name_author) VALUES ( 'Rulfo', 'Juan');
INSERT INTO autor ( lastname_author, name_author) VALUES ( 'Vallejo', 'Cesar');
INSERT INTO autor ( lastname_author, name_author) VALUES ( 'Palma', 'Ricardo');

INSERT INTO book ( date_of_admission_book, edition_book, language_book, name_book, serie_book, id_author) VALUES ( '1878-01-01', 2, 'Español', 'La ciudad y los perros', 2, 1);
INSERT INTO book ( date_of_admission_book, edition_book, language_book, name_book, serie_book, id_author) VALUES ( '1987-01-01', 2, 'Español', 'El Aleph', 2, 2);
INSERT INTO book ( date_of_admission_book, edition_book, language_book, name_book, serie_book, id_author) VALUES ( '1997-01-01', 2, 'Español', 'Pedro paramo', 1, 3);

INSERT INTO role (name_role)	VALUES ('ROLE_ADMIN');
INSERT INTO role (name_role)	VALUES ('ROLE_ASISTENTE');
INSERT INTO role (name_role)	VALUES ('ROLE_CLIENTE');

INSERT INTO account ( correo_account, dni_account, last_name_account, name_account, password_account, id_role)
           VALUES ('admin@gmail.com', 12345678, 'Del Sistema', 'Admin','$2a$10$Ml1yMr8NB9/v99OSnOx2Guz93rGEIhUDVT73etTZhsIMrIw0aJlo2' , 1);






