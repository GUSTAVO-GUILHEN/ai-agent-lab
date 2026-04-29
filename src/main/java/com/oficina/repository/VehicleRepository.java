package com.oficina.repository;

import com.oficina.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    
    // O Spring gera o SQL: SELECT * FROM vehicle WHERE placa = ?
    Optional<Vehicle> findByPlaca(String placa);
}