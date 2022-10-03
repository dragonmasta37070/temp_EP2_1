package EP2;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class BlaIterator implements BasicOperatorIterator {
    boolean retrived;
    BasicOperator value;

    public BlaIterator(BasicOperator value) {
        this.value = value;
    }

    @Override
    public boolean hasNext() {
        return !retrived;
    }

    @Override
    public BasicOperator next() {
        if (!hasNext()){
            throw new NoSuchElementException("BLA");
        }
        retrived = true;
        return value;
    }
}
