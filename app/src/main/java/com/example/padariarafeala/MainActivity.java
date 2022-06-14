package com.example.padariarafeala;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //ligar a interface
    private TextView boloChocolate;
    private TextView boloCenoura;
    private TextView tortaMorango;
    private TextView salgado;
    private TextView pãoQueijo;
    private EditText qtd1;
    private EditText qtd2;
    private EditText qtd3;
    private EditText qtd4;
    private EditText qtd5;
    private Button calcular;
    private Button limpar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //variavel          id do campo a ser utilizado.
        boloChocolate = (TextView) findViewById(R.id.ID_chocolate);
        boloCenoura =(TextView) findViewById(R.id.ID_cenoura);
        tortaMorango = (TextView) findViewById(R.id.ID_tortaMorango);
        salgado = (TextView) findViewById(R.id.ID_salgado);
        pãoQueijo = (TextView) findViewById(R.id.ID_pãoQueijo);
        qtd1 = (EditText) findViewById(R.id.quantidade1);
        qtd2 = (EditText) findViewById(R.id.quantidade2);
        qtd3 = (EditText) findViewById(R.id.quantidade3);
        qtd4 = (EditText) findViewById(R.id.quantidade4);
        qtd5 = (EditText) findViewById(R.id.quantidade5);
        calcular = (Button) findViewById(R.id.buttonCalcular);
        limpar = (Button) findViewById(R.id.buttonLimpar);
    }

    public void Calcular(View view){


        //guardar a quantidade digitado pelo usuário.
        int QTDBoloChocolate = Integer.parseInt(qtd1.getText().toString());
        int QTDBoloCenoura = Integer.parseInt(qtd2.getText().toString());
        int QTDTortaMorango = Integer.parseInt(qtd3.getText().toString());
        int QTDSalgado = Integer.parseInt(qtd4.getText().toString());
        int QTDPãoQueijo = Integer.parseInt(qtd5.getText().toString());

        //guardar o valor dos produtos.
        int Valor_BoloChocolate = 12;
        int Valor_BoloCenoura = 8;
        int Valor_TortaMorango = 10;
        int Valor_Salgado = 5;
        int Valor_pãoQueijo = 2;

        //Primeiro multiplica a quantidade que o usuário quer depois soma com o preço do produto
        int PreçoQTDBoloChocolate = Valor_BoloChocolate * QTDBoloChocolate;
        int PreçoQTDCenoura = Valor_BoloCenoura * QTDBoloCenoura;
        int PreçoQTDTortaMorango = Valor_TortaMorango * QTDTortaMorango;
        int PreçoQTDSalgado = Valor_Salgado * QTDSalgado;
        int PreçoQTDPãoQueijo = Valor_pãoQueijo * QTDPãoQueijo;

        // resultado final é a soma do valor final dos itens que o usario quer
        int preço_Final = PreçoQTDBoloChocolate + PreçoQTDCenoura + PreçoQTDTortaMorango + PreçoQTDSalgado + PreçoQTDPãoQueijo;


        Toast.makeText(this, "O valor total é: "+ String.valueOf(preço_Final), Toast.LENGTH_LONG).show();
        //calcular.setText(String.valueOf(preço_Final));


    }

    public void limpar(View view){
        int PreçoQTDBoloChocolate = 0;
        int PreçoQTDCenoura = 0;
        int PreçoQTDTortaMorango = 0;
        int PreçoQTDSalgado = 0;
        int PreçoQTDPãoQueijo = 0;

        qtd1.setText(String.valueOf(PreçoQTDBoloChocolate));
        qtd2.setText(String.valueOf(PreçoQTDCenoura));
        qtd3.setText(String.valueOf(PreçoQTDTortaMorango));
        qtd4.setText(String.valueOf(PreçoQTDSalgado));
        qtd5.setText(String.valueOf(PreçoQTDPãoQueijo));
    }
}


