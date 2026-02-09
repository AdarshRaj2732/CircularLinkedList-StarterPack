/* =========================================================
   FILE: CircularArrayAdapter.java
   YOU MAY EDIT THIS FILE ONLY
   ========================================================= */

import java.util.ArrayList;

/*
 Problem: Circular List Adapter (Medium)

 You are given a CircularLinkedList<T>.
 You are NOT allowed to modify it.

 Your task:
 1. Internally store elements in an ArrayList<T>
 2. Copy elements from the CircularLinkedList into the ArrayList
 3. Support indexed access and removal
 4. Convert back to a CircularLinkedList while preserving order

 Rules:
 - You may ONLY edit this file
 - Must use Java Generics
 - Must NOT modify CircularLinkedList
*/

public class CircularArrayAdapter<T> {

    private ArrayList<T> list;

    // TODO: constructor that copies from CircularLinkedList
    public CircularArrayAdapter(CircularLinkedList<T> circularList) {
        // TODO
    }

    // TODO: return element at index
    public T get(int index) {
        // TODO
        return null;
    }

    // TODO: remove element at index
    public void remove(int index) {
        // TODO
    }

    // TODO: convert ArrayList back to CircularLinkedList
    public CircularLinkedList<T> toCircularLinkedList() {
        // TODO
        return null;
    }

    public int size() {
        return list.size();
    }
}
