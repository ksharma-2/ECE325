package ece325_lab_assignment5;

import java.util.Comparator;

public class SongComparator implements Comparator<Song> {

    @Override
    public int compare(Song o1, Song o2) {
        int i = Integer.compare(o1.getPopularity(), o2.getPopularity());
        if (i != 0){
            return i;
        }
        return o1.compareTo(o2);
    }

}
