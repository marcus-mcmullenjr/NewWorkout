import java.util.ArrayList;
import java.util.List;

public class ListRepository {
	// Define the list as a member variable
    private List<String> skillList;
    private List<String> wSplitList;
    private List<String> bodyList;
    private List<String> muscleGroupList;
    private List<String> trainingList;
    private List<String> demoList;
    
    
	// Constructor to initialize the list
    public ListRepository() {
        skillList = new ArrayList<>();
        wSplitList = new ArrayList<>();
        bodyList = new ArrayList<>();
        muscleGroupList = new ArrayList<>();
        trainingList = new ArrayList<>();
        demoList = new ArrayList<>();
    }
    
    // Getter method to access the list
    public List<String> getSkillList() {
        return skillList;
    }
    
    public List<String> getWSplitList() {
        return wSplitList;
    }
    
    public List<String> getBodyList() {
        return bodyList;
    }
    
    public List<String> getMuscleGroupList() {
        return muscleGroupList;
    }
    
    public List<String> getTrainingList() {
        return trainingList;
    }
    
    // Setter method to update the list
    public void setSkillList() {
    	skillList.add("Trainee");
		skillList.add("Beginner");
		skillList.add("Novice");
		skillList.add("Intermediate");
		skillList.add("Expert");
		skillList.add("Specialist");
		skillList.add("Beast");
    }
    
    public void setWSplitList() {
    	wSplitList.add("FULS");
		wSplitList.add("PPLS");
		wSplitList.add("Arnold Split");
		wSplitList.add("4-2-1 Split");
		wSplitList.add("Three Day Split");
		wSplitList.add("Custom");
    }
    
    public void setBodyList() {
    	bodyList.add("Head");
		bodyList.add("Chest");
		bodyList.add("Arms");
		bodyList.add("Back");
		bodyList.add("Core");
		bodyList.add("Legs");
    }
    
    public void setMuscleGroupList() {
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
    }
    
    public void setTrainingList() {
    	trainingList.add("Strength");
    	trainingList.add("Power");
    	trainingList.add("Endurance");
    	trainingList.add("Stamina");
    	trainingList.add("Balance");
    	trainingList.add("HIIT");
    	trainingList.add("Cardio");
    	trainingList.add("Flexibility");
    	trainingList.add("Functional");
    	trainingList.add("Aerobic");
    	trainingList.add("Sport");
    	trainingList.add("Agility");
    }
    
    public void demoList() {
    	demoList.add("Push Ups");
    	demoList.add("Bench Press");
    	demoList.add("Leg Press");
    }
}
