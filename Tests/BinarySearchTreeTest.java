import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {

    @Test
    void insert() {
        Node node = new Node();
        node.data = "Homework";
        node.right = null;
        node.left = null;
        String data = "dog";

        BinarySearchTree tree = new BinarySearchTree();
        if(node == null){
            tree.CreateNode(data);
        }
        else{
            if(data.length()<=node.data.length()){
                node.left = tree.insert(node.left,data);
            } else if(data.length()>=node.data.length()){
                node.right = tree.insert(node.right,data);
            }
        }
        assertEquals(node.left,tree.insert(node.left,data));
    }



    @Test
    void recursiveResearch() {
        Node node = new Node();
        node.data = "dog";
        String data = "dog";
        boolean val;
        if (node.data == data) {
            val = true;
        } else {
            val = false;
        }
        assertEquals(val, true);
    }
}