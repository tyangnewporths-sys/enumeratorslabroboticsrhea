package frc.robot.parameters;

import edu.wpi.first.wpilibj.util.Color8Bit;

public enum Colors {
  RED(255, 0, 0),
  BLACK(0, 0, 0),
  WHITE(255, 255, 255),
  YELLOW(255, 255, 0),
  GREEN(0, 255, 0),
  BLUE(0, 0, 255);

  private final Color8Bit color;

  Colors(int red, int green, int blue) {
    this.color = new Color8Bit(red, green, blue);
  }

  public Color8Bit getColor() {
    return color;
  }

  public int getRed() {
    return color.red;
  }

  public int getGreen() {
    return color.green;
  }

  public int getBlue() {
    return color.blue;
  }
}

