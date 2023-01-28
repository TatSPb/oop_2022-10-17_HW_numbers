import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Integer> nums = new HashSet<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int s = random.nextInt(1000);
            nums.add(s);
        }
        System.out.println(nums);

        Iterator<Integer> iterator = nums.iterator();
        while (iterator.hasNext()) {
            var integer = iterator.next();
            if (integer % 2 != 0) {
                iterator.remove();
                System.out.print(integer + " ");
            }
        }
    }
}
