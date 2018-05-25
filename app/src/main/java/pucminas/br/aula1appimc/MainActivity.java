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
        EditText txtPeso = findViewById(R.id.txtPesoId);
        EditText txtAltura = findViewById(R.id.txtAlturaId);
        double peso = Double.valueOf(txtPeso.getText().toString());
        double altura = Double.parseDouble(txtAltura.getText().toString())/100;
        double imc =  Math.round(peso/(altura*altura));
        String result = String.valueOf(imc);
        lblIMC.setText(result);
    }

    // public void getStatus(double imc)

}
