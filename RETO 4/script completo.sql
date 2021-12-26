CREATE database rigotiendas;
use rigotiendas;

CREATE TABLE categoria(
	idCategoria integer AUTO_INCREMENT,
    nombre varchar(12),
    PRIMARY KEY(idCategoria)
);

INSERT INTO categoria (nombre) VALUES ("Hogar");
INSERT INTO categoria (nombre) VALUES ("Oficina");
INSERT INTO categoria (nombre) VALUES ("Juguetería");
INSERT INTO categoria (nombre) VALUES ("Papelería");

SELECT * FROM categoria;

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

SELECT * FROM bodega;

CREATE TABLE proveedor(
	idProveedor integer AUTO_INCREMENT,
    nombre varchar(30),
    esActivo varchar(2),
    PRIMARY KEY(idProveedor)
);

INSERT INTO proveedor(nombre, esActivo) VALUES ("Juguetes Marcopolo","si");
INSERT INTO proveedor(nombre, esActivo) VALUES ("Panamericana","si");
INSERT INTO proveedor(nombre, esActivo) VALUES ("Electrocentro","no");
INSERT INTO proveedor(nombre, esActivo) VALUES ("Toy mercas","si");
INSERT INTO proveedor(nombre, esActivo) VALUES ("Distribuidora Golden","si");
INSERT INTO proveedor(nombre, esActivo) VALUES ("Compra hogar","si");

SELECT * FROM proveedor;

CREATE TABLE suministro(
	idSuministro integer AUTO_INCREMENT,
    nombre varchar(30),
    precio integer,
    sum_idCategoria integer,
    PRIMARY KEY (idSuministro),
    FOREIGN KEY(sum_idCategoria) REFERENCES categoria(idCategoria)
);

INSERT INTO suministro(nombre,precio,sum_idCategoria) VALUES ("Balón Golty profesional",85000,3);
INSERT INTO suministro(nombre,precio,sum_idCategoria) VALUES ("Borradores x 12 und",12200,4);
INSERT INTO suministro(nombre,precio,sum_idCategoria) VALUES ("Cubrelecho King",130000,1);
INSERT INTO suministro(nombre,precio,sum_idCategoria) VALUES ("impresora",550300,2);
INSERT INTO suministro(nombre,precio,sum_idCategoria) VALUES ("Lampara",90000,1);
INSERT INTO suministro(nombre,precio,sum_idCategoria) VALUES ("Marcador colores x 12 und",18700,4);

SELECT * FROM suministro;

CREATE TABLE cotizacion(
	idCotizacion integer AUTO_INCREMENT,
    cot_idSuministro integer,
    cot_idProveedor integer,
    fecha date,
    PRIMARY KEY (idCotizacion),
    FOREIGN KEY (cot_idSuministro) REFERENCES suministro(idSuministro),
    FOREIGN KEY (cot_idProveedor) REFERENCES proveedor(idProveedor)
);

INSERT INTO cotizacion(cot_idSuministro,cot_idProveedor,fecha) VALUES();

CREATE TABLE almacenar(
	idAlmacenar integer AUTO_INCREMENT,
    alm_idSuministro integer,
    alm_idBodega integer,
    PRIMARY KEY (idAlmacenar),
    FOREIGN KEY (alm_idSuministro) REFERENCES suministro(idSuministro),
    FOREIGN KEY (alm_idBodega) REFERENCES bodega(idBodega)
);


