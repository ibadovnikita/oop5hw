public class CalculatorModel {

  private double result;

  public void add(double num1, double num2) {
   result = num1 + num2;
  }

  public void subtrackt (double num1, double num2) {
    result = num1 - num2;
  }

  public void multiply (double num1, double num2) {
    result = num1 * num2;
  }

  public void divide(double num1, double num2) {
    if (num2 != 0) {
        result = num1 / num2;
    } else {
        // Обработка деления на ноль
        throw new IllegalArgumentException("На ноль делить нельзя!");
      }
    }
  
  public double getResult() {
    return result;
  }


}