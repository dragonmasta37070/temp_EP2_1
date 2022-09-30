import java.nio.charset.CodingErrorAction;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

// A simple recipe is an unordered mixture of ingredients;
// 'SimpleRecipe' is subtype of 'Recipe'.
//
// TODO: Implementation of this class.
//  You can use the Java-Collection framework in your implementation.
//
public class SimpleRecipe implements Recipe {

    // TODO: Define missing parts of the class.
    //  Further methods can be added if necessary (but no setters or
    //  getters that return or set just the value of a variable).

    private HashMap<Ingredient, Integer> ingredients;
    //private IngredientGrammPair y;

    // Initializes 'this' as an empty recipe.
    public SimpleRecipe() {
        ingredients = new HashMap<>();
    }

    // Adds an ingredient with its quantity in grams to this recipe. If
    // the ingredient is already contained in 'this' with a certain quantity,
    // the specified quantity 'grams' is added to the quantity of the ingredient.
    // Precondition: ingredient != null.
    public void put(Ingredient ingredient, int grams) {
        if (ingredients.containsKey(ingredient))
            ingredients.put(ingredient, ingredients.get(ingredient) + grams);
        else
            ingredients.put(ingredient, grams);

//        for(Ingredient i :ingredients.keySet()){
//            if (i.getName() == ingredient.getName()){
//                ingredients.put(ingredient, ingredients.get(ingredient) + grams);
//                return;
//            }
//        }
//        ingredients.put(ingredient, grams);
    }

    // Returns a 'Scale' view of 'this'. Later changes to 'this' will be reflected in the
    // returned view.
    public Scale getScale() {
        return new SimpleScale(this);
    }

    //@Override
    // Returns an iterator over all ingredients contained in 'this'.
    // The iterator's 'next()' method throws a 'java.util.NoSuchElementException'
    // with the message "no next ingredient!" if the iteration has no more elements.
    // (See examples in 'PraxisTest2.java'.)
    public IngredientIterator iterator() {

        return new SimpleIngredientIterator(ingredients);
    }

    @Override
    // Returns a readable representation of 'this', with all distinct ingredients
    // and their quantity. There is no specific order. The format is shown in the
    // following example:
    // {Egg=2, Milk=1, Flour=1}
    // (See examples in 'PraxisTest2.java'.)
    public String toString() {
        String out = "{";
        boolean first = true;

        for (Ingredient i : ingredients.keySet()) {
            if (!first)
                out += ", ";
            out += i.getName() + " : " + ingredients.get(i);
            first = false;
        }
        out += "}";
        return out;
    }

    // Returns 'true' if 'obj' is of class 'SimpleRecipe' and has the same
    // ingredients in the same quantity as in 'this' regardless of the
    // order.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimpleRecipe that = (SimpleRecipe) o;
        return Objects.equals(ingredients, that.ingredients);
    }

    // Returns the hash code of 'this'.
    @Override
    public int hashCode() {
        return ingredients.hashCode();
    }


    @Override
    public int getQuantityOf(Ingredient ingredient) {
        return 0;
    }

    public int getWeightOfRecipe () {
        int sum = 0;
        for (Ingredient i : ingredients.keySet())
            sum += ingredients.get(i);
        return sum;
    }
}

//TODO: Define additional class(es) if needed (either here or in a separate file).
