package org.yenbo.lintcode.domain;

public class TreeNode {

	public int val;
	public TreeNode left, right;

	public TreeNode(int val) {
		this.val = val;
		this.left = this.right = null;
	}
	
	@Override
	public String toString() {
		return Integer.toString(val);
	}
}
