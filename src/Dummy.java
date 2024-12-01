import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dummy {

	public static void main(String[] args) {
//		// Variables
//		String running;
		
		// System object input
		Scanner in = new Scanner(System.in);
		
		// Create an instance of ListRepository
		ListRepository listRepo = new ListRepository();
		listRepo.setSkillList();
		
		// High or Low to set skill
		System.out.print("Let's play a game of high or low!\n");
		
//		System.out.println("Start by pressing 1. Then hit enter.");
//		running = in.nextLine();
//		while (!running.equals("1")) {
//			System.out.println("Error. Try again. \nPress the 1 key.");
//			running = in.nextLine();
//		}
//		
//		// Response to user
//		System.out.println("Thank you!\n");
		
		System.out.println("Select your skill level. Press \"h\" for high, \"l\" for low, and \"y\" for the correct skill level!"
				+ "\nThen hit enter.\n");
		
		// Call the getSkillList() method to access the list
		int i = 1;
		List<String> skills = listRepo.getSkillList();
		System.out.println(skills.get(i) + " (Press h, l, or y).");
		String input = in.nextLine();
		
		while (!input.equals("y")) {
			try {
				if(input.equals("h")) {
					System.out.println(skills.get(++i) + " (Press h, l, or y).");
					input = in.nextLine();
				}
				else if(input.equals("l")){
					System.out.println(skills.get(--i) + " (Press h, l, or y).");
					input = in.nextLine();
				}
				else {
					System.out.println("Error. Try again. \nPress the h, l, or y key.");
					input = in.nextLine();
				}
			} catch (IndexOutOfBoundsException e) {
				if (input.equals("h")) {
					System.out.print(skills.get(--i) + " is maximum skill level.");
				}
				else
					System.out.print(skills.get(++i) + " is minimum skill level.");
				System.out.println(" Is this your existing skill level?\nPress h or l, otherwise press y for yes. ");
				input = in.nextLine();
			}
		}
		
		// Close system object input
		in.close();
	}

}