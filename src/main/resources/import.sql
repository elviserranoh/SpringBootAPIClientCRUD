INSERT INTO regiones(id, nombre) VALUES(1, "America");
INSERT INTO regiones(id, nombre) VALUES(2, "Oceania");
INSERT INTO regiones(id, nombre) VALUES(3, "Africa");
INSERT INTO regiones(id, nombre) VALUES(4, "Asia");
INSERT INTO regiones(id, nombre) VALUES(5, "Europa");

INSERT INTO clientes(region_id, nombre, apellido, email, create_at) VALUES(1,"Elvis", "Serrano", "elvis@gmail.com", "2020-08-02");
INSERT INTO clientes(region_id, nombre, apellido, email, create_at) VALUES(5,"Eduardo", "Sanchez", "eduardo@gmail.com", "2020-08-03");
INSERT INTO clientes(region_id, nombre, apellido, email, create_at) VALUES(3,"Luisana", "Maza", "luisana@gmail.com", "2020-08-04");
INSERT INTO clientes(region_id, nombre, apellido, email, create_at) VALUES(3,"Jose", "Hernandez", "jose@gmail.com", "2020-08-05");
INSERT INTO clientes(region_id, nombre, apellido, email, create_at) VALUES(1,"Cleopatra", "Romana", "cleopatra@gmail.com", "2020-08-06");

INSERT INTO usuarios(username, password, enabled, nombre, apellido, email) VALUES('elvis', '$2a$10$bOwnwmIaN6wfyyFsEoIcRu5qZstLRkJ0.3c6UdyDl/4jZylaBhp.i', 1, 'elvis', 'serrano', 'elvis@gmail.com');
INSERT INTO usuarios(username, password, enabled, nombre, apellido, email) VALUES('admin', '$2a$10$vQyk6qyQFQPR3h1WZaPhIeH7enNN.WJySIExskZTzALxNyjzr4tHe', 1, 'admin', 'hernandez', 'admin@gmail.com');

INSERT INTO roles(nombre) VALUES('ROLE_USER');
INSERT INTO roles(nombre) VALUES('ROLE_ADMIN');

INSERT INTO usuarios_roles(usuario_id, role_id)  VALUES(1,1);
INSERT INTO usuarios_roles(usuario_id, role_id)  VALUES(2,1);
INSERT INTO usuarios_roles(usuario_id, role_id)  VALUES(2,2);