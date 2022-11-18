package com.demotraining;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			UserInput ui = new UserInput();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number of users:");
			int users = sc.nextInt();
			Showresults sr = new Showresults();
			Dataset Dataset = new Dataset();
			// System.out.println("NumberEnter number of users:");
			File csvFile = new File("SpeedCalculation.csv");
			FileWriter fileWriter = new FileWriter(csvFile);
			StringBuilder line = new StringBuilder();
			line.append("Distance");

			line.append(',');
			line.append("Time");

			line.append(',');
			line.append("Speed");

			line.append("\n");
			Measure ms = new Measure();
			fileWriter.write(line.toString());
			for (int i = 1; i <= users; i++) {
				float[] ans = ui.distanceAndTime(i);
				
				Dataset.setDistance(ans[0]);
				Dataset.setTime(ans[1]);

				float speed = ms.MeasureSpeed(Dataset.getDistance(), Dataset.getTime());

				line = sr.Method1(Dataset, i, speed);
				fileWriter.write(line.toString());
			}
			fileWriter.close();
			

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

class Measure {
	public float MeasureSpeed(float distance, float time) {
		return distance / time;
	}
}
