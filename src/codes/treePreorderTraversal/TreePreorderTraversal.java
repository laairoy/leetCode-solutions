package codes.treePreorderTraversal;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Laairoy
 * link: https://leetcode.com/problems/n-ary-tree-preorder-traversal/
 */
class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}

public class TreePreorderTraversal {
    public List<Integer> preorder(Node root) {
        List<Integer> list = new LinkedList<>();

        savePreorder(root, list);
        return list;
    }

    private void savePreorder(Node root, List<Integer> list) {
        if (root == null) return;

        list.add(root.val);

        if (root.children == null) return;

        for (Node n : root.children) {
            savePreorder(n, list);
        }
    }
}
