package pruebaJueguito;

import java.util.Scanner;

public class Control extends Thread{
		
		public static int puntos=0;
		public static int vidas=4;
		public static int nivel=1;
		public static int velocidad= 100;
		public static boolean parar = false;
		
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
					
						break;
					}
				}
				setNivel();
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
			 if(puntos%5==0){ 
				 nivel +=1;
				 Control.parar= true;
				
				
				 try {
					sleep(1000);
					System.out.println("FELICIDADES !!\nnivel "+Control.nivel+"\n");
					Flujo.detalles();
					Flujo.espacio(10);
					sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 
				 Control.parar= false; 
				
			 }
		 }
		 
		 public static void esperar(int time, boolean hasta)
		 {
			 while(hasta)
      		{
      			try {sleep(time);}catch(Exception e){}
      		}
	
		 }
		 
		 public static void esperar(int time)
		 {	
      		try {sleep(time);}catch(Exception e){}	
		 }
		 
			
		
		
}
