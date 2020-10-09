package com.example.myapp3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.myapp3.model.Movie;
import com.example.myapp3.model.MovieData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private Spinner spinner;
private ArrayAdapter<Movie> adapter;
private ListView listView;
private SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner =findViewById(R.id.idSpen);
        listView=findViewById(R.id.lisId);
        searchView=findViewById(R.id.searchId);
    }

    public void SubmitClick(View view) {
        String item= spinner.getSelectedItem().toString();

        Toast.makeText(this,item, Toast.LENGTH_SHORT).show();
    }

    public void SearchOnclick(View view) {
        MovieData data = new MovieData();

        adapter = new ArrayAdapter<Movie>(this, android.R.layout.simple_list_item_1, data.movies);
        listView.setAdapter(adapter);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                adapter.getFilter().filter(s);
                return false;
            }
        });




    }

}