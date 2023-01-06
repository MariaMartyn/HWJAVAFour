package org.example;

import java.util.*;

/**
 * 2. Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() -
 помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его,
 first() - возвращает первый элемент из очереди, не удаляя.
 */
public class DequeClass<E> {
    public static final int CAPACITY = 1000;
    private int topIndex;
    private E[] data;


    public DequeClass() {
        this(CAPACITY);
    }
    public DequeClass(int capacity) {
        topIndex = -1;
        data = (E[]) new Object[capacity];
    }

    public int size() {
        return (topIndex + 1);
    }

    public boolean empty() {
        return (topIndex == -1);
    }

    public void enque(E e) throws IllegalStateException {
        if(size() == data.length) throw new IllegalStateException("Stack is full");
        data[++topIndex] = e;
    }

    public int deque() throws EmptyStackException {
        if(empty()) throw new EmptyStackException();
        int newTopIndex = (int) data[0];
        data = Arrays.copyOfRange(data, 1, data.length);
        return newTopIndex;
    }

    public E first () throws EmptyStackException {
        if(empty()) throw new EmptyStackException();
        return data[0];
    }
    public void view() throws EmptyStackException {
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {
                System.out.print(data[i] + " ");
            }
        }
    }
    public static void main(String[] args) {
        DequeClass<Integer> myDeque = new DequeClass<>();
        myDeque.enque(20);
        myDeque.enque(15);
        myDeque.enque(7);
        myDeque.enque(14);
        myDeque.enque(7);

        System.out.println("Список с добавленными элементами: ");
        myDeque.view();
        System.out.println();
        System.out.println("Удаляем первый элемент: " + myDeque.deque());
        System.out.println("Возвращаем первый элемент: " + myDeque.first());
        System.out.println("Список после удаления элемента: ");
        myDeque.view();
    }
}