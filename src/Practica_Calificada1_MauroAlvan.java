public class Practica_Calificada1_MauroAlvan {

    public static void main(String[] args) {
        int[] arreglo = {1, 2, 2, 2, 3, 4, 5, 5, 6};
        int numero = 5;
        int cant = contarOcurrencias(arreglo, numero);
        System.out.println("El número " + numero + " aparece " + cant + " veces en el arreglo.");
    }

    public static int contarOcurrencias(int[] arreglo, int numero) {
        int primeraPosicion = buscarPrimeraPosicion(arreglo, numero);
        if (primeraPosicion == -1) {
            return 0; // El número no está en el arreglo
        }
        int ultimaPosicion = buscarUltimaPosicion(arreglo, numero);
        return ultimaPosicion - primeraPosicion + 1;
    }
// izq = izquierda / der = derecha / mid = medio
    public static int buscarPrimeraPosicion(int[] arreglo, int numero) {
        int izq = 0;
        int der = arreglo.length - 1;
        int result = -1;
        while (izq <= der) {
            int mid = izq + (der - izq) / 2;
            if (arreglo[mid] == numero) {
                result = mid;
                der = mid - 1; // Seguir buscando en la mitad izquierda
            } else if (arreglo[mid] < numero) {
                izq = mid + 1;
            } else {
                der = mid - 1;
            }
        }
        return result;
    }

    public static int buscarUltimaPosicion(int[] arreglo, int numero) {
        int izq = 0;
        int der = arreglo.length - 1;
        int result = -1;
        while (izq <= der) {
            int mid = izq + (der - izq) / 2;
            if (arreglo[mid] == numero) {
                result = mid;
                izq = mid + 1; // Seguir buscando en la mitad derecha
            } else if (arreglo[mid] < numero) {
                izq = mid + 1;
            } else {
                der = mid - 1;
            }
        }
        return result;
    }
}
