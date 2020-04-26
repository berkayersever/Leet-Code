class Most-Common-Word {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> set = new HashSet<>(Arrays.asList(banned));           
        Map<String, Integer> map = new HashMap<>();
        String[] words = paragraph.replaceAll("\\W+" , " ").toLowerCase().split("\\s+");
        for (String word : words) {
            if (!set.contains(word)) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }
        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();  
    }
}
