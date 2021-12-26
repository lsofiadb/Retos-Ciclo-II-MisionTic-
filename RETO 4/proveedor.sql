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