package ar.edu.unju.fi.domain;

import java.time.LocalDate;
import ar.edu.unju.fi.enumerados.Clase;
import ar.edu.unju.fi.enumerados.Estado;

public class Reserva {
	private String origen;
	private String destino;
	private LocalDate fechaDeSalida;
	private LocalDate fechaDeRegreso;
	private Clase clase;
	private Pasajero pasajero;
	private boolean tieneAcompañante;
	private Estado estado;
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public LocalDate getFechaDeSalida() {
		return fechaDeSalida;
	}
	public void setFechaDeSalida(LocalDate fechaDeSalida) {
		this.fechaDeSalida = fechaDeSalida;
	}
	public LocalDate getFechaDeRegreso() {
		return fechaDeRegreso;
	}
	public void setFechaDeRegreso(LocalDate fechaDeRegreso) {
		this.fechaDeRegreso = fechaDeRegreso;
	}
	public Clase getClase() {
		return clase;
	}
	public void setClase(Clase clase) {
		this.clase = clase;
	}
	public Pasajero getPasajero() {
		return pasajero;
	}
	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public boolean isTieneAcompañante() {
		return tieneAcompañante;
	}
	public void setTieneAcompañante(boolean tieneAcompañante) {
		this.tieneAcompañante = tieneAcompañante;
	}
	public Reserva(String origen, String destino, LocalDate fechaDeSalida, LocalDate fechaDeRegreso, Clase clase,
			Pasajero pasajero, boolean tieneAcompañante, Estado estado) {
		super();
		this.origen = origen;
		this.destino = destino;
		this.fechaDeSalida = fechaDeSalida;
		this.fechaDeRegreso = fechaDeRegreso;
		this.clase = clase;
		this.pasajero = pasajero;
		this.estado = estado;
		this.tieneAcompañante = tieneAcompañante;
	}
	
	
}
