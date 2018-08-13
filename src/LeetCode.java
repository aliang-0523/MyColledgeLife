import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

import javax.swing.plaf.SliderUI;

import org.omg.CORBA.PUBLIC_MEMBER;

class Solution {
	//三数之和
//    public List<List<Integer>> threeSum(int[] nums) {
//    	int sun=0;
//    	Arrays.sort(nums);
//    	HashSet<ArrayList<Integer>> hs=new HashSet<ArrayList<Integer>>();
//    	//先排序
//    	Arrays.sort(nums);//-1,-1,0,1,2,4
//    	//再查找
//            int[] a=nums;
//            int[] b=nums;
//            int[] c=nums;       
//            int i,j,k;
//            for(k=0;k<nums.length;k++){
//                i=0;//指向First
//                j=nums.length-1;//指向Last
//                while(i<j && i!=k && j!=k){
//                	if(a[i]+b[j]+c[k]>0){
//                		j--;
//                	}else if(a[i]+b[j]+c[k]<0){
//                		i++;
//                	}else{
//                		ArrayList<Integer> e=new ArrayList<Integer>();
//                		e.add(a[i]);
//                		e.add(b[j]);
//                		e.add(c[k]);
//                		Collections.sort(e);
//                		hs.add(e);
//                		i++;//向右移动
//                		j--;//向左移动
//                	}
//                }
//            }
//            //将HashSet转化为ArrayList
//            List<List<Integer>> list2=new LinkedList<>(hs);
//		return list2;
//    }
	//矩阵置0
//	public void setZeroes(int[][] matrix) {
//		ArrayList<Integer> a=new ArrayList<Integer>();
//		ArrayList<Integer> b=new ArrayList<Integer>();
//        for(int i=0;i<matrix.length;i++) {
//        	for(int j=0;j<matrix[i].length;j++) {
//        		if(matrix[i][j]==0) {
//        			a.add(i);
//        			b.add(j);
//        		}
//        	}
//        }
//        for(int k=0;k<a.size();k++) {
//        	for(int z=0;z<matrix[0].length;z++) {
//        		matrix[a.get(k)][z]=0;
//        	}
//        }
//        for(int c=0;c<matrix.length;c++) {
//        	for(int h=0;h<b.size();h++) {
//        		matrix[c][b.get(h)]=0;
//        	}
//        }
//    }
	//字谜分组
//	public List<List<String>> groupAnagrams(String[] strs) {
//        if(strs==null || strs.length == 0){
//            return new ArrayList<List<String>>();
//        }
//        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
//        for (String s:strs) {
//            char[] ca = s.toCharArray();
//            Arrays.sort(ca);
//            String keyStr = String.valueOf(ca);
//            if(!map.containsKey(keyStr))
//                map.put(keyStr, new ArrayList<String>());
//            map.get(keyStr).add(s);
//        }
//        for(String key: map.keySet()) {
//            Collections.sort(map.get(key));
//        }
//        return new ArrayList<List<String>>(map.values());
//    }
	//无重复字符的最长子串
//	public int lengthOfLongestSubstring(String s) {
//		int maxlength=0;
//		if(s.length()==1) {
//			maxlength=1;
//		}
//		for(int i=0;i<s.length();i++) {
//			for(int j=i+1;j<=s.length();j++) {
//				String s1=s.substring(i, j);
//				if(!containssameKey(s1)) {
//					if(j-i>maxlength)
//						maxlength=j-i;
//				}
//			}
//		}
//        return maxlength;
//    }
//	public boolean containssameKey(String s) {
//		char[] chs=s.toCharArray();
//		if(s.length()>=1) {
//			for(int i=0;i<chs.length;i++) {
//				for(int j=i+1;j<chs.length;j++) {
//					if(chs[i]==chs[j]) {
//						return true;
//					}
//				}
//			}
//		}
//		return false;
//	}
	//标准最长无重复字符串
//	public int lengthOfLongestSubstring(String s) {
//			 	int n = s.length(), ans = 0;
//			 	Map<Character, Integer> map = new HashMap<>(); // current index of character
//			 	// try to extend the range [i, j]
//			 	for (int j = 0, i = 0; j < n; j++) {
//			 		if (map.containsKey(s.charAt(j))) {
//			 			i = Math.max(map.get(s.charAt(j)), i);
//			 		}
//			 		ans = Math.max(ans, j - i + 1);
//			 		map.put(s.charAt(j), j + 1);
//			 	}
//			 	return ans;
//	}
	//最长回文子串
	public String longestPalindrome(String s) {
		String substr=null;
        return substr;
    }
}
public class LeetCode{
	public static void main(String[] args) {
		String s= "pwk";
		Solution solution=new Solution();
		System.out.println(solution.longestPalindrome(s));
	}
}