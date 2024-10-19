package _5_5;

import java.util.*;
import java.util.Scanner;
import java.io.*;

import _5_2.Time;

public class Album {

	// atributos
	private String name;
	private int year;
	private List<String> artists;
	private List<Song> songs;

	// construtor
	public Album (String n, int y){
		this.name = n;
		this.year = y;
		this.artists = new ArrayList<String>();
		this.songs = new ArrayList<Song>();
	}

	public Album (){
		this.name = "";
		this.year = 2024;
		this.artists = new ArrayList<String>();
		this.songs = new ArrayList<Song>();
	}
	
	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}

	public List<String> getArtists() {
		return artists;
	}

	public List<Song> getSongs() {
		return songs;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setArtists(String s) {
		this.artists.add(s);
	}

	public void setSongs(Song s) {
		this.songs.add(s);
	}

	@Override
	public String toString() {
		return "Album = " + name + ", year = " + year + ", artists = " + artists;
	}

	// classe interna
	class Song {

		// atributos
		private String name;
		private Time duration;
		private int trackNumber;

		// construtor
		public Song (String n, Time d, int tn){
			this.name = n;
			this.duration = d;
			this.trackNumber = tn;
		}

		public String getName() {
			return name;
		}

		public Time getDuration() {
			return duration;
		}

		public int getTrackNumber() {
			return trackNumber;
		}

		@Override
		public String toString() {
			return "Album = " + name + ", year = " + year + ", artists = " + artists
			+ ", Song = " + name + ", duration = " + duration + ", trackNumber = " + trackNumber;
		}
	}

	public static Album LoadAlbum(String path) throws FileNotFoundException{
		
		File f = new File(path);
		
		Scanner sc = new Scanner(f);

		String nomeAlbum = sc.nextLine();
		int anoAlbum = Integer.parseInt(sc.nextLine());

		Album a = new Album(nomeAlbum, anoAlbum);

		while (sc.hasNext() == true){
			String s = sc.nextLine();
			a.setArtists(s);
			System.out.println(a);
		}
		
		int trackMusica = 1;
		while (sc.hasNext() == true){
			String[] part = sc.nextLine().split(" ", 2);
			String nomeMusica = part[1];
			String t = sc.nextLine().trim();
			Time tm = new Time(t);
			//int trackMusica = 1;
			//System.out.println(trackMusica);
			Song s = a.new Song(nomeMusica, tm, trackMusica);
			a.songs.add(s);
			trackMusica++;
		}
		sc.close();
		return a;
	}
}
