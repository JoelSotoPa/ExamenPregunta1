
package soto;


public class Soto {

       public static void main(String[] args) {
        int num[] = {1, 2, 3, 4, 5, 6 ,6 ,6 ,6, 7, 8, 9, 10};
        int buscar = 6;
        int inicio = 0;
        int fin = num.length - 1;
        int primero = 0;
        int ultimo = 0;
        
        while (inicio<=fin) {
            int centro=(inicio+fin)/2;
            if (num[centro]==buscar) {
                primero=centro;
                while(primero>0&&num[primero-1]==buscar) {
                    primero--;
                }
                break;
            } else if(num[centro]<buscar) {
                inicio=centro+1;
            } else{
                fin=centro-1;
            }
        }
        if (primero == -1) {
        }
        inicio=primero;
        fin=num.length-1;
        while (inicio<=fin) {
            int centro2=(inicio + fin)/ 2;
            
            if (num[centro2]==buscar){
                ultimo=centro2;
            
                while (ultimo<num.length-1&&num[ultimo + 1] == buscar) {
                    ultimo++;
                }
                break;
            } else if(num[centro2] < buscar) {
                inicio=centro2+1;
            } else{
                fin=centro2-1;
            }
        }
        int total=ultimo-primero+1;
        System.out.println("La cantidad de números es " + total);
    }
}
    

