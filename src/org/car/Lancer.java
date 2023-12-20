package org.car;
//seater(), window(), mileage(), enginePower(), price(), 
public class Lancer extends Skoda {
	@Override
	public void price(long rate) {
		System.out.println("rate of car:"+ rate); 
	}
	private void enginePower(double power) {
		System.out.println("enginepower:"+ power);
	}
	private void mileage() {
		System.out.println("234");
	}
	private void Window() {
		System.out.println("four window");
	}
	private void seater() {
		System.out.println("6 seater");
	}
	public static void main(String[] args) {
		Lancer l=new Lancer();
		l.enginePower(78.23);
		l.mileage();
		l.model("trend model");
		l.price(2000000);
		l.seater();
		l.Window();
	}
}

