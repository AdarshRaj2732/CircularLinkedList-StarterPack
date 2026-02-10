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
        list = new ArrayList<T>();
        for(int i =0;i<circularList.size();i++){
            list.add(circularList.get(i));
        }

        // TODO
    }

    // TODO: return element at index
    public T get(int index) {

        return list.get(index);
    }

    // TODO: remove element at index
    public void remove(int index) {
        list.remove(index);
    }

    // TODO: convert ArrayList back to CircularLinkedList
    public CircularLinkedList<T> toCircularLinkedList() {
        CircularLinkedList<T> newlist = new CircularLinkedList<>();
        for (T item : list) {
            newlist.add(item);
        }
        return newlist;
    }

    public int size() {
        return list.size();
    }
}

