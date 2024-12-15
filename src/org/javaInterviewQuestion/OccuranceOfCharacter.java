package org.javaInterviewQuestion;

import java.util.TreeMap;
import java.util.TreeSet;

public class OccuranceOfCharacter{
	public static void main(String[] args){
		String s = "java";

		TreeMap<Character,Integer> map = new TreeMap();

		char[] chars = s.toCharArray();
		for(Character ch : chars){
			if(!map.containsKey(ch)){
				map.put(ch,1);
			}else{
				map.put(ch,map.get(ch)+1);
			}
		}
		System.out.println(map);
}
}

