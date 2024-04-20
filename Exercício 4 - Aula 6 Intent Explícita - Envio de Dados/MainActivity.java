package com.example.enviodedados;

import android.content.Intent;
import android.os.Bundle;
import android.os.FileObserver;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.enviodedados.model.Pessoa;

public class MainActivity extends AppCompatActivity {
    Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btnEnviar=(Button) findViewById(R.id.cmdEnviar);
        btnEnviar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intencao = new Intent(MainActivity.this, SegundaActivity.class);
                //intencao.putExtra("nome","Raimundo Neto");
                //intencao.putExtra("idade",48);
                Pessoa pessoa = new Pessoa();
                pessoa.setNome("Raiumundo Neto");
                pessoa.setIdade(48);
                intencao.putExtra("objeto",pessoa);
                startActivity(intencao);
            }
        });

    }
}