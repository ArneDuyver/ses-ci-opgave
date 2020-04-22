import java.util.ArrayList;

public class Calculator {

    public static void main(String[] args) {
        ArrayList<String> numbersAsStrings = new ArrayList<>();
        for (int j = 0; j<args.length; j++){
            String newS = args[j];
            numbersAsStrings.add(newS);
        }
        ArrayList<Integer> nums = new ArrayList<>();
        for (String s : numbersAsStrings){
            try{
                int num = Integer.parseInt(s);
                nums.add(num);
            }catch (Exception e){
                System.out.println("Cannot convert to Integer, exception:");
                System.out.println(e);
            }
        }
        System.out.println(add(nums));
    }

    public static int add(ArrayList<Integer> nums){
        int sum = 0;
        for (int i : nums){
            sum += i;
        }
        return sum;
    }
}
