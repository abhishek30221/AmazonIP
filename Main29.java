class Solution {
    ArrayList<Integer> arr = new ArrayList<>(); 
    public void inorder(TreeNode root)
    {
        if(root == null)
            return; 
        
        inorder(root.left);
        arr.add(root.val); 
        inorder(root.right); 
    }
    public int kthSmallest(TreeNode root, int k) {
            k-=1;
            int i = 0; 
            inorder(root); 
            for( ; i < k ; i++); 
            if(i == arr.size())
                return -1; 
            return arr.get(i); 
    }
}

//if space optimized then use morris traversal and print when k gets trggered