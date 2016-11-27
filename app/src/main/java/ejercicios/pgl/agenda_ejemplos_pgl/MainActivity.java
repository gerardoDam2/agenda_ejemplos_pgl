package ejercicios.pgl.agenda_ejemplos_pgl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listaPersona;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final ArrayList<Persona> personas = new ArrayList<>();
        for (int i = 0; i<20 ; i++){
            personas.add(new Persona("persona"+i,"00000000"));
        }

        listaPersona= (ListView) findViewById(R.id.listapersonas);
        AdaptadorPersona adaptador = new AdaptadorPersona(this,personas);
        listaPersona.setAdapter(adaptador);
        
        listaPersona.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Persona item =(Persona) parent.getItemAtPosition(position);
                Intent intent = new Intent(MainActivity.this,PersonaSeleccionadaActivity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("PERSONA",item);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }


}
