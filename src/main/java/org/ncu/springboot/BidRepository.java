package org.ncu.springboot;

import java.util.*;

import org.springframework.stereotype.Component;

@Component
public class BidRepository implements Repository
{
	Map<Integer,Bid> b= new HashMap<>();
	
	int idcounter=0;
	public Bid create(Bid bid)
	{
		if(bid.getId()==0)
		{
			idcounter++;
		}
		bid.setId(idcounter);
		b.put(bid.getId(), bid);
		System.out.println("creating bid");
		return bid;
		
		
	}
	public Bid find(int id)
	{
		System.out.println("finding bid of:"+id+"\n Bid:"+b);
		
		return b.get(id);
		

		
	}
	public List<Bid> findAlL()
	{
		System.out.println("find bid");
		return new ArrayList<>(b.values());
	}
	public Bid delete(int id)
	{
		System.out.println("deleting bid");
		return b.remove(id);
	}

}
