package com.seguimiento.sus.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seguimiento.sus.modelo.Seguimiento;

public interface SeguimientoRepositorio extends JpaRepository<Seguimiento, Integer>{

}
