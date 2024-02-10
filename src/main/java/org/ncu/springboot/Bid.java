package org.ncu.springboot;


public class Bid 
{
 
int id;
 String bidder;
 double amount;
 long timestamp;
public Bid(int id, String bidder, double amount, long timestamp) {
	super();
	this.id = id;
	this.bidder = bidder;
	this.amount = amount;
	this.timestamp = timestamp;
}
public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getBidder() {
	return bidder;
}

public void setBidder(String bidder) {
	this.bidder = bidder;
}

public Bid() {
	super();
	// TODO Auto-generated constructor stub
}
public double getAmount() {
	return amount;
}

public void setAmount(double amount) {
	this.amount = amount;
}

public long getTimestamp() {
	return timestamp;
}

public void setTimestamp(long timestamp) {
	this.timestamp = timestamp;
}


@Override
public String toString() {
	return "Bid [id=" + id + ", bidder=" + bidder + ", amount=" + amount + ", timestamp=" + timestamp + "]";
}
 
}
