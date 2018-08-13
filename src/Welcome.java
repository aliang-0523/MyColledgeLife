import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Calendar;
//import java.util.GregorianCalendar;
//import java.util.HashMap;
//import java.util.function.IntPredicate;
//
//import javax.swing.colorchooser.ColorChooserComponentFactory;
//
//import org.omg.CORBA.PRIVATE_MEMBER;
//
//import java.awt.EventQueue;
//import java.awt.event.*;
//import java.io.File;
//import java.math.BigInteger;
//import java.util.Scanner;
//
//import javax.swing.*;
import java.util.Date;

class Class1{
	protected double score;
	protected String subjectname;
	protected double credit;
	protected boolean passed;
	public Class1(String subn,double cre) {
		this.subjectname=subn;
		this.credit=cre;
	}
	public Class1(Class1 c) {
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
class Friend{
	protected String friendname;
	protected String friendsex;
	protected boolean bestFriend;
	public Friend(String fn,String fs,boolean bf) {
		this.friendname=fn;
		this.friendsex=fs;
		this.bestFriend=bf;
	}
	public Friend(Friend friend) {
		this.friendname=friend.friendname;
		this.friendsex=friend.friendsex;
		this.bestFriend=friend.bestFriend;
	}
}
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
	
	public void pickRoom(int room) {
		this.roomnum=room;
	}
	
}
class CS extends Zjuter{
	private String skill;
	public int classpicked=0;
	protected ArrayList<Class1> classes=new ArrayList<>();
	public CS(double g, double s,Friend friend[],String s1) {
		super(g,s);
		this.skill=s1;
	}
	public void pickClass(String subn,double cre) {
		Class1 class1=new Class1(subn,cre);
		this.classes.add(class1);
		this.classpicked++;
	}
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
enum Size{
	SMALL,MEDIUM,LARGE
}
public class Welcome{
	public static Object goodCopyof(Object a,int newLength) {
		Class<? extends Object> class1=a.getClass();
		if(!class1.isArray())return null;
		Class<?> componentType=class1.getComponentType();
		int length=Array.getLength(a);
		Object newArray=Array.newInstance(componentType, newLength);
		System.arraycopy(a, 0, newArray, 0, Math.min(length, newLength));
		return newArray;
	}
	public static void main(String []args) {
		Size size[]=Size.values();
		System.out.println(size[0]);
		int countdown=1400;
		while(countdown!=0) {
			if(countdown==1400) {
				CS sj=new CS(633, 0, null,"programmer");
				sj.pickRoom(606);
				Class<? extends CS> class1=sj.getClass();
				System.out.println(class1.getDeclaredMethods()[0]);
				System.out.println(Modifier.isPublic(class1.getModifiers()));
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