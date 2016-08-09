/**
 * Created by LordwolF on 8/7/2016.
 */
public class App {
    public static void main(String[] args) {
        Plant plant1 = new Plant();
        Tree tree = new Tree();

        Plant plant2 = tree;

        plant2.grow();

        tree.shedLeaves();

        Plant plant3;

        plant3.grow();


        //wont work plant2 is a tree not a plant
        //plant2.shedLeaves();
    }

    public static void doGrow(Plant plant) {
        plant.grow();
    }
}
