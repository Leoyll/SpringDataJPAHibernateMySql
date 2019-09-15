package com.leo.entity;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name="ticket_info1")	
public class Ticket {
	@Id
	@Column (name="ticket_number", length = 16)
	private long number;
	
	@Column(name="ticket_act_name", nullable= false, length = 24)
	private String activity_name;
	
	@Column(name="ticket_price", nullable= false, precision = 12, scale = 2)
	private BigDecimal price;
	
	@Column(name="ticket_buyer", length = 24)
	private String buyer;
	
	@Column(name="ticket_pur_date")	//name="ticket_purDate" will be transferred to "ticket_pur_date"
	private String purDate;

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public String getActivity_name() {
		return activity_name;
	}

	public void setActivity_name(String activity_name) {
		this.activity_name = activity_name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getBuyer() {
		return buyer;
	}

	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}

	public String getPurDate() {
		return purDate;
	}

	public void setPurDate(String purDate) {
		this.purDate = purDate;
	}

	
}
/*	
 *		@MappedSuperclass is used in superclass
 *		The superclass which is labeled by @MappedSuperclass can not be mapped to a table in database.
 *		The superclass which is labeled by @MappedSuperclass can not be labeled with annotation @Entity and @Table.
 */
