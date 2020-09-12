package ejercicios;

public class ArrayPalindrom 
{
	public static void main (String [] args) 
	{
		int [] arre = new int[] {3,5,3};
		int fin = arre.length;
		System.out.print(palindromo(arre, 0, fin - 1));
		
	}
	
	public static int palindromo(int arre [] , int inic  , int fin) 
	{ 
		if( inic > fin) 
		{
			return 1;	
		}
		else  
		{
			if(arre[inic] == arre[fin] )  
			{
			    return palindromo(arre, inic + 1, fin - 1);
			}
			else 
			{
				return 0;
			}
		}
	}

}
