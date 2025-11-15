package app;

public class Main {
    public static void main(String[] args) {
        Adviser adviser = new DayAdvice();
        adviser.advise(Day.MON);
        adviser.advise(Day.SAT);
        adviser.advise(Day.FRI);
    }
}