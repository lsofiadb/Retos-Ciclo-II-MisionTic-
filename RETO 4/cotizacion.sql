CREATE TABLE cotizacion(
	idCotizacion integer AUTO_INCREMENT,
    cot_idSuministro integer,
    cot_idProveedor integer,
    fecha date not null,
    PRIMARY KEY (idCotizacion),
    FOREIGN KEY (cot_idSuministro) REFERENCES suministro(idSuministro),
    FOREIGN KEY (cot_idProveedor) REFERENCES proveedor(idProveedor)
);