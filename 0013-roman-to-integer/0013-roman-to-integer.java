// Roman to Integer
class Solution {
    public int romanToInt(String s) {
          Map<Character, Integer> m = new HashMap<>();
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);
        int ans =0;
        for(int i = 0; i<s.length(); i++){
           
            int curr = m.get(s.charAt(i));

            // Check if there's a next character and current is less than next
            if (i + 1 < s.length() && curr < m.get(s.charAt(i + 1))) {
                ans -= curr;
            } else {
                ans += curr;
            }
        }

        return ans;

        }
        
    }
