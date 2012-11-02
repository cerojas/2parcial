package pruebaJueguito;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.plaf.basic.BasicBorders.MarginBorder;

public class linea1 extends Thread {
	
		public static List<Character> linea1 = new ArrayList<Character>();
	
	
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
        	
        	for (int i = 0; i < linea1.size(); i++) {
				System.out.print(linea1.get(i));
			}
        	
        	while(true)
        	{
        		//elimina la prira posicion y agrega a la ultima
        		linea1.remove(0);
        		linea1.add(89, abc(Control.nivel));
        		
        		//imprime la lista
        		for (int i = 0; i < linea1.size(); i++) {
    				System.out.print(linea1.get(i));
    			}
        		
        		espacio(30);
        		
        		//tiempo de espera
        		try {
					sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
        		espacio(50);
        	}
        	
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


}
