class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        StringBuilder result = new StringBuilder();
        char carry = '0';

        while (i >= 0 || j >= 0 || carry == '1') {
            char bit1 = (i >= 0) ? a.charAt(i--) : '0';
            char bit2 = (j >= 0) ? b.charAt(j--) : '0';

            int sum = (bit1 - '0') + (bit2 - '0') + (carry - '0');

            if (sum == 0) {
                result.append('0');
                carry = '0';
            } else if (sum == 1) {
                result.append('1');
                carry = '0';
            } else if (sum == 2) {
                result.append('0');
                carry = '1';
            } else if (sum == 3) {
                result.append('1');
                carry = '1';
            }
        }
        return result.reverse().toString();
    }
}
