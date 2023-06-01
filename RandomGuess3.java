//chpt6 practice prjoject 05-31-21
import javax.swing.JOptionPane; 


public class RandomGuess3
{
    public static void main(String[] args) 
    {
        //variables 
            int ask;
            int rng_num;
            String msg;
            int attempts =1;
            final int LOW_RNG = 1;
            final int HIGH_RNG = 10;
            
        //input
        ask = Integer.parseInt(JOptionPane.showInputDialog(null, "Hi there!\nPlease input your guess of a number between "+ LOW_RNG + " and " + HIGH_RNG));

        //rng generation
        rng_num = (int) ((Math.random() * HIGH_RNG) + LOW_RNG);

        //logic
        
        while(ask != rng_num)
        {
            if(ask > rng_num)
            {
                msg = ("Sorry, Your guess is too high!");
                
            }else {
                msg = ("Sorry, Your guess is too low!");
            }//end else

           //retry and update attempts
            ask = Integer.parseInt(JOptionPane.showInputDialog(null, msg + "\nPlease input your guess of a number between "+ LOW_RNG + " and " + HIGH_RNG));            
            ++attempts;

        }//end - while loop
        
        JOptionPane.showMessageDialog(null, "Congratulations! \nYou've Won!\nThe lucky number was: "+ rng_num + "\n Number of attempt(s): " + attempts);
      


    }
}
