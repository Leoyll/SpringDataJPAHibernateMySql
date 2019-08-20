package com.leo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * 	@Entity		create a table based on the class
 * 	can define the table name which will be created by jpa(hibernate) automatically if there is not a table with same name in DATABASE.
 * 	if not parameter name, a table with same name as class will be created by jpa(hibernate) automatically if there is not a table with same name in DATABASE.
 * 	@Table		define table name
 * 	@id			define as PRIMARY KEY
 * 	@Column(name = "ticket_price")	define table column name as ticket_price
 * 	@GeneratedValue(strategy=GenerationType.AUTO)	define generation strategy of PRIMARY KEY
*/

@Entity
@Table(name="my_ticket")	
public class Ticket {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private long ticket_number;
	
	@Column(name="ticket_name")
	private String ticket_activity_name;
	private double price;
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public long getTicket_number() {
		return ticket_number;
	}
	public void setTicket_number(long ticket_number) {
		this.ticket_number = ticket_number;
	}
	public String getTicket_activity_name() {
		return ticket_activity_name;
	}
	public void setTicket_activity_name(String ticket_activity_name) {
		this.ticket_activity_name = ticket_activity_name;
	}

	

}
/*	
 *		@MappedSuperclass is used in superclass
 *		The superclass which is labeled by @MappedSuperclass can not be mapped to a table in database.
 *		The superclass which is labeled by @MappedSuperclass can not be labeled with annotation @Entity and @Table.
 */
