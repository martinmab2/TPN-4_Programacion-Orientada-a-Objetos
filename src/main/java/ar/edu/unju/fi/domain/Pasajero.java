package ar.edu.unju.fi.domain;

public class Pasajero {
	private String nombre;
	private String apellido;
	private String dni;
	private String correoElectronico;
	private String contraseña;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public Pasajero(String nombre, String apellido, String dni, String correoElectronico, String contraseña) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.correoElectronico = correoElectronico;
		this.contraseña = contraseña;
	}
	
	@Override
    public String toString() {
        return "Pasajero " +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                '}';
    }
}
