public class BSTree {
    Node rootNode;
    int height = -1;
    int counter = 0;
    int nodeCounter = 0;

    public BSTree() {
        rootNode = null;
    }

    public boolean checked() {
        return rootNode == null;
    }

    public int minValue(Node rootNode) {
        int minv = rootNode.data;
        while (rootNode.leftNextNode != null) {
            minv = rootNode.leftNextNode.data;
            rootNode = rootNode.leftNextNode;
        }
        return minv;
    }

    public Node newNode(int data) {
        Node tempNode = new Node(data);
        nodeCounter++;
        return tempNode;
    }

    public Node minNode(Node rootNode) {
        while (rootNode.leftNextNode != null) {
            rootNode = rootNode.leftNextNode;
        }
        return rootNode;
    }

    public Node Insert(Node newNode, int data) {
        if (newNode != null) {
            if (data < newNode.data) {
                newNode.leftNextNode = Insert(newNode.leftNextNode, data);
            } else {
                newNode.rightNextNode = Insert(newNode.rightNextNode, data);
            }
        } else {
            newNode = newNode(data);
        }
        return newNode;

    }

    public Node Search(Node rootNode, int data) {
        if (rootNode == null || rootNode.data == data) {
            return rootNode;
        }
        if (rootNode.data < data) {
            return Search(rootNode.rightNextNode, data);
        }
        return Search(rootNode.leftNextNode, data);

    }

    public void Add(int data) {
        Node newNode = new Node(data);
        if (checked()) {
            rootNode = newNode;
            return;
        }
        Node prevNode = null;
        Node tempNode = rootNode;
        while (tempNode != null) {
            if (tempNode.data > data) {
                prevNode = tempNode;
                tempNode = tempNode.leftNextNode;
            } else if (tempNode.data < data) {
                prevNode = tempNode;
                tempNode = tempNode.rightNextNode;
            }
        }
        if (prevNode.data > data) {
            prevNode.leftNextNode = newNode;
        } else {
            prevNode.rightNextNode = newNode;
        }

    }

    public void preOrder(Node tempNode) {
        if (checked()) {
            System.out.println("Tree is Empty");
        } else {
            if (tempNode != null) {
                System.out.print(tempNode.data + "    ");
                preOrder(tempNode.leftNextNode);
                preOrder(tempNode.rightNextNode);
            }
        }
    }

    public void inOrder(Node tempNode) {

        if (checked()) {
            System.out.println("Tree is Empty");
        } else {
            if (tempNode != null) {
                preOrder(tempNode.leftNextNode);
                System.out.print(tempNode.data + "    ");
                preOrder(tempNode.rightNextNode);
            }
        }

    }

    public void postOrder(Node tempNode) {
        if (checked()) {
            System.out.println("Tree is Empty");
        } else {
            if (tempNode != null) {
                preOrder(tempNode.leftNextNode);
                preOrder(tempNode.rightNextNode);
                System.out.print(tempNode.data + "    ");

            }
        }

    }

    public int height(Node rootNode) {
        if (checked()) {
            return -1;
        } else {
            int right = 0, left = 0;
            right = height(rootNode.rightNextNode);
            left = height(rootNode.leftNextNode);
            if (left > right) {
                return left + 1;
            } else {
                return right + 1;
            }
        }
    }

    public int nodeCounter() {
        return nodeCounter;
    }

    public Node Delete(Node rootNode, int data) {
        if (rootNode == null) {
            return rootNode;
        }
        if (data < rootNode.data) {
            rootNode.leftNextNode = Delete(rootNode.leftNextNode, data);
        } else if (data > rootNode.data) {
            rootNode.rightNextNode = Delete(rootNode.rightNextNode, data);
        } else {
            if (rootNode.leftNextNode == null) {
                return rootNode.rightNextNode;
            } else if (rootNode.rightNextNode == null) {
                return rootNode.leftNextNode;
            }
            rootNode.data = minValue(rootNode.rightNextNode);
            rootNode.rightNextNode = Delete(rootNode.rightNextNode, rootNode.data);
        }
        return rootNode;
    }

}
