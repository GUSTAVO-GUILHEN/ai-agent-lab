package com.oficina.service;

import com.oficina.repository.VehicleRepository;
import com.oficina.model.Vehicle;
import com.oficina.exception.DuplicateLicensePlateException;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class VehicleService {

    private final VehicleRepository vehicleRepository;

    // Nota: O @Autowired no construtor é opcional em versões novas do Spring, 
    // mas pode deixar aí que não estraga o motor.
    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public Vehicle save(Vehicle vehicle) {
        // Check if vehicle with same license plate already exists
        if (vehicle.getPlaca() != null && findByPlaca(vehicle.getPlaca()).isPresent()) {
            throw new DuplicateLicensePlateException("Veículo com placa '" + vehicle.getPlaca() + "' já está cadastrado");
        }
        return vehicleRepository.save(vehicle);
    }

    public List<Vehicle> findAll() {
        return vehicleRepository.findAll();
    }

    public Optional<Vehicle> findByPlaca(String placa) {
        return vehicleRepository.findByPlaca(placa);
    }
}