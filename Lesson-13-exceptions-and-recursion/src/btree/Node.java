package btree;

public class Node {
    private Node left;
    private Node right;

    private Integer data;

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public void add(Integer i) {
        if (data == null) {
            this.data = i;
        } else if (data > i) {
            if (left == null) {
                left = new Node();
            }
            getLeft().add(i);
        } else {
            if (right == null) {
                right = new Node();
            }
            getRight().add(i);
        }
    }

    public void printLeftToRight() {
        if (left != null)
            getLeft().printLeftToRight();

        System.out.print(getData() + ", ");

        if (right != null) {
            getRight().printLeftToRight();
        }
    }

    public void printRightToLeft() {
        if (right != null) {
            getRight().printRightToLeft();
        }

        System.out.print(getData() + ", ");

        if (left != null) {
            getLeft().printRightToLeft();
        }
    }
}
