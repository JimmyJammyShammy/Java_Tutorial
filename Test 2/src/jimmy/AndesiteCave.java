package jimmy;

// CaveSystem is the super class of AndesiteCave
// AndesiteCave is CaveSystem's subclass
public class AndesiteCave extends CaveSystem{
    // If adding a class under a super class, the class constructor must match the super
    // Same parameters
    public AndesiteCave(String pickaxe, String block, double ore_chance) {
        super(pickaxe, block, ore_chance); // refers to the super class

    }
    public void getFields(String pickaxe, String block){
        // Can only access these fields from CaveSystem since ore_chance is a private variable
        // Can access block since it is only a protected class
        block = this.block;
        pickaxe = this.pickaxe;
    }

    // This will over take precedent over the super class if this subclass is called due to polymorphism
    @Override
    public void setBlock(String block) {
        if(block.isBlank()){
            block = "andesite";
        }
        this.block = block;
    }

    @Override
    public void length() {
        System.out.println(getOre_chance()*2.5); // Calculates length of cave based on ore chance
    }

    @Override
    public void addCave() {

    }

}
