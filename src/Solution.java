import org.w3c.dom.ls.LSOutput;

class Solution {
    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(sentences));
    }

    public static int mostWordsFound(String[] sentences) {
        int answer = 0;
        int max = 0;
        for (int i = 0; i < sentences.length; i++) {
            for (int j = 0; j < sentences[i].length(); j++) {
                if (sentences[i].charAt(j) == ' ') {
                    answer++;
                }
            }
            if (answer > max)
                max = answer;
            answer = 0;
        }
        return max + 1;
    }
}