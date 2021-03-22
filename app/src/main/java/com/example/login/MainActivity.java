package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText edtUsuario = findViewById(R.id.edtUsuario);
        final EditText edtPassword = findViewById(R.id.edtPassword);

        final Button btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String conteudo = "Usuário: "+edtUsuario.getText()+" Senha: "+edtPassword.getText();
                Toast.makeText(getApplicationContext(), conteudo, Toast.LENGTH_LONG).show();
                // no lugar do texto "clicou no login", exibe o texto digitado nos 2 elementos
            }
        });

        final Button btnSair = findViewById(R.id.btnSair);
        btnSair.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Clicou para Sair", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}