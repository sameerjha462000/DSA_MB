import java.lang.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Stack;

class Main{
	
	private static class TreeNode{
		int data;
		ArrayList<TreeNode> children;
		TreeNode(){
			data = 0;
			children = new ArrayList<>();
		}
		TreeNode(int val){
			data = val;
			children = new ArrayList<>();
		}
	}
	public static TreeNode createTree(Integer[] val){
		TreeNode root = new TreeNode(val[0]);
		Stack<TreeNode> st = new Stack<>();
		st.push(root);
		for(int i=1;i<val.length;i++){
			if(val[i]==null)
				st.pop();
			else{
				TreeNode node = new TreeNode(val[i]);
				st.peek().children.add(node);
				st.push(node);
			}
		}
		return root;
	}
	public static void display(TreeNode root){
		System.out.print(root.data+"->");
		for(TreeNode child:root.children)
			System.out.print(child.data+" ");

		System.out.println();
		for(TreeNode child:root.children)
			display(child);
	}
	public static int max(int a, int b){
		if(a < b)
			return b;
		return a;
	}
	public static int findMax(TreeNode root){
		int maximum = root.data;
		for(TreeNode child:root.children)
			maximum = max(maximum,findMax(child));
		return maximum;
	}
	public static int size(TreeNode root){
		int ans = 0;
		for(TreeNode child:root.children)
			ans += size(child);
		return ans+1;
	}
	public static int height(TreeNode root){
		if(root.children.size() == 0)
			return 0;
		int ans = 0;
		for(TreeNode child:root.children)
			ans = max(ans,height(child));
		ans = ans+1;
		return ans; 
	}
	public static void main(String[] args) {
		initializeIO();
		Integer arr[] = {10,20,null,30,50,null,60,null,null,40,null,null};
		TreeNode root = createTree(arr);
		display(root);
		System.out.println();
		System.out.println(findMax(root));
		System.out.println(size(root));
		System.out.println(height(root));
	}
	private static void initializeIO(){
    	try 
    	{
            System.setIn(new FileInputStream("input.txt"));
            System.setOut(new PrintStream(new FileOutputStream("output.txt")));
            System.setErr(new PrintStream(new FileOutputStream("error.txt")));
        } 
        catch (Exception e) 
        {
            System.err.println(e.getMessage());
        }
    }
}
// GT BT BST RB AVL B+
