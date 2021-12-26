CREATE TABLE bodega(
	idBodega integer AUTO_INCREMENT,
    nombre VARCHAR(30),
    cantidadPisos integer,
    PRIMARY KEY(idBodega)
);

INSERT INTO bodega (nombre,cantidadPisos) VALUES ("Bodega norte",1);
INSERT INTO bodega (nombre,cantidadPisos) VALUES ("Bodega timiza",4);
INSERT INTO bodega (nombre,cantidadPisos) VALUES ("Zona Industrial",2);
INSERT INTO bodega (nombre,cantidadPisos) VALUES ("Zona franca",6);