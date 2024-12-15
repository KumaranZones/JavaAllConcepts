package org.collectionss2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class IterateTheLinkedList{
	public static void main(String[] args){
		LinkedList list = new LinkedList();

		list.add(100);
		list.add(2345);
		list.add(73645353);
		list.add(87657685748l);
		list.add(7465.80f);
		list.add(657483746554d);
		list.add('S');
		list.add(true);
		list.add("String");

		//ForLoop
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		//ForEachLoop
		for(Object lists : list){
			System.out.println(lists);
		}
		//Iterator
		Iterator iter = list.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		//ListIterator : Forward
		ListIterator liIter = list.listIterator();
		while(liIter.hasNext()){
			System.out.println(liIter.next());
		}
		//ListIterator : Reverse
		while(liIter.hasPrevious()){
			System.out.println(liIter.previous());
		}
		//Descending Iterator : DirectlyReverse
		Iterator<Object> dIter = list.descendingIterator();
		while(dIter.hasNext()){
			System.out.println(dIter.next());
		}
	}
}
