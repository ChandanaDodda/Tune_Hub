package com.example.demo.entities;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class PlayList {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	int id;
	String name;
	@ManyToMany
	List<Song> songs;
	public PlayList() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PlayList(int id, String name, List<Song> songs) {
		super();
		this.id = id;
		this.name = name;
		this.songs = songs;
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
	public List<Song> getSongs() {
		return songs;
	}
	public void setSongs(List<Song> songs) {
		this.songs = songs;
	}
	@Override
	public String toString() {
		return "PlayList [id=" + id + ", name=" + name + ", songs=" + songs + "]";
	}
	
	

}
