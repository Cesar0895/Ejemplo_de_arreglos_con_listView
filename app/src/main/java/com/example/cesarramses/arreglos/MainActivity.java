package com.example.cesarramses.arreglos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView lblcentral;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lblcentral=findViewById(R.id.lblcentral);

        Random aleatorio = new Random();

        int a=10;
        int b=5;
        int c=0;

        //Declaramos un arreglo de enteros
        int numeros[];

        //se asigna la longitud del arreglo
        numeros=new int[20];

        numeros[0]=10;
        numeros[1]=5;
        numeros[2]=numeros[0]+numeros[1];
        int suma=0;
        String listanumeros="";

        Toast.makeText(getApplicationContext(),"suma" +numeros[2],Toast.LENGTH_LONG).show();

        for (int i=0;i<numeros.length;i++){
            numeros[i]=aleatorio.nextInt(100);
            suma+=numeros[i];
            listanumeros+= numeros[i]+"\n";


        }
        lblcentral.setText(listanumeros);
        Toast.makeText(getApplicationContext(),"suma de todo el arrglo" +suma,Toast.LENGTH_LONG).show();


        //Arreglo bidimencional
        int matrizNumeros[][];
        matrizNumeros=new int[3][3];

        matrizNumeros[0][0]=5;
        matrizNumeros[0][1]=7;
        matrizNumeros[0][2]=1;
        matrizNumeros[1][0]=4;
        matrizNumeros[1][1]=2;
        matrizNumeros[1][2]=9;

        //For anidados
        for (int i=0;i<3;i++){

            for (int j=0;j<3;j++){
                Log.i("Valor de i "+i,"Valor de j "+j);
                matrizNumeros[i][j]=aleatorio.nextInt(100);
            }
        }


    }
}
