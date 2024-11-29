import java.util.ArrayList;
import java.util.List;

public class Dummy {

	public static void main(String[] args) {
		// Create an instance of ListRepository
		ListRepository listRepo = new ListRepository();
		listRepo.setSkillList();

		// High or Low to set skill
		System.out.println("Let's play a game of high or low!");
		
		// Call the getSkillList() method to access the list
		List<String> skills = listRepo.getSkillList();
		for (String skill : skills) {
			System.out.println(skill);
		}

	}

}
