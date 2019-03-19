
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
    public TestDriver() {}

    public static void test(int noOfDies)
    {
        DieCup dc;
        dc = new DieCup(noOfDies);
        dc.roll();
        System.out.println(dc.getEyes());
    }

    public static void testMultiple(int noOfRolls, int noOfDies)
    {
        DieCup dc;
        dc = new DieCup(noOfDies);
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
        sum = 0;
    }

    public static void compareDieCups(int noOfDies, int noOfRolls)
    {
        DieCup dc1;
        DieCup dc2;
        dc1 = new DieCup(noOfDies);
        dc2 = new DieCup(noOfDies);
        int dc1bigger = 0;
        int dc2bigger = 0;
        int dcsame = 0;

        //For loop der ruller begge diecups et antal gange
        for (int i = 1 ; i <= noOfRolls ; i++ ) 
        {
            dc1.roll();
            dc2.roll();
            //If statement der øger variablerne dc1bigger, dc2bigger og dcsame afhængigt af hvilke værdi der er størst i det individuelle kast
            if (dc1.getEyes() > dc2.getEyes())
            {
                dc1bigger += 1;
            }
            else if (dc1.getEyes() < dc2.getEyes())
            {
                dc2bigger += 1;
            }
            else if (dc1.getEyes() == dc2.getEyes())
            {
                dcsame += 1;
            }
        }
        System.out.println("DieCup 1 is highest: " + dc1bigger + " times");
        System.out.println("DieCup 2 is highest: " + dc2bigger + " times");
        System.out.println("Same score in both: " + dcsame + " times");
        System.out.println();
    }
}
