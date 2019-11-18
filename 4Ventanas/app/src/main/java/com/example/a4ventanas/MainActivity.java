package com.example.a4ventanas;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main);
        Toolbar toolbar = findViewById( R.id.toolbar );
        setSupportActionBar( toolbar );

        FloatingActionButton fab = findViewById( R.id.fab );
        fab.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make( view, "Replace with your own action", Snackbar.LENGTH_LONG )
                        .setAction( "Action", null ).show();
            }
        } );
        String msn = this.getIntent().getExtras().getString( "msn");
        TextView txt = findViewById( R.id.txt );
        txt.setText( msn );
    }
    public void loadComponents(){
        Button btn1 = findViewById( R.id.btn1 );
        Button btn2 = findViewById( R.id.btn2);
        Button btn3 = findViewById( R.id.btn3);
        Button btn4 = findViewById( R.id.btn4);
        btn1.setOnClickListener( this );
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1:{
                Intent actividad1=new Intent(this,actividad1.class);
                startActivity(actividad1);
                break;
            }
            case R.id.btn2:{
                Intent actividad2=new Intent(this,actividad2.class);
                startActivity(actividad2);
                break;
            }
            case R.id.btn3:{
                Intent actividad3=new Intent( this,actividad3.class );
                startActivity(actividad3);
                break;
            }
            case R.id.btn4:{
                Intent actividad4= new Intent( this,actividad4.class);
                startActivity(actividad4);
                break;
            }

        }


    }
}



