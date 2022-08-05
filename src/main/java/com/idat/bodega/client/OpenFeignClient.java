package com.idat.bodega.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.idat.bodega.dto.ProductoDTO;

@FeignClient(name = "idat-producto", url = "localhost:8080")
public interface OpenFeignClient {
	
	@GetMapping("/api/v1/producto/listar")
	public List<ProductoDTO> listadoProductosSelec();

}
