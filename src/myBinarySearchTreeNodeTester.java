import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
//all tests past
public class myBinarySearchTreeNodeTester {

    @Test
    public void Test1(){ //testing if size method works
        int[] array = {2, 1, 3};
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(array);
        assertEquals(3, tree.size());
    }

    @Test
    public void Test2(){//testing if height method works
        int[] array = {9, 3, 5, 22, 34, 1};
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(array);
        assertEquals(2, tree.height());
    }

    @Test
    public void Test3(){ //testing if depth method works
        int[] array = {7, 11, 2, 8, 5, 42};
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(array);
        assertEquals(2, tree.depth(8));
    }

    @Test
   public void Test4(){ //testing if insert method works and inserts correctly
        int[] array = {5, 1, 10, 13, 99, 4};
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(array);
        tree.insert(2);
    }
    @Test
    public void Test5(){ //testing if insert method does not insert a value already in tree
        int[] array = {5, 1, 10, 13, 99, 4};
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(array);
        tree.insert(10);
    }
}
