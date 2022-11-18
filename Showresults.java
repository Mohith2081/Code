package com.demotraining;

import java.io.File;
import java.io.FileWriter;

public class Showresults {



	public StringBuilder Method1( Dataset ds,int user, float ans) {
		// TODO Auto-generated method stub
		StringBuilder line = new StringBuilder();
		try {
		System.out.println("User:"+user+",Distance:"+ds.getDistance()+" KM,Time:"+ds.getTime()+" HR,Speed:"+ans);
		
	
		 
		 
		line.append(String.valueOf(ds.getDistance()));
		line.append("Km");
		line.append(',');
		line.append(String.valueOf(ds.getTime()));
		line.append("Hr");
		line.append(',');
		line.append(ans);
		
		line.append("\n");
		
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return line;
		
	}
}
