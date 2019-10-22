package id.ac.polinema.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.myapplication.adapters.RecycleAdapter;
import id.ac.polinema.myapplication.models.Album;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvAlbum;
    //instansiasi list album
    List<Album> listAlbum = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //menyambungkan rvSuperHero ke layout
        rvAlbum = findViewById(R.id.rvAlbum);
        //Membuat object hero
        Album list = new Album("O.N.I.F.C", R.drawable.album1);
        //menambahkan hero ke listSuperHero
        listAlbum.add(list);
        //membuat object hero baru
        Album list2 = new Album("Beach House 3", R.drawable.album2);
        //menambahkan hero baru ke listSuperhero
        listAlbum.add(list2);
        Album list3 = new Album("Gang Sh*t Only", R.drawable.album3);
        //menambahkan hero ke listSuperHero
        listAlbum.add(list3);

        Album list4 = new Album("Highly Intoxicated", R.drawable.album4);
        //menambahkan hero ke listSuperHero
        listAlbum.add(list4);

        Album list5 = new Album("Valifornication", R.drawable.album5);
        //menambahkan hero ke listSuperHero
        listAlbum.add(list5);

        Album list6 = new Album("The Big Pescado", R.drawable.album6);
        //menambahkan hero ke listSuperHero
        listAlbum.add(list6);

        RecycleAdapter recycleAdapter = new RecycleAdapter(listAlbum);
        //set adapter dan layoutmanager
        rvAlbum.setAdapter(recycleAdapter);
        rvAlbum.setLayoutManager(new LinearLayoutManager(this));

    }
}