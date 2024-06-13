public class Generics<T> {
    private T value;
    public Generics(T value) {
    this.value = value;
    }
    public T getValue() {
    return value;
    }
    public void setValue(T value) {
    this.value = value;
    }
    public static void main(String[] args) {
    Generics<Integer> integerBox = new Generics<>(10);
    Generics<String> stringBox = new Generics<>("Hello, Generics");
    System.out.println("Integer Value: " + integerBox.getValue());
    System.out.println("String Value: " + stringBox.getValue());
    }
    }




public class GenericMethodExample {
public static <T extends Comparable<T>> T findMax(T[] array) {
if (array == null || array.length == 0) {
return null;
}
T max = array[0];
for (T element : array) {
if (element.compareTo(max) > 0) {
max = element;
}
}
return max;
}
public static void main(String[] args) {
Integer[] intArray = { 3, 8, 1, 6, 7, 2 };
Double[] doubleArray = { 2.5, 5.0, 1.3, 9.8 };
String[] stringArray ={"apple","bannaa","cherry"};
System.out.println("Max Integer: " + findMax(intArray));
System.out.println("Max Double:" + findMax(doubleArray));
System.out.println("Max String:" + findMax(stringArray));
}
}
