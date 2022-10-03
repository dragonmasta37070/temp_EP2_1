package eu2;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SplittableRandom;

class Test{
    public static void main(String[]args){
        LL satz2 = new LL("geil", new LL("euda."));
        LL satz1 = new LL("Ich", new LL("bin", new LL("Marco.", satz2)));

        for (String s : satz1){
            System.out.print(s + " ");
        }
    }
}



public class LL implements Iterable<String> {
    private String Wort;
    private LL next;

    public LL(String wort, LL next) {
        Wort = wort;
        this.next = next;
    }

    public LL(String wort) {
        Wort = wort;
    }

    @Override
    public Iterator<String> iterator() {
        if (next != null)
            return new LLIterator(next.iterator(),Wort);
        return new LLIterator(null, Wort);
    }

    public String getWort() {
        return Wort;
    }

    public void setWort(String wort) {
        Wort = wort;
    }

    public LL getNext() {
        return next;
    }

    public void setNext(LL next) {
        this.next = next;
    }
}

class LLIterator implements Iterator<String> {

//    private LL current;
//    private boolean isLast;
//
//    public LLIterator(LL current) {
//        this.current = current;
//        if(current.getNext() == null)
//            isLast = true;
//        else
//            isLast = false;
//    }
//
//    @Override
//    public String next() {
//        if (!hasNext())
//            throw new NoSuchElementException("leer euda");
//
//        String temp = current.getWort();
//        if(current.getNext() != null)
//            current = current.getNext();
//        else
//            isLast = true;
//
//        return temp;
//    }
//
//    @Override
//    public boolean hasNext() {
//        return !isLast;
//    }

private Iterator<String> current;
private String value;
private boolean isRetreved;

    public LLIterator(Iterator<String> current, String value) {
        this.current = current;
        this.value = value;
        isRetreved = false;
    }

//    public LLIterator(String value) {
//        this.value = value;
//    }

    @Override
    public String next() {
        if(!hasNext())
            throw new NoSuchElementException("asd");

        if (!isRetreved){
            isRetreved = true;
            return value;
        }

        String temp = current.next();
        if(!current.hasNext()){
            current = null;
        }

        return temp;
    }

    @Override
    public boolean hasNext() {
        return current != null || !isRetreved;
    }
}
