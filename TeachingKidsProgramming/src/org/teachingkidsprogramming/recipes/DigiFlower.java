package org.teachingkidsprogramming.recipes;

import java.awt.Color;

import org.teachingextensions.logo.ColorWheel;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class DigiFlower
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.getBackgroundWindow().setColor(Colors.Grays.Gray);
    Tortoise.setPenWidth(3);
    createColorPalette();
    for (int i = 1; i <= 15; i++)
    {
      drawOctogon();
      Tortoise.turn(360 / 15);
    }
  }
  private static void drawOctogon()
  {
    for (int i = 1; i <= 8; i++)
    {
      Tortoise.setPenColor(ColorWheel.getNextColor());
      Tortoise.move(50);
      Tortoise.turn(360 / 8);
    }
  }
  private static void createColorPalette()
  {
    Tortoise.setPenWidth(3);
    for (int i = 1; i <= 15; i++)
    {
      Tortoise.turn(360 / 15);
    }
    Color Color1 = Colors.Reds.Red;
    Color Color2 = Colors.Oranges.DarkOrange;
    Color Color3 = Colors.Yellows.Gold;
    Color Color4 = Colors.Yellows.Yellow;
    ColorWheel.addColor(Color1);
    ColorWheel.addColor(Color2);
    ColorWheel.addColor(Color3);
    ColorWheel.addColor(Color4);
    ColorWheel.addColor(Color4);
    ColorWheel.addColor(Color3);
    ColorWheel.addColor(Color2);
    ColorWheel.addColor(Color1);
    for (int i = 1; i <= 8; i++)
    {
      Tortoise.setPenColor(ColorWheel.getNextColor());
      Tortoise.move(50);
      Tortoise.turn(360 / 8);
    }
  }
}
