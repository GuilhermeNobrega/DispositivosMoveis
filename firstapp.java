package com.example.saudacao2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvSaudacao; // Variável nova.
    Button btnSaudacao;
    EditText edtNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtNome =(EditText) findViewById(R.id.txtNome);
        btnSaudacao = (Button) findViewById(R.id.cmdSaudacao);
        btnSaudacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome , saudacao;
                nome = edtNome.getText().toString();
                saudacao = "Seja bem-vindo " + nome + " ao curso de PDM!";
                tvSaudacao.setText(saudacao);
            }
        });
        tvSaudacao=(TextView) findViewById(R.id.lblSaudacao); //Procurando textview com id ldl.
        //tvSaudacao.setText("Seja bem vindo ao curso de PDM!");//Setar um texto nessa variavel.
    }

    // Novo método para dar ação para o botão.
    //public void Saudacao(View v){
        //tvSaudacao.setText("Seja bem vindo ao curso de PDM!");
    }
//}
