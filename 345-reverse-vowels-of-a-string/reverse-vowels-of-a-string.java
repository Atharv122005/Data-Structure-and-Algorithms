class Solution {
    public String reverseVowels(String s) {

        char arr[] = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {

            if (!isVowel(arr[left])) {
                left++;
            } else if (!isVowel(arr[right])) {
                right--;
            } else {
                char temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                left ++;
                right--;
            }

           
        }
         return new String(arr);
    }

    public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' ||
                ch == 'O' || ch == 'U';
    }
}