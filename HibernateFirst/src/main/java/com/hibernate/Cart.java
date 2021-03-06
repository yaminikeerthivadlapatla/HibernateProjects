package com.hibernate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
	@Entity
	@Table(name="Customer")
	public class Cart {
		
		@Id
		@Column(name="id")
		int id;
		@Column(name="name")
		String name;
		@Column(name="city")
		String city;

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
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
	}