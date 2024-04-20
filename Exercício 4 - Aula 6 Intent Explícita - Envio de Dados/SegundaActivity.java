package com.example.enviodedados;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.enviodedados.model.Pessoa;

public class SegundaActivity extends AppCompatActivity {
    TextView tvNome, tvIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_segunda);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        tvNome = (TextView) findViewById(R.id.lblNome);
        tvIdade = (TextView) findViewById(R.id.lblIdade);
        Bundle dados = getIntent().getExtras();

        // String nome = dados.getString("nome");
        // int idade = dados.getInt("idade");
        Pessoa pessoa = (Pessoa)dados.getSerializable("obejto");
        tvNome.setText(pessoa.getNome());
        tvIdade.setText(String.valueOf(pessoa.getIdade()));
    }
}