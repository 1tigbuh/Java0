package app;

public class DayAdvice implements Adviser {
    @Override
    public void advise(Day day) {
        switch (day) {
            case MON, TUE, WED, THU:
                    System.out.println("Порада: Будете продуктивним, якщо будете планувати задачі та робити перерви коли треба.");
                    break;
            case FRI:
                    System.out.println("Happy Friday!");
                    break;
            case SAT, SUN:
                    System.out.println("Відвідайте парк, лазню, чи торговий центр.");
                    break;
            default:
                    System.out.println("Невідомий день");
                    break;
        }
    }
}