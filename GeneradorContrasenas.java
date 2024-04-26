import java.util.Random; //Importar libreria random para datos aleartorios

public class GeneradorContrasenas {
    public static String generarContrasena() {
        int longitud = 15; // Longitud para la contraseña
        Random random = new Random();
        char[] caracteresUsados = new char[longitud]; // Almacena caracteres únicos
        int indice = 0; // Mantiene el número de caracteres únicos generados
        StringBuilder contrasena = new StringBuilder(); // Acumula la contraseña
        
        // Continuar hasta tener 15 caracteres únicos
        while (indice < longitud) {
            char siguienteCaracter = (char) (random.nextInt(93) + 33); // Generar un carácter entre 33 y 125

            boolean yaUsado = false;
            // Verificar si el carácter ya está en el arreglo de caracteres usados
            for (int i = 0; i < indice; i++) {
                if (caracteresUsados[i] == siguienteCaracter) {
                    yaUsado = true;
                    break; // Salir del bucle si encontramos un duplicado
                }
            }

            // Si el carácter es único, agrégalo a la contraseña y al arreglo de caracteres usados
            if (!yaUsado) {
                contrasena.append(siguienteCaracter);
                caracteresUsados[indice] = siguienteCaracter;
                indice++; // Incrementar el número de caracteres únicos
            }
        }

        return contrasena.toString(); // Devolver la contraseña final
    }

    public static void main(String[] args) {
        // Generar y mostrar una contraseña aleatoria
        String nuevaContrasena = generarContrasena();
        System.out.println("Nueva contraseña generada: " + nuevaContrasena);
    }
}

        