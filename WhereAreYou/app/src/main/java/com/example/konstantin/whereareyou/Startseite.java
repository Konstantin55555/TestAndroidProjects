package com.example.konstantin.whereareyou;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

public class Startseite extends AppCompatActivity {

    private TextView tvStart;
    private Button btnSendPosition;
    private Button btnGeoContacts;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.startseite_layout);
        setTitle(R.string.startseite_titel);
        btnSendPosition = findViewById(R.id.sf_position_senden);
        btnGeoContacts = findViewById(R.id.sf_starte_geokontakte);

        android.support.v7.widget.Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        registerForContextMenu(btnGeoContacts);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_page_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case R.id.opt_einstellungenBearbeiten:
                //TODO
                return true;
            case R.id.opt_hilfe:
                //TODO
                return true;
            case R.id.opt_amandoBeenden:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void onCreateContextMenu(ContextMenu menu, View view, ContextMenu.ContextMenuInfo menuInfo){
        if(view.getId()==R.id.sf_starte_geokontakte){
            getMenuInflater().inflate(R.menu.startseite_contextmenu, menu);
        }
        super.onCreateContextMenu(menu, view, menuInfo);
    }

    public boolean onContextItemSelected(MenuItem item){
        if (item.getItemId() == R.id.opt_geokontakt_verwalten_hilfe) {
            //TODO
            return true;
        }
        return super.onContextItemSelected(item);
    }
}



