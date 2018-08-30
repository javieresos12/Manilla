package com.example.android.primertaller;

import android.widget.Spinner;

public class Metodos {

    public static double manilla (double cantidad, int mate, int dije, int tipo, int moneda){
       double total=0;
        if (mate==1){
           if (dije==1){
               if ((tipo==1 || tipo==2)) {
                   if (moneda==1){
                       total = cantidad * 100;
                   }else {
                       total = cantidad * 100 * 3200;
                   }
               }else if(tipo==3){
                   if (moneda==1){
                       total= cantidad*80;
                   }else{
                       total= cantidad*80*3200;
                   }

               }else if (tipo==4){
                   if (moneda==1){
                       total=cantidad*70;
                   }else {
                       total = cantidad * 70 * 3200;
                   }
               }
           }else if(dije==2){
               if ((tipo==1 || tipo==2)){
                   if (moneda==1){
                       total=cantidad*120;
                   }else{
                       total=cantidad*120*3200;
                   }

               }else if (tipo==3){
                   if (moneda==1){
                       total=cantidad*100;
                   }else{
                       total=cantidad*100*3200;
                   }

               }else if (tipo==4){
                   if (moneda==1){
                       total=cantidad*90;
                   }else{
                       total=cantidad*90*3200;
                   }

               }
           }
        }else if (mate==2){
            if (dije==1){
                if ((tipo==1 || tipo==2)){
                    if (moneda==1){
                        total=cantidad*90;
                    }else{
                        total=cantidad*90*3200;
                    }

                }else if (tipo==3){
                    if (moneda==1){
                        total=cantidad*70;
                    }else{
                        total=cantidad*70*3200;
                    }

                }else if (tipo==4){
                    if (moneda==1){
                        total=cantidad*50;
                    }else{
                        total=cantidad*50*3200;
                    }

                }

            }else if (dije==2){
                if ((tipo==1 || tipo==2)){
                    if (moneda==1){
                        total=cantidad*110;
                    }else{
                        total=cantidad*110*3200;
                    }

                }else  if (tipo==3){
                    if (moneda==1){
                        total=cantidad*90;
                    }else{
                        total=cantidad*90*3200;
                    }

                }else  if (tipo==4){
                    if (moneda==1){
                        total=cantidad*80;
                    }else{
                        total=cantidad*80*3200;
                    }

                }
            }
        }
        return total;
    }


}
