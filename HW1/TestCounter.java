public class TestCounter{
	public static void main(String[] args){
		Counter c = new Counter();
			for(int i=0; i<3; i++){
				while(c.getnumber() < 3){
					c.inc();
					System.out.println(c.getnumber());
				}
				c.reset();
			}
	}
}
