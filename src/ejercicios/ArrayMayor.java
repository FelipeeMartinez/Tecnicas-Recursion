package ejercicios;

public class ArrayMayor 
{
	public static void main (String [] args) 
	{
		int [] arre = new int[] {3, 7 , 25 , 13};
		System.out.print("El mayor numero es : " + mayor(arre, 0, 0));
		
	}
	
	public static int mayor(int arre [] , int posicion  , int mayor) 
	{ 
		if(posicion < arre.length) 
		{
			if(arre[posicion] > mayor) 
			{
				return mayor(arre, posicion + 1 , mayor = arre[posicion]);    
			}
			
			return mayor;
			
		}
		else  
		{
			return mayor ;
		}
	}

}
