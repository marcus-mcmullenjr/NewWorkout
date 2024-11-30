
public class Exercise {
	private String name;
	private String type;
    private String equipment;
    private String muscleGroup;
    private String muscleFocus;
    private Boolean isCompound;
    private int duration; // in seconds
    private int repetitions;
    private int sets;

    public Exercise(String name, String equipment, String muscleGroup, int duration, int sets, int repetitions) {
        this.name = name;
        this.equipment = equipment;
        this.muscleGroup = muscleGroup;
        this.duration = duration;
        this.sets = sets;
        this.repetitions = repetitions;
    }
    
    public void Compound() {
    	
    }
    
    // Getters and setters
    public String getName() {
    	return name;
    }
    
    public int getDuration() {
    	return duration;
    }
    
    public int sets() {
    	return sets;
    }
    
    public int repetitions() {
    	return repetitions;
    }
    
    // Display workout details
    public void displayExercise() {
    	System.out.println( sets + " X " + repetitions + " " + name);
    }
    
    public void displayDurationExercise() {
    	System.out.println( duration + "s " + name);
    }
}
