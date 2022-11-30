package ece325_lab_assignment5;

import java.time.LocalDate;

/**
 * This class represents a Song. A Song has a title, release date, and a popularity score.
 * You are not allowed to change the code that is in between the indications, but you are allowed to add
 * code before and after the indicated lines.
 * 
 * @author Cor-Paul Bezemer
 *
 */
public class Song implements Comparable<Song> { // you are allowed to change this line, if necessary
	// not allowed to change anything after this until the indicated line
	private String title;
	private LocalDate releaseDate;
	private int popularity;

	public Song(String title, LocalDate releaseDate, int popularity) {
		this.title = title;
		this.releaseDate = releaseDate;
		this.popularity = popularity;
	}

	public String getTitle() {
		return this.title;
	}

	public LocalDate getReleaseDate() {
		return this.releaseDate;
	}

	public int getPopularity() {
		return this.popularity;
	}
	
	public void setTitle(String s) {
		title = s;
	}
	
	public void setPopularity(int p) {
		if(popularity > 0)
			popularity = p;
	}
	
	public String toString() {
		return "[Song: " + title + ", released on " + releaseDate + ", popularity: " + popularity + "]";
	}

	@Override
	public int compareTo(Song o) {
		// int i = o.getTitle().compareTo(title) * (-1);
		// if(i != 0 ) return i;

		// return o.getReleaseDate().compareTo(releaseDate);

		if (this.equals(o)) {
			return 0;
		} else {
			int i = o.getTitle().compareTo(title) * (-1) ;
			if ( i!= 0) return i;
			return o.getReleaseDate().compareTo(releaseDate);
		}
	}

	public boolean equals(Song song){
		if ((this.title.compareTo(song.getTitle()) == 0) && (this.releaseDate.compareTo(song.getReleaseDate()) == 0)) {
			return true;
		}
		return false;
	}
}