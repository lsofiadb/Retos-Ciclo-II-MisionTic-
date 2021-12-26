CREATE TABLE categoria(
	idCategoria integer AUTO_INCREMENT,
    nombre varchar(12) not null,
    PRIMARY KEY(idCategoria)
);

INSERT INTO categoria (nombre) VALUES ("Hogar");
INSERT INTO categoria (nombre) VALUES ("Oficina");
INSERT INTO categoria (nombre) VALUES ("Juguetería");
INSERT INTO categoria (nombre) VALUES ("Papelería");