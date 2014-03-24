package com.example.proyecto_calculadora;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Calculadora extends Activity {
	
	protected Button btnRegresar;
	protected Button btnUno;
	protected Button btnDos;
	protected Button btnTres;
	protected Button btnCuatro;
	protected Button btnCinco;
	protected Button btnSeis;
	protected Button btnSiete;
	protected Button btnOcho;
	protected Button btnNueve;
	protected Button btnCero;
	protected Button btnMas;
	protected Button btnMenos;
	protected Button btnEntre;
	protected Button btnMultiplicacion;
	protected Button btnIgual;
	protected TextView pantalla;
	protected String textoPantalla;
	protected int auxId;
	protected double auxOperacion;
	protected OnClickListener listener = new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			
			Button b = (Button) v;
			//Toast.makeText(Calculadora.this,"El id es: " + b.getText().toString(), Toast.LENGTH_LONG).show();
			switch(v.getId()) {
			case R.id.btnMultiplicar:
				auxOperacion = Double.parseDouble(pantalla.getText().toString());
				pantalla.setText("");
				auxId = v.getId();
				//Toast.makeText(Calculadora.this, "Multilicacion", Toast.LENGTH_LONG).show();
				break;
			case R.id.btnMas:
				auxOperacion = Double.parseDouble(pantalla.getText().toString());
				pantalla.setText("");
				auxId = v.getId();
				break;	
			case R.id.btnMenos:
				auxOperacion = Double.parseDouble(pantalla.getText().toString());
				pantalla.setText("");
				auxId = v.getId();
				break;
			case R.id.btnEntre:
				auxOperacion = Double.parseDouble(pantalla.getText().toString());
				pantalla.setText("");
				auxId = v.getId();
				break;
			
			case R.id.btnIgual:
				switch(auxId) {
				case R.id.btnMultiplicar:
					
					pantalla.setText("" + (auxOperacion * (Double.parseDouble(pantalla.getText().toString()))));
					auxOperacion = 0;
					break;
				case R.id.btnMas:
					
					pantalla.setText("" + (auxOperacion + (Double.parseDouble(pantalla.getText().toString()))));
					auxOperacion = 0;
					break;
				case R.id.btnMenos:
					
					pantalla.setText("" + (auxOperacion - (Double.parseDouble(pantalla.getText().toString()))));
					auxOperacion = 0;
					break;
				case R.id.btnEntre:
					
					pantalla.setText("" + (auxOperacion / (Double.parseDouble(pantalla.getText().toString()))));
					auxOperacion = 0;
					break;
				default:	
					recibirNumero(b.getText().toString());
					break;	
				}
				break;
			default:
				recibirNumero(b.getText().toString());
				break;
			}
			
			
		
		}
	};
	
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calculadora);
		initComponents();
	}
	
	public void initComponents() {
		
		pantalla = (TextView) findViewById(R.id.pantalla);
		
		btnRegresar = (Button) findViewById(R.id.btnRegresar);
		btnUno = (Button) findViewById(R.id.btnUno);
		btnDos = (Button) findViewById(R.id.btnDos);
		btnTres = (Button) findViewById(R.id.btnTres);
		btnCuatro = (Button) findViewById(R.id.btnCuatro);
		btnCinco = (Button) findViewById(R.id.btnCinco);
		btnSeis = (Button) findViewById(R.id.btnSeis);
		btnSiete = (Button) findViewById(R.id.btnSiete);
		btnOcho = (Button) findViewById(R.id.btnOcho);
		btnNueve = (Button) findViewById(R.id.btnNueve);
		btnCero = (Button) findViewById(R.id.btnCero);
		btnMas = (Button) findViewById(R.id.btnMas);
		btnMenos = (Button) findViewById(R.id.btnMenos);
		btnMultiplicacion = (Button) findViewById(R.id.btnMultiplicar);
		btnEntre = (Button) findViewById(R.id.btnEntre);
		btnIgual = (Button) findViewById(R.id.btnIgual);
		btnUno.setOnClickListener(listener);
		btnDos.setOnClickListener(listener);
		btnTres.setOnClickListener(listener);
		btnCuatro.setOnClickListener(listener);
		btnCinco.setOnClickListener(listener);
		btnSeis.setOnClickListener(listener);
		btnSiete.setOnClickListener(listener);
		btnOcho.setOnClickListener(listener);
		btnNueve.setOnClickListener(listener);
		btnCero.setOnClickListener(listener);
		btnMultiplicacion.setOnClickListener(listener);
		btnEntre.setOnClickListener(listener);
		btnMas.setOnClickListener(listener);
		btnMenos.setOnClickListener(listener);
		btnIgual.setOnClickListener(listener);
	

		btnRegresar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//Toast.makeText(Calculadora.this, "Regresar", Toast.LENGTH_LONG).show();
				Intent i = new Intent(Calculadora.this,MainActivity.class);
				startActivity(i);
			}
		});
	}
	
	public void realizarOperacion(){
		
	}
	
	
	public void recibirNumero(String numero) {
		textoPantalla = pantalla.getText().toString();
		textoPantalla += numero;
		pantalla.setText(textoPantalla);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.calculadora, menu);
		return true;
	}

}
