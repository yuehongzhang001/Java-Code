
public class Testc {

	public static int[] getNumber(int... values)
	{
		
		int[] array=new int[values.length];
		for(int i=0; i<values.length; i++)
			array[i]=values[i];
		return array;
	}
	
	public static void main(String[] args) {
		int[] array = Testc.getNumber(1,2,3,4);
		for(int i: array) {
			System.out.println(i+"\t");
		}
	}
}

