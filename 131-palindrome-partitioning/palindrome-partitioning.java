import java.util.*;

class Solution {

    // Palindrome check
    boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        
        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        
        return true;
    }

    // Recursive function (same as getAllParts)
    void getAllParts(String s, List<String> partitions, List<List<String>> ans) {
        
        // 🔴 Base Case
        if (s.length() == 0) {
            ans.add(new ArrayList<>(partitions));
            return;
        }

        // 🔁 Loop (try all partitions)
        for (int i = 0; i < s.length(); i++) {
            
            String part = s.substring(0, i + 1);

            // ✅ Check palindrome
            if (isPalindrome(part)) {
                
                // 👉 Choose
                partitions.add(part);

                // 👉 Recurse on remaining string
                getAllParts(s.substring(i + 1), partitions, ans);

                // 🔁 Backtrack
                partitions.remove(partitions.size() - 1);
            }
        }
    }

    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> partitions = new ArrayList<>();

        getAllParts(s, partitions, ans);

        return ans;
    }
}