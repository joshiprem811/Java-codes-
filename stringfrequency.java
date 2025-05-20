public class stringfrequency {
    public static void main(String[] args) {
        String s = "premjoshi", c = "";
        for (int i = 0; i < s.length(); i++) {
            String ch = s.substring(i, i + 1);
            if (c.contains(ch)) continue;
            int count = 0;
            for (int j = 0; j < s.length(); j++)
                if (s.substring(j, j + 1).equals(ch)) count++;
            System.out.println(ch + ": " + count);
            c += ch;
        }
    }
}
