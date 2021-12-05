package binarytree;

import java.util.*;

// class node{
//     node left,right;
//     int data;
//     node(int data) {
//         this.data = data;
//     }
// }

public class height {
    static Scanner sc = null;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        node root = createTree();
        int height = findHeight(root);
        System.out.println("The height of the tree is " + height);
    }

    static int findHeight(node root) {
        if (root == null)
            return 0;
        return Math.max(findHeight(root.left), findHeight(root.right)) + 1;
    }

    static node createTree() {
        node root = null;
        System.out.println("Enter data: ");
        int data = sc.nextInt();

        if (data == -1) {
            return null;
        }

        root = new node(data);

        System.out.println("Enter left for:-" + data);
        root.left = createTree();
        System.out.println("Enter right for:-" + data);
        root.right = createTree();
        return root;
    }
}
