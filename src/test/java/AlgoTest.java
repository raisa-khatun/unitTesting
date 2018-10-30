package test.java;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

//import junit.framework.Assert;

import java.util.Arrays; 
import main.java.Item;
import main.java.SortAlgos;
import main.java.SortDemoData;

public class AlgoTest {
	/*Test case 1 vec=[] implemented, covers node,condition,branch */
	@Test(expected=NullPointerException.class)
	public void testSequenceOne() {
		SortDemoData sortDemoData=new SortDemoData();
		sortDemoData.myArray=null;
		SortAlgos.bubbleSort(sortDemoData.myArray);
		SortAlgos.insertionSort(sortDemoData.myArray);
		SortAlgos.selectionSort(sortDemoData.myArray);
		SortAlgos.mergeSort(sortDemoData.myArray);
		SortAlgos.quickSort(sortDemoData.myArray);
		SortAlgos.heapSort(sortDemoData.myArray);
		Assert.fail();
	/*	sortDemoData.runAlgo(0);
		
		sortDemoData.runAlgo(1);
		assertTrue(sortDemoData.myArray==null);
		sortDemoData.runAlgo(2);
		assertTrue(sortDemoData.myArray==null);
		sortDemoData.runAlgo(3);
		assertTrue(sortDemoData.myArray==null);
		sortDemoData.runAlgo(4);
		assertTrue(sortDemoData.myArray==null);
		sortDemoData.runAlgo(5);
		assertTrue(sortDemoData.myArray==null); */
		
		}
	/*Test case 2, vec=[10,9,8,7,11,12] implemented, covers node,condition,branch*/
	@Test
	public void testSequenceTwoBubble() {
		Item key1=new Item(10);
		Item key2=new Item(9);
		Item key3=new Item(8);
		Item key4=new Item(7);
		Item key5=new Item(11);
		Item key6=new Item(12);
		Item[] items= {key1,key2,key3,key4,key5,key6,key6};
		Item[] expected= {key4,key3,key2,key1,key5,key6,key6};
		SortDemoData sortDemoData=new SortDemoData();
		sortDemoData.myArray=items;
		sortDemoData.runAlgo(0);
		
		assertTrue("..bubble sort",Arrays.equals(sortDemoData.myArray, expected));
		
	
	}
	
	@Test
	public void testSequenceTwoInsertion() {
		Item key1=new Item(10);
		Item key2=new Item(9);
		Item key3=new Item(8);
		Item key4=new Item(7);
		Item key5=new Item(11);
		Item key6=new Item(12);
		Item[] items= {key1,key2,key3,key4,key5,key6,key6};
		Item[] expected= {key4,key3,key2,key1,key5,key6,key6};
		SortDemoData sortDemoData=new SortDemoData();
		sortDemoData.myArray=items;
		sortDemoData.runAlgo(2);
		assertTrue("..insertion sort",Arrays.equals(sortDemoData.myArray,expected));
	}
	@Test
	public void testSequenceTwoSelection() {
		Item key1=new Item(10);
		Item key2=new Item(9);
		Item key3=new Item(8);
		Item key4=new Item(7);
		Item key5=new Item(11);
		Item key6=new Item(12);
		Item[] items= {key1,key2,key3,key4,key5,key6,key6};
		Item[] expected= {key4,key3,key2,key1,key5,key6,key6};
		SortDemoData sortDemoData=new SortDemoData();
		sortDemoData.myArray=items;
		sortDemoData.runAlgo(1);
		assertTrue("..selection sort",Arrays.equals(sortDemoData.myArray,expected));
	}
	
	@Test
	public void testSequenceTwoMerge() {
		Item key1=new Item(10);
		Item key2=new Item(9);
		Item key3=new Item(8);
		Item key4=new Item(7);
		Item key5=new Item(11);
		Item key6=new Item(12);
		Item[] items= {key1,key2,key3,key4,key5,key6,key6};
		Item[] expected= {key4,key3,key2,key1,key5,key6,key6};
		SortDemoData sortDemoData=new SortDemoData();
		sortDemoData.myArray=items;
		sortDemoData.runAlgo(3);
		assertTrue("..merge sort",Arrays.equals(sortDemoData.myArray,expected));
	}
	@Test
	public void testSequenceTwoQuick() {
		Item key1=new Item(10);
		Item key2=new Item(9);
		Item key3=new Item(8);
		Item key4=new Item(7);
		Item key5=new Item(11);
		Item key6=new Item(12);
		Item[] items= {key1,key2,key3,key4,key5,key6,key6};
		Item[] expected= {key4,key3,key2,key1,key5,key6,key6};
		SortDemoData sortDemoData=new SortDemoData();
		sortDemoData.myArray=items;
		sortDemoData.runAlgo(4);
		assertTrue("..Quick sort",Arrays.equals(sortDemoData.myArray,expected));
	}
	@Test
	public void testSequenceTwoHeap() {
		Item key1=new Item(10);
		Item key2=new Item(9);
		Item key3=new Item(8);
		Item key4=new Item(7);
		Item key5=new Item(11);
		Item key6=new Item(12);
		Item[] items= {key1,key2,key3,key4,key5,key6,key6};
		Item[] expected= {key4,key3,key2,key1,key5,key6,key6};
		SortDemoData sortDemoData=new SortDemoData();
		sortDemoData.myArray=items;
		sortDemoData.runAlgo(5);
		assertTrue("..heap sort",Arrays.equals(sortDemoData.myArray,expected));
	}




}
