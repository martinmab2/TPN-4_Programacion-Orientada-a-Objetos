package ar.edu.unju.fi.domain;

import java.time.LocalDate;
import ar.edu.unju.fi.enumerados.Clase;
import ar.edu.unju.fi.enumerados.Estado;

/**
 * Representa una reserva de viaje.
 * 
 * <p>Incluye detalles sobre el origen, destino, fechas de salida y regreso, 
 * clase de servicio, pasajero principal, acompañante y estado de la reserva.</p>
 */
public class Reserva {

    private String origen;
    private String destino;
    private LocalDate fechaDeSalida;
    private LocalDate fechaDeRegreso;
    private Clase clase;
    private Pasajero pasajero;
    private Pasajero acompañante;
    private Estado estado;

    /**
     * Obtiene el lugar de origen de la reserva.
     * 
     * @return El lugar de origen.
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * Establece el lugar de origen de la reserva.
     * 
     * @param origen El lugar de origen.
     */
    public void setOrigen(String origen) {
        this.origen = origen;
    }

    /**
     * Obtiene el lugar de destino de la reserva.
     * 
     * @return El lugar de destino.
     */
    public String getDestino() {
        return destino;
    }

    /**
     * Establece el lugar de destino de la reserva.
     * 
     * @param destino El lugar de destino.
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    /**
     * Obtiene la fecha de salida de la reserva.
     * 
     * @return La fecha de salida.
     */
    public LocalDate getFechaDeSalida() {
        return fechaDeSalida;
    }

    /**
     * Establece la fecha de salida de la reserva.
     * 
     * @param fechaDeSalida La fecha de salida.
     */
    public void setFechaDeSalida(LocalDate fechaDeSalida) {
        this.fechaDeSalida = fechaDeSalida;
    }

    /**
     * Obtiene la fecha de regreso de la reserva.
     * 
     * @return La fecha de regreso.
     */
    public LocalDate getFechaDeRegreso() {
        return fechaDeRegreso;
    }

    /**
     * Establece la fecha de regreso de la reserva.
     * 
     * @param fechaDeRegreso La fecha de regreso.
     */
    public void setFechaDeRegreso(LocalDate fechaDeRegreso) {
        this.fechaDeRegreso = fechaDeRegreso;
    }

    /**
     * Obtiene la clase de servicio de la reserva.
     * 
     * @return La clase de servicio.
     */
    public Clase getClase() {
        return clase;
    }

    /**
     * Establece la clase de servicio de la reserva.
     * 
     * @param clase La clase de servicio.
     */
    public void setClase(Clase clase) {
        this.clase = clase;
    }

    /**
     * Obtiene el pasajero que realiza la reserva.
     * 
     * @return El pasajero principal.
     */
    public Pasajero getPasajero() {
        return pasajero;
    }

    /**
     * Establece el pasajero que realiza la reserva.
     * 
     * @param pasajero El pasajero principal.
     */
    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    /**
     * Obtiene el pasajero acompañante de la reserva.
     * 
     * @return El pasajero acompañante.
     */
    public Pasajero getAcompañante() {
        return acompañante;
    }

    /**
     * Establece el pasajero acompañante de la reserva.
     * 
     * @param acompañante El pasajero acompañante.
     */
    public void setAcompañante(Pasajero acompañante) {
        this.acompañante = acompañante;
    }

    /**
     * Obtiene el estado de la reserva.
     * 
     * @return El estado de la reserva.
     */
    public Estado getEstado() {
        return estado;
    }

    /**
     * Establece el estado de la reserva.
     * 
     * @param estado El estado de la reserva.
     */
    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    /**
     * Crea una nueva instancia de Reserva con la información proporcionada.
     * 
     * @param origen El lugar de origen de la reserva.
     * @param destino El lugar de destino de la reserva.
     * @param fechaDeSalida La fecha de salida.
     * @param fechaDeRegreso La fecha de regreso.
     * @param clase La clase de servicio.
     * @param pasajero El pasajero que realiza la reserva.
     * @param acompañante El pasajero acompañante.
     * @param estado El estado de la reserva.
     */
    public Reserva(String origen, String destino, LocalDate fechaDeSalida, LocalDate fechaDeRegreso, Clase clase,
            Pasajero pasajero, Pasajero acompañante, Estado estado) {
        super();
        this.origen = origen;
        this.destino = destino;
        this.fechaDeSalida = fechaDeSalida;
        this.fechaDeRegreso = fechaDeRegreso;
        this.clase = clase;
        this.pasajero = pasajero;
        this.estado = estado;
        this.acompañante = acompañante;
    }
}
