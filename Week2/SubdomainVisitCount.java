class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        List<String> result = new ArrayList<String>();
        int len = cpdomains.length;
        if (len == 0){
            return result;
        }
        for(int i = 0; i < len; i++) {
            String [] wordsArray = cpdomains[i].split(" ");
            if (wordsArray.length <= 1) {
                continue;
            }
            int visited = Integer.parseInt(wordsArray[0]);
            String subDomain = wordsArray[1];
            map.put(subDomain, map.getOrDefault(subDomain, 0)+visited);
            int dotIndex = subDomain.indexOf('.');
            while (dotIndex != -1) {
                subDomain = subDomain.substring(dotIndex + 1);
                map.put(subDomain, map.getOrDefault(subDomain, 0) + visited);
                dotIndex = subDomain.indexOf('.');
            }
        }
        for (String k : map.keySet()) {
            result.add(map.get(k) + " "+k);
        }
        return result;
    }
}