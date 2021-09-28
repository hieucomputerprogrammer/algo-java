package ai.tech.arrays;

public class Array {
  private int[] items;
  private int size = 0;

  public Array(int length) {
    this.items = new int[length];
  }

  // O(n).
  public void insert(int item) {
    // If the array is full, resize it:
    if (this.items.length == this.size) { // O(1).
      // Create a new array (with twice the size) and copy all existing items into this new array and assign items[] field to this array.
      int[] newItems = new int[this.size * 2]; // O(1).
      for (int index = 0; index < size; index++) // O(n).
        newItems[index] = this.items[index];

      this.items = newItems; // O(1).
    }
    // Add the new item at the end:
    this.items[size++] = item; // O(1).
  }

  public void insertAt(int element, int index) {
    // TODO: implement inserting an element at a particular index in this array.
  }

  // O(n).
  public void print() {
    for (int index = 0; index < this.size; index++)
      java.lang.System.out.println(this.items[index]);
  }

  // O(n).
  public int indexOf(int element) {
    for (int index = 0; index < this.size; index++) { // O(n).
      if (this.items[index] == element) { // O(1).
        java.lang.System.out.printf("Index of %d is %d.\n", element, index);
        return index;
      }
    }
    java.lang.System.out.printf("%d doesn't belong inside the array.\n", element);
    return -1;
  }

  public int max() {
    // TODO: implement searching for the max value in this integer array.
    return 0;
  }

  public int[] intersect(int[] array) {
    // TODO: implement searching for common items in this array and another array.
    return null;
  }

  // O(n).
  public void removeAt(int index) {
    // Validate the index.
    if (index < 0 || index >= this.size) // O(1).
      throw new IllegalArgumentException();

    // Shift all items in the arrays to the left to fill the whole.
    for (int i = index; i < this.size; i++) // O(n).
      this.items[i] = items[i + 1];
    this.size--;
  }

  public void reverse() {
    // TODO: implement reversing this array.
  }
}