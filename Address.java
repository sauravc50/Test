package com.cg.bookstore.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


@Entity
@Table(name = "address")
public class Address {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "address_id")
	private int addressId;
	@Column(name = "addressline")
	@NotEmpty(message="Address cannot be empty")
	@Size(min=2,max=30,message="Address Line should be between 2 and 30 characters")
	private String address;
	@Column(name = "city")
	@NotEmpty(message="City cannot be empty")
	@Size(min=2,max=20,message="City name should be between 2 and 20 characters")
	private String city;
	@Column(name = "country")
	@NotEmpty(message="Country cannot be empty")
	@Size(min=2,max=20,message="Country name should be between 2 and 20 characters")
	private String country;
	@Column(name = "pincode")
	@NotEmpty(message="Pincode cannot be empty")
	@Size(min=6,max=8,message="Pincode should be between 6 and 8 characters")
	private String pincode;

	public Address() {
	}

	public Address(int addressId, String address, String city, String country, String pincode) {
		this.addressId = addressId;
		this.address = address;
		this.city = city;
		this.country = country;
		this.pincode = pincode;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", address=" + address + ", city=" + city + ", country=" + country
				+ ", pincode=" + pincode + "]";
	}

}
