package Array;

import java.util.TreeSet;

public class Panagram {
	public static void main(String[] args) {
//     String str="the quick brown fox jumps over lazy dog";
		String str="i am not an panagram";
     str=str.replaceAll(" ","");
     TreeSet<Character> t1=new TreeSet<>();
     for(int i=0;i<str.length();i++)
     {
    	 t1.add(str.charAt(i));
     }
     if(t1.size()==26)
     {
    	 System.out.println("panagram");
     }
     else
     {
    	 System.out.println("not panagram");
     }
	}

}
