/**
 * binary search class.
 */
public class BST {
    //creates the instance variables for the class.
    private Node root;
    private int counter;

    /**
     * the binary search tree constructor, initializes values to 0.
     */
     BST() {
        this.root = null;
        this.counter = 0;
    }

    /**
     * size method.
     *
     * @return int size
     */
    public int size() {
        return counter;
    }

    /**
     * inserts new element into the tree.
     *
     * @param element inserted element
     */
    public void insert(int element) {
        Node current = root;
        boolean stillInserting = true;

        if (this.size() != 0) {
            while (stillInserting) {
                if (element < current.getKey()) { // left search
                    Node leftChild = current.getLeftChild();
                    if (leftChild != null) { // traverse down
                        current = leftChild;
                    } else { // sets new node
                        current.setLeftChild(new Node(element, current, null, null));
                        stillInserting = false;
                        this.counter++;
                    }
                } else if (element > current.getKey()) { // right search
                    Node rightChild = current.getRightChild();
                    if (rightChild != null) { // traverse down
                        current = rightChild;
                    } else { // sets new node
                        current.setRightChild(new Node(element, current, null, null));
                        stillInserting = false;
                        this.counter++;
                    }
                } else { // duplicate
                    System.out.println("Element is already in the tree");
                }
            } // while loop
        } else { // if BST is empty
            this.root = new Node(element);
            this.counter++;
        }
    } // insert

    /**
     * deletes an element from the binary search tree.
     *
     * @int element deleted element
     */
    public void delete(int element) {
        if (this.size() != 0) {
            this.deleteNode(this.root, element);
        }
    }

    /**
     * helper method for delete() method
     *
     * @param current - the current node being inspected
     * @param element -  the value of the node to be deleted
     */
    private Node deleteNode(Node current, int element) {
        if (current == null) { // base case, node not found
            System.out.println("Element not found!");
        } else if (current.getKey() > element) { // traverse down left
            current.setLeftChild(deleteNode(current.getLeftChild(), element));
        } else if (current.getKey() < element) { // traverse down right
            current.setRightChild(deleteNode(current.getRightChild(), element));
        } else { //  element is found, current.getKey() == element

            // if node has 0 or 1 child
            if (current.getLeftChild() == null) {
                this.counter--;
                return current.getRightChild();
            } else if (current.getRightChild() == null) {
                this.counter--;
                return current.getLeftChild();
                // if node has 2 children, replace with largest value in left subtree
            } else {
                Node max = current.getLeftChild();
                while (max.getRightChild() != null) { //finding maximum element in left subtree
                    max = max.getRightChild();
                }

                // moves the largest value in left subtree up to be the new node
                current.setKey(max.getKey());
                // deletes the actual node that contained the largest value that was just moved up
                current.setLeftChild(deleteNode(current.getLeftChild(), max.getKey()));
                this.counter--;
            }

        }

        return current;

    }

    /**
     * prints binary search trees in their order in preorder transversal.
     */
    public void preorder() {
        if (this.size() != 0) {
            this.preorderHelper(root);
        }
    }

    /**
     * prints binary search tree in their order in postorder transversal.
     */
    public void postorder() {
        if (this.size() != 0) {
            this.postorderHelper(root);
        }
    }

    /**
     * prints the binary search tree in their order in inorder transversal.
     */
    public void inorder() {
        if (this.size() != 0) {
            this.inorderHelper(root);
        }
    }

    //PRIVATE METHODS
    private void preorderHelper(Node current) {
        if (current == null) {
            return;
        }
        System.out.print(current.getKey() + " ");
        preorderHelper(current.getLeftChild());
        preorderHelper(current.getRightChild());
    }

    private void postorderHelper(Node current) {
        if (current == null) {
            return;
        }
        postorderHelper(current.getLeftChild());
        postorderHelper(current.getRightChild());
        System.out.print(current.getKey() + " ");
    }

    private void inorderHelper(Node current) {
        if (current == null) {
            return;
        }
        inorderHelper(current.getLeftChild());
        System.out.print(current.getKey() + " ");
        inorderHelper(current.getRightChild());
    }

    /**
     * nested node class to be referenced by BST.
     */
    class Node {
        private int key;
        private Node parent;
        private Node leftChild;
        private Node rightChild;

        /**
         * This is the default node constructor.
         * Instances within the class are initialized.
         * Key is intiialized to -1. All others are intialized to null.
         */
        Node() {
            this.key = -1;
            this.parent = null;
            this.leftChild = null;
            this.rightChild = null;
        }

        /**
         * Creates new node where the key is initialized and all other fields are null.
         *
         * @param key - takes the integer version of key
         */
        Node(int key) {
            this.key = key;
            this.parent = null;
            this.leftChild = null;
            this.rightChild = null;
        }

        /**
         * Creates new node where all the fields are initialized according to parameters.
         *
         * @param key        int
         * @param parent     is parent of Node being created
         * @param leftChild  of Node
         * @param rightChild of Node
         */
        Node(int key, Node parent, Node leftChild, Node rightChild) {
            this.key = key;
            this.parent = parent;
            this.leftChild = leftChild;
            this.rightChild = rightChild;
        }

        //getters and setters for the instance variables

        /**
         * gets Key.
         *
         * @return int key
         */
        int getKey() {
            return this.key;
        }

        /**
         * gets the parent Node.
         *
         * @return Node parent
         */
        Node getParent() {
            return this.parent;
        }

        /**
         * gets the leftChild of the Node
         *
         * @return Node leftChild
         */
        Node getLeftChild() {
            return this.leftChild;
        }

        /**
         * gets the rightChild of the Node.
         *
         * @return Node rightChild
         */
        Node getRightChild() {
            return this.rightChild;
        }

        //setter methods

        /**
         * sets the key for Node.
         *
         * @param key int
         */
        void setKey(int key) {
            this.key = key;
        }

        /**
         * sets the parent node of the Node.
         *
         * @param parent Node
         */
        void setParent(Node parent) {
            this.parent = parent;
        }

        /**
         * sets the leftChild of the Node.
         *
         * @param leftChild Node
         */
        void setLeftChild(Node leftChild) {
            this.leftChild = leftChild;
        }

        /**
         * sets the rightChild of the Node.
         *
         * @param rightChild Node
         */
        void setRightChild(Node rightChild) {
            this.rightChild = rightChild;
        }
    } //Node class
} //BST class
