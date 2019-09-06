public class rabbit {
	public static void main(String[] args) {
		 Rthread r1= new Rthread(1000);
		 Rrunnable rab= new Rrunnable(1000);	 
		 Rthread2 r2 =new Rthread2(58);
		 Rthread r3 =new Rthread(rab);
		 r2.start();
		 r1.start();
		 r3.start();
		 System.out.println("第一次更改");
		 System.out.println("第二次更改");
	}

	public int amount(int month){
		if(month==0|month==1||month==2){
			return 1;
		}
		
		else return amount(month-1)+amount(month-3);
		
	}
	public int newamount(int month){
		if(month==0|month==1||month==2){
			return 1;
		}
		else{ 
			int b=1,c=2,d=3,e;
			for(int i=4;i<month;i++){
				    e=d;
				    d=d+b;
				    b=c;
				    c=e;
					}
			return d;
		}
	}
}
class Rrunnable implements Runnable{
   int month;
   public Rrunnable(int month){
	   this.month=month;
   }
	@Override
	public void run() {
		// TODO Auto-generated method stub
		long startTime=System.currentTimeMillis();   //获取开始时间
		 if(month==0|month==1||month==2){
				System.out.println("Runnable得到数据："+1);
			}
			else{ 
				double b=1,c=2,d=3,e;
				for(double i=4;i<month;i++){
					    e=d;
					    d=d+b;
					    b=c;
					    c=e;
						}
				System.out.println("Runnable得到数据："+d);
			}
		 long endTime=System.currentTimeMillis(); //获取结束时间
		 System.out.println("Runnable程序运行时间： "+(endTime-startTime)+"ms");
		
		
	}
}
 class Rthread extends Thread{
	 int month;
	 public void run(){
         long startTime=System.currentTimeMillis();   //获取开始时间
		 if(month==0|month==1||month==2){
				System.out.println("new得到数据："+1);
			}
			else{ 
				double b=1,c=2,d=3,e;
				for(double i=4;i<month;i++){
					    e=d;
					    d=d+b;
					    b=c;
					    c=e;
						}
				System.out.println("new得到数据："+d);
			}
		 long endTime=System.currentTimeMillis(); //获取结束时间
		 System.out.println("new程序运行时间： "+(endTime-startTime)+"ms");
	 }
	 public Rthread(int month){
		   this.month=month;
	 }
	public Rthread(Rrunnable rab) {
		 super(rab);
	}
}
class Rthread2 extends Thread{
	 int month;
	 public void run(){
		   long startTime=System.currentTimeMillis();   //获取开始时间
		 System.out.println("得到数据："+this.amount(month));
		 long endTime=System.currentTimeMillis(); //获取结束时间
		 System.out.println("程序运行时间： "+(endTime-startTime)+"ms");
	 }
		public double amount(int month){
			if(month==0|month==1||month==2){
				return 1;
			}
			
			else return amount(month-1)+amount(month-3);
			
		}
	 public Rthread2(int month){
		   this.month=month;
	 }
}
