import java.util.Deque;
import java.util.Scanner;
//中缀转后缀
//class Mystack{
//	private int length;
//	private char[] data;
//	private int top;
//	public Mystack(int length) {
//		this.length=length;
//		data=new char[length];
//		top=-1;
//	}
//	public void push(char in) {
//		if(top!=length-1) {
//			data[++top]=in;
//		}
//	}
//	public char pop() {
//		return data[top--];
//	}
//	public char peek() {
//		return data[top];
//	}
//	public char peekn(int n) {
//		return data[n];
//	}
//	public void displayStack(){
//        System.out.print("Stack(bottom-->top):");
//        for(int i = 0 ; i < top+1; i++){
//            System.out.print(peekn(i));
//            System.out.print(' ');
//        }
//        System.out.println("");
//    }
//	public boolean isEmpty(){
//        return (top == -1);
//    }
//	public boolean isFull(){
//		return (top == length-1);
//	}
//}
//class InfixToSuffix {
//    private Mystack s1;//定义运算符栈
//    private Mystack s2;//定义存储结果栈
//    private String input;
//     
//    //默认构造方法，参数为输入的中缀表达式
//    public InfixToSuffix(String in){
//        input = in;
//        s1 = new Mystack(input.length());
//        s2 = new Mystack(input.length());
//    }
//    //中缀表达式转换为后缀表达式，将结果存储在栈中返回，逆序显示即后缀表达式
//    public Mystack doTrans(){
//        for(int j = 0 ; j < input.length() ; j++){
//            System.out.print("s1栈元素为：");
//            s1.displayStack();
//            System.out.print("s2栈元素为：");
//            s2.displayStack();
//            char ch = input.charAt(j);
//            System.out.println("当前解析的字符:"+ch);
//            switch (ch) {
//            case '+':
//            case '-':
//                gotOper(ch,1);
//                break;
//            case '*':
//            case '/':
//                gotOper(ch,2);
//                break;
//            case '(':
//                s1.push(ch);//如果当前字符是'(',则将其入栈
//                break;
//            case ')':
//                gotParen(ch);
//                break;
//            default:
//                //1、如果当前解析的字符是操作数，则直接压入s2
//                //2、
//                s2.push(ch);
//                break;
//            }//end switch
//        }//end for
//         
//        while(!s1.isEmpty()){
//            s2.push(s1.pop());
//        }
//        return s2;
//    }
//     
//    public void gotOper(char opThis,int prec1){
//        while(!s1.isEmpty()){
//            char opTop = s1.pop();
//            if(opTop == '('){//如果栈顶是'(',直接将操作符压入s1
//                s1.push(opTop);
//                break;
//            }else{
//                int prec2;
//                if(opTop == '+' || opTop == '-'){
//                    prec2 = 1;
//                }else{
//                    prec2 = 2;
//                }
//                if(prec2 < prec1){//如果当前运算符比s1栈顶运算符优先级高，则将运算符压入s1
//                    s1.push(opTop);
//                    break;
//                }else{//如果当前运算符与栈顶运算符相同或者小于优先级别，那么将S1栈顶的运算符弹出并压入到S2中
//                    //并且要再次再次转到while循环中与 s1 中新的栈顶运算符相比较；
//                    s2.push(opTop);
//                }
//            }
//             
//        }//end while
//        //如果s1为空，则直接将当前解析的运算符压入s1
//        s1.push(opThis);
//    }
//     
//    //当前字符是 ')' 时，如果栈顶是'(',则将这一对括号丢弃，否则依次弹出s1栈顶的字符，压入s2，直到遇到'('
//    public void gotParen(char ch){
//        while(!s1.isEmpty()){
//            char chx = s1.pop();
//            if(chx == '('){
//                break;
//            }else{
//                s2.push(chx);
//            }
//        }
//    }
// 
//}
//public class DataStructureTest {
//	public static void main(String[] args) {
//		Scanner scanner=new Scanner(System.in);
//		String iString=scanner.nextLine();
//		InfixToSuffix infixToSuffix=new InfixToSuffix(iString);
//		Mystack mystack2=new Mystack(iString.length());
//		mystack2=infixToSuffix.doTrans();
//		mystack2.displayStack();
//		System.out.println("hello world");
//	}
//}
//链表
//class SingleLinkedList{
//	private int size;
//	private Node head;
//	public SingleLinkedList() {
//		size=0;
//		head=null;
//	}
//	private class Node{
//		private Object data;
//		private Node next;
//		public Node(Object data) {
//			this.data=data;
//		}
//	}
//	public Object addHead(Object object) {
//		Node newNode=new Node(object);
//		if(size==0) {
//			head=newNode;
//		}
//		else {
//			newNode.next=head;
//			head=newNode;
//		}
//		size++;
//		return object;
//	}
//	public Object deleteHead(Object object) {
//		Object object2=head.data;
//		head=head.next;
//		size--;
//		return object;
//	}
//	public Node find(Object obj) {
//		Node current=head;
//		int tempSize=size;
//		while(tempSize>0) {
//			if(obj.equals(current.data)) {
//				return current;
//			}
//			else {
//				current=current.next;
//			}
//			tempSize--;
//		}
//		return null;
//	}
//	public boolean delete(Object value) {
//		if(size==0) {
//			return false;
//		}
//		Node current=head;
//		Node previous=head;
//		while(current.data!=value) {
//			if(current.next==null) {
//				return false;
//			}
//			else {
//				previous=current;
//				current=current.next;
//			}
//		}
//		if(current==head) {
//			head=current.next;
//			size--;
//		}
//		else {
//			previous.next=current.next;
//			size--;
//		}
//		return true;
//	}
//	public boolean isEmpty() {
//		return (size==0);
//	}
//	public void display() {
//		if(size>0) {
//			Node node=head;
//			int tempSize=size;
//			if(tempSize==1) {
//				System.out.println("["+node.data+"->");
//				return;
//			}
//			while(tempSize>0) {
//				if(node.equals(head)){
//					System.out.print("["+node.data+"->");
//					}
//				else if(node.next==null) {
//					System.out.print(node.data+"]");
//				}
//				else {
//					System.out.print(node.data+"->");
//				}
//				node=node.next;
//				tempSize--;
//			}
//		}
//		else {
//			System.out.println("[]");
//		}
//	}
//	public int getSize() {
//		return size;
//	}
//}
//public class DataStructureTest {
//	public static void main(String[] args) {
//		SingleLinkedList singleLinkedList=new SingleLinkedList();
//		singleLinkedList.addHead("1");
//		singleLinkedList.addHead("2");
//		singleLinkedList.addHead("3");
//		singleLinkedList.addHead("4");
//		System.out.println(singleLinkedList.getSize());
//		singleLinkedList.display();
//		System.out.println("hello world");
//	}
//}

