package cpit252_fitflex;

//Creator
// This is the factory class responsible for generating workout plans
public class WorkoutPlanFactory {

    // Method to generate a workout plan based on the given type
    public WorkoutPlan generateWorkoutPlan(String type) {

        if (type == null) {
            return null; //Return null if type is null
        }
        if (type.equalsIgnoreCase("Strength")) {
            return new StrengthPlan();  // Return a StrengthPlan object

        } else if (type.equalsIgnoreCase("Cardio")) {
            return new CardioPlan(); // Return a CardioPlan object

        } else if (type.equalsIgnoreCase("Resistance")) {
            return new ResistancePlan(); // Return a Resistance object

        } else {
            throw new IllegalArgumentException("Invalid workout plan type"); // Throw an exception for invalid types
        }
    }
}
