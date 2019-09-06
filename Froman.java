package door;

public class Froman {

	public static void main(String[] args) {
		Froman f= new Froman();
		Roman r= new Roman();
		r.get(299, 0);
		System.out.println(r.c);
		String s=r.c.toString();
		f.get(s);
		
		// TODO Auto-generated method stub

	}
     public void get(String s){
    	 int a=0,b=0,c=0;
    	 for(int i=0;i<s.length();i++){
    		 switch(s.charAt(i)){
    		 case 'I':b=1;
                      break;
    		 case 'V':b=5;
    			      break;
    		 case 'X':b=10;
    			      break;
    		 case 'L':b=50;
    			 	  break;
    		 case 'C':b=100;
    			 	  break;
    		 case 'D':b=500;
    			 	  break;
    		 case 'M':b=1000;
			 	      break;
    		 }
    		 if(c<b){
    			 a=a-2*c;
    		 }
    		 c=b;
    		 a=a+b;
    		
    		 
    	 }
    	 System.out.print(a);
     }
}
