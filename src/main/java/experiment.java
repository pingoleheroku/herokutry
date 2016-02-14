import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class experiment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List abc = new ArrayList();
		abc.add("a");
		abc.add("a");
		abc.add("a");
		abc.add(null);
		abc.add(null);
		abc.add(null);
		abc.add(null);
		
		System.out.println(abc.size());
		
		abc.set(1, "s");
		System.out.println(abc);
		//System.out.println(abc.lastIndexOf("a"));
		/*for(int i =10;i<=1000;i=(i*3/2)+1){
			System.out.println(i);
		}*/
		
	}

}
