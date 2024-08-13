package org.com.aop;

import org.springframework.stereotype.Repository;

@Repository
public class Movie {
	public Movie add(String movieName) {
		try {
			if(movieName != null) {
				System.out.println(movieName+" actor added to movie list");
				return this; 
				}
			
		}
		catch(Exception e){
			System.out.println("e");
		}
		return null;
	}
	public boolean delete(String movieName) {
		if(movieName != null) {
			System.out.println(movieName+ " movie deleted from movieList");
			return true;
		}
		return false;
	} 
}
