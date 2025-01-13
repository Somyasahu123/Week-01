class ProfitAndLoss{
	public static void main(String args[]){
		//Initialize the cost price
		int costPrice = 129;
		//Initialize the selling price
		int sellingPrice = 191;
		//Calculate profit
		int profit = sellingPrice - costPrice;
		//Calculate profitPercentage
		double profitPercentage = (double)profit /costPrice * 100;
		//Print the costPrice,sellingPrice,price,and profitPercentage
		System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage);	
	}
}

