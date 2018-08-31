package com.example.android.primertaller;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class Principal extends AppCompatActivity {

    private EditText cantidad;
    private TextView res;
    private Spinner material;
    private Spinner dije;
    private Spinner tipo;
    private Spinner moneda;
    private String op[];
    private String op2[];
    private String op3[];
    private String op4[];
    private Resources recursos;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        cantidad = findViewById(R.id.txtcantidad);
        res = findViewById(R.id.txtresultado);
        material = findViewById(R.id.cmbmaterial);
        dije = findViewById(R.id.cmbdije);
        tipo = findViewById(R.id.cmbtipo);
        moneda = findViewById(R.id.cmbmoneda);


        recursos = this.getResources();

        op = recursos.getStringArray(R.array.material);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, op);
        material.setAdapter(adapter);

        op2 = recursos.getStringArray(R.array.dije);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, op2);
        dije.setAdapter(adapter2);


        op3 = recursos.getStringArray(R.array.tipo);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, op3);
        tipo.setAdapter(adapter3);

        op4 = recursos.getStringArray(R.array.moneda);
        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, op4);
        moneda.setAdapter(adapter4);

    }

    public void calcular (View v){
         int material2, dije2, tipo2, moneda2;
        double cantidad2=0, resultado=0;

        if (validar()) {

            material2 = material.getSelectedItemPosition();
            dije2 = dije.getSelectedItemPosition();
            tipo2 = tipo.getSelectedItemPosition();
            moneda2 = moneda.getSelectedItemPosition();
            cantidad2 = Double.parseDouble(cantidad.getText().toString());

            resultado = Metodos.manilla(cantidad2, material2, dije2, tipo2, moneda2);

            res.setText("" + String.format("%.2f", resultado));

        }
    }

    public boolean validar (){
        int materi, dijem, tipom, monedam, canti;

        materi = material.getSelectedItemPosition();
        dijem  = dije.getSelectedItemPosition();
        tipom  = tipo.getSelectedItemPosition();
        monedam= moneda.getSelectedItemPosition();

        if (cantidad.getText().toString().isEmpty()){
            cantidad.setError(recursos.getString(R.string.Error1));
            cantidad.requestFocus();
            res.setText("Resultado");
            return false;
        }
        canti=Integer.parseInt(cantidad.getText().toString());
        if (canti<=0){
            cantidad.setError(recursos.getString(R.string.Error6));
            cantidad.requestFocus();
            res.setText("Resultado");
            return false;

        }

        if (materi==0){
            Toast.makeText(this, recursos.getString(R.string.Error2), Toast.LENGTH_SHORT).show();
            return false;
        }

        if (dijem==0){
            Toast.makeText(this, recursos.getString(R.string.Error3), Toast.LENGTH_SHORT).show();
            return false;
        }

        if (tipom==0){
            Toast.makeText(this, recursos.getString(R.string.Error4), Toast.LENGTH_SHORT).show();
            return false;
        }

        if (monedam==0){
            Toast.makeText(this, recursos.getString(R.string.Error5), Toast.LENGTH_SHORT).show();
            return false;
        }

      return true;
    }

    public void limpiar (View v){
       cantidad.setText("");
       material.setSelection(0);
       dije.setSelection(0);
       tipo.setSelection(0);
       moneda.setSelection(0);
       res.setText("Resultado");
       cantidad.requestFocus();
    }
}
