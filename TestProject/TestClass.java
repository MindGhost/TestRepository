
public class TestClass 
{
	private static int mInstanceCtr = 0;
	private int mInstanceNumber;
	
	public TestClass()
	{
		mInstanceNumber = mInstanceCtr;
		mInstanceCtr++;
	}
	
	public int getInstanceNumber()
	{
		return mInstanceNumber;
	}
	
	public int getInstanceCount()
	{
		return mInstanceCtr;
	}
}
