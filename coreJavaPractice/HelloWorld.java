package coreJavaPractice;
import java.util.Scanner;

class HelloWorld{
    public static void main(String[] args){
        byte test = 127;
        int res = (byte)(test + 200);
        System.out.println(res);
        // callTerminalInputsAndPrintMethod();
    }

    public static void callTerminalInputsAndPrintMethod(){
        System.out.println("Hello! this program will take inputs from console and print them");
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter anything : ");
        String userInput = scan.nextLine();
        System.out.println("user input given is : " + userInput);
        scan.close();
    }
}