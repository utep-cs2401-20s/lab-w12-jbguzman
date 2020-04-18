class myBinarySearchTreeNode{
  int myValue;
  myBinarySearchTreeNode left;
  myBinarySearchTreeNode right;
    
  myBinarySearchTreeNode(int inValue){ // created a new node with empty child pointers
    this.myValue = inValue;
    this.left = null;
    this.right = null;
  }
  
  myBinarySearchTreeNode(int[] A) {
      // creates a new Binary Search Tree rooted at the first value in the array
      /// by inserting elements into the tree in the order they are given in A.
     myValue = A[0];
      if (A.length > 1) {
          for (int i = 1; i < A.length; i++) {
              insert(A[i]);
          }
      }
  }

  public void insert(int inValue){
   if(inValue < myValue) {
      if (left == null) {
        left = new myBinarySearchTreeNode(inValue);
      } else {
        left.insert(inValue);
      }
    }
    else{
      if (right == null) {
        right = new myBinarySearchTreeNode(inValue);
      } else {
        right.insert(inValue);
      }
    }
      if(inValue == myValue){
          System.out.print("Error: No duplicates allowed!");
      }
  }

  public int size(){
    int sum = 1;
    if(left != null){
      sum += left.size();
    }
    if(right != null){
      sum += right.size();
    }
    return sum;
  }
  
  public int height(){
     int leftHeight = 0;
     int rightHeight = 0;
     if(left != null){
       leftHeight = left.height();
     }
     if(right != null){
       rightHeight = right.height();
     }

     if(leftHeight > rightHeight){
       return leftHeight + 1;
     }
     else if(leftHeight < rightHeight){
       return rightHeight + 1;
     }
     else{
       return -1;
     }
  }
  
  public int depth(int search) {
      // This method recursively calculates the depth of a given search value.
      // If the given value is not in the tree, this method returns -1.
      // Note that if the tree is a proper BST, this method should complete in O(log n) time.
      // Additionally, remember that the depth is the number of nodes on the path from a node to the root
      // (i.e. the number of the recursie calls).
      if (myValue == search) {
          return 0;
      } else if (search < myValue) {
          if(left != null) {
              return left.depth(search) + 1;
          }
      } else if (search > myValue){
          if(right != null) {
              return right.depth(search) + 1;
          }
      } else {
          return -1;
      }
  }

  // Utility function included so you can debug your solution. 
  public void print() { print(""); }
  private void print(String prefix) {
    System.out.println(prefix + myValue);
    prefix = prefix.replace('\u251C', '\u2502');
    prefix = prefix.replace('\u2514', ' ');
    if(left != null) left.print(prefix + "\u251C ");
    if(right != null) right.print(prefix + "\u2514 ");
  }
  
} 
