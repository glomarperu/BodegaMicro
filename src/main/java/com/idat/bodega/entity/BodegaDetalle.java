package com.idat.bodega.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="detalle_bodega")
public class BodegaDetalle {
	
	@Id
	private ProductoFK fk = new ProductoFK();
	
	public ProductoFK getFk() {
		return fk;
	}

	public void setFk(ProductoFK fk2) {
		// TODO Auto-generated method stub
		
	}	

}
