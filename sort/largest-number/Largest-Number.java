class Largest-Number {
    public String largestNumber(int[] nums) {        
        if(nums == null || nums.length == 0) {
            return "";
        }
        // Convert int array to String array in order to sort later
        String[] strArr = new String[nums.length];
        for(int i = 0; i < nums.length; i++) {
            strArr[i] = String.valueOf(nums[i]);
        }
        // Comparator to decide which string should come first while concatenation
        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                String s1 = str1 + str2;
                String s2 = str2 + str1;
                return s2.compareTo(s1);    // Reverse order, so we can use append()
            }
        };
        Arrays.sort(strArr, comp);
        // Edge case by LeetCode: [0, 0, ... 0, 0]
        if(strArr[0].charAt(0) == '0') {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for(String s: strArr) {
            sb.append(s);
        }
        return sb.toString();        
    }
}
