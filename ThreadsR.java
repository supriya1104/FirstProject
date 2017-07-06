package com.interview.practise;

public class ThreadsR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Thread t = new Thread(new ThreadingDemo1());
     t.start();
	}

}
class ThreadingDemo1 implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try
		{
			System.out.println(Thread.currentThread().getId());
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
}