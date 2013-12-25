
public class TestClass 
{
	private static int mInstanceCtr = 0;
	private int mInstanceNumber;
	
	private String mInstanceName;
	
	public TestClass()
	{
		mInstanceNumber = mInstanceCtr;
		mInstanceCtr++;
		
		mInstanceName = "TestClass_Instance_" + mInstanceNumber;
	}
	
	public int getInstanceNumber()
	{
		return mInstanceNumber;
	}
	
	public int getInstanceCount()
	{
		return mInstanceCtr;
	}
	
	public String getInstanceName()
	{
		return mInstanceName;
	}
}
