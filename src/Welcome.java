import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.function.IntPredicate;

import javax.swing.colorchooser.ColorChooserComponentFactory;

import org.omg.CORBA.PRIVATE_MEMBER;

import java.awt.EventQueue;
import java.awt.event.*;
import java.io.File;
import java.math.BigInteger;
import java.util.Scanner;

import javax.swing.*;


//public class Welcome {
//	enum size{small,medium,large};
//	static size s=size.small;
//	//String[] args锟斤拷示锟接匡拷锟斤拷台锟斤拷锟杰诧拷锟斤拷锟斤拷java锟斤拷锟斤拷锟斤拷盏锟絤ain锟斤拷锟斤拷锟斤拷锟斤拷javac
//	public static void main(String[] args) {
//		try {
//			int[] a=new int[10];
//			for(int i=0;i<100;i++) {
//				System.out.println(a[i]);
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println("锟斤拷锟斤拷越锟斤拷");
//		}
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				System.out.println(s.large);
//				JFrame frame=new ImageViewerFrame();
//				frame.setTitle("ImageViewer");
//				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//				frame.setVisible(true);
//			}
//		});
//	}
//}
//class ImageViewerFrame extends JFrame {
//	private JLabel label;
//	private JFileChooser chooser;
//	private static final int DEFAULT_WIDTH=300;
//	private static final int DEFAULT_HEIGHT=400;
//	public ImageViewerFrame() {
//		setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
//		label=new JLabel();
//		add(label);
//		chooser=new JFileChooser();
//		chooser.setCurrentDirectory(new File("."));
//		JMenuBar menuBar=new JMenuBar();
//		setJMenuBar(menuBar);
//		
//		JMenu menu=new JMenu("File");
//		menuBar.add(menu);
//		
//		JMenuItem openItem=new JMenuItem("Open");
//		menu.add(openItem);
//		
//		
//		openItem.addActionListener((e)->{
//				// TODO 锟皆讹拷锟斤拷锟缴的凤拷锟斤拷锟斤拷锟�
//				int result=chooser.showOpenDialog(null);
//				if(result==JFileChooser.APPROVE_OPTION) {
//					String name=chooser.getSelectedFile().getPath();
//					label.setIcon(new ImageIcon(name));
//				}
//		});
//		JMenuItem exitItem=new JMenuItem("Exit");
//		menu.add(exitItem);
//		exitItem.addActionListener((e)->{
//				System.exit(0);
//		});
//	}
//}
//锟斤拷锟斤拷锟轿程成硷拷锟斤拷锟轿筹拷锟斤拷锟斤拷锟轿筹拷学锟街ｏ拷锟角凤拷通锟斤拷
class Class{
	protected double score;
	protected String subjectname;
	protected double credit;
	protected boolean passed;
	public Class(String subn,double cre) {
		// TODO 锟皆讹拷锟斤拷锟缴的癸拷锟届函锟斤拷锟斤拷锟�
		this.subjectname=subn;
		this.credit=cre;
	}
	public Class(Class c) {
		// TODO 锟皆讹拷锟斤拷锟缴的癸拷锟届函锟斤拷锟斤拷锟�
		this.subjectname=c.subjectname;
		this.credit=c.credit;
	}
	public void setPassed(boolean p) {
		this.passed=p;
	}
	public void setGrade(double g) {
		this.score=g;
	}
}
//锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟皆憋拷锟角凤拷锟斤拷锟斤拷玫锟斤拷锟斤拷锟�
class Friend{
	protected String friendname;
	protected String friendsex;
	protected boolean bestFriend;
	public Friend(String fn,String fs,boolean bf) {
		this.friendname=fn;
		this.friendsex=fs;
		this.bestFriend=bf;
		// TODO 锟皆讹拷锟斤拷锟缴的癸拷锟届函锟斤拷锟斤拷锟�
	}
	public Friend(Friend friend) {
		this.friendname=friend.friendname;
		this.friendsex=friend.friendsex;
		this.bestFriend=friend.bestFriend;
		// TODO 锟皆讹拷锟斤拷锟缴的癸拷锟届函锟斤拷锟斤拷锟�
	}
}
//锟斤拷锟斤拷锟剿ｏ拷锟斤拷锟斤拷锟竭匡拷锟缴硷拷锟斤拷锟窖伙拷锟窖э拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷椋拷锟斤拷锟斤拷锟�
class Zjuter{
	protected double grade;
	protected double score;
	protected ArrayList<Friend> friends=new ArrayList<>();
	protected int friendcount=0;
	protected int roomnum;
	public Zjuter(double g,double s) {
		
		this.grade=g;
		this.score=s;
	}
	
	public void makeFriend(String fn,String fs,boolean bf) {
		Friend friend=new Friend(fn, fs, bf);
		this.friendcount++;
		this.friends.add(friend);
	}
	
	//选锟斤拷锟斤拷锟斤拷
	public void pickRoom(int room) {
		this.roomnum=room;
	}
}
//锟斤拷锟斤拷锟斤拷耍锟斤拷锟斤拷锟斤拷锟斤拷埽锟斤拷锟窖★拷纬锟斤拷锟斤拷锟窖★拷锟侥课程讹拷锟斤拷
class CS extends Zjuter{
	private String skill;
	public int classpicked=0;
	protected ArrayList<Class> classes=new ArrayList<>();
	public CS(double g, double s,Friend friend[],String s1) {
		// TODO 锟皆讹拷锟斤拷锟缴的癸拷锟届函锟斤拷锟斤拷锟�
		super(g,s);
		this.skill=s1;
	}
	//锟斤拷选锟轿筹拷
	public void pickClass(String subn,double cre) {
		Class class1=new Class(subn,cre);
		this.classes.add(class1);
		this.classpicked++;
	}
	//锟轿加匡拷锟斤拷
	public void takeExam(double s,String classname) {
		for(int i=0;i<this.classes.size();i++) {
			if(this.classes.get(i).subjectname==classname) {
				if(s<60) {
					this.classes.get(i).setPassed(false);
				}
				else
					this.score=this.score+this.classes.get(i).credit;
				    this.classes.get(i).setPassed(true);
				this.classes.get(i).setGrade(s);
			}
		}
	}
}
public class Welcome{
	public static void main(String []args) {
		int countdown=1400;
		while(countdown!=0) {
			if(countdown==1400) {
				CS sj=new CS(633, 0, null,"programmer");
				sj.pickRoom(606);
				sj.pickClass("计算机组成原理", 4);
				sj.pickClass("C++", 3);
				sj.pickClass("操作系统", 3);
				sj.pickClass("编译原理", 5);
				sj.pickClass("数据结构", 4);
				sj.makeFriend("许子顼", "男", true);
				sj.makeFriend("张雄波", "男", true);
				sj.makeFriend("吕哲品", "男", true);
				sj.makeFriend("沈正圆", "男", true);
				sj.makeFriend("沈雷钊", "男", true);
				sj.makeFriend("周权", "男", true);
				for(int i=0;i<sj.classes.size();i++) {
					System.out.println(sj.classes.get(i).subjectname);
				}
				for(int i=0;i<sj.friends.size();i++) {
					System.out.println(sj.friends.get(i).friendname);
				}
				sj.takeExam(90,"计算机组成原理");
				System.out.println(sj.score);
			}
			countdown--;
		}
	}
}