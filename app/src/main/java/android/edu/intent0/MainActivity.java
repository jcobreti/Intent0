package android.edu.intent0;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=findViewById(R.id.editText);
    }

    public void irActividad2(View view) {
        Intent intent=new Intent(this, Actividad2.class);
        intent.putExtra("USU",et.getText().toString());
        startActivity(intent);
    }
}
