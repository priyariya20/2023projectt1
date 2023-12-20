package org.bik;
//price(), model(), speed(), mileage(), enginePower()
public class  Ninja extends BMW {
	@Override
	public void mileage(int value) {
		System.out.println("BMW mileage:" + value );
	}
	@Override
	public void enginePower(float power) {
		System.out.println("power of car:"+ power);
}
	private void price(long rupees) {
		System.out.println("amount as been deducted:"+ rupees  );
	}
	private void model(String features) {
		System.out.println("features of car :"+ features );
	}
	private void speed(int range) {
		System.out.println("range of car:"+range);

	}
	public static void main(String[] args) {
		Ninja n=new Ninja();
		n.enginePower(78900);
		n.mileage(450);
		n.model("super model");
		n.price(100000);
		n.speed(50);
		
		
	}
}

