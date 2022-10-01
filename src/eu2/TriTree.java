package eu2;

import java.util.Iterator;
import java.util.NoSuchElementException;

class TestTriTree{
    public static void main(String[]args){
//              1
//        2             3
//     4  5  6       7  8
//                   9
        System.out.println("startet");
        TriTree neun = new TriTree(9);
        TriTree sieben = new TriTree(7,null, neun,null);
        TriTree acht = new TriTree(8);
        TriTree drei = new TriTree(3, sieben, acht , null);
        TriTree vier = new TriTree(4);
        TriTree fünf = new TriTree(5);
        TriTree sechs = new TriTree(6);
        TriTree zwei = new TriTree(2,vier,fünf,sechs);

        TriTree baum = new TriTree(1,zwei,null,drei);

        for (Integer s : baum){
            System.out.print(s + " ");
        }
        System.out.println("finished");
    }
}

public class TriTree implements Iterable<Integer>{
    private TriTree left;
    private TriTree middle;
    private TriTree right;
    private int value;

    public TriTree(int value, TriTree left, TriTree middle, TriTree right) {
        this.left = left;
        this.middle = middle;
        this.right = right;
        this.value = value;
    }

    public TriTree(int value) {
        this.value = value;
    }

    public TriTree getLeft() {
        return left;
    }

    public void setLeft(TriTree left) {
        this.left = left;
    }

    public TriTree getMiddle() {
        return middle;
    }

    public void setMiddle(TriTree middle) {
        this.middle = middle;
    }

    public TriTree getRight() {
        return right;
    }

    public void setRight(TriTree right) {
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new TriTreeIterator(this);
    }
}

class TriTreeIterator implements Iterator<Integer>{

    private TriTree tree;
    private boolean retrived;
    Iterator<Integer> current;

    public TriTreeIterator(TriTree tree) {
        this.tree = tree;
        retrived = false;

        if(tree.getLeft() != null){
            current = tree.getLeft().iterator();
        } else if(tree.getMiddle() != null){
            current = tree.getMiddle().iterator();
        } else if (tree.getRight() != null){
            current = tree.getRight().iterator();
        }
    }

    @Override
    public Integer next() {
        if(!hasNext()){
            throw new NoSuchElementException("ois weg");
        }

        Integer temp = null;
        if (current != null && current.hasNext())
             temp = current.next();
        else{
            temp = tree.getValue();
            retrived = true;
        }
        if(tree.getLeft() != null){
            current = tree.getLeft().iterator();
        } else if(tree.getMiddle() != null){
            current = tree.getMiddle().iterator();
        } else if (tree.getRight() != null){
            current = tree.getRight().iterator();
        }

        retrived = true;
        return temp;
    }

    @Override
    public boolean hasNext() {
        return !retrived;
    }
}
