/**
 * @author Pablo Herrera & Jorge Andrino
 * @since 28/03/2022
 */
public class BinarySearchTree<E>{
    BinarySearchTree(){}

    /**
     * Class that creates a node for the binary tree
     * @param data
     * @return Node
     */
    public Node CreateNode(String data){
        Node node = new Node();
        node.data = data;
        node.left = null;
        node.right = null;
        return node;
    }

    /**
     * class that inserts a value to the binary tree
     * @param node
     * @param data
     * @return Node
     */
    public Node insert(Node node, String data){
        if(node == null){
            return CreateNode(data);
        }
        else{
            int num1 = data.compareTo(node.data);
            //it inserts values to the binary tree depending on the lenght, so the first element with fewer letters wil be the root of the tree
            //the value with more letters will be the last element in the tree
            if(num1<0){
                node.left = insert(node.left,data);
            } else if(num1>0){
                node.right = insert(node.right,data);
            }
        }
        return node;
    }

    /**
     * Class that prints elements in Binary tree in InOrder
     * @param node
     */
    public void Inorder(Node node){
        if(node==null){
            return;
        }else{
            Inorder(node.left);
            System.out.println("-"+node.data+"");
            Inorder(node.right);
        }
    }
    public boolean recursiveResearch(Node node,String key) {
    if(node == null){
        return false;
    }
    if(node.data == key){
        return true;
    }
    return recursiveResearch(node.left,key) || recursiveResearch(node.right,key);
    }
}