import javax.swing.plaf.synth.SynthStyle;

//public class DataStructureTest {
//	public static void main(String[] args) {
//		int[] a= {1,2,3,4,5};
//		System.out.println(findTwoPoint(a,2,0,4));
//	}
	//非递归的二分查找
//	public static int findTwoPoint(int[] array,int key) {
//		int start=0;
//		int last=array.length-1;
//		while(start<=last) {
//			int mid=(start+last)/2;
//			if(key==array[mid]) {
//				return mid;
//			}
//			else if(key>array[mid]) {
//				start=mid+1;
//			}
//			else if(key<array[mid]) {
//				last=mid-1;
//			}
//		}
//		System.out.println("没有目标数字");
//		return -1;
//	}
	//递归的二分查找
//	public static int findTwoPoint(int[] array,int key,int low,int high) {
//		int mid=(low+high)/2;
//		if(low>high) {
//			return -1;
//		}
//		if(key==array[mid]) {
//			return mid;
//		}
//		else {
//			if(key<array[mid]) {
//				return findTwoPoint(array, key, low, mid-1);
//			}
//			else if(key>array[mid]) {
//				return findTwoPoint(array, key, mid+1, high);
//			}
//		}
//		return -1;
//	}
//}
//汉诺塔问题
//public class DataStructureTest {
//	public static void move(int dish,String from,String temp,String to){
//	    if(dish == 1){
//	        System.out.println("将盘子"+dish+"从塔座"+from+"移动到目标塔座"+to);
//	    }else{
//	        move(dish-1,from,to,temp);//A为初始塔座，B为目标塔座，C为中介塔座
//	        System.out.println("将盘子"+dish+"从塔座"+from+"移动到目标塔座"+to);
//	        move(dish-1,temp,from,to);//B为初始塔座，C为目标塔座，A为中介塔座
//	    }
//	}
//	public static void main(String[] args) {
//		move(3, "A", "B", "C");
//		System.out.println("hello world");
//	}
//}
//归并排序非递归
//public class DataStructureTest {
//	public static int[] AddSort(int[] a,int[] b) {
//		int[] c=new int[a.length+b.length];
//		int anum=0;
//		int bnum=0;
//		int cnum=0;
//		while(anum<a.length&&bnum<b.length) {
//			if(a[anum]<b[bnum]) {
//				c[cnum++]=a[anum++];
//			} 
//			else {
//				c[cnum++]=b[bnum++];
//			}
//		}
//		while(anum==a.length&&bnum<b.length) {
//			c[cnum++]=b[bnum++];
//		}
//		while(bnum==b.length&&anum<a.length) {
//			c[cnum++]=a[anum++];
//		}
//		return c;
//	}
//	public static void main(String[] args) {
//		int a[]= {1,2,3,4};
//		int b[]= {2,3,7,8};
//		int c[]=AddSort(a, b);
//		for(int i=0;i<c.length;i++) {
//			System.out.println(c[i]);
//		}
//		System.out.println("hello world");
//	}
//}
//背包问题
public class DataStructureTest{
	private int[] weights;
	private boolean[] selected;
	public DataStructureTest(int[] weights) {
		this.weights=weights;
		selected=new boolean[weights.length];
	}
	public void knapstack(int total,int index) {
		if(total<0||total>0&&index>=weights.length) {
			return;
		}
		if(total==0) {
			for(int i=0;i<index;i++) {
				if(selected[i]==true) {
					System.out.print(weights[i]+" ");
				}
			}
			System.out.println();
			return;
		}
		selected[index]=true;
		knapstack(total-weights[index], index+1);
		selected[index]=false;
		knapstack(total, index+1);
	}
	public static void main(String[] args) {
		int[] array= {11,8,7,1,5};
		int total=20;
		DataStructureTest dataStructureTest=new DataStructureTest(array);
		dataStructureTest.knapstack(total, 0);
	}
}
	