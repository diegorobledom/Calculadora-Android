package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt1 = (Button) findViewById(R.id.buttonList);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(v.getContext(),ListViewActivity.class);
                startActivity(i);
            }
        });


    }

    //Método para Lanzar Segundo Activity
    public void SegundoActivity(View view)
    {
        Intent intent = new Intent (view.getContext(), SegundoActivity.class);

        startActivity(intent);
    }

    public void CapturarDatos(View view)
    {
        EditText texto = (EditText) findViewById(R.id.editText1);
        TextView textview1 = (TextView) findViewById(R.id.textView2);

        String textoET = texto.getText().toString();

        textview1.setText(textoET);
        Toast.makeText(view.getContext(),"Su nombre es: "+textoET,Toast.LENGTH_LONG).show();
    }
}


