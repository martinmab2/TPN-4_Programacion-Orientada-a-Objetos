package ar.edu.unju.fi.test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unju.fi.domain.Pasajero;
import ar.edu.unju.fi.manager.Manager;
import ar.edu.unju.fi.manager.PasajeroManager;

public class JavaTest {
    private PasajeroManager pasajeroManager;
    private Manager manager;

    @BeforeEach
    public void setUp() {
        manager = new Manager();
        pasajeroManager = new PasajeroManager(manager);
    }

    @Test
    public void pruebaRegistrarPasajeroValido() {
        Pasajero pasajeroValido = new Pasajero("Nuevo", "Pasajero", "12345678", "nuevo@ejemplo.com", "Password1!");
        assertTrue(pasajeroManager.registrarPasajero(pasajeroValido));
    }

    @Test
    public void pruebaRegistrarPasajeroNoValido() {
        Pasajero pasajeroInvalido = new Pasajero("Nuevo", "Pasajero", "12345678", "nuevo@ejemplo.com", "short1!");
        assertFalse(pasajeroManager.registrarPasajero(pasajeroInvalido));
    }

    @Test
    public void pruebaMostrarPasajeros() {
        List<Pasajero> pasajeros = pasajeroManager.getPasajeros();
        assertTrue(pasajeros.size() > 0);
    }
}
