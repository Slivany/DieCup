import java.util.ArrayList;
/**
 * Write a description of class TestDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestDriver
{
    /**
     * Constructor for objects of class TestDriver
     */
    public TestDriver()
    {}
    
    public static void test4638(int noOfRolls)
    {
        ArrayList<Integer> newDies = new ArrayList<>();
        newDies.add(4);
        newDies.add(6);
        newDies.add(3);
        newDies.add(8);
        
        DieCup dc;
        dc = new DieCup(newDies);
        double sum = 0;
        System.out.println();
        System.out.println("Starter her");
        for (int i = 1 ; i <= noOfRolls ; i++ ) 
        {
            dc.roll();
            System.out.println("Throw no " + i + ": " + dc.getEyes()); 
            sum += dc.getEyes();
        }
        // Udregner gennemsnittet ved at dividere summen af terningeslaget
        // med antal slag
        System.out.println("Average no of eyes: " + sum/noOfRolls);
    }
}
