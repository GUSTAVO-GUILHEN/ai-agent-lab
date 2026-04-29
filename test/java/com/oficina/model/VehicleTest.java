package com.oficina.model;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
public class VehicleTest {
    private Vehicle vehicle;

    @BeforeEach
    public void setUp() {
        vehicle = new Vehicle();
    }

    @Test
    public void createValidVehicle() {
        vehicle.setPlate("ABC-1234");
        vehicle.setModel("Ford Ka");
        vehicle.setColor("Red");
        vehicle.setYear(2020);

        assertThat(vehicle).isNotNull();
        assertThat(vehicle.getPlate()).isEqualTo("ABC-1234");
        assertThat(vehicle.getModel()).isEqualTo("Ford Ka");
        assertThat(vehicle.getColor()).isEqualTo("Red");
        assertThat(vehicle.getYear()).isEqualTo(2020);
    }

    @Test
    public void failToInsertInvalidPlate() {
        vehicle.setPlate("ABC1234"); // Invalid plate format

        assertThatThrownBy(() -> vehicle.validate())
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Invalid plate format");
    }

    @Test
    public void failToInsertYearGreaterThan2027() {
        vehicle.setYear(2028); // Year greater than 2027

        assertThatThrownBy(() -> vehicle.validate())
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Year cannot be greater than 2027");
    }
}