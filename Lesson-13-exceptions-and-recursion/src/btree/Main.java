package btree;

public class Main {
    public static void main(String[] args) {
        int[] data = {5, 4, 6, 3, 7, 2, 8, 1, 9};

        BTree tree = new BTree();
        for (int i : data)
        {
            tree.add(i);
        }

        tree.printLeftToRight();
        System.out.println();
        tree.printRightToLeft();
    }
}
