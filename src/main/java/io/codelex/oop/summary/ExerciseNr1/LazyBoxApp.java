package io.codelex.oop.summary.ExerciseNr1;

public class LazyBoxApp {
    public static void main(String[] args) {

        LazyBox<Integer> box = new LazyBox<>(LazyBoxApp::calculate);

        Integer contents = box.get();
        Integer contents2 = box.get();

        System.out.println(contents);
        System.out.println(contents2);

    }

    public static Integer calculate() {
        return 200;
    }
}
