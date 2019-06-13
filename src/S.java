import java.util.Arrays;

public class S {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
    ListNode p = l1, q = l2, curr = dummyHead;
    int carry = 0;
    while (p != null || q != null) {
        int x = (p != null) ? p.val : 0;
        int y = (q != null) ? q.val : 0;
        int sum = carry + x + y;
        carry = sum / 10;
        curr.next = new ListNode(sum % 10);
        curr = curr.next;
        if (p != null) p = p.next;
        if (q != null) q = q.next;
    }
    if (carry > 0) {
        curr.next = new ListNode(carry);
    }
    return dummyHead.next;
    }
    public int largestRectangleArea(int[] heights) {
    	int area = 0;  
    	  java.util.Stack<Integer> stack = new java.util.Stack<Integer>();  
    	  for (int i = 0; i < heights.length; i++) {  
    	    if (stack.empty() || heights[stack.peek()] < heights[i]) {  
    	      stack.push(i);  
    	    } else {  
    	      int start = stack.pop();  
    	      int width = stack.empty() ? i : i - stack.peek() - 1;  
    	      area = Math.max(area, heights[start] * width);  
    	      i--;  
    	    }  
    	  }  
    	  while (!stack.empty()) {  
    	    int start = stack.pop();  
    	    int width = stack.empty() ? heights.length : heights.length - stack.peek() - 1;  
    	    area = Math.max(area, heights[start] * width);        
    	  }  
    	  return area;  
    }
    public static void main(String[] args) {
//    	S solution = null;
//    	ListNode l1=new ListNode(3);
//    	ListNode l3=new ListNode(4);
//    	l1.next=l3;
//    	ListNode l2=new ListNode(2);
//    	ListNode l4=new ListNode(1);
//    	l2.next=l4;
//    	System.out.println(solution.addTwoNumbers(l1, l2).val);
    	S s=new S();
    	int[] test= {1,2,3,4};
    	System.out.println(s.largestRectangleArea(test));
    }
}
