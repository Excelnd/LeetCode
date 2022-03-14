package solution;

import java.util.ArrayList;
import java.util.List;

class Solution6 {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> fb = new ArrayList<>();

        int i = 0;
        while (i < n) {
            i++;
            if (i % 3 == 0 && i % 5 == 0) fb.add("FizzBuzz");                            
            else if (i % 3 == 0) fb.add("Fizz");                 
            else if (i % 5 == 0) fb.add("Buzz");                 
            else fb.add(Integer.toString(i));
        }
        return fb;
    }
}
