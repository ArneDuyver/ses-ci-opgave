import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CalculatorTests {

    @Test
    public void add_4_5_Solution9(){
        ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(4,5));
        assert(Calculator.add(nums) == 9 );
    }

    @Test
    public void add_1_4_Solution5(){
        ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(1,4));
        assert(Calculator.add(nums) == 5 );
    }

    @Test
    public void add_0_0_16_Solution16(){
        ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(0,0,16));
        assert(Calculator.add(nums) == 16 );
    }

    @Test
    public void add_4_min5_SolutionMin1(){
        ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(4,-5));
        assert(Calculator.add(nums) == -1 );
    }

}
