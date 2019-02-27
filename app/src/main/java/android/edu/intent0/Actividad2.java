package android.edu.intent0;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Actividad2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Como la hemos creado con el asistente, la ha incluido en el MANIFEST
        setContentView(R.layout.activity_actividad2);

        //Recuperamos el Intent que nos ha lanzado
        Intent intent0=getIntent();
        //Recuperamos el EXTRA que hemos llamado "USU"
        String usuario=(String) ((Intent) intent0).getStringExtra("USU");

       //Lo voy a poner en el ActionBar
        ActionBar w=getSupportActionBar();
        w.setTitle("TITULO");
        w.setSubtitle("Usuario ACTUAL: "+usuario);

    }
}
