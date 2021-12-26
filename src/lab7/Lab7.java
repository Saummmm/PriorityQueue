/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.util.Date;

/**
 *
 * @author saum
 */
public class Lab7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        //create priority queue object
        PriorityQueue reg = new PriorityQueue();
        //create time for the first regular input
        Date date1 = new Date();
        //get time for the first input, and convert to integer
        reg.insert(Math.abs((int) date1.getTime()), "Alice");
        // input emergency level 3
        reg.insert(3, "Bob");
        Date date2 = new Date();
        reg.insert(Math.abs((int) date2.getTime()), "Cat");
        Date date3 = new Date();
        reg.insert(Math.abs((int) date3.getTime()), "Dan");
        //input emergency level 1
        reg.insert(1, "Eric");
        //output by removing smallest, or the first value in the queue
        while (reg.size() > 0) {
            System.out.println(reg.removeMin().getValue());
        }
    }

}
