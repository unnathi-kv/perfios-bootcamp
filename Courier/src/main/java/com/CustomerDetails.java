package com;
import java.time.LocalDate;

public class CustomerDetails {
private String cust_name;
private String cust_city;
private String mobileno;
private String delivery_area;
private double courier_weight;
private double amount;
private LocalDate shipment_date;
private LocalDate delivery_date;
private int courier_tracking_no;
public CustomerDetails()
{
	
}

public CustomerDetails(String cust_name, String cust_city, String mobileno, String delivery_area, double courier_weight,
		double amount, LocalDate shipment_date, LocalDate delivery_date) {
	super();
	this.cust_name = cust_name;
	this.cust_city = cust_city;
	this.mobileno = mobileno;
	this.delivery_area = delivery_area;
	this.courier_weight = courier_weight;
	this.amount = amount;
	this.shipment_date = shipment_date;
	this.delivery_date = delivery_date;
}
public String getCust_name() {
	return cust_name;
}
public void setCust_name(String cust_name) {
	this.cust_name = cust_name;
}
public String getCust_city() {
	return cust_city;
}
public void setCust_city(String cust_city) {
	this.cust_city = cust_city;
}
public String getMobileno() {
	return mobileno;
}
public void setMobileno(String mobileno) {
	this.mobileno = mobileno;
}
public String getDelivery_area() {
	return delivery_area;
}
public void setDelivery_area(String delivery_area) {
	this.delivery_area = delivery_area;
}
public double getCourier_weight() {
	return courier_weight;
}
public void setCourier_weight(double courier_weight) {
	this.courier_weight = courier_weight;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
public LocalDate getShipment_date() {
	return shipment_date;
}
public void setShipment_date(LocalDate localDate) {
	this.shipment_date = localDate;
}
public LocalDate getDelivery_date() {
	return delivery_date;
}
public void setDelivery_date(LocalDate delivery_date) {
	this.delivery_date = delivery_date;
}
public int getCourier_tracking_no() {
	return courier_tracking_no;
}
public void setCourier_tracking_no(int courier_tracking_no) {
	this.courier_tracking_no = courier_tracking_no;
}

}
