/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void helper(TreeLinkNode root){
        while(root != null) {
            if(root.left == null) return;
            root.left.next = root.right;
            if (root.next != null) root.right.next = root.next.left;
            else root.right.next = null;
            root = root.next;
        }
    }
    public void connect(TreeLinkNode root) {
        while(root != null){
            TreeLinkNode tmp= root;
            helper(root);
            root = tmp.left;
        }

    }
}
/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {

    
    public void connect(TreeLinkNode root) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        if(root == null || root.left == null || root.right == null) return;
        
        root.left.next = root.right;
        
        if(root.next != null){
            root.right.next = root.next.left;
        }
        
        connect(root.left);
        connect(root.right);

    }
}