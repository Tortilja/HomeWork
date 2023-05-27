package io.codelex.oop.runners;


public enum Runner {
    BEGINNER(300, 480),
    INTERMEDIATE(240, 300),
    ADVANCED(180, 240);

    private int minTime;
    private int maxTime;

    Runner(int minTime, int maxTime) {
        this.minTime = minTime;
        this.maxTime = maxTime;
    }

    public static Runner getFitnessLevel(int time) {
        for (Runner runner : Runner.values()) {
            if (time >= runner.minTime && time <= runner.maxTime) {
                return runner;
            }
        }
        return null; // or throw an exception if desired
    }
}