/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.myqueue.MyPriorityQueue;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue pq = new MyPriorityQueue();
        pq.push("ABHISHEK GUPTA", 1);
        pq.push("ABHI GUPTA", 5);
        pq.push("A GUPTA", 2);
        pq.push("EK GUPTA", 9);
        pq.push("AB GUPTA", 7);
        pq.push("SHEK GUPTA", 10);
        pq.push("H GUPTA", 0);

        pq.display();


    }
}
