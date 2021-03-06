package com.jia.datastructure.binarysearchtree;

/**
 * @author Jarris
 */
public class BST<E extends Comparable<E>> {

    private class Node {

        private E    e;
        private Node left;
        private Node right;

        public Node(E e) {
            this.e = e;
            left = null;
            right = null;
        }
    }

    private Node root;
    private int  size;

    public BST() {
        root = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
