package com.example.gabriela.usadaotrucksappfinal;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class ContatoActivity extends Activity implements AdapterView.OnItemSelectedListener {

    Spinner spinner;
//teste
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contato);

        spinner= (Spinner) findViewById(R.id.spinner);

      ArrayAdapter adapter=ArrayAdapter.createFromResource(this,R.array.selecione,android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
       // Toast.makeText(this,"Voce selecionou",Toast.LENGTH_SHORT).show();
        TextView myText=(TextView) view;
        Toast.makeText(this,"Você selecionou"+myText.getText(),Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

}
