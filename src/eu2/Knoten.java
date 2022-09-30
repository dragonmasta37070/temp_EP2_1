package eu2;

import java.util.Iterator;

public class Knoten implements Iterable<Integer> {
    private int value;
    private Knoten left;
    private Knoten right;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Knoten getLeft() {
        return left;
    }

    public void setLeft(Knoten left) {
        this.left = left;
    }

    public Knoten getRight() {
        return right;
    }

    public void setRight(Knoten right) {
        this.right = right;
    }


    @Override
    public Iterator<Integer> iterator() {
        return new TreeIterator(this);
    }

    public boolean isLeafNote() {
        return left == null && right == null;
    }
}

class TreeIterator implements Iterator<Integer> {
    boolean hasValue = true;
    boolean isRight = false;
    Knoten node;
    Iterator<Integer> current;

    public TreeIterator(Knoten node) {
        isRight = false;
        this.node = node;
        this.current = node.getLeft().iterator();
    }

    @Override
    public Integer next() {
        Integer temp = current.next();

        if (node.isLeafNote()) {

        }
        if (!current.hasNext() && !isRight) {
            current = node.getRight().iterator();
        }

        return temp;
    }

    @Override
    public boolean hasNext() {
        return false;
    }
}
