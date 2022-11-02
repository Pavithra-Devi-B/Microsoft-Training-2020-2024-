public class Solution {
    List<String> res = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        print(root, list);
        return res;
    }

    void print(TreeNode root, List<Integer> list){
        if(root == null) return;
        list.add(root.val);
        if(root.left == null && root.right == null){

            StringBuilder sb = new StringBuilder();
            sb.append(list.get(0));

            for(int i=1; i<list.size(); i++){
                sb.append("->");
                sb.append(list.get(i));
            }
            res.add(sb.toString());
        }
        print(root.left, list);
        print(root.right, list);
        list.remove(list.size()-1);
    }
}
