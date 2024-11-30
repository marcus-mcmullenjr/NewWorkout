import java.util.ArrayList;
import java.util.List;

public class Workout {
	private String workoutName;
    private List<Exercise> exercises;
    private String type; // e.g., "Strength", "HIIT", "Yoga"
    
	public Workout(String workoutName, String type) {
        this.workoutName = workoutName;
        this.type = type;
        this.exercises = new ArrayList<>();
    }
	
	// Add an exercise to the workout
    public void addExercise(Exercise exercise) {
        exercises.add(exercise);
    }
    
}
