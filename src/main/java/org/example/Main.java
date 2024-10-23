package org.example;

public class Main {
    public static void main(String[] args) {
        MyContainer<Integer> list = new MyContainer<>();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("Size: " + list.size()); // 3
        System.out.println("Element at index 1: " + list.get(1)); // 2

        list.remove(1);
        System.out.println("Size after removal: " + list.size()); // 2
    }
}
