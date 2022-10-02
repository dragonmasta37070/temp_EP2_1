package eu2;

import java.util.*;

public class QuadTree implements Iterable<Integer> {
    Integer value;
    QuadTree first;
    QuadTree second;
    QuadTree third;
    QuadTree fourth;

    public QuadTree(Integer value) {
        this.value = value;
    }

    public QuadTree(Integer value, QuadTree first, QuadTree second, QuadTree third, QuadTree fourth) {
        this.value = value;
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
    }

    public Integer getValue() {
        return value;
    }

    public QuadTree getFirst() {
        return first;
    }

    public QuadTree getSecond() {
        return second;
    }

    public QuadTree getThird() {
        return third;
    }

    public QuadTree getFourth() {
        return fourth;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new QuadTreeIterator(this);
    }
}

class TestQadTree {
    public static void main(String[] args) {
//              1
//        2      10         3
//     4  5  6   11     7  8
//               12      9
//           13 14 15 16
        System.out.println("start");

        QuadTree neun = new QuadTree(9);
        QuadTree sieben = new QuadTree(7, null, neun, null, null);
        QuadTree acht = new QuadTree(8);
        QuadTree drei = new QuadTree(3, sieben, acht, null, null);
        QuadTree vier = new QuadTree(4);
        QuadTree fünf = new QuadTree(5);
        QuadTree sechs = new QuadTree(6);
        QuadTree zwei = new QuadTree(2, vier, fünf, sechs, null);
        QuadTree thirteen = new QuadTree(13);
        QuadTree fourteen = new QuadTree(14);
        QuadTree fifteen = new QuadTree(15);
        QuadTree sixteen = new QuadTree(16);
        QuadTree twelve = new QuadTree(12, thirteen, fourteen, fifteen, sixteen);
        QuadTree eleven = new QuadTree(11, null, null, twelve, null);
        QuadTree ten = new QuadTree(10, eleven, null, null, null);

        QuadTree baum = new QuadTree(1, zwei, ten, drei, null);


        List<Integer> baumliste = new LinkedList<>();
        for (Integer s : baum) {
            baumliste.add(s);
            System.out.print(s + ", ");
        }
        Collections.sort(baumliste);
        for(Integer i : baumliste)
            System.out.println(i);
        System.out.println("finished");

    }
}

class QuadTreeIterator implements Iterator<Integer> {
    private QuadTree node;
    private int state;
    private boolean fetched;
    private Iterator<Integer> current;

    public QuadTreeIterator(QuadTree node) {
        this.node = node;
        this.fetched = false;

        if (node.getFirst() != null) {
            current = node.getFirst().iterator();
            state = 1;
        } else if (node.getSecond() != null) {
            current = node.getSecond().iterator();
            state = 2;
        } else if (node.getThird() != null) {
            current = node.getThird().iterator();
            state = 3;
        } else if (node.getFourth() != null) {
            current = node.getFourth().iterator();
            state = 4;
        }
    }

    @Override
    public boolean hasNext() {
        return !fetched;
    }

    @Override
    public Integer next() {
        if (!hasNext())
            throw new NoSuchElementException("leer");

        Integer temp;

        if (current != null) {
            temp = current.next();

            if (!current.hasNext()) {
                if (node.getSecond() != null && state < 2) {
                    current = node.getSecond().iterator();
                    state = 2;
                } else if (node.getThird() != null && state < 3) {
                    current = node.getThird().iterator();
                    state = 3;
                } else if (node.getFourth() != null && state < 4) {
                    current = node.getFirst().iterator();
                    state = 4;
                } else {
                    current = null;
                }

            }

        } else {
            temp = node.getValue();
            fetched = true;
        }

        return temp;
    }
}
