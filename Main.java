
/*
lab 4
partners: Damandeep Kaur and Sam Deckel
9/22/20
*/

import java.util.Random;

class Main {
  public static void main(String[] args) {

    Random r = new Random();
    int randomNum = r.nextInt(50) +1;
  

    System.out.println("The Random Number is: " + randomNum);

    for (int i = randomNum; i>=0; i--){
      System.out.println(i);
    }
    if (randomNum < 25){
      System.out.println("Ahoy mateys!");
    }
    else {
      if (randomNum < 42){
        System.out.println("Cannonball!");
      }
      else {
        System.out.println("Blast off!");
      }
    }


  }
}