package day1;

import java.util.Scanner;

public class train_one {
    public static void main(String[] args) {
        // 回文字符串检测器 “level”“noon”
        // charAt() 方法用于返回指定索引处的字符。索引范围为从 0 到 length() - 1。
        // 字符串索引从 0 开始，即第一个字符的索引为 0，第二个字符的索引为 1，以此类推。
        // Java 语言内部全是 0-based；跟"外部世界"打交道时（数据库、人类日期）才用 1-based。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        // nextLine() 方法用于读取用户输入的整行文本。
        String str = sc.nextLine();
        // 三元运算符：表达式1 ? 表达式2 : 表达式3 表示如果表达式1为 true，则返回表达式2，否则返回表达式3。
        System.out.println("该字符串是否为回文字符串：" + (isPalindrome(str) ? "是" : "否"));
    }

    public static boolean isPalindrome(String str){
        for (int i = 0 ; i < str.length()/2; i++){
            System.out.println("当前比较的字符：" + str.charAt(i) + " " + str.charAt(str.length() - 1 - i));
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }
}
