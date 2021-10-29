package controlflow;

/**
 * @author Xiahuicheng
 * @PackageName:IfElse
 * @ClassName:WhileDemo
 * @Description 循环
 * @date2021/10/29 18:07
 */
public class WhileDemo {
    public static void main(String[] args) {
        testWhile(50, 80);
    }

    /**
     * 当条件为true时，while循环会执行一条语句（也就是一个块语句）
     * 语法： while(condition) statement
     * 如果开始时循环条件的值就为false,那么while循环一次也不执行
     *
     * @param balance
     * @param goal
     */
    public static void testWhile(int balance, int goal) {
        int interestRest = 12;
        int years = 1;
        while (balance < goal) {
            balance += goal;
            double interest = balance * interestRest / 100;
            balance += interest;
            years++;
        }

    }
}
