package DailyCoding;

public class No20 {
    public static void main(String[] args) {
        String str = "wwwggoppopppp";
//        if(str.length() == 0) return "";
        char box = str.charAt(0);
        str = str + " ";
        String result = "";
        char[] arr = str.toCharArray();
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == box) {
                count++;
                box = arr[i];
            } else {
                if (count == 1) {
                    result = result + box;
                } else if (count == 2) {
                    result = result + box + box;
                } else if (count > 2) {
                    result = result + count + box;
                }
                count = 1;
                box = arr[i];
            }
        }

        System.out.println(result);

    }
}
