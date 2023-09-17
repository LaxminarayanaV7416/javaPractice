import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {
        // byte test = 127;
        // int res = (byte)(test + 200);
        // System.out.println(res);

        arrayCheck();

        // callTerminalInputsAndPrintMethod();
    }

    public static void callTerminalInputsAndPrintMethod() {
        System.out.println("Hello! this program will take inputs from console and print them");
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter anything : ");
        String userInput = scan.nextLine();
        System.out.println("user input given is : " + userInput);
        scan.close();
    }

    public static void arrayCheck() {
        int[] arr1 = {1,2,3,4};
        List<Integer> test = new ArrayList<>();
        for(Integer i : arr1){
            test.add(i);
        }
        test.add(2, 100);
        System.out.println(test);
    }
}