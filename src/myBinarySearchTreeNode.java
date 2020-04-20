class myBinarySearchTreeNode{
  int myValue;
  myBinarySearchTreeNode left;
  myBinarySearchTreeNode right;
    
  myBinarySearchTreeNode(int inValue){ // created a new node with empty child pointers
    this.myValue = inValue; //set myValue to inValue
    this.left = null; //set left to null
    this.right = null; //set right to null
  }
  
  myBinarySearchTreeNode(int[] A) {
      // creates a new Binary Search Tree rooted at the first value in the array
      /// by inserting elements into the tree in the order they are given in A.
     myValue = A[0]; //root not set to A at index 0
      if (A.length > 1) { //if A is larger than 1, build tree
          for (int i = 1; i < A.length; i++) { //for loop to traverse array
              insert(A[i]); //start inserting into tree the values in array
          }
      }
  }

  public void insert(int inValue){
   if(inValue < myValue) { //if value is smaller than root, insert left
      if (left == null) { //if left does not exist create new node
        left = new myBinarySearchTreeNode(inValue); //creating node
      } else {
        left.insert(inValue); //insert value
      }
    }
    else{ //if value is larger than root, insert right
      if (right == null) { //if right does not exist create new node
        right = new myBinarySearchTreeNode(inValue); //creating node
      } else {
        right.insert(inValue); //insert value
      }
    }
      if(inValue == myValue){ //if value and root are the same
          System.out.print("Error: No duplicates allowed!"); //cannot insert because BST don't have duplicates
      }
  }

  public int size(){
    int sum = 1; //count root
    if(left != null){ //if root has children on left side
      sum += left.size(); //recursively increment
    }
    if(right != null){ //if root has children on right side
      sum += right.size(); //recursively increment
    }
    return sum; //return sum
  }
  
  public int height(){
     int leftHeight = 0; //left height starts at 0
     int rightHeight = 0; //right height starts at 0

     if(left != null){ //if left exists
       leftHeight = left.height() + 1; //recursively increment
     }
     if(right != null){ //if right exists
       rightHeight = right.height() + 1; //recursively increment
     }

     return Math.max(leftHeight, rightHeight); //return max height
  }
  
  public int depth(int search) {
      if (myValue == search) { //if the value looking for equals the value of the root
          return 0; //root depth is 0
      }
      if (left != null && search < myValue) { //if left exists and value looking for is less than root
              return left.depth(search) + 1; //recursively check depth of value and add root
          }
      if (right != null && search > myValue ){ //if right exists and value looking for is greater than root
              return right.depth(search) + 1; //recursively check depth of value and add root
      }
      return -1; //not found return 1
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
