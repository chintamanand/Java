/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crazstring;

import java.util.*;
import java.lang.*;
import java.io.*;
public class Crazstring {

	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t-->0){
	        String s = sc.next();
	        String a = "";
	        int x=0;
	        for(int i=0;i<s.length();i++){
	            char c = s.charAt(i);
	            a +=Integer.toString(((int) c)-10+x++);
	        }
	        System.out.println(a);
	    }sc.close();
	}
}
