import java.util.Scanner; 
class Main {
  public static void main(String[] args) {
    int users = people(0);
  }

  public static int people(int person)
  {
    if(person < 15)
    {
      Scanner scan = new Scanner(System.in);
      System.out.println("Welcome to Hyde Park, how many people are entering the park? ");

      //scanner to ask reciever about how many people are entering
      int peopleEntering = scan.nextInt();

      return people(person + peopleEntering); 
      //statement to add up the amount of people that are are already in the park and how many are being currently added
    }else{
      //if the park is full, the else statement will play saying it's full
      System.out.println("Sorry, the park is full at the moment with a max of 15 people");
      return 15;
    }
  }
}