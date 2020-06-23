package com.example.gruppe3;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.MenuInflater;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;



public class MenuMainActivity extends AppCompatActivity
{
    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.menu.menu_main);
        findViewById(R.id.link1).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.akafoe.de/gastronomie/speiseplaene-der-mensen/wh-bocholt/"));
                startActivity(browserIntent);
            }
        });

        findViewById(R.id.link2).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.akafoe.de/gastronomie/speiseplaene-der-mensen/wh-bocholt/"));
                startActivity(browserIntent);
            }
        });
    }
}
