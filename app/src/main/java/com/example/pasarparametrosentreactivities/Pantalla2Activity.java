package com.example.pasarparametrosentreactivities;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.widget.TextView;

import com.example.pasarparametrosentreactivities.beans.Usuario;
import com.example.pasarparametrosentreactivities.datos.SeasData;

public class Pantalla2Activity extends AppCompatActivity {
    private TextView txtUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

        txtUser = (TextView) findViewById(R.id.txtUserPantalla2);

        //Bundle variables = getIntent().getExtras();
        //String user = variables.getString("USUARIO");
        //Usuario miUsuario = (Usuario) variables.getSerializable("USUARIO");

        txtUser.setText(SeasData.getUsuario().getEmail());
    }

}
