/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.frostburg.cosc310.lab00;
import java.util.ArrayList;
import java.util.LinkedList;
/**
 *
 * @author Noah Dell
 */
public class DellNLab00 implements Lab00 {

    /**
     * Makes a long string using Java concatenation.
     * @param size the # of times
     * @return how long it took
     */
    @Override
    public long problem0(int size) {
        System.out.println("This is just an example, but please follow this template.");
        String s = "";
        long start = System.currentTimeMillis();

        for (int i=0; i<size; i++) {
            s = s + i;
        }
        
        long end = System.currentTimeMillis();
        return end - start;
    }

    /**
     * Makes a long string using Java StringBuilder
     * @param size the # of times
     * @return how long it took
     */
    @Override
    public long problem1(int size) {
        StringBuilder sb = new StringBuilder();
        long start = System.currentTimeMillis();

        for (int i=0; i<size; i++) {
            sb.append(i);
        }
        
        long end = System.currentTimeMillis();
        return end - start;
    }

    @Override
    public long problem2() {
        ArrayList<String> strings= new ArrayList<String>();
        long start=System.currentTimeMillis();
        for( int i=0; i<10000000; i++){
            strings.add(Integer.toString(i));
        }
        long end1 = System.currentTimeMillis();
        long Time1=end1-start;
        System.out.println("Time1 arraylisr: "+Time1+" milliseconds"); // getting the total time in the arraylist
        
        LinkedList<String> llist = new LinkedList<String>();
        long st=System.currentTimeMillis();
        for(int i=0; i<10000000;i++){
            llist.add(Integer.toString(i));
        }
        long end2 = System.currentTimeMillis();
        long Time2=end2-st;
        System.out.println("Time2 linklist: "+Time2+" milliseconds");// getting the total time in the loinkedList
        System.out.println("The difference in the times is: ");
        return Math.abs(Time1-Time2);
        // need abs because it will give you a negative number if you want
        
        // really large numbers- afrraylist is faster
        // small list of numbers- linkedlist is faster
        
        // Next we have to calculate The time values and compare them
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          
        /**create an arraylist
        *create a linked list
        *make both take type string
        *start and end time
        *for (int i=0; i<size; i++) {
            sb.append(i);
        *}
        *long end = System.currentTimeMillis();
        *return end - start;
        *create two different for loops, one for each of your declarations
        *add the urrent "i" data into your arraylist
        *determine the time it took to loop through
        *compare the times of arraylist and linkedlist
        */
      
        
        
    }
        
    
}

