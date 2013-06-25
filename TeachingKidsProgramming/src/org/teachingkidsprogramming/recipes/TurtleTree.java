package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Turtle;

import com.spun.util.NumberUtils;

public class TurtleTree
{
  public static void main(String[] args)
  {
    Turtle turtle = new Turtle();
    turtle.setY(turtle.getY() + 100);
    turtle.setSpeed(10);
    turtle.getBackgroundWindow().setColor(Colors.Grays.Black);
    int length = 70;
    drawBranch(turtle, length);
  }
  private static void drawBranch(Turtle turtle, int length)
  {
    if (0 < length)
    {
      adjustColor(turtle, length);
      turtle.move(length);
      drawLowerBranches(turtle, length);
    }
  }
  private static void adjustColor(Turtle turtle, int length)
  {
    if (length <= 10)
    {
      turtle.setPenColor(Colors.Greens.Lime);
      turtle.setPenWidth(2);
    }
    else if (length <= 20)
    {
      turtle.setPenColor(Colors.Greens.ForestGreen);
      turtle.setPenWidth(3);
    }
    else if (length <= 30)
    {
      turtle.setPenColor(Colors.Greens.DarkGreen);
      turtle.setPenWidth(4);
    }
    else if (length <= 40)
    {
      turtle.setPenColor(Colors.Greens.Olive);
      turtle.setPenWidth(6);
    }
    else if (length <= 50)
    {
      turtle.setPenColor(Colors.Browns.Sienna);
      turtle.setPenWidth(8);
    }
    else if (length <= 60)
    {
      turtle.setPenColor(Colors.Browns.SaddleBrown);
      turtle.setPenWidth(10);
    }
  }
  private static void drawLowerBranches(Turtle turtle, int length)
  {
    int rightAngle = NumberUtils.getRandomInt(10, 60);
    turtle.turn(rightAngle);
    drawShorterBranch(turtle, length);
    int leftAngle = -NumberUtils.getRandomInt(10, 60);
    turtle.turn(leftAngle - rightAngle);
    drawShorterBranch(turtle, length);
    turtle.turn(-leftAngle);
    adjustColor(turtle, length);
    turtle.move(-length);
  }
  private static void drawShorterBranch(Turtle turtle, int length)
  {
    int difference = NumberUtils.getRandomInt(5, 15);
    drawBranch(turtle, length - difference);
  }
}