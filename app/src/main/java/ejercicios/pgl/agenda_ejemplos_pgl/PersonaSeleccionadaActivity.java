package ejercicios.pgl.agenda_ejemplos_pgl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PersonaSeleccionadaActivity extends AppCompatActivity {

    TextView nombreTextview,numeroTextview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.persona_seleccionada);
        nombreTextview=(TextView)findViewById(R.id.nombreTextView);
        numeroTextview=(TextView)findViewById(R.id.numeroTextView);
        Intent intent = getIntent();
        Persona persona= (Persona) intent.getSerializableExtra("PERSONA");
        nombreTextview.setText(persona.getNombre());
        numeroTextview.setText(persona.getNumero());


    }
}
