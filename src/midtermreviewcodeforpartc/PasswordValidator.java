/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermreviewcodeforpartc;
import java.util.Scanner;

/**
 *
 * @modifier Kyro
 */
public class PasswordValidator {
    
    public String check(){
            int passwordRule=8;//modified so rules can easily be changed
            int specialRule=1;//modified so rules can easily be change
            Scanner sc = new Scanner(System.in);
            String password = "";
            boolean validPassword=false;
            while(!validPassword)
        {
            System.out.println("Passwords must have at least "+passwordRule+" characters");
            System.out.println("Passwords must have at least "+specialRule+" special character");
            System.out.println("Please enter your desired password:"); 
            
            password = sc.nextLine();
            int specialCharCount=0;
            //iterate over each character to see if it is a special character
            for(int i=0;i<password.length(); i++)
            {
                if(!(Character.isLetterOrDigit(password.charAt(i))))
                {
                    //now we know there is at least one special character
                    specialCharCount++;
                }
            }
            if(specialCharCount>=specialRule && password.length()>=passwordRule)
            {
                validPassword=true;
            }
        }//loop only ends when password is valid so now we create the User
    return password;
}
}
    
