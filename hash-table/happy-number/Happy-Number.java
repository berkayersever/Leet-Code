class Happy-Number {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(n != 1) {
            int sum = 0;
            while(n != 0) {
                sum += Math.pow(n % 10, 2);
                n /= 10;
            }
            if(set.contains(sum)) {
                return false;
            }
            set.add(sum);
            n = sum;
        }
        return true;        
    }
}
