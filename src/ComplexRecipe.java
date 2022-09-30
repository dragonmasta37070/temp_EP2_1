import java.util.LinkedList;
import java.util.NoSuchElementException;

// A more complex recipe consisting of multiple objects of type 'recipe'. The order is relevant.
// 'ComplexRecipe' is subtype of 'Recipe'.
//
// TODO: Implementation of this class.
//  You can use the Java-Collection framework in your implementation.
//
public class ComplexRecipe implements Recipe // implements Recipe
{
    private LinkedList<Recipe> recipes;

    // TODO: Define missing parts of the class.
    //  Further methods can be added if necessary (but no setters or
    //  getters that set or return just the value of a variable).

    // Initializes 'this' with recipes in the specified order.
    // Precondition: recipes != null, recipes.length > 1
    public ComplexRecipe(Recipe... recipes) {
        this.recipes = new LinkedList<>();

        for (Recipe r : recipes) {
            this.recipes.addLast(r);
        }

// TODO: implement constructor.
    }

    //@Override
    // Returns an iterator over elements of 'Ingredient', where the
    // iterations are in the order of the recipes specified at initialization
    // of 'this'.
    // The iterator's 'next()' method throws a 'java.util.NoSuchElementException'
    // with the message "no next recipe!" of the iteration has no more elements.
    public IngredientIterator iterator() {

        return new ComplexIterator(recipes);
    }

    @Override
    // Returns a readable representation with all the recipe components of 'this' in the
    // order specified at initialization of 'this'.
    // The format is reflecting the structure of the recipe and is shown in the following
    // example:
    // [{Egg=50, Flour=300, Milk=250}, {Egg=100}]
    // (See also examples in 'PraxisTest2.java'.)
    //
    public String toString() {
        String out = "";

        // TODO: implement method.
        return "";
    }

    // 'equals' and 'hashCode' need not be overridden in this class.

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int getQuantityOf(Ingredient ingredient) {
        return 0;
    }
}

class ComplexIterator implements IngredientIterator {

    private LinkedList<Recipe> recipes;

    private IngredientIterator current;
    private int index;

    public ComplexIterator(LinkedList<Recipe> recipes) {
        this.recipes = recipes;
        this.index = 0;

        if (this.recipes.size() > 0)
            current = this.recipes.get(0).iterator();
        else
            current = null;
    }

    @Override
    public Ingredient next() {
        if (!hasNext())
            throw new NoSuchElementException("gibts nimma euda");

        Ingredient temp = current.next();

        if (current.hasNext()) {
            current = null;
            while (++index < recipes.size()) {
                if (recipes.get(index) != null) {
                    current = recipes.get(index).iterator();
                    break;
                }
            }
        }

        return temp;
    }

    @Override
    public boolean hasNext() {
        return current.hasNext();
    }
}
