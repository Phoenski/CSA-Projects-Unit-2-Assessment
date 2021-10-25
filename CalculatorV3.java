import java.util.Scanner;

class CalculatorV3
{
    public static void main(String [] args)
    {
        // Variables
        double varA;
        double varB;
        double varC;
        double varD;
        double varE;
        double varF;
        double varG;
        double varH;
        double varI;
        double varJ;
        int howManyVars;

        // Scanner creation
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many variables do you wish to uses? (2-10)");
        howManyVars = scanner.nextInt();

        if (howManyVars == 2)
        {
            System.out.println("Enter variable A: ");
            varA = scanner.nextDouble();
            System.out.println("Enter variable B: ");
            varB = scanner.nextDouble(); 
        }
        else if (howManyVars == 3)
        {
            System.out.println("Enter variable A: ");
            varA = scanner.nextDouble();
            System.out.println("Enter variable B: ");
            varB = scanner.nextDouble();
            System.out.println("Enter variable C: ");
            varC = scanner.nextDouble();
        }
        else if (howManyVars == 4)
        {
            System.out.println("Enter variable A: ");
            varA = scanner.nextDouble();
            System.out.println("Enter variable B: ");
            varB = scanner.nextDouble();
            System.out.println("Enter variable C: ");
            varC = scanner.nextDouble();
            System.out.println("Enter variable D: ");
            varD = scanner.nextDouble();
        }
        else if (howManyVars == 5)
        {
            System.out.println("Enter variable A: ");
            varA = scanner.nextDouble();
            System.out.println("Enter variable B: ");
            varB = scanner.nextDouble();
            System.out.println("Enter variable C: ");
            varC = scanner.nextDouble();
            System.out.println("Enter variable D: ");
            varD = scanner.nextDouble();
            System.out.println("Enter variable E: ");
            varE = scanner.nextDouble();
        }
        else if (howManyVars == 6)
        {
            System.out.println("Enter variable A: ");
            varA = scanner.nextDouble();
            System.out.println("Enter variable B: ");
            varB = scanner.nextDouble();
            System.out.println("Enter variable C: ");
            varC = scanner.nextDouble();
            System.out.println("Enter variable D: ");
            varD = scanner.nextDouble();
            System.out.println("Enter variable E: ");
            varE = scanner.nextDouble();
            System.out.println("Enter variable F: ");
            varF = scanner.nextDouble();
        }
        else if (howManyVars == 7)
        {
            System.out.println("Enter variable A: ");
            varA = scanner.nextDouble();
            System.out.println("Enter variable B: ");
            varB = scanner.nextDouble();
            System.out.println("Enter variable C: ");
            varC = scanner.nextDouble();
            System.out.println("Enter variable D: ");
            varD = scanner.nextDouble();
            System.out.println("Enter variable E: ");
            varE = scanner.nextDouble();
            System.out.println("Enter variable F: ");
            varF = scanner.nextDouble();
            System.out.println("Enter variable G: ");
            varG = scanner.nextDouble();
        }
        else if (howManyVars == 8)
        {
            System.out.println("Enter variable A: ");
            varA = scanner.nextDouble();
            System.out.println("Enter variable B: ");
            varB = scanner.nextDouble();
            System.out.println("Enter variable C: ");
            varC = scanner.nextDouble();
            System.out.println("Enter variable D: ");
            varD = scanner.nextDouble();
            System.out.println("Enter variable E: ");
            varE = scanner.nextDouble();
            System.out.println("Enter variable F: ");
            varF = scanner.nextDouble();
            System.out.println("Enter variable G: ");
            varG = scanner.nextDouble();
            System.out.println("Enter variable H: ");
            varH = scanner.nextDouble();
        }
        else if (howManyVars == 9)
        {
            System.out.println("Enter variable A: ");
            varA = scanner.nextDouble();
            System.out.println("Enter variable B: ");
            varB = scanner.nextDouble();
            System.out.println("Enter variable C: ");
            varC = scanner.nextDouble();
            System.out.println("Enter variable D: ");
            varD = scanner.nextDouble();
            System.out.println("Enter variable E: ");
            varE = scanner.nextDouble();
            System.out.println("Enter variable F: ");
            varF = scanner.nextDouble();
            System.out.println("Enter variable G: ");
            varG = scanner.nextDouble();
            System.out.println("Enter variable H: ");
            varH = scanner.nextDouble();
            System.out.println("Enter variable I: ");
            varI = scanner.nextDouble();
        }
        else if (howManyVars == 10)
        {
            System.out.println("Enter variable A: ");
            varA = scanner.nextDouble();
            System.out.println("Enter variable B: ");
            varB = scanner.nextDouble();
            System.out.println("Enter variable C: ");
            varC = scanner.nextDouble();
            System.out.println("Enter variable D: ");
            varD = scanner.nextDouble();
            System.out.println("Enter variable E: ");
            varE = scanner.nextDouble();
            System.out.println("Enter variable F: ");
            varF = scanner.nextDouble();
            System.out.println("Enter variable G: ");
            varG = scanner.nextDouble();
            System.out.println("Enter variable H: ");
            varH = scanner.nextDouble();
            System.out.println("Enter variable I: ");
            varI = scanner.nextDouble();
            System.out.println("Enter variable J: ");
            varJ = scanner.nextDouble();
        }
        else 
        {
            System.out.println("Invalid entry");
        }
    }
}