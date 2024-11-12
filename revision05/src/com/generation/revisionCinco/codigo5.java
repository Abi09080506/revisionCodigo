package com.generation.revisionCinco;
// se evaluá si un número es afortunado o no.
import java.util.Scanner;
// se debe agregar el scan (importar la clase scanner)
// Falta inicializar el programa con el método main

public class codigo5 {

public static void main (String [] args) {		
	// Falta agregar system.in para leer datos del ususario
	Scanner s = new Scanner(System.in);
    
	System.out.print("Introduzca un número: "); // cambio por comilla doble
    
    String ni = s.nextLine();
    // Falta convertir la entrada de String a Int
    
    int c = Integer.parseInt(ni);
    int numero= c;
    
    int afo = 0;
    int noAfo = 0;
    
    while (numero > 0) {
	  int digito = numero % 10;
      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
		afo++;
      } else {
		noAfo++;
      }
	  numero /= 10;
    }
    if (afo > noAfo) {
      System.out.println("El " + c + " es un número afortunado.");
    } else {
      System.out.println("El " + c + " no es un número afortunado.");
    }
    s.close();
  }
  
}

