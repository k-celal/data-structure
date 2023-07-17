
public class AVLTree {
    public Node rootNode;

    public void insert(int data){
        rootNode = insert(rootNode, data);
    }

    public int height(){
        if(rootNode==null){
                return 0 ;
        }
        return  height(rootNode);
    }

    public int height(Node newNode) {
        if (newNode == null) {
            return 0;
        }
        return newNode.height;
    }
    
    public void preOrder(Node tempNode) {
        if (rootNode==null) {
            System.out.println("Tree is Empty");
        } else {
            if (tempNode != null) {
                System.out.print(tempNode.data + "    ");
                preOrder(tempNode.leftNode);
                preOrder(tempNode.rightNode);
            }
        }
    }

    public void inOrder(Node tempNode) {

        if (rootNode==null) {
            System.out.println("Tree is Empty");
        } else {
            if (tempNode != null) {
                preOrder(tempNode.leftNode);
                System.out.print(tempNode.data + "    ");
                preOrder(tempNode.rightNode);
            }
        }

    }

    public void postOrder(Node tempNode) {
        if (rootNode==null) {
            System.out.println("Tree is Empty");
        } else {
            if (tempNode != null) {
                preOrder(tempNode.leftNode);
                preOrder(tempNode.rightNode);
                System.out.print(tempNode.data + "    ");

            }
        }

    }
    
    public int max(int x, int y) {
        return (x > y) ? x : y;
    }

    public int balance(Node tempNode) {
        if (tempNode == null) {
            return 0;
        }
        return (height(tempNode.leftNode) - height(tempNode.rightNode));
    }

    public Node minNode(Node tempNode) {
        if (tempNode.leftNode != null) {
            return minNode(tempNode.leftNode);
        }
        return tempNode;
    }

    public Node rightRotate(Node tempNode) {
        Node a = tempNode.leftNode;
        Node b = a.rightNode;

        a.rightNode = tempNode;
        tempNode.leftNode = b;

        tempNode.height = max(height(tempNode.leftNode), height(tempNode.rightNode)) + 1;
        a.height = max(height(a.leftNode), height(a.rightNode)) + 1;

        return a;

    }

    public Node leftRotate(Node tempNode) {//10
        Node a = tempNode.rightNode;//20
        Node b = a.leftNode;//15
        
        a.leftNode = tempNode;
        tempNode.rightNode = b;

        tempNode.height = max(height(tempNode.rightNode), height(tempNode.leftNode)) + 1;
        a.height = max(height(a.rightNode), height(a.leftNode)) + 1;

        return a;
    }

    public Node insert(Node tempNode, int data) {
        if (tempNode == null) {
            return (new Node(data));
        }
        if (data < tempNode.data) {
            tempNode.leftNode = insert(tempNode.leftNode, data);
        } else if (data > tempNode.data) {
            tempNode.rightNode = insert(tempNode.rightNode, data);
        } else {
            return tempNode;
        }
        tempNode.height = 1 + max(height(tempNode.leftNode), height(tempNode.rightNode));

        int balance = balance(tempNode);
        // ll
        if (balance > 1 && data < tempNode.leftNode.data) {
            return rightRotate(tempNode);
        }
        // rr
        if (balance < -1 && data > tempNode.rightNode.data) {
            return leftRotate(tempNode);
        }
        // lr
        if (balance > 1 && data > tempNode.leftNode.data) {
            tempNode.leftNode = leftRotate(tempNode.leftNode);
            return rightRotate(tempNode);
        }
        // rl
        if (balance < -1 && data < tempNode.rightNode.data) {
            tempNode.rightNode = rightRotate(tempNode.rightNode);
            return leftRotate(tempNode);
        }

        return tempNode;

    }

    public void delete(int data){
        rootNode = delete(rootNode, data);
    }
    public Node delete(Node root, int data) {
        if (root == null) {
            return root;
        }
        if (data < root.data) {
            root.leftNode = delete(root.leftNode, data);
        } else if (data > root.data) {
            root.rightNode = delete(root.rightNode, data);
        } else {
            if (root.leftNode == null || root.rightNode == null) {
                Node temp = null;
                if (temp == root.leftNode) {
                    temp = root.rightNode;
                } else {
                    temp = root.leftNode;
                }
                if (temp == null) {
                    temp = root;
                    root = null;
                } else {
                    root = temp;
                }
            }
        }
        if (root == null) {
            return root;
        }
        root.height = max(height(rootNode.leftNode), height(root.rightNode)) + 1;
        int balance = balance(root);
        // ll
        if (balance > 1 && balance(root.leftNode) >= 0) {
            return rightRotate(root);
        }
        // rr
        if (balance < -1 && balance(root.rightNode) <= 0) {
            return leftRotate(root);
        }
        // lr
        if (balance > 1 && balance(root.leftNode) < 0) {
            root.leftNode = leftRotate(root.leftNode);
            return rightRotate(root);
        }
        // rl
        if (balance < -1 && balance(root.rightNode) > 0) {
            root.rightNode = rightRotate(root.rightNode);
            return leftRotate(root);
        }
        return root;
    }
}
