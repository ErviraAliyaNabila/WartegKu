package com.example.myapp2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    private ArrayList<String> fotoMakanan = new ArrayList<>();
    private ArrayList<String> namaMakanan = new ArrayList<>();
    private ArrayList<String> infoMakanan = new ArrayList<>();
    private ArrayList<String> hargaMakanan = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        getDataFromInternet();
    }

    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(fotoMakanan, namaMakanan, infoMakanan, hargaMakanan, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getDataFromInternet(){
        namaMakanan.add("Orek Tempe");
        fotoMakanan.add("https://akcdn.detik.net.id/community/media/visual/2020/12/19/orek-tempe.jpeg?w=1254");
        infoMakanan.add("Orek tempe adalah olahan tempe yang dioseng dengan sejumlah bumbu dan kecap manis. Ada dua jenis orek tempe yang basah dan kering.");
        hargaMakanan.add("3000");

        namaMakanan.add("Terong Balado");
        fotoMakanan.add("https://akcdn.detik.net.id/community/media/visual/2020/01/23/4e34734d-f0b0-4a7d-842f-09838d577980.jpeg?w=1254");
        infoMakanan.add("Ingin makan sayur dengan cita rasa yang kuat? Pilih menu terong balado. Terong yang digoreng dan dimasak dengan bumbu balado ini juga jadi favorit banyak orang.");
        hargaMakanan.add("4000");

        namaMakanan.add("Perkedel");
        fotoMakanan.add("https://akcdn.detik.net.id/community/media/visual/2021/05/18/resep-perkedel-kentang-yang-mulus-anti-retak.jpeg?w=2000");
        infoMakanan.add("Perkedel kentang banyak dipilih karena rasanya yang gurih, teksturnya empuk dan mengenyangkan.");
        hargaMakanan.add("2000");

        namaMakanan.add("Tumis Kangkung");
        fotoMakanan.add("https://akcdn.detik.net.id/community/media/visual/2019/12/03/8e829ee8-91b2-4fc6-9141-9616129042d4.jpeg?w=724");
        infoMakanan.add("Kangkung ditumis dengan bawang merah, bawang putih, cabe dan terasi.");
        hargaMakanan.add("5000");

        namaMakanan.add("Oseng Kacang Panjang");
        fotoMakanan.add("https://akcdn.detik.net.id/community/media/visual/2021/03/20/oseng-pedas-kacang-panjang.jpeg?w=2121");
        infoMakanan.add("Kacang panjang diolah dengan cara ditumis dengan bumbu yang sederhana seperti bawang merah, bawang putih, cabai, lengkuas, garam, dan penyedap rasa.");
        hargaMakanan.add("3000");

        namaMakanan.add("Sayur Lodeh");
        fotoMakanan.add("https://akcdn.detik.net.id/community/media/visual/2020/12/19/orek-tempe.jpeg?w=1254");
        infoMakanan.add("Sayur lodeh merupakan sayur berkuah yang berisikan aneka sayuran yang dimasak dengan bumbu rempah dan santan. Sayuran yang dipakai terdiri dari kacang panjang, terong, tempe, labu siam, dan jagung.");
        hargaMakanan.add("2000");

        namaMakanan.add("Ayam Geprek");
        fotoMakanan.add("https://keluyuran.com/wp-content/uploads/2018/01/Ayam-Geprek-Djogjakarto.webp");
        infoMakanan.add("Anda bisa memilih sendiri jenis sambal yang ingin dipakai untuk menggeprek ayam, mulai dari sambal bawang, sambal terasi, sambal ijo, sambal matah, sambal pete, dan sambalado.");
        hargaMakanan.add("10000");

        namaMakanan.add("Ayam Bakar Kecap");
        fotoMakanan.add("https://www.resepistimewa.com/wp-content/uploads/cara-membuat-ayam-bakar-kecap.jpg");
        infoMakanan.add("Ayam yang di bakar lalu dibaluri banyak kecap dan lalapan.");
        hargaMakanan.add("12000");

        namaMakanan.add("Ikan Cucut");
        fotoMakanan.add("https://selerasa.com/wp-content/uploads/2015/12/images_ikan_Ikan-cucut_ikan-cucut-kemangi.JPG");
        infoMakanan.add(" Ikan Cucut Daun Kemangi Yang Harum dan Pedas.");
        hargaMakanan.add("8000");


        prosesRecyclerViewAdapter();
    }
}