
package pruebaJueguito;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Flujo extends Thread {
	
		 public static  List<Character> linea1 = new ArrayList<Character>();
	
	
		public void run()
		{
			lista();
		}
		
		public static void lista()
		{
        	
        	//llenar la lista
        	for (int i = 0; i <90; i++) {
        		if(i<89){linea1.add(i, ' ');}
        		else {linea1.add(i,abc(Control.nivel));}	
			}        	
        	
        	espacio(50);
        	
        	printLista(linea1);
        	
        	while(true)
        	{
        		//elimina la prira posicion y agrega a la ultima
        		linea1.remove(0);
        		linea1.add(89, abc(Control.nivel));
        		
        		detalles();
        		espacio(10);
        		printLista(linea1);
        		espacio(15);
        		
        		//tiempo de espera
        		try {sleep(Control.velocidad);} catch (InterruptedException e) {e.printStackTrace();}
    
        		espacio(50);
        		
        		//verifica si hay vidas
        		if(!Control.setVida()){break;}
        	}
        	
        	gameOver();
        	
		}

		
		public static void espacio(int linea)
		{
			for (int i = 0; i < linea; i++) {
				System.out.println();
			}
		}
		
		public static <e> void printLista(List<e> lista)
		{
			for (int i = 0; i < lista.size(); i++) {
				System.out.print(lista.get(i));
			}
		}

			//n = grado de dificultadad
		public static char abc(int n)
		{
			 char letra;
			 String abcFacil= " a  b  c  d  e  f  g  h  i  j  k  l  m  n  o  p  q  r  s  t  u  v  w  x  y  z  A  B  C  D  E  F  G  H  I  J  K  L  M  N  O  P  Q  R  S  T  U  V  W  X  Y  Z ";
			 
			 switch(n)
			 {
			 	case 1: letra = abcFacil.charAt((int)(Math.random()*52)); break;
			 	case 2: letra = abcFacil.charAt((int)(Math.random()*103));break;
			 	default:letra = abcFacil.charAt((int)(Math.random()*52)); break;
			 }
			 return letra;
		}
		
		public static void detalles()
		{
			System.out.println("puntos: "+ Control.puntos);
    		System.out.println("vidas: "+ Control.vidas +"       nivel: "+Control.nivel);
    		System.out.println("______________________________");
    		
		}

		public static void gameOver()
		{
        	System.out.println("GAME OVER !!");
        	for (int i = 0; i < 25; i++) {
				System.out.println();
				try {
					sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
        	
        	Scanner lee = new Scanner(System.in);
        	System.out.println("GAME OVER !!\n");
        	System.out.println("desea continuar?");
        	espacio(25);
        	lee.next();
		}
}
