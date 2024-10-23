package org.example.test;

import org.junit.jupiter.api.Test;
import org.example.MyContainer;

import static org.junit.jupiter.api.Assertions.*;

public class MyContainerTest {

    @Test
    public void testAddAndGet() {
        MyContainer<String> list = new MyContainer<>();
        list.add("Hello");
        list.add("World");
        assertEquals("Hello", list.get(0));
        assertEquals("World", list.get(1));
    }

    @Test
    public void testRemove() {
        MyContainer<String> list = new MyContainer<>();
        list.add("Hello");
        list.add("World");
        list.remove(0);
        assertEquals("World", list.get(0));
    }

    @Test
    public void testSize() {
        MyContainer<String> list = new MyContainer<>();
        assertEquals(0, list.size());
        list.add("Hello");
        assertEquals(1, list.size());
    }

    @Test
    public void testInvalidIndex() {
        MyContainer<String> list = new MyContainer<>();
        list.add("Hello");
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(1));
    }
}