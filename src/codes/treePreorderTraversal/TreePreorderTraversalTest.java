package codes.treePreorderTraversal;

import java.util.List;

public class TreePreorderTraversalTest {
    public static void main(String[] args) {
        Node root = new Node(1,
                List.of(new Node(3,
                                List.of(new Node(5),
                                        new Node(6))),
                        new Node(2),
                        new Node(4)));

        System.out.println(new TreePreorderTraversal().preorder(root));

    }
}
