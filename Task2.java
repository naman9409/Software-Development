import java.util.Random;
import java.util.Scanner;


public class Task2 {
    public static void main(String[] args){
Scanner scan = new Scanner(System.in);
System.out.println("what is your name");
String name = scan.nextLine();

System.out.println("well, " + name +",i am thinking of a number between 1 and 100!");
int myNumber = getRandomNumber(1,100);
for (int i=0;i <6;i++) {
    Scanner scan1 = new Scanner(System.in);
    System.out.println("take a guess");
    int yourGuess =  scan1.nextInt();
    if (yourGuess == myNumber) {
        System.out.println("you guessed correctly!");
break;
    }
else if (yourGuess < myNumber) {
    System.out.println("your guess is too low!");
}
else if (yourGuess > myNumber){
    System.out.println("your guess is too high!");
}
if (i >= 5) {
    System.out.println();
    System.out.println("nope. the number I was thinking of was" + myNumber + "!");
    
}
    }


    }
    public static int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.ints(min,max).findFirst().getAsInt();
    }
}
