package co.diana.tallereco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {


    private EditText editTextUsername;
    private Button buttonIngresar;
    private FirebaseDatabase database;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextUsername= findViewById(R.id.editTextUsername);
        buttonIngresar= findViewById(R.id.buttonIngresar);
        database=FirebaseDatabase.getInstance();

        buttonIngresar.setOnClickListener(
                (v)->{
                   String nombre= editTextUsername.getText().toString();
                   Intent intent= new Intent(this,Contacto.class);

                }
        );

    }
}