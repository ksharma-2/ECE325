package ece325_lab_assignment3;

/**
 * Extras is a type of equipment that by default does not need wrapping.
 */
public class Extras extends Equipment {
    String item;

    public Extras(String item){
        this.item = item;
        this.setNeedsWrapping(false);
    }

    @Override
    public String toString() {
        return item;
    }
    
}
