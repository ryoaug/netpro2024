public class HybridCarImpl implements ICar,IElectricCharge,INavigation{
    int b=50;
    int sp=5;
    
    public static void main(String[] args){
    	HybridCarImpl masaCar= new  HybridCarImpl();

    	ICar car=(ICar) masaCar;
    	car.setSpeed(60);
    	car.printCarName();
    	
    	IElectricCharge charger =(IElectricCharge) masaCar;
    	charger.chargeBattery(100);

        INavigation navi = (INavigation) masaCar;
        navi.setDistination("海老名");
    
    }
    
    
	@Override
	public void chargeBattery(int b) {
		this.b=b;
		
	}

	@Override
	public int getAllBattery() {
	
		return b;
	}

	@Override
	public int consumeBattery(int b) {
		this.b-=b;
		return this.b;
	}

	@Override
	public void setSpeed(int sp) {
		this.sp=sp;
		
	}

	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return sp;
	}

	@Override
	public void printCarName() {
		System.out.println("masacar");
		
	}

    @Override
    public void setDistination(String s){
        System.out.println("目的地は" + s);
    }

    @Override
    public void printRoute(){

    }
}
