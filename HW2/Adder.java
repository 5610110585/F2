public class Adder {
	private double val;
	public Adder(){
		val = 0.0;

	}
	public void add(double v){
		val += v;

	}
	public double getval(){
		return val;

	}
	public void reset(){
		val = 0.0;
	}
}