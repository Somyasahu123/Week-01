class Discount{
	public static void main(String args[]){
		//Create a variable named fee and assign 125000
		double fee = 125000;
		//Create another variable disPer and assign 10 
		double disPer = 10;
		//Calculate disAmt
		double disAmt = (disPer/100)*fee;
		//Calculate disFee
		double disFee = fee - disAmt;
		//Output
		System.out.println("The discount amount is INR " + disAmt + " and final discounted fee is INR " + disFee);
	}
}

