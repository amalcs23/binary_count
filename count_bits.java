/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
//import java.lang.Math.*;

/* Name of the class has to be "Main" only if the class is public. */

class Codechef
{
   
static int no_bits(int n){
    int count=0;
    while(n>0){
        n>>=1;
        count++;
    }
    return count;
}
static int set_bits(int n){
    int count=0;
    while(n>0){
        n&=(n-1);
        count++;
    }
    return count;
}
	public static void main (String[] args) throws java.lang.Exception
	{
	int n=3,set=2,bi=1111;
    //int res=Integer.parseInt(bin(bi));
    System.out.printf("The Numbers having length %d and %d set bits \n",n,set);
    for(int i=0;i<16;i++){
        if(n==no_bits(i) && set==set_bits(i)){
            System.out.println(i);
        }
    }
	//System.out.println(bin(bi));
	}
}
