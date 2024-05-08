class BinaryTree<E> {
    private BTNode root;

    // constructor
    public BinaryTree() {
        root = null;
    }

    // function to check if tree is empty
    public boolean isEmpty() {
        return root == null;        // return root; also works
    }

// ============================================================================

    // function to insert data
    public void insert(E data) {        // public, can be accessed outside this class
        root = insert(root, data);      // root calls the insert method which is right below this method
    }

    // function to insert data recursively
    private BTNode insert(BTNode node, E data) {        // it doesnt get a conflict although both method share the same name
        if (node == null) {                             // cuz this method's access moddifier is PRIVATE which can be accessed
            node = new BTNode(data);                    // inside this class only (used inside insert method above). it takes 2 parameter
        }
        else {
            if (node.getLeft() == null) {
                node.left = insert(node.left, data);
            } else {
                node.right = insert(node.right, data);
            }
        }
        return node;
    }

// ============================================================================

    // function to count number of nodes
    public int countNodes() {
        return countNodes(root);
    }

    // function to count number of nodes recursively
    private int countNodes(BTNode r) {
        if (r == null) {
            return 0;
        } else {
            int l = 1;
            l += countNodes(r.getLeft());
            l += countNodes(r.getRight());
            return l;
        }
    }

// ============================================================================

    // function to search for an element
    public boolean search(E val) {
        return search(root, val);
    }

    // function to search for an element recursively
    private boolean search(BTNode r, E val) {
        if (r.getData() == val) {
            return true;
        }
        if (r.getLeft() != null)  {
            if (search(r.getLeft(), val)) {
                return true;
            }
        }
        if (r.getRight() != null) {
            if (search(r.getRight(), val)) {
                return true;
            }
        }
        return false;
    }

// ============================================================================

    // function for inorder traversal
    public void inorder() {             // public, can be accessed outside this class
        inorder(root);                  // it calls inorder method with an argument which right below this method
    }

    // inorder traversal recursively
    private void inorder(BTNode r) {                    // this is a PRIVATE method which is used inside inorder method
        if (r != null) {                                // right above this method. it takes one parameter
            inorder(r.getLeft());
            System.out.print(r.getData() + " ");
            inorder(r.getRight());
        }
    }

// ============================================================================

    // function for preorder traversal
    public void preorder() {
        preorder(root);
    }

    // preorder traversal recursively
    private void preorder(BTNode r) {
        if (r != null) {
            System.out.print(r.getData() + " ");
            preorder(r.getLeft());
            preorder(r.getRight());
        }
    }

// ============================================================================

    // function for postorder traversal
    public void postorder() {
        postorder(root);
    }

    // postorder traversal recursively
    private void postorder(BTNode r) {
        if (r != null) {
            postorder(r.getLeft());
            postorder(r.getRight());
            System.out.print(r.getData() + " ");
        }
    }
}
