package co.diana.tallereco;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class Contacto extends AppCompatActivity {

    private EditText editTextNombre;
    private EditText editTextTelefono;
    private Button buttonmas;
    private ListView Contenedor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);

        editTextNombre= findViewById(R.id.editTextNombre);
        editTextTelefono= findViewById(R.id.editTextTelefono);
        buttonmas= findViewById(R.id.buttonmas);
        Contenedor= findViewById(R.id.Contenedor);
    }
}