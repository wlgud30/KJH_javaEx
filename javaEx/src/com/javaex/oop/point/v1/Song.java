package com.javaex.oop.point.v1;

public class Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private String track;
	
	
	
	public Song(String title,String artist,String album,String composer, int year, String track) {
		this(title,artist);
		this.title=title;
		this.artist=artist;
		this.album=album;
		this.composer=composer;
		this.year=year;
		this.track=track;
	}
	public Song() {
		
	}
	
	public Song(String title,String artist) {
		this.title=title;
		this.artist=artist;
		System.out.println("나 호출되냐?");
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getTrack() {
		return track;
	}
	public void setTrack(String track) {
		this.track = track;
	}
	
	public void showInfo() {
		System.out.printf("%s, %s (%s, %d, %s,%s 작곡)",artist,title,album,year,track,composer);
	}
	
}
