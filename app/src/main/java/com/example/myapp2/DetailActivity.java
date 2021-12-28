package com.example.myapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    ImageView imgMakanan;
    TextView txtNamaMakanan;
    TextView txtInfoMakanan;
    TextView txtHargaMakanan;

    Button btnKurang, btnTambah, ordering;
    TextView tampilanJumlah;

    int angka = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imgMakanan = findViewById(R.id.imgMakanan);
        txtNamaMakanan = findViewById(R.id.txtNamaMakanan);
        txtInfoMakanan = findViewById(R.id.txtInfoMakanan);
        txtHargaMakanan = findViewById(R.id.txtHargaMakanan);

        btnKurang = findViewById(R.id.kurang);
        tampilanJumlah = findViewById(R.id.jumlah);
        btnTambah = findViewById(R.id.tambah);
        ordering = findViewById(R.id.detailPesanan);

        getIncomingExtra();
    }

    private void getIncomingExtra(){
        if(getIntent().hasExtra("foto_makanan") && getIntent().hasExtra("nama_makanan") && getIntent().hasExtra("info_makanan") && getIntent().hasExtra("harga_makanan")){

            String fotoMakanan = getIntent().getStringExtra("foto_makanan");
            String namaMakanan = getIntent().getStringExtra("nama_makanan");
            String infoMakanan = getIntent().getStringExtra("info_makanan");
            String hargaMakanan = getIntent().getStringExtra("harga_makanan");

            setDataActivity(fotoMakanan, namaMakanan, infoMakanan, hargaMakanan);

        }
    }

    private void setDataActivity(String fotoMakanan, String namaMakanan, String infoMakanan, String hargaMakanan){

        Glide.with(this).asBitmap().load(fotoMakanan).into(imgMakanan);

        txtNamaMakanan.setText(namaMakanan);
        txtInfoMakanan.setText(infoMakanan);
        txtHargaMakanan.setText(hargaMakanan);

        int hargaTetap = Integer.parseInt(hargaMakanan);
        final int[] harga = {Integer.parseInt(hargaMakanan)};

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                angka++;
                if(angka > 1) {
                    String angkaStr = String.valueOf(angka);
                    tampilanJumlah.setText(angkaStr);
                    harga[0] = harga[0] + hargaTetap;
                    txtHargaMakanan.setText(String.valueOf(harga[0]));
                }else{
                    txtHargaMakanan.setText(hargaMakanan);
                }
            }
        });

        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(angka <= 1){
                    tampilanJumlah.setText("1");
                    txtHargaMakanan.setText(hargaMakanan);
                }else{
                    angka--;
                    String angkaStr = String.valueOf(angka);
                    tampilanJumlah.setText(angkaStr);
                    harga[0] = harga[0] - hargaTetap;
                    txtHargaMakanan.setText(String.valueOf(harga[0]));
                }
            }
        });

        ordering.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailActivity.this, Pesanan.class);
                intent.putExtra("harga", String.valueOf(harga[0]));

                startActivity(intent);
            }
        });

    }


}