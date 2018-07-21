package com.github.karuturirs;

class TestJoinMethod1 extends Thread{  
	 public void run(){  
	  for(int i=1;i<=5;i++){  
	   try{  
	    Thread.sleep(500);  
	   }catch(Exception e){System.out.println(e);}  
	  System.out.println(this.getName()+"--"+i);  
	  }  
	 }
	 
	 
	public static void main(String args[]){  
	 TestJoinMethod1 t1=new TestJoinMethod1();
	 t1.setName("t1");
	 TestJoinMethod1 t2=new TestJoinMethod1();  
	 t2.setName("t2");
	 TestJoinMethod1 t3=new TestJoinMethod1();  
	 t3.setName("t3");
	 
	 
	  
	 t2.start();  
	 t1.start();  
	 try{  
		  t1.join();  
		 }catch(Exception e){System.out.println(e);}  
	 t3.start();  
	 }  
	}