package com.spring.beans;
	
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
	
@Entity
@Table(name="bus_info")
public class Bus {
	@Id @Column(name="bus_id")
	private int busId;
	
	@Column(name="busname")	
	private String busName;
	
	private String source;
	
	private String destination;
	
	@Column(name="bus_type")
	private String busType;
	
	@Column(name="total_seats")
	private int totalSeats;
	
	private double price;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="bus_id")
	private List<Ticket>ticket;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="bus_id")
	private List<Available> available;
	
	
	public int getBusId() {
		return busId;
	}
	public void setBusId(int busId) {
		this.busId = busId;
	}
	public String getBusName() {
		return busName;
	}
	public void setBusName(String busName) {
		this.busName = busName;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getBusType() {
		return busType;
	}
	public void setBusType(String busType) {
		this.busType = busType;
	}
	public int getTotalSeats() {
		return totalSeats;
	}
	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Bus [busId=" + busId + ", busName=" + busName + ", source=" + source + ", destination=" + destination
				+ ", busType=" + busType + ", totalSeats=" + totalSeats + ", price=" + price + "]";
	}

	
	

}
