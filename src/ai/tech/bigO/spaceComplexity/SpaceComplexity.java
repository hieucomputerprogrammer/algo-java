package ai.tech.bigO.spaceComplexity;

public class SpaceComplexity {
  public void greet(String[] names) {
    // O(n) time complexity.
    for (int index = 0; index < names.length; index++) {
      java.lang.System.out.printf("Hello, %s!\n", names[index]);
    }
  }
}