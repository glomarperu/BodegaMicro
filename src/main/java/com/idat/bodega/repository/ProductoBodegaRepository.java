package com.idat.bodega.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.bodega.entity.BodegaDetalle;

@Repository
public interface ProductoBodegaRepository extends JpaRepository<BodegaDetalle, Integer>{

}
