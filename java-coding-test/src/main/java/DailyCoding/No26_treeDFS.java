package DailyCoding;

import java.util.ArrayList;

public class No26_treeDFS {
    public static void main(String[] args) {
        tree root = new tree("1");
        tree rootChild1 = root.addChildNode(new tree("2"));
        tree rootChild2 = root.addChildNode(new tree("3"));
        tree leaf1 = rootChild1.addChildNode(new tree("4"));
        tree leaf2 = rootChild1.addChildNode(new tree("5"));

        No26_treeDFS test = new No26_treeDFS();
        System.out.println(test.dfs(root));
    }

    public ArrayList<String> dfs(tree node) {
        ArrayList<String> result = new ArrayList<>();
        return dfsMethod(node, result);
    }

    public ArrayList<String> dfsMethod(tree node, ArrayList<String> result) {
        //1. 해당 트리의 값을 Arraylist에 저장
        result.add(node.getValue());
        //2. 자식이 있다면 자식의 첫번째 인자부터 재귀함수 실행
        if (node.children != null) {
            for (int i = 0; i < node.children.size(); i++) {
                result = dfsMethod(node.children.get(i), result);
            }
        }
        //3. 자식이 없다면 만들어진 ArrayList를 리턴
        return result;
    }


    public static class tree {
        private String value;
        private ArrayList<tree> children;

        public tree(String data) {
            this.value = data;
            this.children = null;
        }

        public tree addChildNode(tree node) {
            if(children == null) children = new ArrayList<>();
            children.add(node);
            return children.get(children.size() - 1);
        }

        public String getValue() {      //현재 노드의 데이터를 반환
            return value;
        }

        public ArrayList<tree> getChildrenNode() {
            return children;
        }
    }
}
