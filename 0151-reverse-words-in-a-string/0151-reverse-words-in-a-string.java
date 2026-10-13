class Solution {
    
public String reverseWords(String s) {
    StringBuilder sb = new StringBuilder();
    int n = s.length();
    int i = n - 1;

    while (i >= 0) {
        // Skip spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        if (i < 0) {
            break;
        }

        int end = i;

        // Find the beginning of the word
        while (i >= 0 && s.charAt(i) != ' ') {
            i--;
        }

        // Append the word
        sb.append(s.substring(i + 1, end + 1));

        // Add a single space between words
        sb.append(" ");
    }

    // Remove the last extra space
    if (sb.length() > 0) {
        sb.setLength(sb.length() - 1);
    }

    return sb.toString();
}

}