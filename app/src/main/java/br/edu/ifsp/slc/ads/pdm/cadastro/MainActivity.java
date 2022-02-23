package br.edu.ifsp.slc.ads.pdm.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button salvarBtn;
    private Button limparBtn;

    private EditText edtNome;
    private EditText edtTelefone;
    private EditText edtEmail;
    private CheckBox checkBox;
    private RadioButton mascRb;
    private RadioButton femRb;
    private EditText edtCidade;
    private Spinner spinnerUF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNome = findViewById(R.id.edtNome);
        edtTelefone = findViewById(R.id.edtTelefone);
        edtEmail = findViewById(R.id.edtEmail);
        checkBox = findViewById(R.id.checkBox);
        mascRb = findViewById(R.id.radioMas);
        femRb = findViewById(R.id.radioFem);
        edtCidade = findViewById(R.id.edtCidade);
        spinnerUF = findViewById(R.id.spinnerUF);

        salvarBtn = findViewById(R.id.SalvarBtn);
        salvarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Formulario form = new Formulario();
                form.setNomeCompleto(edtNome.getText().toString());
                form.setTelefone(edtTelefone.getText().toString());
                form.setEmail(edtEmail.getText().toString());
                form.setIngressarLista(checkBox.isChecked());
                form.setSexo(String.valueOf(mascRb.isChecked() ? mascRb.getText() : femRb.getText()));
                form.setUf(((TextView) spinnerUF.getSelectedView()).getText().toString());
                Toast.makeText(MainActivity.this, form.toString(), Toast.LENGTH_SHORT).show();
            }
        });

        limparBtn = findViewById(R.id.LimparBtn);
        limparBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtNome.setText("");
                edtTelefone.setText("");
                edtEmail.setText("");
                edtCidade.setText("");
                checkBox.setText("");
                mascRb.setText("");
                femRb.setText("");
                spinnerUF.setSelection(0);
            }
        });
    }
}