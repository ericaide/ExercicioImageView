package com.example.imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button botao_seguir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao_seguir = findViewById(R.id.botao_seguir);

        botao_seguir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                botaoEnviar();
            }
        });


    }

    private void botaoEnviar(){
        Toast.makeText(this,"Você está seguindo Vinicius Oliveira", Toast.LENGTH_SHORT).show();
    }



}
