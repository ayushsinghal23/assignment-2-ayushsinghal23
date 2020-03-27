/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:11 PM
 */
package problem4.myqueue;
// to create queue to store pre - order successor

import problem4.node.Node;

import java.util.*;

public class MyQueue {
    public Node root = null;
    Queue<String> queue = new LinkedList<String>();
    ArrayList<Integer> linkedList = new ArrayList<>();
    ArrayList<Integer> linkedlist2 = new ArrayList<>();
    Node foundNode;
    Node parentOfFoundNode;

    public void insert(int value) {
        Node newnode = new Node(value);
        if (root == null) {
            root = newnode;
        } else {
            Node current = root;
            Node parent = null;
            while (true) {
                parent = current;
                if (value <= current.data) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newnode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newnode;
                        return;
                    }
                }
            }
        }
    }

    public void preorder(Node x) {
        if (x == null) {
            return;
        } else {
            linkedList.add(x.data);
            preorder(x.left);
            preorder(x.right);
        }
    }

    public void postorder(Node x) {
        if (x == null) {
            return;
        } else {
            postorder(x.left);
            postorder(x.right);
            linkedlist2.add(x.data);
        }
    }

    public void printSuccessor() {
        for (int i = 0; i < linkedList.size() - 1; i++) {
            queue.add(linkedList.get(i) + " successor is-------> " + linkedList.get(i + 1));
        }
        queue.add(linkedList.get(linkedList.size() - 1) + " successor is-------> " + "null");
    }

    public void printPreOrder() {
        System.out.println("--------------------PREORDER---------------------");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.print(linkedList.get(i) + " ");
        }
        System.out.println();
    }

    public void printPostOrder() {
        System.out.println("--------------------POSTORDER---------------------");
        for (int i = 0; i < linkedlist2.size(); i++) {
            System.out.print(linkedlist2.get(i) + " ");
        }
        System.out.println();
    }

    public void checkOpposites() {
        if (linkedList.get(0) == linkedlist2.get(linkedlist2.size() - 1)) {
            System.out.println("STATEMENT 1 PROVED CORRECT");
        } else {
            System.out.println("SORRY!! STATEMENT 1 PROVED WRONG");
        }
    }


    public void checkMiddles(int mid) {
        if (linkedlist2.get(mid) == linkedList.get(mid)) {
            System.out.println("STATEMENT 2 PROVED CORRECT");
        } else {
            System.out.println("SORRY!! STATEMENT 2 PROVED WRONG");
        }
    }

    public void display() {
        for (String i : queue) {
            System.out.println(i);

        }
    }

//    public void search(int value) {
//
//        int flag = 0;
//
//        if (root == null) {
//            return;
//        } else {
//            Node current = root;
//            while (true) {
//                if (value == root.data) {
//                    foundNode = root;
//                    parentOfFoundNode = root;
////                    System.out.println(foundNode.data + " " + parentOfFoundNode.data);
//                    flag = 1;
//                    return;
//                }
//                if (value < current.data) {
//                    if (current.left.data == value) {
//                        foundNode = current.left;
//                        parentOfFoundNode = current;
////                        System.out.println(foundNode.data + " " + parentOfFoundNode.data);
//                        flag = 1;
//                        return;
//                    } else {
//                        current = current.left;
//                        if (current == null) {
//                            System.out.println("NOT FOUND");
//                        }
//                    }
//                } else if (value > current.data) {
//                    if (current.right.data == value) {
//                        foundNode = current.right;
//                        parentOfFoundNode = current;
////                        System.out.println(foundNode.data + " " + parentOfFoundNode.data);
//                        flag = 1;
//                        return;
//                    } else {
//                        current = current.right;
//                        if (current == null) {
//                            System.out.println("NOT FOUND");
//                        }
//
//                    }
//                }
//            }
//        }
//    }


//    public void preOrderSuccessor(int value) {
//
//        search(value);
////        System.out.println(foundNode.data + " " + parentOfFoundNode.data);
//        if (foundNode.left != null) {
//            queue.add(foundNode.left.data);
//            System.out.println(+foundNode.left.data);
//        } else if (foundNode.right != null) {
//            queue.add(foundNode.right.data);
//            System.out.println(foundNode.right.data);
//        }
//        else if(foundNode==parentOfFoundNode.left) {
//            System.out.println(parentOfFoundNode.right.data);
//        }
//        else
//         {
//            int x = 0;
//            while (parentOfFoundNode != root) {
//                int upper = parentOfFoundNode.data;
//                search(parentOfFoundNode.data);
//                if (parentOfFoundNode.left.data == upper) {
//                    x = 1;
//                    queue.add(parentOfFoundNode.right.data);
//                    System.out.println(parentOfFoundNode.right.data);
//                    return;
//                }
//
//
//            }
//            if (x == 0) {
//                System.out.println("N  D");
//            }
//        }
////    public Node root() {
////        return root;
////    }
//    }


}
