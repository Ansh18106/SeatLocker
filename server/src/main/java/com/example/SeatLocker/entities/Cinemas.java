package com.example.SeatLocker.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Cinemas")
public class Cinemas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cinemaid;
	private String name;
	private String location;
	private int numberOfScreens;
	public Long getCinemaid() {
		return cinemaid;
	}
	public void setCinemaid(Long cinemaid) {
		this.cinemaid = cinemaid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getNumberOfScreens() {
		return numberOfScreens;
	}
	public void setNumberOfScreens(int numberOfScreens) {
		this.numberOfScreens = numberOfScreens;
	}
	@Override
	public String toString() {
		return "Cinemas [cinemaid=" + cinemaid + ", name=" + name + ", location=" + location + ", numberOfScreens="
				+ numberOfScreens + "]";
	}
	
}
