package com.interview.practise;

public class Threads {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
		{
  threadingDemo t = new threadingDemo();
  t.start();
	}
	}

}

class threadingDemo extends Thread
{
	public void run()
	{
		try
		{
			System.out.println(Thread.currentThread().getId());
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
