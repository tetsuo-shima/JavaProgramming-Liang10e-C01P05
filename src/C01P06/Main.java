package C01P06;

// (Summation of a series) Write a program that displays the result of
// 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9.

public class Main {

    public static void main(String[] args) {
	    //int start = 1;
        int end = 9;

        System.out.println(sumGauss(end));
    }

    public static int sumGauss(int cap) {
        return (cap * (cap + 1) / 2);
    }
}
