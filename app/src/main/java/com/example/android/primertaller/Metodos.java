package com.example.android.primertaller;

import android.widget.Spinner;

public class Metodos {

    public static double manilla (double cantidad, int mate, int dije, int tipo, int moneda){
       double total=0;
        if (mate==1){
           if (dije==1){
               if ((tipo==1 || tipo==2) && moneda==1){
                   total= cantidad*100;
               }else if(tipo==3 && moneda==1){
                   total= cantidad*80;
               }else if (tipo==4 && moneda==1){
                   total=cantidad*70;
               }else{
                   total=cantidad*3200;
               }
           }else if(dije==2){
               if ((tipo==1 || tipo==2) && moneda==1){
                   total=cantidad*120;
               }else if (tipo==3 && moneda==1){
                   total=cantidad*100;
               }else if (tipo==4 && moneda==1){
                   total=cantidad*90;
               }else{
                   total=cantidad*3200;
               }
           }
        }else if (mate==2){
            if (dije==1){
                if ((tipo==1 || tipo==2) && moneda==1){
                    total=cantidad*90;
                }else if (tipo==3 && moneda==1){
                    total=cantidad*70;
                }else if (tipo==4 && moneda==1){
                    total=cantidad*50;
                }else{
                    total=cantidad*3200;
                }

            }else if (dije==2){
                if ((tipo==1 || tipo==2) && moneda==1){
                    total=cantidad*110;
                }else  if (tipo==3 && moneda==1){
                    total=cantidad*90;
                }else  if (tipo==4 && moneda==1){
                    total=cantidad*80;
                }else{
                    total=cantidad*3200;
                }

            }

        }
        return total;
    }


}
