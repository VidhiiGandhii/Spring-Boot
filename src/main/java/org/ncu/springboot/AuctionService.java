package org.ncu.springboot;

public interface AuctionService
{
	void createAuction(String auctionDetails);
	void placeBid( int auctionId,Bid b);
	String getauctionDetails(int auctionId);
}
