package cpit252_fitflex;

// Concrete Product: ResistancePlan class implementing the WorkoutPlan interface
public class ResistancePlan implements WorkoutPlan {

    @Override
    public String generatePlan() {

        // Detailed plan for Resistance Training
        return "\n --- Resistance Training Plan:\n"
                + "Day 1: Upper Body Strength Workout (Chest, Back, Shoulders)\n"
                + "Day 2: Lower Body Strength Workout (Legs, Glutes, Calves)\n"
                + "Day 3: Core and Full-Body Resistance Training\n"
                + "Repeat with progressive overload and varying exercises.\n";
    }
}
