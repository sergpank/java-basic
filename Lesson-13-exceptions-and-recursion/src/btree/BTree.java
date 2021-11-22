package btree;

public class BTree {
    Node root;

    public void add(Integer i) {
        if (root == null) {
            root = new Node();
        }
        root.add(i);
    }

    public void printLeftToRight() {
        root.printLeftToRight();
    }

    public void printRightToLeft() {
        root.printRightToLeft();
    }
}
