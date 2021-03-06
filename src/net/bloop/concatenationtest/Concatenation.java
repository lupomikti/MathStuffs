package net.bloop.concatenationtest;

public class Concatenation {

    static int concat(int first, int second)
    {
        String firstS = Integer.toString(first);
        String secondS = Integer.toString(second);
        String concat = firstS + secondS;
        long finish = Long.parseLong(concat);

        return Integer.MIN_VALUE >= finish || finish >= Integer.MAX_VALUE ? 0 : (int)finish;
    }
}
