package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class SegundoActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);

        Button openSecond = (Button) findViewById(R.id.button4);

        String nombre = getIntent().getStringExtra("nombre");

        Toast.makeText(this,"El nombre que pasaste es: "+nombre,Toast.LENGTH_LONG).show();

        TextView textview1 = (TextView) findViewById(R.id.textview3);

        SwitchCompat sw = (SwitchCompat) findViewById(R.id.switch1);
        ToggleButton tg = (ToggleButton) findViewById(R.id.toggleButton1);

        sw.setChecked(true);

        openSecond.setVisibility(View.GONE);

        tg.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if(isChecked)
                {
                    openSecond.setVisibility(View.VISIBLE);
                }
                else
                {
                    openSecond.setVisibility(View.GONE);
                }
            }
        });

        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if (isChecked)
                {
                    textview1.setVisibility(View.VISIBLE);
                } else
                {
                    textview1.setVisibility(View.GONE);
                }
            }
        });

        openSecond.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(v.getContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}