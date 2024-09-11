package ar.edu.unju.fi.util;

import java.util.regex.Pattern;

public class VerificacionDeContraseña {
	public static final Pattern Contraseña_Pattern = Pattern
			.compile("^(?=.*[A-Z])(?=.*[0-9].*[0-9])(?=.*[^a-zA-Z0-9]).{8,12}$");

	public static boolean validar(String contraseña) {
		if (!Contraseña_Pattern.matcher(contraseña).matches()) {
			return false;
		}
		return !tieneNumerosConsecutivos(contraseña);
	}
	
	private static boolean tieneNumerosConsecutivos(String contraseña) {
		for (int indicadorLetra=0; indicadorLetra<contraseña.length(); indicadorLetra++) {
			if (Character.isDigit(contraseña.charAt(indicadorLetra)) && Character.isDigit(contraseña.charAt(indicadorLetra+1))) {
				if (Math.abs(contraseña.charAt(indicadorLetra) - contraseña.charAt(indicadorLetra+1)) == 1) {
					return true;
				}
			}
		}
		return false;
	}
}
