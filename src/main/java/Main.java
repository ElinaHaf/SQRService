import ru.netology.SQRService.ru.netology.sqr.SQRService;

public class Main {

    public static void main(String[] args) {
        SQRService service = new SQRService();
        int min = 200;
        int maх = 500;
        System.out.println(service.calcSqr(min, maх));
    }
}
