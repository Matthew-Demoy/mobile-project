package b.android.flex;

import android.util.Pair;

import java.util.Vector;

public class Program {

    protected Vector<Pair<String , workoutSchedule>> program;

    public Program(){
        program = new Vector<Pair<String,workoutSchedule>>();
    }

    public Program(Vector<String> titles, Vector<workoutSchedule> workouts) {
        if (titles.size() == workouts.size()) {
            for(int i = 0; i < titles.size(); i++)
            {
                addWorkoutToProgram(titles.get(i), workouts.get(i));
            }

            } else {
            //error
            }
    }

    public void makeFiveByFive()
    {
        String ChestDay = "Chest";
        String BackDay = "Back";
        String LegsDay = "Legs";

        workoutSchedule chestWorkout = new workoutSchedule();
        chestWorkout.addExcersise(new exercise("Flat Bench", 3, 5, 135, 2, 2, 90));
        chestWorkout.addExcersise(new exercise("Shoulder Press", 3, 5, 80, 3, 3, 60));
        chestWorkout.addExcersise(new exercise("Lateral Raise", 3, 10, 45, 2, 2, 60));
        chestWorkout.addExcersise(new exercise("Tricep Pushdown", 3, 12, 50, 1, 1, 60));
        chestWorkout.addExcersise(new exercise("Shrug", 4, 8, 160, 2, 3, 60));

        workoutSchedule backWorkout = new workoutSchedule();
        chestWorkout.addExcersise(new exercise("Deadlift", 3, 5, 200, 2, 2, 90));
        chestWorkout.addExcersise(new exercise("Barbell Row", 3, 8, 95, 3, 3, 60));
        chestWorkout.addExcersise(new exercise("Lat Pulldown", 3, 10, 110, 2, 2, 60));
        chestWorkout.addExcersise(new exercise("Dumbell Curl", 3, 12, 25, 1, 1, 60));


        workoutSchedule legsWorkout = new workoutSchedule();
        chestWorkout.addExcersise(new exercise("Squat", 4, 5, 135, 2, 2, 90));
        chestWorkout.addExcersise(new exercise("Lunges", 3, 10, 70, 3, 3, 60));
        chestWorkout.addExcersise(new exercise("Leg Extensions", 3, 10, 70, 2, 2, 60));
        chestWorkout.addExcersise(new exercise("Hamstring Curl", 3, 10, 80, 1, 1, 60));
        chestWorkout.addExcersise(new exercise("Calf Raise", 3, 12, 90, 2, 3, 60));

        addWorkoutToProgram(ChestDay,chestWorkout);
        addWorkoutToProgram(BackDay,backWorkout);
        addWorkoutToProgram(LegsDay,legsWorkout);

    }
    protected void addWorkoutToProgram(String title, workoutSchedule workout)
    {
        Pair<String, workoutSchedule> pair = new Pair(title, workout);
        program.add(pair);
    }

    protected  void clearProgram(){
        program = null;
    }
}


