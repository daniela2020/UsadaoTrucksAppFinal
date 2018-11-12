package com.example.gabriela.usadaotrucksappfinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class EditarActivity extends AppCompatActivity {

    @Override
    //metodo para criar activity//
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar);

    }
    public void editar (View view){
        PecasCrudRemoto c = new PecasCrudRemoto();
        //findviewbyid=Esse método é utilziado para buscar e recupera as Views dentro do layout
        EditText etNome_peca = findViewById(R.id.etNome_peca);
        EditText etVeiculo = findViewById(R.id.etVeiculo);
        EditText etAno = findViewById(R.id.etAno);

        //abaixo get.text e to.string ele faz é retornar uma representação textual em String do objeto em questão.
        //POST: Utilizado para inserir dados remotamente.
        c.execute("POST",etNome_peca.getText().toString(),
                etVeiculo.getText().toString(),
                etAno.getText().toString());
        finish();

    }
    //Para encerrar uma atividade, chame o método finish()
        public void cancelar(View view){ finish();
    }

}
