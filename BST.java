/**
 * binary search class.
 */
public class BST {
    //PRIVATE METHODS
    private void preorderHelper(Node current) {

    }
    private void postorderHelper(Node current) {

    }
    private void inorderHelper(Node current) {

    }

    /**
     * node class to be referenced by BST.
     */
    class Node {

        // FIELDS
        private int key;
        private Node parent;
        private Node leftChild;
        private Node rightChild;

        //CONSTRUCTORS
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

        //GETTERS and SETTERS

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


