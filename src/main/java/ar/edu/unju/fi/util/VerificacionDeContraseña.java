package ar.edu.unju.fi.util;

import java.util.regex.Pattern;

/**
 * Clase encargada de la verificación de contraseñas para asegurar que cumplan con ciertos criterios de seguridad.
 * 
 * La clase proporciona métodos para validar contraseñas basadas en patrones predefinidos y reglas adicionales,
 * como evitar números consecutivos en la contraseña.
 */
public class VerificacionDeContraseña {

    /**
     * Patrón de expresión regular que define las condiciones de seguridad de la contraseña:
     * 
     *     Debe contener al menos una letra mayúscula.
     *     Debe contener al menos dos dígitos.
     *     Debe contener al menos un carácter especial (no alfanumérico).
     *     Debe tener una longitud entre 8 y 12 caracteres.
     * 
     */
    public static final Pattern CONDICIONES = Pattern
            .compile("^(?=.*[A-Z])(?=.*[0-9].*[0-9])(?=.*[^a-zA-Z0-9]).{8,12}$");

    /**
     * Valida una contraseña en función del patrón predefinido y verifica que no contenga números consecutivos.
     * 
     * @param contraseña La contraseña a validar.
     * @return {@code true} si la contraseña cumple con las condiciones de seguridad y no tiene números consecutivos;
     *         {@code false} si no cumple con alguna de las condiciones.
     */
    public static boolean validar(String contraseña) {
        if (!CONDICIONES.matcher(contraseña).matches()) {
            return false;
        }
        return !tieneNumerosConsecutivos(contraseña);
    }

    /**
     * Verifica si la contraseña contiene números consecutivos.
     * 
     * Esto se realiza comprobando cada par de dígitos adyacentes en la contraseña. Si dos dígitos consecutivos
     * tienen una diferencia de 1, se considera que la contraseña tiene números consecutivos.
     * 
     * @param contraseña La contraseña en la que se verifica la presencia de números consecutivos.
     * @return {@code true} si se encuentran números consecutivos en la contraseña; 
     *         {@code false} en caso contrario.
     */
    private static boolean tieneNumerosConsecutivos(String contraseña) {
        for (int indicadorLetra = 0; indicadorLetra < contraseña.length() - 1; indicadorLetra++) {
            if (Character.isDigit(contraseña.charAt(indicadorLetra)) && Character.isDigit(contraseña.charAt(indicadorLetra + 1))) {
                if (Math.abs(contraseña.charAt(indicadorLetra) - contraseña.charAt(indicadorLetra + 1)) == 1) {
                    return true;
                }
            }
        }
        return false;
    }
}

