/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string.compare;

/**
 *
 * @author karan
 */
public class StringCompare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s = "hello";
        String s1 = "hi";
        System.out.println("for == "+(s == null ? s1 == null : s.equals(s1)));
        System.out.println("for equals: "+s.equals(s1));
        System.out.println("for compareTo: "+s.compareTo(s1));
        System.out.println("for equalsIgnoreCase: "+s.equalsIgnoreCase(s1));
    }
    
}

