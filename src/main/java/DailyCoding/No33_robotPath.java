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
        Queue<int[]> queue = new LinkedList<>();
        queue.add(src);
        queue.add(null);

        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            if (poll == null) {
                timeResult++;
                queue.add(null);
                continue;
            }
            if (Arrays.equals(poll, dst)) break;    //도착지면 끝냄
            int y = poll[0];
            int x = poll[1];
            visited[y][x] = true;

            if (y + 1 < room.length && room[y + 1][x] == 0 && !visited[y + 1][x]) {
                queue.add(new int[]{y + 1, x});
            }
            if (y - 1 >= 0 && room[y - 1][x] == 0 && !visited[y - 1][x]) {
                queue.add(new int[]{y - 1, x});
            }
            if (x + 1 < room[y].length && room[y][x + 1] == 0 && !visited[y][x + 1]) {
                queue.add(new int[]{y, x + 1});
            }
            if (x - 1 >= 0 && room[y][x - 1] == 0 && !visited[y][x - 1]) {
                queue.add(new int[]{y, x - 1});
            }
        }

        return timeResult;
    }
}
