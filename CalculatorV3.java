import java.util.Scanner;

class CalculatorV3 {
    public static void main(String[] args) {
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
        String userInput;
        int whereIsNumber = 0;
        String howManyVars = null;

        // Operators
        char operatorAB;
        char operatorBC;
        char operatorCD;
        char operatorDE;
        char operatorEF;
        char operatorFG;
        char operatorGH;
        char operatorHI;
        char operatorIJ;

        // Absolute value of?
        boolean absOf = false;

        // Result
        double operationResult = 0;

        // Scanner creation
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many variables do you wish to uses? (2-10)");
        userInput = scanner.nextLine();
        if (userInput.equals("2"))
        {
            whereIsNumber = userInput.indexOf("2");
        } 
        else if (userInput.equals("3"))
        {
            whereIsNumber = userInput.indexOf("3");
        }
        else if (userInput.equals("4"))
        {
            whereIsNumber = userInput.indexOf("4");
        }
        else if (userInput.equals("5"))
        {
            whereIsNumber = userInput.indexOf("5");
        }
        else if (userInput.equals("6"))
        {
            whereIsNumber = userInput.indexOf("6");
        }
        else if (userInput.equals("7"))
        {
            whereIsNumber = userInput.indexOf("7");
        }
        else if (userInput.equals("8"))
        {
            whereIsNumber = userInput.indexOf("8");
        }
        else if (userInput.equals("9"))
        {
            whereIsNumber = userInput.indexOf("9");
        }
        else if (userInput.equals("10"))
        {
            whereIsNumber = userInput.indexOf("10");
        }
        else
        {
            System.out.println("Error");
        }

        if (userInput.length() == 1)
        {
            howManyVars = userInput.substring(whereIsNumber, (whereIsNumber + 1));
        }
        else if (userInput.length() == 2)
        {
            howManyVars = userInput.substring(whereIsNumber, (whereIsNumber + 2));
        }
        else
        {
            System.out.println("Error");
        }

        if (howManyVars.equals("2"))
        {
            System.out.println("Enter variable A: ");
            varA = scanner.nextDouble();
            System.out.println("Enter variable B: ");
            varB = scanner.nextDouble();

            // Operation for 2
            System.out.println("Please list operators from left to right.");
            System.out.println("A-B");
            operatorAB = scanner.next().charAt(0);

            System.out.println("Abs of?");
            absOf = scanner.nextBoolean();
            if (absOf == true)
            {
                operationResult = Math.abs(varA + operatorAB + varB);
            }
            else if (absOf == false)
            {
                operationResult = varA + operatorAB + varB;
            }
            else
            {
                System.out.println("Error");
            }

            System.out.println("Result: " + operationResult);
        } 
        else if (howManyVars.equals("3"))
        {
            System.out.println("Enter variable A: ");
            varA = scanner.nextDouble();
            System.out.println("Enter variable B: ");
            varB = scanner.nextDouble();
            System.out.println("Enter variable C: ");
            varC = scanner.nextDouble();

            // Operation for 3
            System.out.println("Please list operators from left to right.");
            System.out.println("A-B");
            operatorAB = scanner.next().charAt(0);
            System.out.println("B-C");
            operatorBC = scanner.next().charAt(0);

            System.out.println("Abs of?");
            absOf = scanner.nextBoolean();
            if (absOf == true)
            {
                operationResult = Math.abs(varA + operatorAB + varB + operatorBC + varC);
            }
            else if (absOf == false)
            {
                operationResult = varA + operatorAB + varB + operatorBC + varC;
            }
            else
            {
                System.out.println("Error");
            }

            System.out.println("Result: " + operationResult);
        }
        else if (howManyVars.equals("4"))
        {
            System.out.println("Enter variable A: ");
            varA = scanner.nextDouble();
            System.out.println("Enter variable B: ");
            varB = scanner.nextDouble();
            System.out.println("Enter variable C: ");
            varC = scanner.nextDouble();
            System.out.println("Enter variable D: ");
            varD = scanner.nextDouble();

            // Operation for 4
            System.out.println("Please list operators from left to right.");
            System.out.println("A-B");
            operatorAB = scanner.next().charAt(0);
            System.out.println("B-C");
            operatorBC = scanner.next().charAt(0);
            System.out.println("C-D");
            operatorCD = scanner.next().charAt(0);

            System.out.println("Abs of?");
            absOf = scanner.nextBoolean();
            if (absOf == true)
            {
                operationResult = Math.abs(varA + operatorAB + varB + operatorBC + varC + operatorCD + varD);
            }
            else if (absOf == false)
            {
                operationResult = varA + operatorAB + varB + operatorBC + varC + operatorCD + varD;
            }
            else
            {
                System.out.println("Error");
            }

            System.out.println("Result: " + operationResult);
        }
        else if (howManyVars.equals("5"))
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

            // Operation for 5
            System.out.println("Please list operators from left to right.");
            System.out.println("A-B");
            operatorAB = scanner.next().charAt(0);
            System.out.println("B-C");
            operatorBC = scanner.next().charAt(0);
            System.out.println("C-D");
            operatorCD = scanner.next().charAt(0);
            System.out.println("D-E");
            operatorDE = scanner.next().charAt(0);

            System.out.println("Abs of?");
            absOf = scanner.nextBoolean();
            if (absOf == true)
            {
                operationResult = Math.abs(varA + operatorAB + varB + operatorBC + varC + operatorCD + varD + operatorDE + varE);
            }
            else if (absOf == false)
            {
                operationResult = varA + operatorAB + varB + operatorBC + varC + operatorCD + varD + operatorDE + varE;
            }
            else
            {
                System.out.println("Error");
            }

            System.out.println("Result: " + operationResult);
        }
        else if (howManyVars.equals("6"))
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

