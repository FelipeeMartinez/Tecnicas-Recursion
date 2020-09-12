package ejercicios;

public class NumPrimo 
{
	public static void main (String [] args) 
    {
        boolean primo = primo(16, 2);
        if(primo = false) 
        {
        	System.out.println("Es primo ");
        }
        else 
        {
        	System.out.println("No es primo ");
        }
    }

	private static boolean primo(int num, int divisor)
	{
		
        if(num/2 < divisor)
        {
            return true; 
            
        } 
        else 
        {
        	
            if(num%divisor==0)
            {
            	
                return false;
            } 
            else 
            {
            	return primo(num, divisor + 1);
            }
            
        }
        
	}
}
                

