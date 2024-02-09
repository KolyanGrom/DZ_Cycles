import ru.netology.services.CalcSurvice;

public class Main {
    public static void main(String[] args) {
        CalcSurvice survice = new CalcSurvice();
        int my = survice.calculate(10_000, 3_000, 20_000);
        
        System.out.println("Количество месяцев отдыха в году: " + my);
    }
}
