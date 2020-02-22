class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> fb = new ArrayList<String>();
        int i = 1;
        while (i <= n) {
            if (i % 3 == 0 && i % 5 == 0) fb.add("FizzBuzz");                            
            else if (i % 3 == 0) fb.add("Fizz");                 
            else if (i % 5 == 0) fb.add("Buzz");                 
            else fb.add(String.valueOf(i));
            i++;
        }
        return fb;
    }
}
