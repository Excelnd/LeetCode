class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> fb = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            if (i % (3 * 5) == 0)
                fb.add("FizzBuzz");                            
            else if (i % 3 == 0) {
                fb.add("Fizz");                 
            }
            else if (i % 5 == 0) {
                fb.add("Buzz");                 
            }  
            else {
                String str = Integer.toString(i);
                fb.add(str);
            }
        }
        return fb;
    }
}
