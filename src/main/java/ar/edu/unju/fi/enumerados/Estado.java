package ar.edu.unju.fi.enumerados;

/**
 * Enum que representa los diferentes estados posibles para una reserva.
 * <p>
 * Los estados disponibles son:
 * <ul>
 *   <li><b>RESERVADA:</b> Indica que la reserva ha sido realizada pero aún no ha sido pagada ni cancelada.</li>
 *   <li><b>CANCELADA:</b> Indica que la reserva ha sido cancelada y ya no es válida.</li>
 *   <li><b>PAGADA:</b> Indica que la reserva ha sido pagada y está confirmada.</li>
 * </ul>
 * </p>
 */
public enum Estado {
    /**
     * Indica que la reserva ha sido realizada pero aún no ha sido pagada ni cancelada.
     */
    RESERVADA,

    /**
     * Indica que la reserva ha sido cancelada y ya no es válida.
     */
    CANCELADA,

    /**
     * Indica que la reserva ha sido pagada y está confirmada.
     */
    PAGADA
}
