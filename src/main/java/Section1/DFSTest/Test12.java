package Section1.DFSTest;

import java.util.ArrayList;
import java.util.HashSet;

public class Test12 {
    public static void main(String[] args) {
        int result = connectedVertices(new int[][]{
                {0, 1},
                {2, 3},
                {3, 5},
                {3, 4},
                {0, 2}
        });
        System.out.println(result);
    }

    public static int connectedVertices(int[][] edges) {
        // TODO:
        ArrayList<HashSet<Integer>> list = new ArrayList<>();

        list.add(new HashSet<>()); //첫 연결 정점을 Set에 넣어 List에 추가한다.
        list.get(0).add(edges[0][0]);
        list.get(0).add(edges[0][1]);

        for(int i = 1; i < edges.length; i++) { //주어진 배열을 하나씩 돈다
            int first = edges[i][0];
            int last = edges[i][1];


            boolean check = false;
            int index = 0;
            ArrayList<Integer> indexList = new ArrayList<>();


            for(int j = 0; j < list.size(); j++){   //list에 담긴 set을 순회한다.
                HashSet<Integer> set = list.get(j);
                if(set.contains(first) || set.contains(last)){
                    check = true;
                    indexList.add(j);
                    index = j;
                }
            }
            if(indexList.size() == 2){   // 연결된 정점이 다른 두 정점과 이어질 때
                int index1 = indexList.get(0).intValue();
                int index2 = indexList.get(1).intValue();

                HashSet<Integer> totalSet = new HashSet<>();  //Set 합쳐서 추가하기
                HashSet<Integer> set1 = list.get(index1);
                HashSet<Integer> set2 = list.get(index2);
                totalSet.addAll(set1);
                totalSet.addAll(set2);
                list.add(totalSet);

                list.remove(index1);    //원래 Set 지우기
                list.remove(index2);
            }

            if(check){  //set에 연결된 정점이 있다면 set에 나머지 정점 추가
                if(indexList.size() == 2) index = list.size() - 1;
                HashSet<Integer> set = list.get(index);
                set.add(first);
                set.add(last);
            } else {  //set에 연결된 정점이 없다면 set을 새로 만들어 정점을 넣고 list에 추가
                HashSet<Integer> group = new HashSet<Integer>();
                group.add(first);
                group.add(last);
                list.add(group);
            }
        }
        return list.size();
    }
}


