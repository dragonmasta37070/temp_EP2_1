package EP2;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyIterator implements BasicOperatorIterator {
    Iterator<BasicOperator> rigth;
    Iterator<BasicOperator> left;

    public MyIterator(Iterator<BasicOperator> left, Iterator<BasicOperator> rigth) {
        this.left = left;
        this.rigth = rigth;
    }

    @Override
    public BasicOperator next() {
        if (!hasNext()){
            throw new NoSuchElementException("BLA");
        }

        if(left.hasNext())
            return left.next();
        else
            return rigth.next();
    }

    @Override
    public boolean hasNext() {
        return left.hasNext() || rigth.hasNext();
    }
}
