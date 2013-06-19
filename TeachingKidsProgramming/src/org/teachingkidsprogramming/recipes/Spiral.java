package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.Tortoise;

public class Spiral
{
  public static void main(String[] args)
  {
    Tortoise.show();
    //    Make the tortoise go as fast as possible --#4
    //    Add Blue Violet to the Color Wheel --#6
    //    Add Violet to the Color Wheel --#8
    //    Add Purple to the Color Wheel --#9
    //    Do the following 75 times --#3
    for (int i = 1; i <= 75; i++)
    {
      //         Change the color of the line the tortoise draws the next color on the Color Wheel --#7
      //         Move the tortoise 5 times the current line number you are drawing --#5
      Tortoise.turn(360 / 3);
    }
  }
}
