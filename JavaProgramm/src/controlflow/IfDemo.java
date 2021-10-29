package controlflow;

/**
 * @author Xiahuicheng
 * @PackageName:Map
 * @ClassName:IfDemo
 * @Description 条件语句的形式： if(condition) statement
 * 条件必须用小括号括起来，与绝大多数程序设计语言一样，Java常常希望在某个条件为真时执行多条语句，
 * 在这种情况下就可以使用 块语句（block statement）形式为：
 * {
 * statement1
 * statement2
 * ...
 * }
 * 使用块（有时称为复合语句）可以在Java程序结构中原本只能放置一条（简单）语句的地方放置多条语句
 * @date2021/10/29 16:55
 */
public class IfDemo {
    public static void main(String[] args) {
        testIf(1, 8);
        testIfElseIf(10, 1);
    }

    public static void testIf(int yourSales, int target) {
        StringBuilder performance = new StringBuilder();
        double bouns;
        if (yourSales >= target) {
            performance.append("Statisfactory");
            bouns = 100 + 0.01 * (yourSales - target);
        } else {
            performance.append("Unstatisfactory");
            bouns = 0;
        }
        System.out.println("performance:" + performance + " " + "bouns:" + bouns);
    }

    public static void testIfElseIf(int yourSales, int target) {
        String performance = null;
        double bouns = 0.0;
        if (yourSales > 2 * target) {
            performance = "Excellent";
            bouns = 1000;
        } else if (yourSales >= 1.5 * target) {
            performance = "Fine";
            bouns = 500;
        } else if (yourSales >= target) {
            performance = "Satisfactory";
            bouns = 100;
        } else {
            System.out.println("You're fired ");
        }
        System.out.println(performance + " " + bouns);
    }

}
