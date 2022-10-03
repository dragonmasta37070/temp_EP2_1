package EP2;

import java.util.*;

// This class implements 'BasicOperator' and represents a simple replacement operation on a string.
// It replaces the all occurrences of the specified 'oldChar' with 'newChar'.
//
public class ReplaceOperator implements BasicOperator {

    private char oldChar;
    private char newChar;

    // Initializes this.

    public ReplaceOperator(char oldChar, char newChar) {
        this.oldChar = oldChar;
        this.newChar = newChar;
    }

    @Override
    public BasicOperatorIterator iterator() {
        return new BlaIterator(this);
    }

    @Override
    public String apply(String operand) {
        return operand.replace(oldChar, newChar);
    }

    @Override
    public StringOperator andThen(StringOperator after) {
        return new ComposedOperator(this, after);
    }

    @Override
    public String toString() {
        return "replace '" + oldChar + "' with '" + newChar + "'";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReplaceOperator that = (ReplaceOperator) o;
        return oldChar == that.oldChar && newChar == that.newChar;
    }

    @Override
    public int hashCode() {
        return Objects.hash(oldChar, newChar);
    }

    //TODO: define missing parts of this class.
}
