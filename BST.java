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
    public BST() {
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
                if (element < current.getKey()) { //left
                    Node leftChild = current.getLeftChild();
                    if (leftChild != null) {
                        current = leftChild;
                    } else {
                        current.setLeftChild(new Node(element, current, null, null));
                        stillInserting = false;
                        this.counter++;
                    }
                } else {//right
                    if (element > current.getKey()) {
                        Node rightChild = current.getRightChild();
                        if (rightChild != null) {
                            current = rightChild;
                        } else {
                            current.setRightChild(new Node(element, current, null, null));
                            stillInserting = false;
                            this.counter++;
                        }
                    }
                }
            } //while
        } else { //if BST is empty
            this.root  = new Node(element);
        }
    } //insert

    /**
     * deletes an element from the binary search tree.
     *
     * @int element deleted element
     */
    public void delete(int element) {
        Node current = root;
        boolean stillInserting = true;


    }

    /**
     * prints binary search trees in their order in preorder transversal.
     */
    public void preorder() {
        throw new UnsupportedOperationException("not implemented");
    }

    /**
     * prints binary search tree in their order in postorder transversal.
     */
    public void postorder() {
        throw new UnsupportedOperationException("not implemented");
    }

    /**
     * prints the binary search tree in their order in inorder transversal.
     */
    public void inorder() {
        throw new UnsupportedOperationException("not implemented");
    }

    //PRIVATE METHODS
    private void preorderHelper(Node current) {

    }
    private void postorderHelper(Node current) {

    }
    private void inorderHelper(Node current) {

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
