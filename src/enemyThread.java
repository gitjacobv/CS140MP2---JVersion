
public class enemyThread extends Thread{
	
	volatile Enemy enemy;
	volatile int sleeptime;
	volatile boolean needSleep;
	volatile boolean isSleeping;
	
	public enemyThread(){
		this.enemy = null;
		this.sleeptime = 600;
		this.isSleeping = false;
	}
	
	public enemyThread(Enemy enemy){
		this.enemy = enemy;
		this.sleeptime = 600;
	}
	
	public void setEnemy(Enemy enemy){
		this.enemy = enemy;
	}
	
	public void run(){
		while(true){
		//	System.out.println("");
			if(enemy != null && enemy.getAttacking()){
				System.out.println("SOMETHING SHOULD BE HAPPENING");
				this.isSleeping = true;
				toSleep(sleeptime);
				enemy.isIdle = true;
				toSleep(1000);
				enemy.setAttacking(false);
				enemy.isIdle = false;
				this.isSleeping = false;
			}
			
			if(enemy!= null && enemy.getCurrentHP() <= 0){
				System.out.println("SOMETHING DIED!");
				this.isSleeping = true;
				toSleep(600);
				enemy.isDead = true;	
				this.isSleeping = false;
				this.enemy = null;
			}
		}
	}
	
	public void setSleepTime(int sleeptime){
		this.sleeptime = sleeptime;
	}
	
	public void setNeedSleep(boolean needSleep){
		this.needSleep = needSleep;
	}
	
	public boolean getNeedSleep(){
		return this.needSleep;
	}
	
	public void toSleep(int miliseconds){
		try{
			System.out.println("HINDI NATUTULOG YUNG THREAD");
			Thread.sleep(miliseconds);
		}catch(Exception e){}
	}
}
