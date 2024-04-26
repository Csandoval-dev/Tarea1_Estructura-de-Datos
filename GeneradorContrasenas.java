import java.util.Random; //Importar libreria random para datos aleartorios

public class GeneradorContrasenas {
    public static String generarContrasena() {
        int longitud = 15; // Longitud para la contraseña
        Random random = new Random();
        char[] caracteresUsados = new char[longitud]; // Almacena caracteres únicos
        int indice = 0; // Mantiene el número de caracteres únicos generados
        StringBuilder contrasena = new StringBuilder(); // Acumula la contraseña

        