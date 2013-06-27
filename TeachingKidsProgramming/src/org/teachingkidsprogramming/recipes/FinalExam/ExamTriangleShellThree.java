package org.teachingkidsprogramming.recipes.FinalExam;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.windows.MessageBox;

public class ExamTriangleShellThree
{
  private static int length;
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    int shellSize = MessageBox.askForNumericalInput("Enter a size for the shell.");
    if (shellSize < 350)
    {
      MessageBox.showMessage("Shell size too small to be seen");
      MessageBox.askForNumericalInput("Enter a new size greater than 350");
    }
    for (int i = 1; i <= shellSize; i++)
    {
      {
        Tortoise.setPenColor(Colors.getRandomColor());
        int largelength = shellSize / 150;
        length--;
        if (largelength < 0)
        {
          length = length + 5;
        }
        else
        {
          drawTriangle();
        }
        int numberofRotations = 7;
        Tortoise.turn(360 * numberofRotations / shellSize);
      }
    }
  }
  private static void drawTriangle()
  {
    for (int j = 1; j <= 2; j++)
    {
      Tortoise.move(length);
      Tortoise.turn(360 / 3.5);
    }
  }
}
