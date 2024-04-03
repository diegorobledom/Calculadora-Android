package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Calculadora extends AppCompatActivity
{
    TextView textview1;

    double datoDouble1, datoDouble2, resultado;

    String datoString1, datoString2, tipoOperacion, resultadoPrevio;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        textview1 = (TextView) findViewById(R.id.textView);
    }

    public void cero(View v)
    {
        textview1.append("0");
    }

    public void uno(View v)
    {
        textview1.append("1");
    }

    public void dos(View v)
    {
        textview1.append("2");
    }

    public void tres(View v)
    {
        textview1.append("3");
    }

    public void cuatro(View v)
    {
        textview1.append("4");
    }

    public void cinco(View v)
    {
        textview1.append("5");
    }

    public void seis(View v)
    {
        textview1.append("6");
    }

    public void siete(View v)
    {
        textview1.append("7");
    }

    public void ocho(View v)
    {
        textview1.append("8");
    }

    public void nueve(View v)
    {
        textview1.append("9");
    }

    public void suma(View v)
    {
        if(resultadoPrevio!=null)
        {
            datoDouble1=resultado;
        } else
        {
            datoString1 = textview1.getText().toString();
            datoDouble1 = Double.parseDouble(datoString1);
        }

        textview1.setText("");

        tipoOperacion="suma";
    }

    public void resta(View v)
    {
        if(resultadoPrevio!=null)
        {
            datoDouble1=resultado;
        } else
        {
            datoString1 = textview1.getText().toString();
            datoDouble1 = Double.parseDouble(datoString1);
        }

        textview1.setText("");

        tipoOperacion="resta";
    }

    public void resultado(View v)
    {
        datoString2 = textview1.getText().toString();
        datoDouble2 = Double.parseDouble(datoString2);

        textview1.setText("");

        if(tipoOperacion.equals("suma"))
        {
            resultado = datoDouble1+datoDouble2;
        } else
            if (tipoOperacion.equals("resta"))
            {
                resultado = datoDouble1-datoDouble2;
            }

        textview1.setText(String.valueOf(resultado));
    }

    public void BorrarTodo(View v)
    {
        datoDouble1=0;
        datoDouble2=0;
        resultado=0;
        textview1.setText("");
    }
}
