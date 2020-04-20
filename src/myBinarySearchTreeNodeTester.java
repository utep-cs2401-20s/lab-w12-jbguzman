import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class myBinarySearchTreeNodeTester {

    @Test
    public void Test1(){ //testing if size method works and it passed
        int[] array1 = {2, 1, 3};
        myBinarySearchTreeNode tree1 = new myBinarySearchTreeNode(array1);
        assertEquals(3, tree1.size()); //pass

        int[] array2 = {2, 1, 5, 3, 10, 9};
        myBinarySearchTreeNode tree2 = new myBinarySearchTreeNode(array2);
        assertEquals(6, tree2.size()); //pass

        int[] array3 = {100};
        myBinarySearchTreeNode tree3 = new myBinarySearchTreeNode(array3);
        assertEquals(1, tree3.size()); //pass
    }

    @Test
    public void Test2(){//testing if height method works and it passed
        int[] array1 = {9, 3, 22, 34, 5, 1};
        myBinarySearchTreeNode tree1 = new myBinarySearchTreeNode(array1);
        assertEquals(2, tree1.height()); //pass

        int[] array2 = {1, 2, 3, 4, 5, 6};
        myBinarySearchTreeNode tree2 = new myBinarySearchTreeNode(array2);
        assertEquals(5, tree2.height()); //pass

        int[] array3 = {100, 50, 200};
        myBinarySearchTreeNode tree3 = new myBinarySearchTreeNode(array3);
        assertEquals(1, tree3.height()); //pass
    }

    @Test
    public void Test3(){ //testing if depth method works
        int[] array = {7, 11, 2, 8, 5, 42, 30};
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(array);
        assertEquals(2, tree.depth(8)); //pass
        assertEquals(1, tree.depth(2)); //pass
        assertEquals(0, tree.depth(7)); //pass
        assertEquals(3, tree.depth(30)); //pass
        assertEquals(-1, tree.depth(100)); //won't pass, not sure why
    }

    @Test
   public void Test4(){ //testing if insert method works and inserts correctly and passes
        int[] array = {5, 1, 10, 13, 99, 4};
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(array);
        tree.insert(2); //pass
        //tried doing an assertEquals on an expected array but couldn't get it to work
    }
    @Test
    public void Test5(){ //testing if insert method does not insert a value already in tree and passes
        int[] array = {5, 1, 10, 13, 99, 4};
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(array);
        tree.insert(10); //pass
        //tried doing an assertEquals on an expected array after insert but couldn't get it to work
    }
}
