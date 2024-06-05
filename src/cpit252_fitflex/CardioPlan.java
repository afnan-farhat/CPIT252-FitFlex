package cpit252_fitflex;

// Concrete Product: CardioPlan class implementing the WorkoutPlan interface
public class CardioPlan implements WorkoutPlan {

    @Override
    public String generatePlan() {

        // Detailed plan for Cardio
        return "\n --- Cardio Plan:\n"
                + "Day 1: 30 minutes of Running\n"
                + "Day 2: 45 minutes of Cycling\n"
                + "Day 3: 20 minutes of HIIT (High-Intensity Interval Training)\n"
                + "Repeat with variations and increase intensity over time.\n";
    }
}
