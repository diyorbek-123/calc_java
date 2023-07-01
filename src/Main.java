//package nyc.c4q.ac21.romancalc;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String answer = calc(input);
        System.out.println(answer);
    }

    public static String calc(String input){
        String result = "";
        String [] elements = input.split("[+*/-]");
        String [] operator = input.split("[0-9]+");
        if (elements.length == 2){
            try{
                int a = Integer.parseInt(elements[0]);
                int b = Integer.parseInt(elements[1]);

                if ((a <= 10) && (a >= 1) && (b <= 10) && (b >= 1)) {
                    switch (operator[1]){
                        case "+":
                            result = Integer.toString(a+b);
                            break;
                        case "-":
                            result = Integer.toString(a-b);
                            break;
                        case "*":
                            result = Integer.toString(a*b);
                            break;
                        case "/":
                            result = Integer.toString(a/b);
                            break;
//                        default:
//                            System.out.println("invalid operator");
                    }
                }else {
                    System.out.println("invalid values of elements");
                }
            } catch (NumberFormatException e){
                System.out.println("NumberFormatException // you have entered invalid characters");
            }
        }else {
            System.out.println("invalid number of elements or operator");
        }
        return result;
    }
}