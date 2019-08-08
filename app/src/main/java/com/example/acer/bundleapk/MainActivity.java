package com.example.acer.bundleapk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {
    EditText edtNama, edtAlamat, edtNohp, edtPekerjaan, edtLmkerja, edtAsalsekolah, edtKompetensi;
    Button btnInput;
    String Namanya, Alamatnya, Nohpnya, Pekerjaannya, Lmkerjanya, Asalsekolahnya, Kompetensinya;
    Pegawai Pegawaiku;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtNama=(EditText)findViewById(R.id.edt_nama);
        edtAlamat=(EditText)findViewById(R.id.edt_alamat);
        edtNohp=(EditText)findViewById(R.id.edt_nohp);
        edtPekerjaan=(EditText)findViewById(R.id.edt_pekerjaan);
        edtLmkerja=(EditText)findViewById(R.id.edt_lmkerja);
        edtAsalsekolah=(EditText)findViewById(R.id.edt_aslSekolah);
        edtKompetensi=(EditText)findViewById(R.id.edt_kompetensi);

        btnInput=(Button)findViewById(R.id.btn_input);
        btnInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Namanya = edtNama.getText().toString();
                Alamatnya = edtAlamat.getText().toString();
                Nohpnya = edtNohp.getText().toString();
                Pekerjaannya = edtPekerjaan.getText().toString();
                Lmkerjanya = edtLmkerja.getText().toString();
                Asalsekolahnya = edtAsalsekolah.getText().toString();
                Kompetensinya = edtKompetensi.getText().toString();
                Pegawaiku = new Pegawai(Namanya, Alamatnya,Nohpnya, Pekerjaannya, Lmkerjanya, Asalsekolahnya,Kompetensinya);
                Intent kirim = new Intent(MainActivity.this,DetailActivity.class);
                kirim.putExtra("xxx", (Serializable) Pegawaiku);
                startActivity(kirim);
                }
        });
    }
}
