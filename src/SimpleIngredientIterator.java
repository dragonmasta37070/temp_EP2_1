import java.util.HashMap;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class SimpleIngredientIterator implements IngredientIterator {

    private Iterator<Ingredient> iterator;

    public SimpleIngredientIterator(HashMap<Ingredient, Integer> ingerdients) {
        this.iterator = ingerdients.keySet().iterator();
    }

    @Override
    public Ingredient next() {
        if (!hasNext())
            throw new NoSuchElementException("no next ingredient!");

        return iterator.next();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }
}
