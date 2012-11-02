package pruebaJueguito;

import java.util.Scanner;

public class Control extends Thread{
		
		public static int puntos=0;
		public static int vidas=4;
		public static int nivel=1;
		public static int velocidad= 100;
		
		public void run()
		{	
			controlador();
		}
			
		
		public static void controlador()
		{
			while(true)
			{
				Scanner lee = new Scanner(System.in);
				char entrada= lee.next().charAt(0);
				
				//eliminar letra 
				for (int i =0;  i<Flujo.linea1.size();  i++) {
					if(entrada==(Flujo.linea1.get(i)))
					{
						Flujo.linea1.set(i, ' ');
						puntos +=1;
						setNivel();
						break;
					}
				}
				
				if(!setVida()){break;}
			}
			
		}
		
		public static boolean setVida()
		{
			boolean vivo= true;
			
			if(Flujo.linea1.get(0) !=' ')
			{
				vidas-=1;
			}
			
			if(vidas==0)
			{
				vivo = false;
			}
			return vivo;
		}
		
		 public static void setNivel()
		 {
			 if(puntos == 5){ 
				 nivel +=1;
				 
		        	Scanner lee = new Scanner(System.in);
		        	System.out.println("GAME OVER !!\n");
		        	System.out.println("desea continuar?");
		        	Flujo.espacio(25);
		        	lee.next();
			 
			 
			 
			 
			 }
		 }
			
		
		
}
