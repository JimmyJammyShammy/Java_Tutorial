package jimmy;
// Class name is capitalized
public class Mine {
// Fields that the "Mine" Class is created with
    public String pickaxe; // Accessible and changeable from anywhere
    protected String block; // Accessible in subclasses and same package
    private double ore_chance; // Accessible only in the class it's made

    // Creates a final variable that can never be changed
    final boolean generateOres = true;

    // generateOres = false;, Gives an error, tries to assign another value to a final variable

    // Constructors are a special method in a class that helps create objects from the class

    // Default Constructor - Has no parameters and changes nothing, available every time a new class is made
    // Does not need a return type since it returns type "Mine" being the class
    // Both named "Mine" and returns datatype "Mine"

    // public Mine(){
    //
    // }

    // Custom Constructor - Include parameters that need to be filled
    public Mine(String pickaxe, String block, double ore_chance){
        // "this" targets the field specifically in the current class
        // refers to the instance of "Mine" then the field in "Mine" then makes it equal to the parameter of the constructor
        // Sets the field equal to the parameter so it able to be referenced in another class
        this.pickaxe = pickaxe;
        this.block = block;
        this.ore_chance = ore_chance;

        caveTunnels++;
    }

// Custom method, name usually lowercase, followed by uppercase
    public void oreGen(){
        ore_chance++;
    }

    // Getter - A method that gets a private variable within a class and allows other classes to access it through a method
    public double getOre_chance(){
        return ore_chance;
    }

    // Setter - Allows control over what can be inputted into the field
    public void setOre_chance(double ore_chance){
        if(ore_chance < 0){
            ore_chance = 0; // Sets ore_chance to 0 if ore_chance goes below 0 in another method
        }
        this.ore_chance = ore_chance; // Sets the private ore_chance variable to the parameter
    }

    // Static Variables
        // Acts as global variables that can be used and is shared among all constructors
        public static int caveTunnels = 3; // Is independent of any individual call of the "Mine" class but its value is shared amongst them all
}
