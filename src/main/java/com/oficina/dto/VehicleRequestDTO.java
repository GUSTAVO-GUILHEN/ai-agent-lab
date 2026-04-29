package com.oficina.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record VehicleRequestDTO(
    @NotBlank(message = "A placa é obrigatória")
    @Pattern(regexp = "^[A-Z]{3}[0-9][A-Z][0-9]{2}$", message = "Placa inválida. Use o padrão Mercosul (ex: ABC1D23)")
    String placa,

    @NotBlank(message = "O modelo é obrigatório")
    String modelo,

    @NotBlank(message = "A cor é obrigatória")
    String cor,

    @NotNull(message = "O ano é obrigatório")
    Integer ano
) {}
