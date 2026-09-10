class Solution {

    int ans = 0;

    public int averageOfSubtree(TreeNode root) {
        dfs(root);
        return ans;
    }

    Pair dfs(TreeNode root) {

        if (root == null) {
            return new Pair(0, 0);
        }

        Pair left = dfs(root.left);
        Pair right = dfs(root.right);

        int sum = left.sum + right.sum + root.val;
        int count = left.count + right.count + 1;

        if (root.val == sum / count) {
            ans++;
        }

        return new Pair(sum, count);
    }
}

class Pair {
    int sum;
    int count;

    Pair(int sum, int count) {
        this.sum = sum;
        this.count = count;
    }
}