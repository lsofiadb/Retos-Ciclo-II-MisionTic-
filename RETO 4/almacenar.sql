CREATE TABLE almacenar(
	idAlmacenar integer AUTO_INCREMENT,
    alm_idSuministro integer,
    alm_idBodega integer,
    PRIMARY KEY (idAlmacenar),
    FOREIGN KEY (alm_idSuministro) REFERENCES suministro(idSuministro),
    FOREIGN KEY (alm_idBodega) REFERENCES bodega(idBodega)
);