package com.example.SeatLocker.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Showtimes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long showtimeId;
	private Long cinemaId;
	private Long movieId;
	private String dateTime;
	private String endTime;
	private String date;
	public Long getShowtimeId() {
		return showtimeId;
	}
	public void setShowtimeId(Long showtimeId) {
		this.showtimeId = showtimeId;
	}
	public Long getCinemaId() {
		return cinemaId;
	}
	public void setCinemaId(Long cinemaId) {
		this.cinemaId = cinemaId;
	}
	public Long getMovieId() {
		return movieId;
	}
	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Showtimes [showtimeId=" + showtimeId + ", cinemaId=" + cinemaId + ", movieId=" + movieId + ", dateTime="
				+ dateTime + ", endTime=" + endTime + ", date=" + date + "]";
	}
}
