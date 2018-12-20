package hackerearth.problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class ModeOfBinaryTree {
	int max=0;
	public int[] findMode(TreeNode root) {
		Map<Integer,Integer> m = new HashMap<Integer,Integer>();

		findModeUtil(root,m);
		List<Integer> l = new LinkedList<Integer>();
		for(Map.Entry<Integer, Integer> e:m.entrySet()){
			if(e.getValue()>max){
				l.clear();
			l.add(e.getKey());
			max=e.getValue();
			}
			else if(e.getValue()==max){
				l.add(e.getKey());
			}
		}
		Iterator<Integer> it= l.iterator();
		int arr[] = new int[m.keySet().size()];
		int i=0;
		while(it.hasNext()){
			arr[i] =it.next();
			i++;
		}
		return arr;

	}
	public static void main(String args[]){
		ModeOfBinaryTree s = new ModeOfBinaryTree();
		TreeNode root = s.new TreeNode(6);
		root.left=s.new TreeNode(2);
		root.left.left=s.new TreeNode(0);
		root.left.right=s.new TreeNode(4);
		root.left.right.left=s.new TreeNode(2);
		root.left.right.right=s.new TreeNode(6);
		root.right= s.new TreeNode(8);
		root.right.left = s.new TreeNode(7);
		int a[]=s.findMode(root);
		System.out.println(a[0]);
		System.out.println(a[1]);
	}
	public void findModeUtil(TreeNode root,Map<Integer,Integer> m){
		if(root==null){
			return;
		}
		int x = root.val;
		if(m.get(x)==null){
				m.put(x,1);

		}
		else{
			int val=m.get(x);
			++val;
	
				m.put(x,val);

		}

		findModeUtil(root.left,m);
		findModeUtil(root.right,m);
	}
	// Definition for a binary tree node.
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
}