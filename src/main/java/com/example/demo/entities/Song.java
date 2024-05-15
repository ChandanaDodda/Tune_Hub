package com.example.demo.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Song {
		@Id
		@GeneratedValue(strategy= GenerationType.AUTO)
		int id;
		String name;
		String artist;
		String link;
		String genre;
		@ManyToMany
		List<PlayList> playlists;
		public Song() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Song(int id, String name, String artist, String link, String genre, List<PlayList> playlists) {
			super();
			this.id = id;
			this.name = name;
			this.artist = artist;
			this.link = link;
			this.genre = genre;
			this.playlists = playlists;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getArtist() {
			return artist;
		}
		public void setArtist(String artist) {
			this.artist = artist;
		}
		public String getLink() {
			return link;
		}
		public void setLink(String link) {
			this.link = link;
		}
		public String getGenre() {
			return genre;
		}
		public void setGenre(String genre) {
			this.genre = genre;
		}
		public List<PlayList> getPlaylists() {
			return playlists;
		}
		public void setPlaylists(List<PlayList> playlists) {
			this.playlists = playlists;
		}
		@Override
		public String toString() {
			return "Song [id=" + id + ", name=" + name + ", artist=" + artist + ", link=" + link + ", genre=" + genre
					+ ", playlists=" + playlists + "]";
		}
		
}
