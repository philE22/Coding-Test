package Section1;

public class arrLengthTest {
    public static void main(String[] args) {
//        Queue<Integer> buffer = new LinkedList<>();
//        for(int i=0; i < 5; i++){
//            buffer.add(i);
//        }
//
//        System.out.println(buffer.stream().reduce(0, Integer::sum));
        int[][] board = new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0}
        };
        String operation = "DDRRRUDUDUD";

        arrLengthTest test = new arrLengthTest();
        int a = test.boardGame(board, operation);

        System.out.println(a);

    }
    public Integer boardGame(int[][] board, String operation) {
        // TODO:
        char[] arr = operation.toCharArray();
        int x = 0;
        int y = 0;
        int point = 0;
        int length = board.length;


        for(char op : arr){
            switch(op){
                case 'U':
                    y--;
                    break;
                case 'L':
                    x--;
                    break;
                case 'D':
                    y++;
                    break;
                case 'R':
                    x++;
                    break;
            }
            if(x < 0 || x > length || y >length || y < 0) return null;
            point += board[y][x];
        }

        return point;
    }

}
