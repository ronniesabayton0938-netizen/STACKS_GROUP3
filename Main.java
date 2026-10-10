import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Listen, look, listen and learn");
        System.out.println("Yes or No?");
        System.out.print("Answer: ");
        String answer = sc.nextLine();
        if(answer.equalsIgnoreCase("yes")){
            System.out.println("Good.");
        }else if(answer.equalsIgnoreCase("no")){
            System.out.println("You Stoopid.");
        }else{
            System.out.println("You Stoopid, Invalid Input.");
        }
        System.out.println("Goodbye!");
    }
}
