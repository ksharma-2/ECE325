package ece325_lab_assignment3;

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
