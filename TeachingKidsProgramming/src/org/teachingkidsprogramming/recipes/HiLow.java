package org.teachingkidsprogramming.recipes;

import java.util.Random;

import org.teachingextensions.logo.utils.Sounds;
import org.teachingextensions.windows.MessageBox;

public class HiLow
{
  public static void main(String[] args)
  {
    int correctNumber = new Random().nextInt(100);
    int numberOfGuesses = 8;
    for (int i = 1; i <= numberOfGuesses; i++)
    {
      int chancesLeft = numberOfGuesses + 1 - i;
      int guess = MessageBox.askForNumericalInput("Guess a Number (" + chancesLeft + " left)");
      //if the number is not valid then
      if (guess < 1 || 100 < guess)
      {
        MessageBox.showMessage("Your number " + guess + " is not between 1 and 100");
      }
      else if (guess == correctNumber)
      {
        Sounds.playBeep();
        MessageBox.showMessage("You won");
        System.exit(0);
      }
      else if (correctNumber < guess)
      {
        MessageBox.showMessage("Too High");
      }
      else
      {
        MessageBox.showMessage("Too Low");
      }
    }
    MessageBox.showMessage("You lost, the correct answer was " + correctNumber);
  }
}
