package com.oficina.controller;

import com.oficina.dto.VehicleRequestDTO;
import com.oficina.model.Vehicle;
import com.oficina.service.VehicleService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {

    private final VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @PostMapping
    public ResponseEntity<Vehicle> create(@Valid @RequestBody VehicleRequestDTO dto) {
        // Mapeamento simples do DTO para a Entidade
        Vehicle vehicle = new Vehicle();
        vehicle.setPlaca(dto.placa());
        vehicle.setModelo(dto.modelo());
        vehicle.setCor(dto.cor());
        vehicle.setAno(dto.ano());

        Vehicle savedVehicle = vehicleService.save(vehicle);
        
        // Retorna 201 Created conforme solicitado
        return ResponseEntity.status(HttpStatus.CREATED).body(savedVehicle);
    }

    @GetMapping
    public ResponseEntity<List<Vehicle>> listAll() {
        // Retorna 200 OK por padrão com a lista
        return ResponseEntity.ok(vehicleService.findAll());
    }
}
