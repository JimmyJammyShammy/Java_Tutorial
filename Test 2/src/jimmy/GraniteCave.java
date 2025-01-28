package jimmy;
// extends makes it a subclass of CaveSystem, giving it the same constructor and methods
// implements gives the class access to the IGeneratable interface that has its own abstract methods
public class GraniteCave extends CaveSystem implements IGeneratable{
        public GraniteCave(String pickaxe, String block, double ore_chance){
            super(pickaxe, block, ore_chance);
        }

    @Override
    public void setBlock(String block) {
        if(block.isBlank()){
            block = "granite";
        }
        this.block = block;
    }

    @Override
    public void length() {
        System.out.println(getOre_chance()*2); // Calculates length of the cave based on ore chance
    }

    // Uses the abstract method from the super class to call the method from the interface
    @Override
    public void addCave() {
        generate();
    }

    // Adds the method from the interface
    @Override
    public void generate() {
        System.out.println("Generating Cave");
    }
}
