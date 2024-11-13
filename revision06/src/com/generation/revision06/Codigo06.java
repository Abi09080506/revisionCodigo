package com.generation.revision06;

import java.util.Scanner;

public class Codigo06 {
	// Se agregá  el método main para inicializar el programa

	public static void main (String [] args) {		
// Falta crear adecuadamente un nuevo arreglo, se agrega el scan para ver la entrada del usuario 
	Scanner s = new Scanner(System.in);
	
	int[] n = new int[20];

    // se debe corregir el incremento por i++, a su vez, no se llama adecuadamente el método que imprime en consola sysout 
    for (int i = 0; i < 20; i++) {
      n[i] = (int)(Math.random() * 381) + 20;
      System.out.print(n[i] + " ");
    }
    // se corrige el método println
    System.out.println("\n¿Qué números quiere resaltar? ");
    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
    
    int opcion = s.nextInt();
    
// el operador terciario esta mal planteado en vez de : (sino) ? (if) se cambia por ? (if) : (verdadero si no falso)
    int multiplo = (opcion == 1) ? 5 : 7;
// arriba 
    
    for (int e : n) {
      if (e % multiplo == 0) {
        System.out.print("[" + e + "] ");
      }else {
       }
    // se corrige system.out.print por 
        System.out.print(e + " ");
      }
    }
  
}
