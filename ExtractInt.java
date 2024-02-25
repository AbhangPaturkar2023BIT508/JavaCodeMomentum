class Solution 
{ 
    ArrayList<String> extractIntegerWords(String s) 
    { 
        ArrayList<String> integerWords = new ArrayList<>();
        StringBuilder currentWord = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                currentWord.append(c);
            } else {
                if (currentWord.length() > 0) {
                    integerWords.add(currentWord.toString());
                    currentWord.setLength(0); // Reset currentWord
                }
            }
        }
        
        if (currentWord.length() > 0) {
            integerWords.add(currentWord.toString());
        }
        
        return integerWords;
    }
} 