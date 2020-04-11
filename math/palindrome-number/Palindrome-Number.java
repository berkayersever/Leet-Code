class Palindrome-Number {
    public boolean isPalindrome(int x) {
        String number = String.valueOf(x);
        int length = number.length();
        if(length == 1) {
            return true;
        }
        for(int i = 0; i < length; i++) {
            if(number.charAt(i) != number.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
