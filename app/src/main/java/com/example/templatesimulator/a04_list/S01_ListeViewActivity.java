package com.example.templatesimulator.a04_list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.templatesimulator.R;

public class S01_ListeViewActivity extends AppCompatActivity {

    private ListView lvListView;

    /** Méthode 1 avec un tableau dans le java **/
    private String[] stagiaires = new String[]{
            "David 1", "Naoufel", "Stanlenes", "Laureline","Nadia","Didier", "Simon", "Rima", "David 2", "Naziha", "Jérôme", "Ali", "Khadim"
    };


    public void populateListVew(){

        String[] listCouleur = getResources().getStringArray(R.array.liste_couleurs);

        final ArrayAdapter<String> adapter = new ArrayAdapter<>(
          // le contexte     la mise en forme    les données à afficher
          this, android.R.layout.simple_list_item_1, listCouleur);

        lvListView.setAdapter(adapter);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s01_liste_view);

        lvListView = findViewById(R.id.lv_listview);
        populateListVew();
    }
}