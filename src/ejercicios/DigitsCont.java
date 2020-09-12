package ejercicios;

public class DigitsCont 
{
	public static void main (String [] args) 
	{
		int num = 50;
		System.out.print("tiene " + contar(num) + " digitos");
		
	}
	
	public static int contar(int num) 
	{ 
		if(num < 10) 
		{
			return 1;
		}
		else  
		{
			return  1 + contar(num/10);		
		}
	}

}
