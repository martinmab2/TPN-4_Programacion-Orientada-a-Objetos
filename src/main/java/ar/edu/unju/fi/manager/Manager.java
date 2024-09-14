package ar.edu.unju.fi.manager;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fi.domain.Pasajero;
import ar.edu.unju.fi.domain.Reserva;
import ar.edu.unju.fi.enumerados.Clase;
import ar.edu.unju.fi.enumerados.Estado;

/**
 * Clase que gestiona la información de pasajeros, reservas, origenes y destinos.
 * <p>
 * La clase proporciona métodos para precargar datos de pasajeros y reservas, 
 * así como para obtener y añadir pasajeros. También proporciona listas de 
 * origenes y destinos disponibles.
 * </p>
 */
public class Manager {
    
    /**
     * Lista de pasajeros precargados.
     */
    private List<Pasajero> pasajeros;
    
    /**
     * Lista de reservas precargadas.
     */
    private List<Reserva> reservas;
    
    /**
     * Lista de lugares de origen disponibles.
     */
    private List<String> origenes;
    
    /**
     * Lista de destinos disponibles.
     */
    private List<String> destinos;
    
    /**
     * Constructor de la clase. Inicializa las listas de pasajeros, reservas,
     * origenes y destinos mediante métodos de precarga.
     */
    public Manager(){
        precargarPasajeros();
        precargarOrigenesYDestinos();
        precargarReservas();
    }
    
    /**
     * Precarga una lista de pasajeros con datos predefinidos.
     * <p>
     * Esta lista se utiliza para simular una base de datos de pasajeros en
     * el sistema.
     * </p>
     */
    public void precargarPasajeros() {
        pasajeros = new ArrayList<>();
        
        pasajeros.add(new Pasajero("Martin Alejandro", "Bonari", "44477373", "444777373@fi.unju.edu.ar", "Password1!"));
        pasajeros.add(new Pasajero("Juan Pablo", "Borges", "44477374", "444777374@fi.unju.edu.ar", "Passw0rd@"));
        pasajeros.add(new Pasajero("Brian Adrian", "Peña Rodriguez", "44477375", "444777375@fi.unju.edu.ar", "P@ssw0rd1"));
        pasajeros.add(new Pasajero("Conrado Maximiliano", "Vargas", "44477376", "444777376@fi.unju.edu.ar", "SecReT2!"));
        pasajeros.add(new Pasajero("Maria Marta", "Juarez", "44477377", "444777377@fi.unju.edu.ar", "MyP@ssw0rd"));
        pasajeros.add(new Pasajero("Fabrizio", "Armada", "44477378", "444777378@fi.unju.edu.ar", "P@ssword1"));
        pasajeros.add(new Pasajero("Irene", "Quiroga", "44477379", "444777379@fi.unju.edu.ar", "1Password!"));
        pasajeros.add(new Pasajero("Fabricio Alfredo", "Flores", "44477380", "444777380@fi.unju.edu.ar", null));
        pasajeros.add(new Pasajero("Enzo", "Merengues", "44477381", "444777381@fi.unju.edu.ar", null));
        pasajeros.add(new Pasajero("Federico", "Valverde", "44477382", "444777382@fi.unju.edu.ar", null));
        pasajeros.add(new Pasajero("John Nicolas", "Abruzzi", "44477383", "444777383@fi.unju.edu.ar", null));
        pasajeros.add(new Pasajero("Michael Ismael", "Schofield", "44477384", "444777384@fi.unju.edu.ar", null));
        pasajeros.add(new Pasajero("Lincoln Andrew", "Burrows", "44477385", "444777385@fi.unju.edu.ar", null));
        pasajeros.add(new Pasajero("Theodore", "Bagwell", "44477386", "444777386@fi.unju.edu.ar", null));
        pasajeros.add(new Pasajero("Kaniel Maximilian", "Outis", "44477387", "444777387@fi.unju.edu.ar", null));
    }
    
    /**
     * Añade un nuevo pasajero a la lista de pasajeros.
     * 
     * @param pasajero El pasajero a añadir.
     */
    public void añadirPasajeroEnLaLista(Pasajero pasajero) {
        pasajeros.add(pasajero);
    }
    
    /**
     * Devuelve la lista de pasajeros.
     * 
     * @return Lista de pasajeros.
     */
    public List<Pasajero> mostrarListaDePasajeros() {
        return pasajeros;
    }
    
    /**
     * Precarga las listas de origenes y destinos con datos predefinidos.
     * <p>
     * Estas listas se utilizan para simular una base de datos de origenes y
     * destinos disponibles en el sistema.
     * </p>
     */
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
    
    /**
     * Precarga una lista de reservas con datos predefinidos.
     * <p>
     * Estas reservas se utilizan para simular una base de datos de reservas
     * en el sistema.
     * </p>
     */
    public void precargarReservas() {
        reservas = new ArrayList<>();
        
        reservas.add(new Reserva(origenes.get(0), destinos.get(8), LocalDate.of(2024, 10, 1), LocalDate.of(2024, 10, 15), Clase.Economy, pasajeros.get(0), null, Estado.CANCELADA)); 
        reservas.add(new Reserva(origenes.get(3), destinos.get(6), LocalDate.of(2024, 10, 1), LocalDate.of(2024, 10, 15), Clase.Economy, pasajeros.get(1),  pasajeros.get(11), Estado.CANCELADA));
        reservas.add(new Reserva(origenes.get(7), destinos.get(3), LocalDate.of(2024, 10, 1), LocalDate.of(2024, 10, 15), Clase.Economy, pasajeros.get(2), pasajeros.get(12), Estado.CANCELADA));
        reservas.add(new Reserva(origenes.get(9), destinos.get(5), LocalDate.of(2024, 10, 1), LocalDate.of(2024, 10, 15), Clase.Economy, pasajeros.get(3), null, Estado.CANCELADA));
        reservas.add(new Reserva(origenes.get(5), destinos.get(14), LocalDate.of(2024, 10, 1), LocalDate.of(2024, 10, 15), Clase.Economy, pasajeros.get(4),  null, Estado.CANCELADA));
    }
    
    /**
     * Devuelve la lista de pasajeros.
     * 
     * @return Lista de pasajeros.
     */
    public List<Pasajero> getPasajeros() {
        return pasajeros;
    }

    /**
     * Devuelve la lista de reservas.
     * 
     * @return Lista de reservas.
     */
    public List<Reserva> getReservas() {
        return reservas;
    }

    /**
     * Devuelve la lista de lugares de origen disponibles.
     * 
     * @return Lista de origenes.
     */
    public List<String> getOrigenes() {
        return origenes;
    }

    /**
     * Devuelve la lista de destinos disponibles.
     * 
     * @return Lista de destinos.
     */
    public List<String> getDestinos() {
        return destinos;
    }
}