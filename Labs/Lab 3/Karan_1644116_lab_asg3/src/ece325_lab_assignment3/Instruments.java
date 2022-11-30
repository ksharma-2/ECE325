package ece325_lab_assignment3;

/**
 * Instrument is a type of Equipment that by default, needs wrapping
 */
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
