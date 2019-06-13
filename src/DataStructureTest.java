import java.util.Deque;
import java.util.Scanner;
//��׺ת��׺
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
//    private Mystack s1;//���������ջ
//    private Mystack s2;//����洢���ջ
//    private String input;
//     
//    //Ĭ�Ϲ��췽��������Ϊ�������׺���ʽ
//    public InfixToSuffix(String in){
//        input = in;
//        s1 = new Mystack(input.length());
//        s2 = new Mystack(input.length());
//    }
//    //��׺���ʽת��Ϊ��׺���ʽ��������洢��ջ�з��أ�������ʾ����׺���ʽ
//    public Mystack doTrans(){
//        for(int j = 0 ; j < input.length() ; j++){
//            System.out.print("s1ջԪ��Ϊ��");
//            s1.displayStack();
//            System.out.print("s2ջԪ��Ϊ��");
//            s2.displayStack();
//            char ch = input.charAt(j);
//            System.out.println("��ǰ�������ַ�:"+ch);
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
//                s1.push(ch);//�����ǰ�ַ���'(',������ջ
//                break;
//            case ')':
//                gotParen(ch);
//                break;
//            default:
//                //1�������ǰ�������ַ��ǲ���������ֱ��ѹ��s2
//                //2��
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
//            if(opTop == '('){//���ջ����'(',ֱ�ӽ�������ѹ��s1
//                s1.push(opTop);
//                break;
//            }else{
//                int prec2;
//                if(opTop == '+' || opTop == '-'){
//                    prec2 = 1;
//                }else{
//                    prec2 = 2;
//                }
//                if(prec2 < prec1){//�����ǰ�������s1ջ����������ȼ��ߣ��������ѹ��s1
//                    s1.push(opTop);
//                    break;
//                }else{//�����ǰ�������ջ���������ͬ����С�����ȼ�����ô��S1ջ���������������ѹ�뵽S2��
//                    //����Ҫ�ٴ��ٴ�ת��whileѭ������ s1 ���µ�ջ���������Ƚϣ�
//                    s2.push(opTop);
//                }
//            }
//             
//        }//end while
//        //���s1Ϊ�գ���ֱ�ӽ���ǰ�����������ѹ��s1
//        s1.push(opThis);
//    }
//     
//    //��ǰ�ַ��� ')' ʱ�����ջ����'(',����һ�����Ŷ������������ε���s1ջ�����ַ���ѹ��s2��ֱ������'('
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
//����
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
	//�ǵݹ�Ķ��ֲ���
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
//		System.out.println("û��Ŀ������");
//		return -1;
//	}
	//�ݹ�Ķ��ֲ���
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
//��ŵ������
//public class DataStructureTest {
//	public static void move(int dish,String from,String temp,String to){
//	    if(dish == 1){
//	        System.out.println("������"+dish+"������"+from+"�ƶ���Ŀ������"+to);
//	    }else{
//	        move(dish-1,from,to,temp);//AΪ��ʼ������BΪĿ��������CΪ�н�����
//	        System.out.println("������"+dish+"������"+from+"�ƶ���Ŀ������"+to);
//	        move(dish-1,temp,from,to);//BΪ��ʼ������CΪĿ��������AΪ�н�����
//	    }
//	}
//	public static void main(String[] args) {
//		move(3, "A", "B", "C");
//		System.out.println("hello world");
//	}
//}
//�鲢����ǵݹ�
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
//��������
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
	