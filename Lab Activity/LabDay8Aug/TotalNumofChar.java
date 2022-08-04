package Labday8Aug;

/**
 * @author Aniket_Ingale
 *
 */
public class TotalNumofChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "My Name Is Aniket";    
        int count = 0;    
        System.out.println("The entered string is: "+str);    
    
        for(int i = 0; i < str.length(); i++) 
        {    
            if(str.charAt(i) != ' ')    
                count++;    
        }                
           
        System.out.println("Total number of characters in the string: " + count);

	}

}
