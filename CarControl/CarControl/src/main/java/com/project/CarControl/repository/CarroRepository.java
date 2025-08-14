package com.project.CarControl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.CarControl.model.Carro;

public interface CarroRepository extends JpaRepository<Carro, Long> {
    

}
