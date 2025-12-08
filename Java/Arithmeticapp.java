import java.util.Random;
import java.util.Scanner;
public class Arithmeticapp{
public static void main(String[]args){
Scanner input=new Scanner(System.in);
Random random=new Random();
int totalscore=0;
 int totalattempts = 0;

 for (int count = 0; count < 10; count++) {
int questone=random.nextInt(1,100);
int questtwo=random.nextInt(1,10);
System.out.println("Welcome to Udochi simple arithimetic calculator app!!!!you have 10 marks for each question ! Question= " + questone + "-" + questtwo);
int answerfromuser = input.nextInt();
int answers=questone - questtwo;


if (answerfromuser == answers) {
System.out.println("You are correct!!Genius!!!");
totalscore+=10;
                       
 } else {
System.out.println("You are slowly becoming an olodo o, simple subtraction!!Try again!!!");
totalattempts++;
}
               
           
if (totalattempts == 2) {
System.out.print("You missed this simple subtraction twice? why?Anyways I dont want to know ,here is the answer= " + answers   );
}
}

       
System.out.println("Quiz Finished");
System.out.println("Your Score is=" + totalscore + "/100");

        
}
}

