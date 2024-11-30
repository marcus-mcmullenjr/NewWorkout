import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dummy {

	public static void main(String[] args) {
		// Variables
		int running;
		
		// System object input
		Scanner in = new Scanner(System.in);
		
		// Create an instance of ListRepository
		ListRepository listRepo = new ListRepository();
		listRepo.setSkillList();
		
		// High or Low to set skill
		System.out.println("Let's play a game of high or low!");
		System.out.println("Start by pressing 1");
		running = in.nextInt();
		while (running != 1) {
			System.out.println("Error. Try again. \nPress the 1 key");
			running = in.nextInt();
		}
		
		// Response to user
		System.out.println("Thank you!\n");
		
		// Call the getSkillList() method to access the list
		List<String> skills = listRepo.getSkillList();
		for (int i = 0; i < skills.size(); i++) {
			System.out.printf("%-20s", skills.get(i)); // Print each name with a width of 15
            if ((i + 1) % 3 == 0)
            	System.out.println();
		}
		
		// Close system object input
		in.close();
	}

}