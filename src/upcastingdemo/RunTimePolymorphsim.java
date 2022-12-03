package upcastingdemo;

class RBIBank
{
	int rateOfInterest()
	{
		return 3;
	}
}

class SBI extends RBIBank
{
	int rateOfInterest()
	{
		return 5;
	}
	
	void holiday()
	{
		System.out.println("sat sun holiday");
	}
}
class Kotak extends RBIBank
{
	
}





public class RunTimePolymorphsim {

	public static void main(String[] args) {
		
		//upcasting
		//reference of parent , object of child
		
		RBIBank bank = new SBI();
		System.out.println(bank.rateOfInterest());
		
	}
}
