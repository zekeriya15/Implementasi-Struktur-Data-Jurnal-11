class BTNode<E> {
    BTNode left, right;
    E data;

    // constructor
    public BTNode() {
        left = null;
        right = null;
        data = null;
    }

    // constructor
    public BTNode(E item) {
        left = null;
        right = null;
        data = item;
    }

    // function to set left node
    public void setLeft(BTNode n) {
        left = n;
    }

    // function to set right node
    public void setRight(BTNode n) {
        right = n;
    }

    // function to get left node 
    public BTNode getLeft() {
        return left;
    }

    // function to get right node
    public BTNode getRight() {
        return right;
    }

    // function to set data to node 
    public void setData(E d) {
        data = d;
    }

    // function to get data from node
    public E getData() {
        return data;
    }
}