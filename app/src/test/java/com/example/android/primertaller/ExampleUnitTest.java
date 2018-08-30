package com.example.android.primertaller;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void prueba (){
        double cantidad=1, res;
        int material=1, dije=1, tipo=1, moneda=1;
        res=cantidad*100;
        assertEquals(res, Metodos.manilla(cantidad, material, dije, tipo, moneda),0);


    }

    @Test
    public void prueba2 (){
        double cantidad=1, res;
        int material=1, dije=1, tipo=1, moneda=2;
        res=cantidad*100*3200;
        assertEquals(res, Metodos.manilla(cantidad, material, dije, tipo, moneda),0);

    }

    @Test
    public void prueba3(){
        double cantidad=1, res;
        int material=1, dije=1, tipo=2, moneda=1;
        res=cantidad*100;
        assertEquals(res, Metodos.manilla(cantidad, material, dije, tipo, moneda),0);

    }

    @Test
    public void prueba4 (){
        double cantidad=1, res;
        int material=1, dije=1, tipo=2, moneda=2;
        res=cantidad*100*3200;
        assertEquals(res, Metodos.manilla(cantidad, material, dije, tipo, moneda),0);

    }

    @Test
    public void prueba5(){
        double cantidad=1, res;
        int material=1, dije=1, tipo=3, moneda=1;
        res=cantidad*80;
        assertEquals(res, Metodos.manilla(cantidad, material, dije, tipo, moneda),0);

    }

    @Test
    public void prueba6 (){
        double cantidad=1, res;
        int material=1, dije=1, tipo=3, moneda=2;
        res=cantidad*80*3200;
        assertEquals(res, Metodos.manilla(cantidad, material, dije, tipo, moneda),0);

    }
    @Test
    public void prueba7 (){
        double cantidad=1, res;
        int material=1, dije=1, tipo=4, moneda=1;
        res=cantidad*70;
        assertEquals(res, Metodos.manilla(cantidad, material, dije, tipo, moneda),0);

    }
    @Test
    public void prueba8 (){
        double cantidad=1, res;
        int material=1, dije=1, tipo=4, moneda=2;
        res=cantidad*70*3200;
        assertEquals(res, Metodos.manilla(cantidad, material, dije, tipo, moneda),0);

    }
    @Test
    public void prueba9(){
        double cantidad=1, res;
        int material=1, dije=2, tipo=1, moneda=1;
        res=cantidad*120;
        assertEquals(res, Metodos.manilla(cantidad, material, dije, tipo, moneda),0);

    }
    @Test
    public void prueba10 (){
        double cantidad=1, res;
        int material=1, dije=2, tipo=1, moneda=2;
        res=cantidad*120*3200;
        assertEquals(res, Metodos.manilla(cantidad, material, dije, tipo, moneda),0);

    }
    @Test
    public void prueba11 (){
        double cantidad=1, res;
        int material=1, dije=2, tipo=2, moneda=1;
        res=cantidad*120;
        assertEquals(res, Metodos.manilla(cantidad, material, dije, tipo, moneda),0);

    }
    @Test
    public void prueba12(){
        double cantidad=1, res;
        int material=1, dije=2, tipo=2, moneda=2;
        res=cantidad*120*3200;
        assertEquals(res, Metodos.manilla(cantidad, material, dije, tipo, moneda),0);

    }
    @Test
    public void prueba13(){
        double cantidad=1, res;
        int material=1, dije=2, tipo=3, moneda=1;
        res=cantidad*100;
        assertEquals(res, Metodos.manilla(cantidad, material, dije, tipo, moneda),0);

    }
    @Test
    public void prueba14 (){
        double cantidad=1, res;
        int material=1, dije=2, tipo=3, moneda=2;
        res=cantidad*100*3200;
        assertEquals(res, Metodos.manilla(cantidad, material, dije, tipo, moneda),0);

    }
    @Test
    public void prueba15(){
        double cantidad=1, res;
        int material=1, dije=2, tipo=4, moneda=1;
        res=cantidad*90;
        assertEquals(res, Metodos.manilla(cantidad, material, dije, tipo, moneda),0);

    }
    @Test
    public void prueba16(){
        double cantidad=1, res;
        int material=1, dije=2, tipo=4, moneda=2;
        res=cantidad*90*3200;
        assertEquals(res, Metodos.manilla(cantidad, material, dije, tipo, moneda),0);

    }
    @Test
    public void prueba17(){
        double cantidad=1, res;
        int material=2, dije=1, tipo=1, moneda=1;
        res=cantidad*90;
        assertEquals(res, Metodos.manilla(cantidad, material, dije, tipo, moneda),0);

    }
    @Test
    public void prueba18(){
        double cantidad=1, res;
        int material=2, dije=1, tipo=1, moneda=2;
        res=cantidad*90*3200;
        assertEquals(res, Metodos.manilla(cantidad, material, dije, tipo, moneda),0);

    }
    @Test
    public void prueba19(){
        double cantidad=1, res;
        int material=2, dije=1, tipo=2, moneda=1;
        res=cantidad*90;
        assertEquals(res, Metodos.manilla(cantidad, material, dije, tipo, moneda),0);

    }
    @Test
    public void prueba20(){
        double cantidad=1, res;
        int material=2, dije=1, tipo=2, moneda=2;
        res=cantidad*90*3200;
        assertEquals(res, Metodos.manilla(cantidad, material, dije, tipo, moneda),0);

    }
    @Test
    public void prueba21(){
        double cantidad=1, res;
        int material=2, dije=1, tipo=3, moneda=1;
        res=cantidad*70;
        assertEquals(res, Metodos.manilla(cantidad, material, dije, tipo, moneda),0);

    }
    @Test
    public void prueba22(){
        double cantidad=1, res;
        int material=2, dije=1, tipo=3, moneda=2;
        res=cantidad*70*3200;
        assertEquals(res, Metodos.manilla(cantidad, material, dije, tipo, moneda),0);

    }
    @Test
    public void prueba23(){
        double cantidad=1, res;
        int material=2, dije=1, tipo=4, moneda=1;
        res=cantidad*50;
        assertEquals(res, Metodos.manilla(cantidad, material, dije, tipo, moneda),0);

    }
    @Test
    public void prueba24(){
        double cantidad=1, res;
        int material=2, dije=1, tipo=4, moneda=2;
        res=cantidad*50*3200;
        assertEquals(res, Metodos.manilla(cantidad, material, dije, tipo, moneda),0);

    }
    @Test
    public void prueba25(){
        double cantidad=1, res;
        int material=2, dije=2, tipo=1, moneda=1;
        res=cantidad*110;
        assertEquals(res, Metodos.manilla(cantidad, material, dije, tipo, moneda),0);

    }
    @Test
    public void prueba26(){
        double cantidad=1, res;
        int material=2, dije=2, tipo=1, moneda=2;
        res=cantidad*110*3200;
        assertEquals(res, Metodos.manilla(cantidad, material, dije, tipo, moneda),0);

    }
    @Test
    public void prueba27(){
        double cantidad=1, res;
        int material=2, dije=2, tipo=2, moneda=1;
        res=cantidad*110;
        assertEquals(res, Metodos.manilla(cantidad, material, dije, tipo, moneda),0);

    }
    @Test
    public void prueba28(){
        double cantidad=1, res;
        int material=2, dije=2, tipo=2, moneda=2;
        res=cantidad*110*3200;
        assertEquals(res, Metodos.manilla(cantidad, material, dije, tipo, moneda),0);

    }
    @Test
    public void prueba29(){
        double cantidad=1, res;
        int material=2, dije=2, tipo=3, moneda=1;
        res=cantidad*90;
        assertEquals(res, Metodos.manilla(cantidad, material, dije, tipo, moneda),0);

    }
    @Test public void prueba30(){
        double cantidad=1, res;
        int material=2, dije=2, tipo=3, moneda=2;
        res=cantidad*90*3200;
        assertEquals(res, Metodos.manilla(cantidad, material, dije, tipo, moneda),0);

    }
    @Test
    public void prueba31(){
        double cantidad=1, res;
        int material=2, dije=2, tipo=4, moneda=1;
        res=cantidad*80;
        assertEquals(res, Metodos.manilla(cantidad, material, dije, tipo, moneda),0);

    }
    @Test
    public void prueba32(){
        double cantidad=1, res;
        int material=2, dije=2, tipo=4, moneda=2;
        res=cantidad*80*3200;
        assertEquals(res, Metodos.manilla(cantidad, material, dije, tipo, moneda),0);

    }

}