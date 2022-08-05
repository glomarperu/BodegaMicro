package com.idat.bodega.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.bodega.client.OpenFeignClient;
import com.idat.bodega.dto.ProductoDTO;
import com.idat.bodega.entity.ProductoFK;
import com.idat.bodega.entity.Bodega;
import com.idat.bodega.entity.BodegaDetalle;
import com.idat.bodega.repository.ProductoBodegaRepository;
import com.idat.bodega.repository.BodegaRepository;

@Service
public class BodegaServiceImpl implements BodegaService {

	@Autowired
	private BodegaRepository repositoryAula;
	
	@Autowired
	private ProductoBodegaRepository repositoryAlumnoAula;
	
	@Autowired
	private OpenFeignClient feign;
	
	
	@Override
	public void guardarBodega(Bodega bodega) {
		repositoryAula.save(bodega);
	}
	
	@Override
	public void asignarProductos() {
	
		List<ProductoDTO> listado = feign.listadoAlumnosSeleccionados();
		BodegaDetalle detalle = new BodegaDetalle();
		ProductoFK fk = new ProductoFK();
		
		for(ProductoDTO productoDTO : listado) {
			fk = new ProductoFK();
			fk.setIdProducto(productoDTO.getIdProducto());
			fk.setIdBodega(1);
			
			detalle.setFk(fk);
			repositoryAlumnoAula.save(detalle);
		}
		
	}
	
	
}
