import java.util.Random;
import java.util.Scanner;

public class numberguessinggame{
  public static void main(String args[]){
    int answer, guess, score=0;
    final int Max = 100;
    Scanner keyboard = new Scanner(System.in);
    Random rand = new Random();
    answer = rand.nextInt(Max)+1;
    for(int i=0;i<5;i++){
      System.out.println("guess a number between 1 and 100");
      guess = keyboard.nextInt();
      if(guess == answer){
            System.out.println("congratulations! your guess was correct");
            System.out.println("you have completed the task in "+(i+1)+" attempts");
     		score = (5 - i)*10;
            break;}
    
      else if(guess < answer){
            System.out.println("your guess is less than the answer"+answer);}

      else{
            System.out.println("your guess is greater than the answer"+answer);}
    }
     
    if(score == 0){
            System.out.println("sorry, you are out of attempts");
            System.out.println("The answer is "+answer+"\n please try again...");}
    else{
            System.out.println("your score is "+score);}
                   
  }
}

    