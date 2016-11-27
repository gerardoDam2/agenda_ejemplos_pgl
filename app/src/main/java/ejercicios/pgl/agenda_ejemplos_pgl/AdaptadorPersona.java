package ejercicios.pgl.agenda_ejemplos_pgl;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Gerardo on 17/11/2016.
 */

public class AdaptadorPersona extends ArrayAdapter<Persona> {

    public AdaptadorPersona(Context context, ArrayList<Persona> datos) {
        super(context, R.layout.persona_list_item, datos);
    }

    @Override
    public View getView(int position, View converView, ViewGroup parent){

        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.persona_list_item, null);

        TextView nombreText = (TextView) item.findViewById(R.id.nombreTextView);
        if (nombreText!=null)
        nombreText.setText(getItem(position).getNombre());

        TextView numeroText = (TextView) item.findViewById(R.id.numeroTextView);
        if (numeroText!=null)
        numeroText.setText(getItem(position).getNumero());

        return item;
    }
}

