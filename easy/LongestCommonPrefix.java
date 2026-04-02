class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        String refrence = strs[0];

        for (int i = 0; i < refrence.length(); i++){

            char c = refrence.charAt(i);

            for(int j = 1; j < strs.length; j ++){

                if (i >= strs[j].length() || c != strs[j].charAt(i)){
                    return refrence.substring(0, i);
                }


            }


        }
        return refrence;
        
    }
}