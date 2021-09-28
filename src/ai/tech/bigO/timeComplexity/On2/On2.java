package ai.tech.bigO.timeComplexity.On2;

public class On2 {
  // O(n^2)
  public static void log(int[] numbers) {
    // O(n * n) = O(n^2)
    for(int firstIterator : numbers) { // O(n)
      for(int secondIterator : numbers) { //O(n)
        java.lang.System.out.printf("%d - %d\n", firstIterator, secondIterator);
      }
    }
  }

  public static void main(String[] args) {
    log(new int[] { 1, 2, 3, 4, 5 });
  }
}