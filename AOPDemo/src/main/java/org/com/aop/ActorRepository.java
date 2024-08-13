package org.com.aop;

import org.springframework.stereotype.Repository;

@Repository
public class ActorRepository {
	public ActorRepository add(String actorName) {
		try {
			if(actorName != null) {
				System.out.println(actorName+" actor added to actorlist");
				return this; 
				}
			
		}
		catch(Exception e){
			System.out.println("e");
		}
		return null;
	}
	public boolean delete(String actorName) {
		if(actorName != null) {
			System.out.println(actorName+ " movie deleted from movieList");
			return true;
		}
		return false;
	}

}
