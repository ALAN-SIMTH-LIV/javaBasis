package day3.train_three;

public class train_three {
    public static void main(String[] args) {
        // 简易银行账户与异常处理
        try {
            BankAccount bankAccount = new BankAccount("10086",0);
            bankAccount.deposit(1000);
            System.out.println("当前账户: " + bankAccount);
            bankAccount.withdraw(1500);
            if (bankAccount.getBalance() <= 0){
                throw new InsufficientBalanceException("余额不足");
            }
            System.out.println("当前账户: " + bankAccount);
            System.out.println("当前账户余额: " +bankAccount.getBalance());
        } catch (InsufficientBalanceException e){
            System.out.println(e);
        } finally {
            System.out.println("操作结束");
        }
    }
}
