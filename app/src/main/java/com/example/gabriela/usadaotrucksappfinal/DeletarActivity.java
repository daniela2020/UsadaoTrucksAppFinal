package com.example.gabriela.usadaotrucksappfinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class DeletarActivity extends AppCompatActivity {

    //chamado p iniciar uma atividade
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deletar);
    }

    public void deletar(View view) {
        PecasCrudRemoto c = new PecasCrudRemoto();
         //findviewbyid=Esse método é utilziado para buscar e recupera as Views dentro do layout
        EditText etNome_peca = findViewById(R.id.etNome_peca);
        //EditText tvIEditTextd = findViewById(R.id.tvId);
        EditText etVeiculo = findViewById(R.id.etVeiculo);
        EditText etAno = findViewById(R.id.etAno);

        //abaixo get.text e to.string ele faz é retornar uma representação textual em String do objeto em questão.
        //POST: Utilizado para inserir dados remotamente.
        c.execute("DELETE", etNome_peca.getText().toString(),
                etVeiculo.getText().toString(),
                etAno.getText().toString());
        finish();

    }

    //Para encerrar uma atividade, chame o método finish()
    public void cancelar(View v) {
        finish();
    }

}


