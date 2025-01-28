package jimmy;
// Making it an abstract class makes it so it cannot be directly reference, can only use subclasses
public abstract class CaveSystem {
    public String pickaxe;
    protected String block;
    private double ore_chance;

    public CaveSystem(String pickaxe, String block, double ore_chance){
        this.pickaxe = pickaxe;
        this.block = block;
        this.ore_chance = ore_chance;

        }


    public double getOre_chance(){
        return ore_chance;
    }

    public String getBlock(){
        return block;
    }

    public void setOre_chance(){
        if(ore_chance < 0 ){
            ore_chance = 0;
        }
    }
    // Will set the block to stone if that parameter is blank
    // Is overridden in the subclasses depending on the subclass, ex for AndesiteCave it is andesite instead of stone
    public void setBlock(String block){
        if(block.isBlank()){
            block = "stone";
        }
        this.block = block;
    }

    // In abstract classes you can also make abstract methods,
    // Abstract methods have no function in the class, but must be implemented in subclasses
    public abstract void length();
        // Creates a method with no declared body, meaning subclasses have to define the method's function
    public abstract void addCave();

}

