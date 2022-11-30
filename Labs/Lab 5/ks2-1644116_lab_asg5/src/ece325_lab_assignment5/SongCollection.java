package ece325_lab_assignment5;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * This class represents a Song. A Song has a title, release date, and a popularity score.
 * You are not allowed to change the code that is in between the indications, but you are allowed to add
 * code before and after the indicated lines.
 * 
 * @author Cor-Paul Bezemer
 *
 */
public class SongCollection extends SongComparator {
	// not allowed to change anything after this until the indicated line
	private TreeSet<Song> collection;
	
	public SongCollection() {
		collection = new TreeSet<Song>();
	}
	
	public static LocalDate parseLocalDate(String str) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		return LocalDate.parse(str, formatter);
	}
	
	public void addSong(Song s) {
		collection.add(s);
	}	
	
	public String toString() {
		String str = "[SongCollection: " + collection.size() + " songs: \n";
		for(Song s : collection) {
			str += "\t" + s + "\n";
		}
		return str + "]";
	}
	
	// you are allowed to make changes/add code after this
	
	public void loadSongs(String filename) {
		BufferedReader in = null;
		Scanner s = null;

		try {
			in = new BufferedReader(new FileReader(filename));
			String line;
			String title, popularity;
			LocalDate releaseDate;

			while ((line = in.readLine()) != null) {
				s = new Scanner(line);
				s.useDelimiter(",");
				
				try {
					title = s.next();
					popularity = s.next();
					releaseDate = SongCollection.parseLocalDate(s.next());
					collection.add(new Song(title, releaseDate, Integer.parseInt(popularity)));
				} catch (Exception e) {
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
	}

	public List<Song> sortByPopularity() {
		List<Song> songs = new ArrayList<Song> (collection);
		Collections.sort(songs, new SongComparator());
		return songs;
	}
	
	public static void main(String[] args) {
		SongCollection album = new SongCollection();
		album.loadSongs("songs.txt");
		System.out.println(album);

		List<Song> songs = new ArrayList<Song>();
		songs = album.sortByPopularity();
		System.out.println(songs);

	}
}
