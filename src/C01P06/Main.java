package C01P06;

public class Main {

    public static void main(String[] args) {
	    int start = 1;
        int cap = 9;
        int result = 0;

        for (int count = start; count <= cap; count++) {
            result += count;
        }

        System.out.println(result);
    }
}
