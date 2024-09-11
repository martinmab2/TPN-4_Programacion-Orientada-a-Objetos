package ar.edu.unju.fi.manager;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fi.domain.Pasajero;
import ar.edu.unju.fi.domain.Reserva;
import ar.edu.unju.fi.enumerados.Clase;
import ar.edu.unju.fi.enumerados.Estado;

public class Manager {
	private List<Pasajero> pasajeros;
	private List<Reserva> reservas;
	private List<String> origenes;
	private List<String> destinos;
	
	public Manager(){
		precargarPasajeros();
		precargarOrigenesYDestinos();
        precargarReservas();
	}
 	
	public void precargarPasajeros() {
		pasajeros = new ArrayList<>();
			
		pasajeros.add(new Pasajero("Martin Alejandro", "Bonari", "44477373", "444777373@fi.unju.edu.ar", "contraseña seminal"));
		pasajeros.add(new Pasajero("Juan Pablo", "Borges", "44477374", "444777374@fi.unju.edu.ar", "contraseña seminal2"));
		pasajeros.add(new Pasajero("Brian Adrian", "Peña Rodriguez", "44477375", "444777375@fi.unju.edu.ar", "contraseña seminal3"));
		pasajeros.add(new Pasajero("Conrado Maximiliano", "Vargas", "44477376", "444777376@fi.unju.edu.ar", "contraseña seminal4"));
		pasajeros.add(new Pasajero("Maria Marta", "Juarez", "44477377", "444777377@fi.unju.edu.ar", "contraseña seminal5"));
		pasajeros.add(new Pasajero("Fabrizio", "Armada", "44477378", "444777378@fi.unju.edu.ar", "contraseña seminal6"));
		pasajeros.add(new Pasajero("Irene", "Quiroga", "44477379", "444777379@fi.unju.edu.ar", "contraseña seminal7"));
		pasajeros.add(new Pasajero("Fabricio Alfredo", "Flores", "44477380", "444777380@fi.unju.edu.ar", "contraseña seminal8"));
		pasajeros.add(new Pasajero("Enzo", "Merengues", "44477381", "444777381@fi.unju.edu.ar", "contraseña seminal9"));
		pasajeros.add(new Pasajero("Federico", "Valverde", "44477382", "444777382@fi.unju.edu.ar", "contraseña seminal10"));
		pasajeros.add(new Pasajero("John Nicolas", "Abruzzi", "44477383", "444777383@fi.unju.edu.ar", "contraseña seminal11"));
		pasajeros.add(new Pasajero("Michael Ismael", "Schofield", "44477384", "444777384@fi.unju.edu.ar", "contraseña seminal12"));
		pasajeros.add(new Pasajero("Lincoln Andrew", "Burrows", "44477385", "444777385@fi.unju.edu.ar", "contraseña seminal13"));
		pasajeros.add(new Pasajero("Theodore", "Bagwell", "44477386", "444777386@fi.unju.edu.ar", "contraseña seminal14"));
		pasajeros.add(new Pasajero("Kaniel Maximilian", "Outis", "44477387", "444777387@fi.unju.edu.ar", "contraseña seminal15"));
	}
	
	public void añadirPasajeroEnLaLista(Pasajero pasajero) {
		pasajeros.add(pasajero);
	}
	
	public List<Pasajero> mostrarListaDePasajeros() {
		return pasajeros;
	}
	
	public void precargarOrigenesYDestinos() {
		origenes = new ArrayList<>();
		destinos = new ArrayList<>();
		
		origenes.add("Buenos Aires");
		origenes.add("Cordoba");
		origenes.add("Tucuman");
		origenes.add("Mendoza");
		origenes.add("Misiones");
		origenes.add("Jujuy");
		origenes.add("Catamarca");
		origenes.add("Santiago Del Estero");
		origenes.add("La Pampa");
		origenes.add("Chubut");
		origenes.add("Santa Cruz");
		origenes.add("Tierra Del Fuego");
		origenes.add("Gran Buenos Aires");
		origenes.add("Santa Fe");
		origenes.add("Formosa");
		origenes.add("Salta");
		
		destinos.add("La Rioja");
		destinos.add("Chaco");
		destinos.add("Islas Malvinas");
		destinos.add("Antartida Argentina");
		destinos.add("Corrientes");
		destinos.add("Entre Rios");
		destinos.add("Neuquen");
		destinos.add("Rio Negro");
		destinos.add("San Juan");
		destinos.add("San Luis");
		destinos.add("San Pablo, Brasil");
		destinos.add("Cartagena, Colombia");
		destinos.add("Oruro, Peru");
		destinos.add("Santa Cruz De la Sierra, Bolivia");
		destinos.add("Reykjavik, Islandia");
		
	}
	
	public void precargarReservas() {
		reservas = new ArrayList<>();
		
		reservas.add(new Reserva(origenes.get(0), destinos.get(8), LocalDate.of(2024, 10, 1), LocalDate.of(2024, 10, 15), Clase.Economy, pasajeros.get(0), false, Estado.CANCELADA)); 
		reservas.add(new Reserva(origenes.get(3), destinos.get(6), LocalDate.of(2024, 10, 1), LocalDate.of(2024, 10, 15), Clase.Economy, pasajeros.get(0), true, Estado.CANCELADA));
		reservas.add(new Reserva(origenes.get(7), destinos.get(3), LocalDate.of(2024, 10, 1), LocalDate.of(2024, 10, 15), Clase.Economy, pasajeros.get(0), true, Estado.CANCELADA));
		reservas.add(new Reserva(origenes.get(9), destinos.get(5), LocalDate.of(2024, 10, 1), LocalDate.of(2024, 10, 15), Clase.Economy, pasajeros.get(0), false, Estado.CANCELADA));
		reservas.add(new Reserva(origenes.get(5), destinos.get(14), LocalDate.of(2024, 10, 1), LocalDate.of(2024, 10, 15), Clase.Economy, pasajeros.get(0), false, Estado.CANCELADA));
	}
	
	public List<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public List<String> getOrigenes() {
        return origenes;
    }

    public List<String> getDestinos() {
        return destinos;
    }

}