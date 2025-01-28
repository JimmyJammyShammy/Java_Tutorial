package jimmy;

import java.util.ArrayList;
import java.util.List;

/* the 'c' in the angled brackets represents an undefined datatype
 * the extends makes it so that the datatype has to be a subclass of the CaveSystem datatype
 *
 * c within this class acts as a "generic" datatype, meaning it is not specified
 *
 * If a ? is within the <> then it is called a wildcard generic,
 * When you know it extends a certain class but can hold any type
 */
public class CaveGen<c extends CaveSystem> {

    private List<c> caves;

    public CaveGen(){
        this.caves = new ArrayList<>();
    }

    // This method has a parameter with the generic datatype c\
    // This method adds elements to the previous arraylist
    public void addCave(c cave){
        // adds the paramter for this method to the caves list
        caves.add(cave);
        System.out.println("Added " + cave + "to the generation");
    }

    // Prints each cave in the list
    public void displayCaves(){
        System.out.println("Current caves in generation");
        // Using a for each loop to print out the list
        for(c cave : caves){
            System.out.println(cave);
        }
    }
    // You will almost never make your own generics, but there are many established generics in minecraft
}
