import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入贷款金额：");
        double p = scanner.nextDouble();
        System.out.println("你输入的贷款金额是："+ p);
        System.out.println("请输入贷款月数：");
        int m = scanner.nextInt();
        System.out.println("你输入的贷款月数是："+m);
        System.out.println("请输入月利率：");
        double mr = scanner.nextDouble();
        System.out.println("你输入的月利率是："+mr);
        double pom = Math.pow(1 + mr,  m );
        // 每月还款金额 = 贷款金额 * 月利率 * (1 + 月利率) ^ 贷款月数 / (1 + 月利率) ^ 贷款月数 - 1
        // Math.pow（底数，指数） 计算底数的指数次方
        double payment = p * mr * pom / ( pom - 1);
        String format = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment); // 格式化金额为货币格式
        System.out.println("每月还款金额是："+format);
        scanner.close();


    }
}
