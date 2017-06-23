boolean checkPalindrome(String inputString) {
	
    StringBuilder sb = new StringBuilder(inputString);
    String s = sb.reverse().toString();

    if(inputString.equals(s)){
        return true;
    }
	
    return false;
}