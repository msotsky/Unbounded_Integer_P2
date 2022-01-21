/*
Maxime Sotsky
COMP 2611
Nov 10 1pm 2020
*/
public class TestUnboundedInteger{
    public static void main(String[] args)
    {
        UnboundedInteger ubInt1 = new UnboundedInteger();
        UnboundedInteger ubInt2 = new UnboundedInteger();

        ubInt1.assignValue("100");
        ubInt2.assignValue("-100");
        System.out.println("(100 + -100 = 0)");
        System.out.println(ubInt1.toString() + " + " + ubInt2.toString() + " = " + UnboundedIntegerOperations.add(ubInt1,ubInt2).toString());
        System.out.println();

        ubInt1.clear();
        ubInt2.clear();

        ubInt1.assignValue("295");
        ubInt2.assignValue("-5731");
        System.out.println("(295 + -5731 = 5436)");
        System.out.println(ubInt1.toString() + " + " + ubInt2.toString() + " = " + UnboundedIntegerOperations.add(ubInt1,ubInt2).toString());
        System.out.println();

        ubInt1.clear();
        ubInt2.clear();

        ubInt1.assignValue("-299");
        ubInt2.assignValue("5000");
        System.out.println("(-299 + 5000 = 4701)");
        System.out.println(ubInt1.toString() + " + " + ubInt2.toString() + " = " + UnboundedIntegerOperations.add(ubInt1,ubInt2).toString());
        System.out.println();

        ubInt1.clear();
        ubInt2.clear();

        ubInt1.assignValue("2222");
        ubInt2.assignValue("-11111");
        System.out.println("(2222 + -11111 = 8889)");
        System.out.println(ubInt1.toString() + " + " + ubInt2.toString() + " = " + UnboundedIntegerOperations.add(ubInt1,ubInt2).toString());
        System.out.println();

        ubInt1.clear();
        ubInt2.clear();

        ubInt1.assignValue("-99999");
        ubInt2.assignValue("12345");
        System.out.println("(-99999 + 12345 = -87654)");
        System.out.println(ubInt1.toString() + " + " + ubInt2.toString() + " = " + UnboundedIntegerOperations.add(ubInt1,ubInt2).toString());
        System.out.println();

        ubInt1.clear();
        ubInt2.clear();

        ubInt1.assignValue("99999");
        ubInt2.assignValue("999");
        System.out.println("(99999 + 999 = 100998)");
        System.out.println(ubInt1.toString() + " + " + ubInt2.toString() + " = " + UnboundedIntegerOperations.add(ubInt1,ubInt2).toString());
        System.out.println();

        ubInt1.clear();
        ubInt2.clear();

        ubInt1.assignValue("1");
        ubInt2.assignValue("1");
        System.out.println("(1 + 1 = 2)");
        System.out.println(ubInt1.toString() + " + " + ubInt2.toString() + " = " + UnboundedIntegerOperations.add(ubInt1,ubInt2).toString());
        System.out.println();

        ubInt1.clear();
        ubInt2.clear();

        ubInt1.assignValue("-1");
        ubInt2.assignValue("1");
        System.out.println("(-1 + 1 = 0)");
        System.out.println(ubInt1.toString() + " + " + ubInt2.toString() + " = " + UnboundedIntegerOperations.add(ubInt1,ubInt2).toString());
        System.out.println();

        ubInt1.clear();
        ubInt2.clear();

        ubInt1.assignValue("0");
        ubInt2.assignValue("0");
        System.out.println("(0 + 0 = 0)");
        System.out.println(ubInt1.toString() + " + " + ubInt2.toString() + " = " + UnboundedIntegerOperations.add(ubInt1,ubInt2).toString());
        System.out.println();

        ubInt1.clear();
        ubInt2.clear();

        ubInt1.assignValue("1");
        ubInt2.assignValue("-2");
        System.out.println("(1 + -2 = -1)");
        System.out.println(ubInt1.toString() + " + " + ubInt2.toString() + " = " + UnboundedIntegerOperations.add(ubInt1,ubInt2).toString());
        System.out.println();
    }
}
 