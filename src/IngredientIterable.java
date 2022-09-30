// Iterable objects with 'Ingredient' elements.
//
public interface IngredientIterable extends Iterable<Ingredient> {

    @Override
    // Returns an iterator over elements of 'Ingredient'.
    IngredientIterator iterator();
}
