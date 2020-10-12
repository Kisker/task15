package net.learn2develop.task15;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);

        List<Jelo> jela = new ArrayList<>();
        Jelo jelo1 = new Jelo(1, "Domaca supa", "Govedja supa sa planinskih obronka Zlatibora");
        jela.add(jelo1);
        Jelo jelo2 = new Jelo(1, "Supa", "Juneca supa");
        jela.add(jelo2);
        Jelo jelo3 = new Jelo(2, "Cevapi", "10 banjaluckih cevapa");
        jela.add(jelo3);
        Jelo jelo4 = new Jelo(3, "Sladoled", "Cokoladni domaci sladoled");
        jela.add(jelo4);
        Jelo jelo5 = new Jelo(3, "BeMix", "Miks od organskih vocnih proizvoda");
        jela.add(jelo5);

        ArrayAdapter<Jelo> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, jela);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Jelo jela = (Jelo) parent.getSelectedItem();
                displayjeloData(jela);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    public void getSelected (View v){
        Jelo jela = (Jelo) spinner.getSelectedItem();
        displayjeloData(jela);
    }
    public void displayjeloData(Jelo jelo){
        int ID = jelo.getID();
        String ime = jelo.getIme();
        String opis = jelo.getOpis();

        String jeloData = "Meni broj: " + ID + "\nIme: " + ime +  "\nOpis: " + opis;
        Toast.makeText(this, jeloData, Toast.LENGTH_LONG).show();
    }
}