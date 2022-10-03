package EP2;

import java.util.Iterator;
import java.util.Objects;

// This class implements 'StringOperator' and represents a composition of two 'StringOperator'
// objects that are applied in succession (both can be 'ComposedOperator' objects themselves).
// Calling this object's 'apply' method returns the result of applying the second 'StringOperator'
// on the result of applying the first one on the specified string.
// 'ComposedOperator' objects can be build using the 'andThen' method specified in the
// interface 'StringOperator'.
//
public class ComposedOperator implements StringOperator {

    private BasicOperator jetzt;
    private StringOperator folgender;

    public ComposedOperator(BasicOperator jetzt) {
        this.jetzt = jetzt;
        folgender = null;
    }

    // Returns an iterator over all basic operators which
    // this operator is composed of.
    // See examples in 'PraxisTest2.java'.
    public BasicOperatorIterator iterator() {
        return new MyIterator(jetzt, folgender.iterator());
    }

    @Override
    public String apply(String operand) {
        String out = operand;
        for (BasicOperator b : this) {
            b.apply(out);
        }
        return out;
    }

    @Override
    public StringOperator andThen(StringOperator after) {
        if (folgender != null)
            folgender.andThen(after);
        else
            folgender = new ComposedOperator((BasicOperator) after);
        return this;
    }

    @Override
    public String toString() {
        return jetzt.toString() + " and Then " + folgender.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Iterator<BasicOperator> x = ((ComposedOperator) o).iterator();

        for (BasicOperator i : this) {
            if (x.hasNext()) {
                if (x.next() != i)
                    return false;
            } else
                return false;
        }
        return !x.hasNext();
    }

    @Override
    public int hashCode() {
        return Objects.hash(jetzt, folgender);
    }
}