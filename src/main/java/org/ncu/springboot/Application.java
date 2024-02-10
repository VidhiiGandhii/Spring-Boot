package org.ncu.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {
	

	public static void main(String[] args) {
			ApplicationContext context=	SpringApplication.run(Application.class, args);
			 BidRepository bidRepository = context.getBean(BidRepository.class);
			Bid bid=new Bid();
			
			 bidRepository.create(bid);
			 bidRepository.find(1);
			  AuctionService a= context.getBean(AuctionService.class);
			  a.createAuction("Auction1");
		      a.placeBid(1, bid);
		      a.getauctionDetails(1);
			
	}

}
