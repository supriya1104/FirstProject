package com.interview.practise;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String st = "priya";
		char c[] = st.toCharArray();
		for(int i=c.length-1; i>=0 ;i--)
		{
		System.out.println(c[i]);	
		}
	}

}
