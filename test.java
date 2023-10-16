
public class test {
	public static void main(String[] args) {
		ArrayList <Character> ar = new ArrayList();
		ar.add(0,'A');
		ar.add(0,'B');
		ar.get(1);
		System.out.println("Get  : "+ar.get(1));
		System.out.println("Error");
		//ar.set(2,'C');
		ar.add(2,'C');
		System.out.println("Error");
		//ar.add(4,'D');
		System.out.println("Remove  :"+ar.remove(1));
		ar.remove(1);
		ar.add(1,'D');
		ar.add(1,'E');
		//ar.get(4);
		System.out.println("Error");
		System.out.println("Set  :"+ar.set(2,'G'));
		System.out.println("Get  :"+ar.get(2));
	}

}