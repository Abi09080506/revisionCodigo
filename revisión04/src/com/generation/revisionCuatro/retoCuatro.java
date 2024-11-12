package com.generation.revisionCuatro;

import java.util.Scanner;

public class retoCuatro {

		public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);
		    
		    System.out.println("Tira jugador 1 (introduzca piedra, papel o tijeras): ");
		    String player1 = scan.nextLine();
		    
		    System.out.println("Tira jugador 2 (introduzca piedra, papel o tijeras): ");
		    String player2 = scan.nextLine();
		    
		    String playerone = player1.toLowerCase();
		    String playertwo = player2.toLowerCase();
		    String piedra = "piedra";
		    String papel = "papel";
		    String tijeras = "tijeras";
		    
		  if(player1.equals(playertwo)) {
			  System.out.println("¡Empate!");
		  } else if(player1 == piedra && playertwo == tijeras) {
			  System.out.println("Ganó piedra");
		  } else if (player1 == piedra && playertwo == papel) {
			  System.out.println("Ganó papel");
		  } else if (player1 == tijeras && playertwo == papel) {
			  System.out.println("Ganó tijeras");
		  } else if(player1 == tijeras && playertwo == piedra){
			  System.out.println("Ganó piedra");
		  } else if(player1 == papel && playertwo == tijeras) {
			  System.out.println("Ganó tijeras");
		  } else {
			  System.out.println("Ganó papel");
		  }
			
		    
		    
		scan.close();	
		}
	
	}