
public class Prvi {

	public static void main(String[] args) {
		double a,b,c,s,p; //deklaracija spremenljivk
		a=BranjePodatkov.preberiDouble();
		b=BranjePodatkov.preberiDouble();
		c=BranjePodatkov.preberiDouble();
		s=BranjePodatkov.preberiDouble();
		p=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println(p);
	}

}
