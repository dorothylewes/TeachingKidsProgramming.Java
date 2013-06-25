package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class FourSquare
{
  public static void main(String[] args)
  {
    //  Show the tortoise --#1
    Tortoise.show();
    Tortoise.setSpeed(10);
    for (int i = 1; i <= 4; i++)
    {
      drawSquare();
      //      Turn the tortoise 90 degrees to the right --#10
      Tortoise.turn(90);
    }
    //  Repeat
  }
  private static void drawSquare()
  {
    for (int i = 1; i <= 4; i++)
    {
      Tortoise.setPenColor(Colors.getRandomColor());
      Tortoise.move(50);
      Tortoise.turn(90);
    }
  }
}
