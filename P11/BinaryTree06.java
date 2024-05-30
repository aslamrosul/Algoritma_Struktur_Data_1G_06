package P11;

public class BinaryTree06 {
    Node06 root;
    int size;

    public BinaryTree06() {
        root = null;
    }

    boolean isEmpty() {
        return root != null;
    }

    void add(int data) {
        if (!isEmpty()) {// tree is isEmpty
            root = new Node06(data);
        } else {
            Node06 current = root;
            while (true) {
                if (data < current.data) {
                    //salah tanda >
                    if (current.left == null) {
                        current.left = new Node06(data);
                        break;
                        //terbalik isi dengan else dibawah
                        
                    } else {
                        current = current.left;
                        //terbalik isis dengan diatas
                    }
                } else if (data > current.data) {
                    //memperbaiki tanda <
                    if (current.right == null) {
                        //mengganti tanda !=
                        current.right = new Node06(data);
                        break;
                        // isi terbalik dengan else dibawahnya
                    } else {
                        current = current.right;
                    }

                } else {
                    // Data sudah ada dalam pohon
                    break;
                }
            }
        }
    }

    boolean find(int data) {
        boolean result = false;
        Node06 current = root;
        while (current != null) {
            if (current.data == data) {
                result = true;
                break;
            } else if (data < current.data) {
                //memperbaiki tanda >
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return result;
    }

    void traversePreOrder(Node06 node) {
        if (node != null) {
            System.out.println(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(Node06 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.println(" " + node.data);
        }
    }

    void traverseInOrder(Node06 node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.println(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    Node06 getSuccessor(Node06 del) {
        Node06 successor = del.right;
        Node06 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right; 
            // Perbaikan: Menghubungkan orangtua penerus dengan anak kanannya
            successor.right = del.right;
        }
        return successor;
    }


    void delete(int data) {
        if (!isEmpty()) {
            System.out.println("Tree is empty");
            return;
        }
        // find more (curent) that will be deleted
        Node06 parent = null;
        //perbaikan root jadi null
        Node06 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.data == data) {
                break;
            } else if (data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else  {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        
        if (current == null) {
            System.out.println("Couldn't find data!");
            return;
        } else {
            // if there is no child, simply delete it
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;

                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }

            } else if (current.left == null) {// if there is 1 child right
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                        //perbaikan current jadi parent
                    } else {
                        parent.right = current.right;
                    }
                }

            } else if (current.right == null) {// if there is 1 child (left)
                if (current == root) {
                    root = current.left;

                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    }else {
                        parent.right = current.left;
                    }
                }

            } else {// if there is 2 childs
                Node06 successor = getSuccessor(current);
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                    successor.left = current.left;
                }

            }
        }
    }
}