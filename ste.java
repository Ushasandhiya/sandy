import java.util.Scanner;
public class ste
{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string:");
    String a = sc.nextLine();
    boolean word = a.contains("sandhiya");
    System.out.println("contains text?:" + word );
    if(word==true)
    {
    System.out.println("Greeting detected");}
    else{
    System.out.println("not detected");
    }
}
}
