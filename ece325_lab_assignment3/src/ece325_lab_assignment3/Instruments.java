package ece325_lab_assignment3;

public class Instruments extends Equipment {
    String instrument;

    public Instruments(String instrument){
        this.instrument = instrument;
        this.setNeedsWrapping(true);
    }

    @Override
    public String toString() {
        return instrument;
    }
 
}
