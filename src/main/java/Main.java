import ru.netology.services.CountService;

public class Main {

    public static void main(String[] args) {
        CountService service = new CountService();
        int count = service.calculate(100, 60, 150);

        System.out.println(count);
    }
}
