package DailyCoding;

public class No18 {
    public static void main(String[] args) {
        No18 test = new No18();
        int a = test.numberSearch("Sou2bgPJkS7Lp5r2j6jeWOts8X");
        System.out.println(a);
    }

    public int numberSearch(String str) {
        // TODO:
        if(str.length() == 0) return 0;

        str = str.replace(" ", "");
        System.out.println(str);
        System.out.println(str.length());
        int count = 0;
        double sum = 0;
        for(int i = 0; i < 10; i++){
            while(str.contains(String.valueOf(i))){
                sum += i;
                str = str.replaceFirst(String.valueOf(i), "");
            }
        }
        System.out.println("sum : " + sum);
        System.out.println("length : " + str.length());
        System.out.println(sum / str.length());
        return (int) Math.round(sum / str.length());
    }

}
