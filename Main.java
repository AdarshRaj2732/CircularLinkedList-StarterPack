/* =========================================================
   FILE: Main.java
   TESTING ONLY (NOT GRADED)
   ========================================================= */

public class Main {
    public static void main(String[] args) {

        CircularLinkedList<String> clist = new CircularLinkedList<>();
        clist.add("A");
        clist.add("B");
        clist.add("C");
        clist.add("D");

        CircularArrayAdapter<String> adapter =
                new CircularArrayAdapter<>(clist);

        // Expected output:
        // A
        // C
        // A C D

        System.out.println(adapter.get(0)); // A
        System.out.println(adapter.get(2)); // C

        adapter.remove(1); // removes B

        CircularLinkedList<String> newList =
                adapter.toCircularLinkedList();

        for (int i = 0; i < newList.size(); i++) {
            System.out.print(newList.get(i) + " ");
        }
    }
}
