package com.example.android.primertaller;

public class Metodos {

    public static double manilla (double cantidad, String material, String dije, String tipo, String moneda){
       double total=0;
        if (material.equalsIgnoreCase("cuero")){
           if (dije.equalsIgnoreCase("martillo")){
               if ((tipo.equalsIgnoreCase("oro") || tipo.equalsIgnoreCase("oro rosado")) && moneda.equalsIgnoreCase("dolar")){
                   total= cantidad*100;
               }else{
                   total = cantidad*3200;
               }
           }
        }
        return total;
    }


}
