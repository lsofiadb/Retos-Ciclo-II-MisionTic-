CREATE TABLE suministro(
	idSuministro integer AUTO_INCREMENT,
    nombre varchar(30),
    precio integer,
    sum_idCategoria integer not null,
    PRIMARY KEY (idSuministro),
    FOREIGN KEY(sum_idCategoria) REFERENCES categoria(idCategoria)
);

INSERT INTO suministro(nombre,precio,sum_idCategoria) VALUES ("Balón Golty profesional",85000,3);
INSERT INTO suministro(nombre,precio,sum_idCategoria) VALUES ("Borradores x 12 und",12200,4);
INSERT INTO suministro(nombre,precio,sum_idCategoria) VALUES ("Cubrelecho King",130000,1);
INSERT INTO suministro(nombre,precio,sum_idCategoria) VALUES ("impresora",550300,2);
INSERT INTO suministro(nombre,precio,sum_idCategoria) VALUES ("Lampara",90000,1);
INSERT INTO suministro(nombre,precio,sum_idCategoria) VALUES ("Marcador colores x 12 und",18700,4);