            // Operation for 6
            System.out.println("Please list operators from left to right.");
            System.out.println("A-B");
            operatorAB = scanner.next().charAt(0);
            System.out.println("B-C");
            operatorBC = scanner.next().charAt(0);
            System.out.println("C-D");
            operatorCD = scanner.next().charAt(0);
            System.out.println("D-E");
            operatorDE = scanner.next().charAt(0);
            System.out.println("E-F");
            operatorEF = scanner.next().charAt(0);

            System.out.println("Abs of?");
            absOf = scanner.nextBoolean();
            if (absOf == true)
            {
                operationResult = Math.abs(varA + operatorAB + varB + operatorBC + varC + operatorCD + varD + operatorDE + varE + operatorEF + varF);
            }
            else if (absOf == false)
            {
                operationResult = varA + operatorAB + varB + operatorBC + varC + operatorCD + varD + operatorDE + varE + operatorEF + varF;
            }
            else
            {
                System.out.println("Error");
            }

            System.out.println("Result: " + operationResult);
        }
        else if (howManyVars.equals("7"))
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

            // Operation for 7
            System.out.println("Please list operators from left to right.");
            System.out.println("A-B");
            operatorAB = scanner.next().charAt(0);
            System.out.println("B-C");
            operatorBC = scanner.next().charAt(0);
            System.out.println("C-D");
            operatorCD = scanner.next().charAt(0);
            System.out.println("D-E");
            operatorDE = scanner.next().charAt(0);
            System.out.println("E-F");
            operatorEF = scanner.next().charAt(0);
            System.out.println("F-G");
            operatorFG = scanner.next().charAt(0);

            System.out.println("Abs of?");
            absOf = scanner.nextBoolean();
            if (absOf == true)
            {
                operationResult = Math.abs(varA + operatorAB + varB + operatorBC + varC + operatorCD + varD + operatorDE + varE + operatorEF + varF + operatorFG + varG);
            }
            else if (absOf == false)
            {
                operationResult = varA + operatorAB + varB + operatorBC + varC + operatorCD + varD + operatorDE + varE + operatorEF + varF + operatorFG + varG;
            }
            else
            {
                System.out.println("Error");
            }

            System.out.println("Result: " + operationResult);
        }
        else if (howManyVars.equals("8"))
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

            // Operation for 8
            System.out.println("Please list operators from left to right.");
            System.out.println("A-B");
            operatorAB = scanner.next().charAt(0);
            System.out.println("B-C");
            operatorBC = scanner.next().charAt(0);
            System.out.println("C-D");
            operatorCD = scanner.next().charAt(0);
            System.out.println("D-E");
            operatorDE = scanner.next().charAt(0);
            System.out.println("E-F");
            operatorEF = scanner.next().charAt(0);
            System.out.println("F-G");
            operatorFG = scanner.next().charAt(0);
            System.out.println("G-H");
            operatorGH = scanner.next().charAt(0);

            System.out.println("Abs of?");
            absOf = scanner.nextBoolean();
            if (absOf == true)
            {
                operationResult = Math.abs(varA + operatorAB + varB + operatorBC + varC + operatorCD + varD + operatorDE + varE + operatorEF + varF + operatorFG + varG + operatorGH + varH);
            }
            else if (absOf == false)
            {
                operationResult = varA + operatorAB + varB + operatorBC + varC + operatorCD + varD + operatorDE + varE + operatorEF + varF + operatorFG + varG + operatorGH + varH;
            }
            else
            {
                System.out.println("Error");
            }

            System.out.println("Result: " + operationResult);
        }
        else if (howManyVars.equals("9"))
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

            // Operation for 9
            System.out.println("Please list operators from left to right.");
            System.out.println("A-B");
            operatorAB = scanner.next().charAt(0);
            System.out.println("B-C");
            operatorBC = scanner.next().charAt(0);
            System.out.println("C-D");
            operatorCD = scanner.next().charAt(0);
            System.out.println("D-E");
            operatorDE = scanner.next().charAt(0);
            System.out.println("E-F");
            operatorEF = scanner.next().charAt(0);
            System.out.println("F-G");
            operatorFG = scanner.next().charAt(0);
            System.out.println("G-H");
            operatorGH = scanner.next().charAt(0);
            System.out.println("H-I");
            operatorHI = scanner.next().charAt(0);

            System.out.println("Abs of?");
            absOf = scanner.nextBoolean();
            if (absOf == true)
            {
                operationResult = Math.abs(varA + operatorAB + varB + operatorBC + varC + operatorCD + varD + operatorDE + varE + operatorEF + varF + operatorFG + varG + operatorGH + varH + operatorHI + varI);
            }
            else if (absOf == false)
            {
                operationResult = varA + operatorAB + varB + operatorBC + varC + operatorCD + varD + operatorDE + varE + operatorEF + varF + operatorFG + varG + operatorGH + varH + operatorHI + varI;
            }
            else
            {
                System.out.println("Error");
            }

            System.out.println("Result: " + operationResult);
        }
        else if (howManyVars.equals("10"))
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

            // Operation for 10
            System.out.println("Please list operators from left to right.");
            System.out.println("A-B");
            operatorAB = scanner.next().charAt(0);
            System.out.println("B-C");
            operatorBC = scanner.next().charAt(0);
            System.out.println("C-D");
            operatorCD = scanner.next().charAt(0);
            System.out.println("D-E");
            operatorDE = scanner.next().charAt(0);
            System.out.println("E-F");
            operatorEF = scanner.next().charAt(0);
            System.out.println("F-G");
            operatorFG = scanner.next().charAt(0);
            System.out.println("G-H");
            operatorGH = scanner.next().charAt(0);
            System.out.println("H-I");
            operatorHI = scanner.next().charAt(0);
            System.out.println("I-J");
            operatorIJ = scanner.next().charAt(0);

            System.out.println("Abs of?");
            absOf = scanner.nextBoolean();
            if (absOf == true)
            {
                operationResult = Math.abs(varA + operatorAB + varB + operatorBC + varC + operatorCD + varD + operatorDE + varE + operatorEF + varF + operatorFG + varG + operatorGH + varH + operatorHI + varI + operatorIJ + varJ);
            }
            else if (absOf == false)
            {
                operationResult = varA + operatorAB + varB + operatorBC + varC + operatorCD + varD + operatorDE + varE + operatorEF + varF + operatorFG + varG + operatorGH + varH + operatorHI + varI + operatorIJ + varJ;
            }
            else
            {
                System.out.println("Error");
            }

            System.out.println("Result: " + operationResult);
        }
        else
        {
            System.out.println("Error");
        }
    }
}
