package pan.xu.杂七杂八;

public class sleep {
  public static void main(String[] args) {
  	int[] a={100,300,200,50,10,500};
  	mythread xupan=new mythread();
  	xupan.setTime(a);
	  for(int i=0;i<a.length;i++){
	  	new Thread(xupan,"thread"+i).start();
	  }
  }
}

class mythread implements Runnable{
	static int flag=0;
	static int[] time;
	void setTime(int[]time){
		this.time=time;
	}
	@Override
	public void run() {
		int i;
		synchronized(this){
			i=flag;
			flag++;
		}
		try{
		Thread.sleep(time[i]);
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			System.out.println(time[i]);
			flag++;
			}
	}
}