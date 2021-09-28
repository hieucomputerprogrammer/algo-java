package ai.tech.bigO.timeComplexity.O1;

public class O1 {
  public void log(int[] numbers) {
    // O(1):
    java.lang.System.out.println(numbers[0]);
  }

  public void log1(int[] numbers) {
    // O(2) ~= O(1):
    java.lang.System.out.println(numbers[0]);
    java.lang.System.out.println(numbers[1]);
  }
}