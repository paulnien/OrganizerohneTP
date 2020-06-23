package com.example.gruppe3;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.MenuInflater;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity
{


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void openMensa(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.akafoe.de/gastronomie/speiseplaene-der-mensen/wh-bocholt/"));
        startActivity(browserIntent);
    }
    public void openStundenplan(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://splan.w-hs.de/splan/mobile?lan=de&acc=false&act=tt&sel=pg&pu=55&og=24&pg=WINFO%202&sd=true&dfc=2020-06-23&loc=5&sa=false&cb=o"));
        startActivity(browserIntent);
    }
}
