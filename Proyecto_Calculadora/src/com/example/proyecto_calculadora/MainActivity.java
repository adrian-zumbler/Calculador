package com.example.proyecto_calculadora;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	protected Button btnCalculadora;
	protected Button btnConvertidor;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initComponents();
	}
	
	
	public void initComponents() {
		btnCalculadora = (Button) findViewById(R.id.btnCalculadora);
		btnConvertidor = (Button) findViewById(R.id.btnConvertidor);
		btnCalculadora.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Intent i = new Intent(MainActivity.this,Calculadora.class);
				startActivity(i);
				
			}
		});
		btnConvertidor.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(MainActivity.this,Convertidor.class);
				startActivity(i);
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
