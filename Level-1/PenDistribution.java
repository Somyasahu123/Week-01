class PenDistribution{
	public static void main(String args[]){
		//creating a int variable pens and assign number of pens
		int pens = 14;
		
		//creating a int variable student and assign number of students
		int student = 3;
		
		//creating a int variable havingPen for calculating equal   distribution of pens
		int havingPen = pens/student;
		
		//creating a int variable remainingPens for calculating remaining pens which is not distributed 
		int remainingPens = pens - (havingPen * student);
		
		//Output
		System.out.println("The Pen Per Student is " + havingPen + " and the remaining pen not distributed is " + remainingPens);
	}
}


