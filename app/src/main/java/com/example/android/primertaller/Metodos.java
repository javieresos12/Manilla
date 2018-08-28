package com.example.android.primertaller;

public class Metodos {

    public static double manilla (double cantidad, String material, String dije, String tipo, String moneda){
       double total=0;
        if (material.equalsIgnoreCase("cuero")){
           if (dije.equalsIgnoreCase("martillo")){
               if ((tipo.equalsIgnoreCase("oro") || tipo.equalsIgnoreCase("oro rosado")) && moneda.equalsIgnoreCase("dolar")){
                   total= cantidad*100;
               }else if(tipo.equalsIgnoreCase("plata") && moneda.equalsIgnoreCase("dolar")){
                   total= cantidad*80;
               }else if (tipo.equalsIgnoreCase("niquel") && moneda.equalsIgnoreCase("dolar")){
                   total=cantidad*70;
               }else{
                   total=cantidad*3200;
               }
           }else if(dije.equalsIgnoreCase("ancla")){
               if ((tipo.equalsIgnoreCase("oro") || tipo.equalsIgnoreCase("oro rosado")) && moneda.equalsIgnoreCase("dolar")){
                   total=cantidad*120;
               }else if (tipo.equalsIgnoreCase("plata") && moneda.equalsIgnoreCase("dolar")){
                   total=cantidad*100;
               }else if (tipo.equalsIgnoreCase("niquel") && moneda.equalsIgnoreCase("dolar")){
                   total=cantidad*90;
               }else{
                   total=cantidad*3200;
               }
           }
        }else if (material.equalsIgnoreCase("cuerda")){
            if (dije.equalsIgnoreCase("martillo")){
                if ((tipo.equalsIgnoreCase("oro") || tipo.equalsIgnoreCase("oro rosado")) && moneda.equalsIgnoreCase("dolar")){
                    total=cantidad*90;
                }else if (tipo.equalsIgnoreCase("plata") && moneda.equalsIgnoreCase("dolar")){
                    total=cantidad*70;
                }else if (tipo.equalsIgnoreCase("niquel") && moneda.equalsIgnoreCase("dolar")){
                    total=cantidad*50;
                }else{
                    total=cantidad*3200;
                }

            }else if (dije.equalsIgnoreCase("ancla")){
                if ((tipo.equalsIgnoreCase("oro") || tipo.equalsIgnoreCase("oro rosado")) && moneda.equalsIgnoreCase("dolar")){
                    total=cantidad*110;
                }else  if (tipo.equalsIgnoreCase("plata") && moneda.equalsIgnoreCase("dolar")){
                    total=cantidad*90;
                }else  if (tipo.equalsIgnoreCase("niquel") && moneda.equalsIgnoreCase("dolar")){
                    total=cantidad*80;
                }else{
                    total=cantidad*3200;
                }

            }

        }
        return total;
    }


}
