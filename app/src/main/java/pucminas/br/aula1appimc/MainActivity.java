package pucminas.br.aula1appimc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void CalcularIMC(View view){
        TextView lblIMC = findViewById(R.id.lblIMCId);
        TextView lblIMCClassificacao = findViewById(R.id.lblIMCClassificacaoId);
        EditText txtPeso = findViewById(R.id.txtPesoId);
        EditText txtAltura = findViewById(R.id.txtAlturaId);

        double peso = Double.valueOf(txtPeso.getText().toString());
        double altura = Double.parseDouble(txtAltura.getText().toString())/100;
        double imc =  calcularIMC(peso, altura);

        String result = String.format("%.2f", imc);
        String classificacao = getClassificacao(imc);

        lblIMC.setText(result);
        lblIMCClassificacao.setText(classificacao);
    }

    private double calcularIMC(double peso, double altura){
        double imc =  peso/(altura*altura);

        return imc;
    }

    private String getClassificacao(double imc){
        if(imc < 16){
            return "Magreza grave";
        } else if (imc < 17){
            return "Magreza moderada";
        } else if (imc < 18.5){
            return "Magreza leve";
        } else if (imc < 25){
            return "Saudável";
        } else if (imc < 30){
            return "Sobrepeso";
        } else if (imc < 35){
            return "Obesidade Grau I";
        } else if (imc < 40){
            return "Obesidade Grau II (severa)";
        }
        return "Obesidade Grau III (mórbida)";
    }
}
