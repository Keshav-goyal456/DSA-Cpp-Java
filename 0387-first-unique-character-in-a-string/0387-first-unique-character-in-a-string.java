// class Solution {
//     public int firstUniqChar(String s) {

//         for (int i = 0; i < s.length(); i++) {
//             char ch = s.charAt(i);

//             if (s.indexOf(ch) == s.lastIndexOf(ch)) {
//                 return i;
//             }
//         }

//         return -1;
//     }
// }


class Solution {
    public int firstUniqChar(String s) {
        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}