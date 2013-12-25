
public class TestApp 
{
	public static void main(String[] arg)
	{
		TestClass inst1 = new TestClass();
		TestClass inst2 = new TestClass();
		TestClass inst3 = new TestClass();
		
		System.out.println("Instance 1 number: " + inst1.getInstanceNumber());
		System.out.println("Instance 2 number: " + inst2.getInstanceNumber());
		System.out.println("Instance 3 number: " + inst3.getInstanceNumber());
		System.out.println("Instance 1 count: " + inst1.getInstanceCount());
		System.out.println("Instance 2 count: " + inst2.getInstanceCount());
		System.out.println("Instance 2 count: " + inst3.getInstanceCount());
	}
}
