

INSERT INTO autor ( lastname_author, name_author) VALUES ( 'Vargas Llosa', 'Mario');
INSERT INTO autor ( lastname_author, name_author) VALUES ( 'Borges', 'Jorge Luis');
INSERT INTO autor ( lastname_author, name_author) VALUES ( 'Rulfo', 'Juan');
INSERT INTO autor ( lastname_author, name_author) VALUES ( 'Vallejo', 'Cesar');
INSERT INTO autor ( lastname_author, name_author) VALUES ( 'Palma', 'Ricardo');

INSERT INTO book ( date_of_admission_book, edition_book, foto, language_book, name_book, serie_book, id_author) VALUES ( '1878-01-01', 2, '1cc8f898-77d9-4441-acfc-883976001046_ferrari2.jpg', 'Español', 'La ciudad y los perros', 2, 1);
INSERT INTO book ( date_of_admission_book, edition_book, foto, language_book, name_book, serie_book, id_author) VALUES ( '1987-01-01', 2, '1ec97c0a-9bc9-435b-9b0e-91044cb0b45e_ferrari.jpg', 'Español', 'El Aleph', 2, 2);
INSERT INTO book ( date_of_admission_book, edition_book, foto, language_book, name_book, serie_book, id_author) VALUES ( '1997-01-01', 2, 'ba754c39-7a7e-4a1d-975d-bfaba7e0a0ad_paramo.jpg', 'Español', 'Pedro paramo', 1, 3);

INSERT INTO role (name_role)	VALUES ('ROLE_ADMIN');
INSERT INTO role (name_role)	VALUES ('ROLE_ASISTENTE');
INSERT INTO role (name_role)	VALUES ('ROLE_CLIENTE');

INSERT INTO account ( correo_account, dni_account, last_name_account, name_account, password_account, id_role)
           VALUES ('admin@gmail.com', 12345678, 'Del Sistema', 'Admin','$2a$10$Ml1yMr8NB9/v99OSnOx2Guz93rGEIhUDVT73etTZhsIMrIw0aJlo2' , 1);
INSERT INTO account ( correo_account, dni_account, last_name_account, name_account, password_account, id_role)
           VALUES ('web@gmail.com', 98765432, 'Del Sistema', 'Estudiante','$2a$10$2wTzbbs2VCM6LRQ7e2gnb.HW/rBAmO391DGnEgd.f9O/pJTQD60g2' , 3);
           






