package ar.edu.unju.fi.domain;

/**
 * Representa un pasajero de la agencia de viajes.
 * Un pasajero tiene información personal necesaria para registrar una reserva.
 * 
 * @see ar.edu.unju.fi.domain.Reserva
 * @see ar.edu.unju.fi.manager.PasajeroManager
 */
public class Pasajero {

    private String nombre;
    private String apellido;
    private String dni;
    private String correoElectronico;
    private String contraseña;

    /**
     * Obtiene el nombre del pasajero.
     * 
     * @return El nombre del pasajero.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del pasajero.
     * 
     * @param nombre El nombre del pasajero.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el apellido del pasajero.
     * 
     * @return El apellido del pasajero.
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Establece el apellido del pasajero.
     * 
     * @param apellido El apellido del pasajero.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Obtiene el Documento Nacional de Identidad (DNI) del pasajero.
     * 
     * @return El DNI del pasajero.
     */
    public String getDni() {
        return dni;
    }

    /**
     * Establece el Documento Nacional de Identidad (DNI) del pasajero.
     * 
     * @param dni El DNI del pasajero.
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Obtiene la dirección de correo electrónico del pasajero.
     * 
     * @return La dirección de correo electrónico del pasajero.
     */
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    /**
     * Establece la dirección de correo electrónico del pasajero.
     * 
     * @param correoElectronico La dirección de correo electrónico del pasajero.
     */
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    /**
     * Obtiene la contraseña del pasajero.
     * 
     * @return La contraseña del pasajero.
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * Establece la contraseña del pasajero.
     * 
     * @param contraseña La contraseña del pasajero.
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    /**
     * Crea una nueva instancia de Pasajero con los datos proporcionados.
     * 
     * @param nombre El nombre del pasajero.
     * @param apellido El apellido del pasajero.
     * @param dni El DNI del pasajero.
     * @param correoElectronico La dirección de correo electrónico del pasajero.
     * @param contraseña La contraseña del pasajero.
     */
    public Pasajero(String nombre, String apellido, String dni, String correoElectronico, String contraseña) {
        super();
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.correoElectronico = correoElectronico;
        this.contraseña = contraseña;
    }
}

