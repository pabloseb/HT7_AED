import java.util.ArrayList;
import java.util.HashMap;

public class BinarySearchTree<E>{
    BinarySearchTree(){}
    public Node CreateNode(String data){
        Node node = new Node();
        node.data = data;
        node.left = null;
        node.right = null;
        return node;
    }
    public Node insert(Node node, String data){
        if(node == null){
            return CreateNode(data);
        }
        else{
            if(data.length()<=node.data.length()){
                node.left = insert(node.left,data);
            } else if(data.length()>=node.data.length()){
                node.right = insert(node.right,data);
            }
        }
        return node;
    }
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
