class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans=new ArrayList<>();
        solve(root,"",ans);
        return ans;
    }
    void solve(TreeNode root,String path,List<String> ans) {
        if(root==null) return;
        path+=root.val;
        if(root.left==null && root.right==null) {
            ans.add(path);
            return;
        }
        path+="->";
        solve(root.left,path,ans);
        solve(root.right,path,ans);
    }
}