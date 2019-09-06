package door;

import java.util.Random;

public class Poke {
	static int []s;
	

	public static void main(String[] args) {
		Poke p=new Poke();
		p.see();
		System.out.println("第一次修改");
		
	}
	
	public Poke(){
		s=new int [53];
		for(int i=1;i<=52;i++)s[i]=i;
		this.xi();
	}
	public void xi(){
		Random r= new Random();
		for(int j=1;j<=52;j++){
			int k;
			k=r.nextInt(52);
			while(k==0){
				k=r.nextInt(52);	
			};
			s[j]=k;		
		}	
	}
	public void see(){
		for(int i=1;i<=52;i++){
					switch((s[i]-1)/13){
							case 0:
								System.out.print("桃花");
								break;
							case 1:
								System.out.print("红心");
								break;
							case 2:
								System.out.print("方块");
								break;
							case 3:
								System.out.print("梅花");
								break;
									}	
					
					switch(s[i]%13){
							case 1:
								System.out.println("A 第"+i+"张");
								break;
							case 0:
								System.out.println("K 第"+i+"张");
								break;
							case 11:
								System.out.println("j 第"+i+"张");
								break;
							case 12:
								System.out.println("Q 第"+i+"张");
								break;
							default:
								System.out.println(s[i]%13+" 第"+i+"张");
					
							}
							}
					}

}
