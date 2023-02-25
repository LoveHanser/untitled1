import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        test t = new test();

        t.name = "aaa";
        t.f(t);
        System.out.println(t.name);

    }
}