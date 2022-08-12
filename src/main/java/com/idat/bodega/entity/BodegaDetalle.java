package com.idat.bodega.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="detalle_bodega")
public class BodegaDetalle {
	
	@EmbeddedId
	private ProductoFK fk = new ProductoFK();

	public ProductoFK getFk() {
		return fk;
	}

	public void setFk(ProductoFK fk) {
		this.fk = fk;
	}	

}
