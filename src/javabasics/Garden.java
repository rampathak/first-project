package javabasics;

public class Garden {
	public static void main(String[] args) {
		
		int noofTrees =4;
		boolean hasWatersys = true;
		char gardenstnme ='S';
		float grdntemp =97.5f;
		System.out.println("No of Trees:  " +noofTrees);
		System.out.println(hasWatersys);
		System.out.println(gardenstnme);
		System.out.println(grdntemp);
		

		int [] nums= {2,3,4,5};
		int sum = 0;
		for(int i=0; i<nums.length; i++)
		{ 
			sum=sum+nums[i];
		
		}
		System.out.println(sum);
		
	}
		

}
