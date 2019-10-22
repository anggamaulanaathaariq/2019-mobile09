package id.ac.polinema.recyclerviewsangatsederhana;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.recyclerviewsangatsederhana.adapters.SuperHeroAdapter;
import id.ac.polinema.recyclerviewsangatsederhana.models.SuperHero;

public class MainActivity extends AppCompatActivity {
    //instansiasi Recyclerview
    RecyclerView rvSuperHero;
    //instansiasi list superhero
    List<SuperHero> listSuperHero = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //menyambungkan rvSuperHero ke layout
        rvSuperHero = findViewById(R.id.rvSuperHero);
        //Membuat object hero
        SuperHero hero = new SuperHero("Petruk");
        //menambahkan hero ke listSuperHero
        listSuperHero.add(hero);
        //membuat object hero baru
        hero = new SuperHero("Gareng");
        //menambahkan hero baru ke listSuperhero
        listSuperHero.add(hero);

        SuperHero hero2 = new SuperHero("Kimmi");
        //menambahkan hero ke listSuperHero
        listSuperHero.add(hero2);

        SuperHero hero3 = new SuperHero("Mia");
        //menambahkan hero ke listSuperHero
        listSuperHero.add(hero3);

        SuperHero hero4 = new SuperHero("Wiz");
        //menambahkan hero ke listSuperHero
        listSuperHero.add(hero4);

        SuperHero hero5 = new SuperHero("Tyga");
        //menambahkan hero ke listSuperHero
        listSuperHero.add(hero5);

        SuperHero hero6 = new SuperHero("Chewy");
        //menambahkan hero ke listSuperHero
        listSuperHero.add(hero6);

        SuperHero hero7 = new SuperHero("Khaled");
        //menambahkan hero ke listSuperHero
        listSuperHero.add(hero7);

        SuperHero hero8 = new SuperHero("Iwa");
        //menambahkan hero ke listSuperHero
        listSuperHero.add(hero8);

        SuperHero hero9 = new SuperHero("Chewy");
        //menambahkan hero ke listSuperHero
        listSuperHero.add(hero9);

        SuperHero hero10 = new SuperHero("Khaled");
        //menambahkan hero ke listSuperHero
        listSuperHero.add(hero10);

        SuperHero hero11 = new SuperHero("Iwa");
        //menambahkan hero ke listSuperHero
        listSuperHero.add(hero11);

        SuperHero hero12 = new SuperHero("Iwa");
        //menambahkan hero ke listSuperHero
        listSuperHero.add(hero12);

        SuperHero hero13 = new SuperHero("Iwa");
        //menambahkan hero ke listSuperHero
        listSuperHero.add(hero13);

        SuperHero hero14 = new SuperHero("Iwa");
        //menambahkan hero ke listSuperHero
        listSuperHero.add(hero14);

        SuperHero hero15 = new SuperHero("Iwa");
        //menambahkan hero ke listSuperHero
        listSuperHero.add(hero15);

        //Instansiasi Adapter
        SuperHeroAdapter superHeroAdapter = new SuperHeroAdapter(listSuperHero);
        //set adapter dan layoutmanager
        rvSuperHero.setAdapter(superHeroAdapter);
        rvSuperHero.setLayoutManager(new LinearLayoutManager(this));
    }
}
