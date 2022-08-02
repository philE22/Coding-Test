package Section1.CombinationTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class PermutationEx {
    public static void main(String[] args) {
        PermutationEx ex = new PermutationEx();
        ArrayList<Integer[]> result = ex.newChickenRecipe(new int[]{1, 10, 1100, 1111}, 2);
        Iterator<Integer[]> it = result.iterator();
    }

    public ArrayList<Integer[]> newChickenRecipe(int[] stuffArr, int choiceNum) {
        // TODO:
        Arrays.sort(stuffArr);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < stuffArr.length; i++) {
            String str = String.valueOf(stuffArr[i]);
            if(str.contains("000")) continue;
            list.add(stuffArr[i]);
        }
        Integer[] ingredient = new Integer[list.size()];
        for (int i = 0; i < ingredient.length; i++) {
            ingredient[i] = list.get(i);
        }

        Integer[] recipe = new Integer[]{};
        boolean[] checked = new boolean[ingredient.length];
        ArrayList<Integer[]> result = new ArrayList<>();

        return permutation(recipe, checked, ingredient, choiceNum, result);
    }

    public ArrayList<Integer[]> permutation(Integer[] recipe, boolean[] checked, Integer[] ingredient, int choiceNum, ArrayList<Integer[]> result) {
        if (choiceNum == recipe.length) {
            System.out.println(Arrays.toString(recipe));
            result.add(recipe);
            return result;
        }

        for (int i = 0; i < ingredient.length; i++) {
            if(!checked[i]) {
                Integer[] currentRecipe = Arrays.copyOf(recipe, recipe.length + 1);
                currentRecipe[currentRecipe.length - 1] = ingredient[i];
                checked[i] = true;
                result = permutation(currentRecipe, checked, ingredient, choiceNum, result);
                checked[i] = false;
            }
        }

        return result;
    }
}
