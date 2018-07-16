package ru.geekbrains.java1.hw1;

public class Main {

        /* task1 */
    public static void main(String[] args) {
    }
        /* task2 */
    byte b = 100;
    int i = 3412342;
    long l = 1234234123412L;
    float f = 345.6F;
    double d = 41234.13D;
    boolean bool = false;
    String s = "string";
    char c = 'c';
        /* task3 */
    public static int task3(int x1, int x2, int x3, int x4) {
        x1 = x1 * (x2 + (x3 / x4));
        return x1;
    }
        /* task4 */
    public static boolean task4(int x1,int x2) {
        x1 = x1 + x2;
        if (x1 >= 10)
        if (x1 <= 20) {
            return true;
        }
        return false;
    }

        /* task 5 */
    public static void positiveOrNegative(int x1) {
        if (x1 >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }
        /* task 6 */
    public static boolean Negative(int x1) {
        if (x1 < 0) {
            return true;
        }
        return false;
    }
        /* task 7 */
    public static void greetings(String name) {
        System.out.println("Hello," + name);
    }

}
