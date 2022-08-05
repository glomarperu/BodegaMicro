package com.idat.bodega.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bodega")
public class Bodega {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idBodega;
	private String bodega;
	public Integer getIdBodega() {
		return idBodega;
	}
	public void setIdBodega(Integer idBodega) {
		this.idBodega = idBodega;
	}
	public String getBodega() {
		return bodega;
	}
	public void setBodega(String bodega) {
		this.bodega = bodega;
	}
		
	

}
