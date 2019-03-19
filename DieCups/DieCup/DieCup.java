import java.util.ArrayList;
/**
 * This class models a DieCup (raflebæger)
 * 
 * @author Kurt Jensen
 * @version 2017-05-01
 */
public class DieCup
{
    private int maxEyes; //The number of eyes from the highest roll
    private ArrayList<Die> dies;
    /**
     * Constructor for DieCup objects
     */
    public DieCup(ArrayList<Integer> newDies)
    {
        if (newDies.size() > 0) 
        {
            dies = new ArrayList<Die>();
            for (int i = 0; i < newDies.size(); i++)
            {
            dies.add(new Die(newDies.get(i)));
            }
        }
        else
        {
            System.out.println("Der skal være mindst 1 terning");
        }


    }

    /**
     * Obtain a new number of eyes for both dies
     */
    public void roll()
    {
        for (Die die : dies)
        {
            die.roll();
        }
        if (getEyes() > maxEyes)
            {
                maxEyes = getEyes();
            }
    }
    
    // Loop der printer 20 slag med raflebægeret
    public void roll20()
    {
        System.out.println();
        System.out.println("Starter her");
            for (int i = 0 ; i < 20 ; i++ )
            {
            for (Die die : dies)
            {
                die.roll();
                System.out.println(die.getEyes());
            }
        }
    }
    
    /**
     * Return the sum of the number of eyes shown by the dies
     */

    public int getEyes()
    {
        int sum = 0;
        for (Die die : dies)
        {
            sum += die.getEyes();
        }
        return sum;
    }

    public int getMaxEyes()
    {
        return maxEyes;
    }    

    public void resetMaxEyes()
    {
        maxEyes = 0;
    }

    //Metode der kan slå et vilkårligt antal gange med 2 terninger
    //og udregne gennemsnittet
    public void multipleRolls(int noOfRolls)
    {
        double sum = 0;
        System.out.println();
        System.out.println("Starter her");
        
        for (int i = 1 ; i <= noOfRolls ; i++ ) 
        {
            for (Die die : dies)
            {
                die.roll();
            }
            System.out.println("Throw no " + i + ": " + getEyes()); 
            sum += getEyes();   
        }
        // Udregner gennemsnittet ved at dividere summen af terningeslaget
        // med antal slag
        System.out.println("Average no of eyes: " + sum/noOfRolls);
    }
}