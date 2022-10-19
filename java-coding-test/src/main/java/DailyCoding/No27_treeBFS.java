package DailyCoding;

import java.util.ArrayList;
import java.util.LinkedList;

public class No27_treeBFS {
    public static void main(String[] args) {
        tree root = new tree("1");
        tree rootChild1 = root.addChildNode(new tree("2"));
        tree rootChild2 = root.addChildNode(new tree("3"));
        tree leaf1 = rootChild1.addChildNode(new tree("4"));
        tree leaf2 = rootChild1.addChildNode(new tree("5"));
        leaf1.addChildNode(new tree("6"));
        rootChild2.addChildNode(new tree("7"));
        No27_treeBFS test = new No27_treeBFS();


        System.out.println(test.bfs(root));
    }

    public ArrayList<String> bfs(tree node) {
        ArrayList<String> result = new ArrayList<>();
        LinkedList<tree> queue = new LinkedList<>();
        queue.add(node);

        while (queue.size() != 0) {
            //1. 현재 노드의 값을 result에 저장
            tree tree = queue.poll();
            result.add(tree.getValue());

            //2. 현재 노드의 자식 노드들을 queue에 저장
            if (tree.getChildrenNode() != null) {
                for (int i = 0; i < tree.getChildrenNode().size(); i++) {
                    queue.add(tree.getChildrenNode().get(i));
                }
            }
        }

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
            if (children == null) children = new ArrayList<>();
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
