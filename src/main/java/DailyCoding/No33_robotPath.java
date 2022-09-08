package DailyCoding;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class No33_robotPath {
    public static void main(String[] args) {
        int[][] room = new int[][]{
                {0, 0, 0, 0, 0, 0},
                {0, 1, 1, 0, 1, 0},
                {0, 1, 0, 0, 0, 0},
                {0, 0, 1, 1, 1, 0},
                {1, 0, 0, 0, 0, 0}
        };
        int[] src = new int[]{4, 2};
        int[] dst = new int[]{2, 2};

        No33_robotPath test = new No33_robotPath();
        System.out.println(test.robotPath(room, src, dst));
    }


    public int robotPath(int[][] room, int[] src, int[] dst) {
        // TODO :
        // 4, 2 위치에서 한칸 이동하는 식을 구함
        // 길이 있다면 큐에 저장
        // 방문한곳은 체크함
        // 시간에 +1을 함
        boolean[][] visited = new boolean[room.length][room[0].length];
        int timeResult = 0;
        int[] location = Arrays.copyOf(src, 2);
        Queue<int[]> queue = new LinkedList<>();
        queue.add(location);

        while (!queue.isEmpty()) {
            int xIndex = location[0];
            int yIndex = location[1];

            if (yIndex !=room[0].length-1 && room[xIndex][yIndex + 1] == 0 && !visited[xIndex][yIndex + 1]) {
                queue.add(new int[]{xIndex, yIndex + 1});
            }
            if (yIndex != 0 && room[xIndex][yIndex - 1] == 0 && !visited[xIndex][yIndex - 1]) {
                queue.add(new int[]{xIndex, yIndex - 1});
            }
            if (xIndex != room.length - 1 && room[xIndex + 1][yIndex] == 0 && !visited[xIndex + 1][yIndex]) {
                queue.add(new int[]{xIndex + 1, yIndex});
            }
            if (xIndex != 0 && room[xIndex - 1][yIndex] == 0 && !visited[xIndex - 1][yIndex]) {
                queue.add(new int[]{xIndex - 1, yIndex});
            }

            timeResult++;


        }

        return 0;
    }
}
