package com.idat.bodega.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.bodega.entity.BodegaDetalle;

public interface ProductoBodegaRepository extends JpaRepository<BodegaDetalle, Integer>{

}
