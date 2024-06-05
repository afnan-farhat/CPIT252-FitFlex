package cpit252_fitflex;

// Concrete Product: StrengthPlan class implementing the WorkoutPlan interface
public class StrengthPlan implements WorkoutPlan {

    @Override
    public String generatePlan() {

        // Detailed plan for Strength Training
        return "\n --- Strength Training Plan:\n"
                + "Day 1: Upper Body Workout (Chest, Shoulders, Triceps)\n"
                + "Day 2: Lower Body Workout (Legs, Glutes, Calves)\n"
                + "Day 3: Rest or Cardio\n"
                + "Repeat for the next week with variations.";
    }
}
