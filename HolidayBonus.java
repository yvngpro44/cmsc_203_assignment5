package assignment5;
public class HolidayBonus {

	public static double[] calculateHolidayBonus(double[][] data, double high, double low, double other) {
		double[] bonus = new double[data.length];
		int cas = 1;
		
		for (int row = 0; row < bonus.length; row++) 
		{
			double total = 0.0; 

			for (int column = 0; column < data[row].length; column++) //for each column
			{
				if (data[row][column] <= 0)
				{ 
					switch (cas) {
					case 1:
					total += 0; 
					break;
				}}
				else if (data[row][column] == TwoDimRaggedArrayUtility.getHighestInColumn(data, column)) //if sales was highest
				{
					total += high; 
				}

				else if (data[row][column] == TwoDimRaggedArrayUtility.getLowestInColumn(data, column)) //if sales were lowest
				{
					total += low; 
				}

				else total += other; 
			}
			bonus[row] = total; 
		}
		return bonus; 
	}

	public static double calculateTotalHolidayBonus(double[][] data, double high, double low, double other) {
		double[] bonus; 
		bonus = calculateHolidayBonus(data, high, low, other); 
		
		double total = 0; 
		for (int count = 0; count < bonus.length; count++) {
			total += bonus[count];
		}
		return total; 
	}
}

