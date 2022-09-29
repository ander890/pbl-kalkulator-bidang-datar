package xyz.dvlprs.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtPanjang, edtLebar;
    TextView txtLuas, txtKeliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init(){
        edtPanjang = findViewById(R.id.edtPanjang);
        edtLebar = findViewById(R.id.edtLebar);
        txtLuas = findViewById(R.id.txtLuas);
        txtKeliling = findViewById(R.id.txtKeliling);
    }

    public void HitungPersergi(View v){
        double panjang = Double.parseDouble(edtPanjang.getText().toString());
        double lebar = Double.parseDouble(edtLebar.getText().toString());

        double luas = panjang * lebar;
        double keliling = (panjang * 2) + (lebar * 2);

        txtLuas.setText("Luas Persegi : " + luas + " cm²");
        txtKeliling.setText("Keliling Persegi : " + keliling + " cm");
    }

    public void HitungLingkaran(View v){
        double diameter = Double.parseDouble(edtPanjang.getText().toString());
        double jariJari = diameter / 2;

        double luas = Math.PI * (jariJari * jariJari);
        double keliling = Math.PI * diameter;

        txtLuas.setText("Luas Lingkaran : " + luas + " cm²");
        txtKeliling.setText("Keliling Lingkaran : " + keliling + " cm");
    }

    public void HitungSegitiga(View v){
        double alas = Double.parseDouble(edtPanjang.getText().toString());
        double tinggi = Double.parseDouble(edtLebar.getText().toString());

        double luas = (alas * tinggi) / 2;

        double sisiMiring = Math.sqrt(((alas / 2) * (alas / 2)) + (tinggi * tinggi));
        double keliling = alas + sisiMiring + sisiMiring;

        txtLuas.setText("Luas Segitiga : " + luas + " cm²");
        txtKeliling.setText("Keliling Segitiga : " + keliling + " cm");
    }
}