class Counting-Elements {
    public int countElements(int[] arr) {
        if(arr == null || arr.length == 0) {
            return 0;
        }
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            Integer value = map.get(arr[i]);
            map.put(arr[i], value == null ? 1 : value + 1);
        }
        for(int key : map.keySet()) {
            if(map.containsKey(key - 1)) {
                count += map.get(key - 1);
            }
        }
        return count;        
    }
}
