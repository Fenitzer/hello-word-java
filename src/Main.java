import java.util.Objects;
import java.util.Scanner;


public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello Word");

        System.out.println("what's your name?");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Hello " + name);

        System.out.print
                    (
                        """
                        Qual operação você quer fazer?
                        Soma +
                        Subtração - 
                        Divisão / 
                        Multiplicação *
                        """
                    );

        String operação = input.nextLine();
        System.out.println("qual a primeira vaiável");
        float var1 = input.nextFloat();
        System.out.println("qual a segunda variável");
        float var2 = input.nextFloat();

        if (Objects.equals(operação, "+")) {
            float result = var1 + var2;
            System.out.println("seu resultado é " + result);
        }
        if (Objects.equals(operação, "-")) {
            float result = var1 - var2;
            System.out.println("seu resultado é " + result);
        }
        if (Objects.equals(operação, "/")) {
            float result = var1 / var2;
            System.out.println("seu resultado é " + result);
        }
        if (Objects.equals(operação, "*")) {
            float result = var1 * var2;
            System.out.println("seu resultado é " + result);
        }
    }
}

