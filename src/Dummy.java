import java.util.ArrayList;
import java.util.List;

public class Dummy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> skillList = new ArrayList<>();
		skillList.add("Trainee");
		skillList.add("Beginner");
		skillList.add("Novice");
		skillList.add("Intermediate");
		skillList.add("Expert");
		skillList.add("Specialist");
		skillList.add("Beast");
		
		List<String> wSplitList = new ArrayList<>();
		wSplitList.add("FULS");
		wSplitList.add("PPLS");
		wSplitList.add("Arnold Split");
		wSplitList.add("4-2-1 Split");
		wSplitList.add("Three Day Split");
		wSplitList.add("Custom");

		List<String> bodyList = new ArrayList<>();
		bodyList.add("Head");
		bodyList.add("Chest");
		bodyList.add("Arms");
		bodyList.add("Back");
		bodyList.add("Core");
		bodyList.add("Legs");
		
		List<String> muscleGroupList = new ArrayList<>();
		muscleGroupList.add("Traps");
		muscleGroupList.add("Shoulders");
		muscleGroupList.add("Pecs");
		muscleGroupList.add("Biceps");
		muscleGroupList.add("Triceps");
		muscleGroupList.add("Abdominals");
		muscleGroupList.add("Obliques");
		muscleGroupList.add("Lats");
		muscleGroupList.add("Erector Spine");
		muscleGroupList.add("Glutes");
		muscleGroupList.add("Hamstrings");
		
		for (String skill : skillList) {
		    System.out.println(skill);
		}
		
	}

}
