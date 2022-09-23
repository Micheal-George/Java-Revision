package demo;

public class ClassN extends Demo {
	
	
	 public void sample(int a,int... data){
	      for(int i:data)
	    	  System.out.println(i);
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ClassN d=new ClassN();
d.sample(1);


	}
}
