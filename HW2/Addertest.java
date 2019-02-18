public class Addertest{
	public static void main (String[] args){
		Adder a = new Adder();
		a.add(2);
		a.add(3);
		System.out.println(a.getval());
		a.add(1);
		System.out.println(a.getval());
		a.reset();
		System.out.println(a.getval());
	}
}
