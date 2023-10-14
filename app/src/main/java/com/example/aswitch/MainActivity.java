package com.example.aswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/* Ejemplo 2: Calcular descuento
        String productType = "camisa";
        double price = 50.0;
        switch (productType) {
            case "camisa":
                price *= 0.9; // Descuento del 10%
                break;
            case "pantalón":
                price *= 0.8; // Descuento del 20%
                break;
            case "zapatos":
                price *= 0.7; // Descuento del 30%
                break;
            default:
                break;
        }
        System.out.println("El precio final es: " + price + " dólares.");



    }
}
*/

// Ejemplo 3: Convertir números romanos a decimales
        String romanNumber = "XXIV"; // 24
        int decimalNumber = 0;

        for (int i = 0; i < romanNumber.length(); i++) {
            switch (romanNumber.charAt(i)) {
                case 'I':
                    decimalNumber += 1;
                    break;
                case 'V':
                    decimalNumber += 5;
                    break;
                case 'X':
                    decimalNumber += 10;
                    break;
                case 'L':
                    decimalNumber += 50;
                    break;
                case 'C':
                    decimalNumber += 100;
                    break;
                case 'D':
                    decimalNumber += 500;
                    break;
                case 'M':
                    decimalNumber += 1000;
                    break;
                default:
                    break;
            }
        }

        System.out.println("El número romano " + romanNumber + " equivale a " + decimalNumber + " en decimal.");
    }
}