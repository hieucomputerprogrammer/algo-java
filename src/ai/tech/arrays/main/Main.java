package ai.tech.arrays.main;

import ai.tech.arrays.Array;

public class Main {
  public static void main(String[] args) {
    Array array = new Array(5);
    array.insert(1);
    array.insert(2);
    array.insert(3);
    array.insert(4);
    array.insert(5);
    array.insert(6);
    array.insert(7);

    array.removeAt(5);

    array.print();
    array.indexOf(5);
  }
}