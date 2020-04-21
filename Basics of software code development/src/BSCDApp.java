import branchings.tasks.Task1B;
import branchings.tasks.Task2B;
import branchings.tasks.Task3B;
import linear_programs.tasks.*;

public class BSCDApp {

    public static void main(String[] args) {
        System.out.println(Task1.getZ(6, 2, 5));
        System.out.println(Task2.getValueOfExpressionWithRoot(8, 21, 1));
        System.out.println(Task3.getValueOfTrigonometricExpression(30,60));
        System.out.println(Task4.getReversedDouble(223.456));
        System.out.println(Task5.getFormatedTime(3660));
        System.out.println(Task6.isInArea(2,4));
        System.out.println(Task1B.isTriangle(90,91));
        System.out.println(Task2B.getMaxOfMins(4,2,3,2));
        System.out.println(Task3B.isOnSingleLine(-3,5,2,4,2,14));
    }

}
