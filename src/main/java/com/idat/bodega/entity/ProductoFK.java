package com.idat.bodega.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ProductoFK implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4417214286334278899L;
	
	@Column(name="id_producto", nullable = false, unique = true)
	private Integer idProducto;
	
	@Column(name = "id_bodega", nullable = false,  unique = true)
	private Integer idBodega;
	
	
	public Integer getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}
	public Integer getIdBodega() {
		return idBodega;
	}
	public void setIdBodega(Integer idBodega) {
		this.idBodega = idBodega;
	}
	
	
	
	

}
