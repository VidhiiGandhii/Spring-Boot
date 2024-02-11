package org.ncu.springboot;

import java.util.*;

public interface Repository {
	Bid create(Bid bid);
	Bid find(int id);
	List<Bid> findAlL();
	Bid delete(int id);
}
