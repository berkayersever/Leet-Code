class Group-Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groupedAnagrams = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str: strs) {
            char[] characters = str.toCharArray();
            Arrays.sort(characters);
            String sorted = new String(characters);
            if(!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(str);
        }
        groupedAnagrams.addAll(map.values());
        return groupedAnagrams;
    }
}
