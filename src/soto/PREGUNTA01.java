package soto;

public class PREGUNTA01 {
    public static void main(String[] args) {
     int num[]={1,2,3,4,5,6,7,8,9,10,10,10,11};
     int buscar=10;
     int acum1=0;
     int acum2=0;
     boolean adi=false;
     int total=0;
     int inicio=0;
     int cen;
     int fin =num.length-1;
     while (inicio<=fin){
     cen=(inicio+fin)/2;
     if(buscar==num[cen]){
     int cen2=cen;
     while (num[cen]==num[cen+1])
         acum1=acum1+1;
          cen=cen+1;
          adi=true;
     }
         int cen2;
     while(buscar==num[cen2-1]){
     acum2=acum2+1;
     cen2=cen2-1;
     if(adi==false){
     adi=true;} 
     }
     break;
     }else if(buscar<num[cen2]){
             fin=cen2-1;}
             else{
             inicio=cen2+1;}
    } 
    if(adi==true){
total=acum1+acum2+1;
}
    System.out.println("la cnatida de numero es "+total);
}