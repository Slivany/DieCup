// import class for generation of random numbers
import java.util.Random;
/**
 * This class models a Die (terning)
 * 
 * @author Kurt Jensen
 * @version 2017-01-05
 */
public class Die
{
    private Random random;   //used for generation of random numbers
    private int eyes;        //number of eyes shown
    private int sides;
    /**
     * Constructor for Die objects
     */
    public Die(int noOfSides)
    {
        if (noOfSides > 1)
        {
            sides = noOfSides;
        }
        else
        {
            System.out.println("Der skal være minimum 2 sider på terningen");
        }
        random = new Random();
        roll();
    }

    /**
     * Obtain a new number of eyes for this die
     */
    public void roll()
    {
        eyes = random.nextInt(sides)+1;
    }

    /**
     * Return the number of eyes shown by this die
     */
    public int getEyes()
    {
        return eyes;
    }
}
