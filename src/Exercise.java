
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
}
