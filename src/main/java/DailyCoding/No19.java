package DailyCoding;

public class No19 {
    public static void main(String[] args) {

        String str = "khoor";
        int secret = 3;
        String result = "";

        for(int i = 0; i < str.length(); i++){
            char chr = str.charAt(i);
            if(chr == ' ') continue;
            int index = chr - secret;
            if (index > 122) {
                index = index - 26;
            }
            if (index < 97) {
                index += 26;
            }
            System.out.println((char) index);
            result = result + (char) index;
        }
        System.out.println(result);
    }
}
