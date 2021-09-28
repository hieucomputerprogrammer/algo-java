package ai.tech.bigO.timeComplexity.On;

public class On {
  public void log(int[] numbers) {
    // O(n):
    for (int index = 0; index <= numbers.length; index++) {
      java.lang.System.out.println(numbers[index]);
    }
  }

  // O(n + n) = O(2n) ~= O(n):
  public void log1(int[] numbers) {
    // O(n):
    for (int index = 0; index <= numbers.length; index++) {
      java.lang.System.out.println(numbers[index]);
    }

    // O(n):
    for (int index = 0; index <= numbers.length; index++) {
      java.lang.System.out.println(numbers[index]);
    }
  }

  // O(n + m) ~= O(n):
  public void log1(int[] numbers, String[] texts) {
    // O(n):
    for (int index = 0; index <= numbers.length; index++) {
      java.lang.System.out.println(numbers[index]);
    }

    // O(m):
    for (int index = 0; index <= texts.length; index++) {
      java.lang.System.out.println(texts[index]);
    }
  }
}