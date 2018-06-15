import java.util.HashMap;
import java.util.Map;

class TestCallRun2 extends Thread{  
 public void run(){  
  for(int i=1;i<5;i++){  
    try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  
    System.out.println(i);  
  }  
 }  
 public static void main(String args[]){  
	 
	
	 
  /*TestCallRun2 t1=new TestCallRun2();  
  TestCallRun2 t2=new TestCallRun2();  
   
  */
  /*
   * Each thread starts in a separate call stack.
Invoking the run() method from main thread, 
the run() method goes onto the current call stack 
rather than at the beginning of a new call stack.
   */
 // t1.run();  
  //t2.run();  
  
  /*
   * no context-switching 
   * because here t1 and t2 will be treated as normal object 
   * not thread object.

   */
 }  
}  