package at.hackerrank.interview.tree;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Scanner;

public class PreorderTraversal {
    /**
     * PreOrder - Root -> Left -> Right
     * @param root
     */
    public static void preOrder(Node root) {
        if(root == null){
            return;
        }
        System.out.print(root.data+ " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    /**
     * PreOrder - Left -> Right ->
     * @param root
     */
    public static void postOrder(Node root) {
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+ " ");
    }

    /**
     * InOrder - Left-> Root -> Right
     * @param root
     */
    public static void inOrder(Node root) {
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+ " ");
        inOrder(root.right);
    }

    public static void levelOrder(Node root){
        if(root == null) {
            return;
        }
        LinkedList<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node current = queue.peek();
            System.out.print(current.data + " ");
            if (current.left != null)
                queue.add(current.left);
            if (current.right != null)
                queue.add(current.right);
            queue.pop();
        }
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while (t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        preOrder(root);
    }
}
