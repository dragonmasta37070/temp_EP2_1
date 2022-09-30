public class SimpleScale implements Scale{
    private SimpleRecipe recipe;

    public SimpleScale(SimpleRecipe recipe) {
        this.recipe = recipe;
    }

    @Override
    public int getGrams() {
        return recipe.getWeightOfRecipe();
    }
}
