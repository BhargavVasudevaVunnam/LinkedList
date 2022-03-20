import java.util.*;
public class Using {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	LinkedList a=new LinkedList();
	while(true) {
		System.out.println("1.insert 2.show 3.deletebyposition 4.delete by key");
		int op=in.nextInt();
		if(op==1) {
			a.add(in.nextInt());
		}
		else if(op==2) {
			a.show();
		}
		else if(op==3) {
			a.removebyindex(in.nextInt());
		}
		else if(op==4) {
			a.removebykey(in.nextInt());
		}
		else {
			System.out.println("Wrong Option");
		}
	}
}
}
