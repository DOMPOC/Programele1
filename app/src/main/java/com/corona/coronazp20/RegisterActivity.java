package com.corona.coronazp20; // failo vieta diske

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {//pradzia

    @Override
    protected void onCreate(Bundle savedInstanceState) {  // jei nera bibliotekos galima pridet
        // alt+enter
        super.onCreate(savedInstanceState);// atidaromas tuscias langas
        setContentView(R.layout.activity_register);//uzkrauna vaizda
        final EditText username=findViewById(R.id.username);
        final EditText password=findViewById(R.id.password);
        final EditText email=findViewById(R.id.email);
        Button register_btn=findViewById(R.id.register_btn);

        register_btn.setOnClickListener(new View.OnClickListener() {//mygtuko veiksmai paspaudus
            @Override
            public void onClick(View view) {
                //nuo cia rasomas kodas kuris veiks paspaudus mygtuka register
                Toast.makeText(RegisterActivity.this, "Prisijungimo vardas:"
                                +username.getText().toString()+
                                "\n"+"Slaptazodis:"+password.getText().toString()+"\n"+"Emailas"
                                +email.getText().toString()+"\n",
                        Toast.LENGTH_SHORT).show();
                //if (Validation.isValidPassword(password.getText().toString())
            }// baigiasi funkcija
        });


    }//funkcija
}  // klase//pabaiga atidaro ir uzdaro klases, funkcijas, salygas ir ciklus.
    // ctrl+alt+l formatavimas kodo
