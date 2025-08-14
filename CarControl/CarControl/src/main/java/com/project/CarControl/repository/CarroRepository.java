package com.project.CarControl.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.CarControl.model.Carro;

public interface CarroRepository extends JpaRepository<Carro, Long> {
    List<Carro> findByModelo(String modelo);
    List<Carro> findByFabricante(String fabricante);
    List<Carro> findByAno(int ano);

}
