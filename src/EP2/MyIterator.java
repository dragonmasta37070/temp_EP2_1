package EP2;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyIterator implements BasicOperatorIterator {
    BasicOperator value;
    Iterator<BasicOperator> current;
    boolean isRetrived;

    public MyIterator(BasicOperator value, Iterator<BasicOperator> current) {
        this.value = value;
        this.current = current;
    }

    @Override
    public BasicOperator next() {
        if (!hasNext()){
            throw new NoSuchElementException("BLA");
        }
        BasicOperator temp;

        if(!isRetrived) {
            isRetrived = true;
            return value;
        }

        temp = current.next();
        if(!current.hasNext()){
            current = null;
        }



        return temp;
    }

    @Override
    public boolean hasNext() {
        return current != null || !isRetrived;
    }
}
