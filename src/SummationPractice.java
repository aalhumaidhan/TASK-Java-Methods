import java.util.ArrayList;

public class SummationPractice {

    static int sum(ArrayList<Integer> numbersList) {
        int sum = 0;
        for (Integer integer : numbersList) {
            sum += integer;
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbersList = new ArrayList<>();

        numbersList.add(1);
        numbersList.add(4);
        numbersList.add(7);
        numbersList.add(11);
        numbersList.add(17);

        int sum = sum(numbersList);
        System.out.println(sum);
    }
}