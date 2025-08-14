package com.project.CarControl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.CarControl.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    Cliente findByEmail(String email);

}
