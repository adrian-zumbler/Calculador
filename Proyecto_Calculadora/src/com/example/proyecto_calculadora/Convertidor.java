package com.example.proyecto_calculadora;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Convertidor extends Activity {
	protected Button btnCelsius;
	protected Button btnFahrenheit;
	protected EditText valor;
	protected TextView resul;
	protected Button btnBack;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_convertidor);
	}
	
	public void initComponents() {
		btnCelsius = (Button) findViewById(R.id.btnCelsius);
		btnFahrenheit = (Button) findViewById(R.id.btnFahrenheit);
		valor = (EditText) findViewById(R.id.txtValor);
		resul = (TextView) findViewById(R.id.lblResultado);
		btnBack = (Button) findViewById(R.id.btnBack);
		
		btnCelsius.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				convertirCelsius();
				
			}
		});
		
		btnFahrenheit.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				convertirFahrenheit();
				
			}
		});
		
		btnBack.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(Convertidor.this,MainActivity.class);
				startActivity(i);
				
			}
		});
		
		
		
		
	}
	
	public void convertirCelsius() {
		double valor = Double.parseDouble(this.valor.getText().toString());
		double resul = ((valor-32) * 5)/9;
		this.resul.setText(resul + " Celsius");
	}
	
	public void convertirFahrenheit() {
		double valor = Double.parseDouble(this.valor.getText().toString());
		double resul = ((valor * 9)/5) + 32;
		this.resul.setText(resul + " Fahrenheit");
	}
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.convertidor, menu);
		return true;
	}

}
