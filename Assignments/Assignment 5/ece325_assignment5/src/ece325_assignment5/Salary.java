package ece325_assignment5;

public class Salary {
	
	/**
	 * Returns the amount of pay a band member will get (in dollars). This amount is computed by adding the bonus (if any)
	 * to the base salary and then deducting the amount spent on snacks. So, if a band member earned 100 dollars, spent 50 on snacks,
	 * and earned a bonus of 10 (%), their pay will be 60 dollars. 
	 * 
	 * Note: The current implementation of this method is extremely buggy and can easily be abused by anyone.
	 * 
	 * @param salary The base salary earned by this band member during this salary period (in dollars).
	 * @param snacksAmount The total amount spent by this band member on snacks during this salary period (in dollars).
	 * @param bonus The bonus percentage that the band member earned this salary period (in percentage).   
	 * @return the amount of pay a band member will get (in dollars)
	 */
	public static Double pay(Double salary, Double snacksAmount, Integer bonus) {

		//Check if any values are null
		if (salary == null || snacksAmount == null || bonus == null){
			throw new IllegalArgumentException("Null value entered");
		}

		// Check if salary has a valid entry
		if (salary > 1000.0 || salary < 0.0){
			throw new IllegalArgumentException("Salary can not be greater than 1000 or less than 0");
		}

		// Check if snacksAmount is non negative
		if (snacksAmount < 0) {
			throw new IllegalArgumentException("Cannot have a negative amount spent on snacks");
		}

		// Check if bonus has a valid entry
		if (bonus < 0 || bonus > 10){
			throw new IllegalArgumentException("Bonus must be between 0% and 10%");
		}

		// Check that snacksAmount is less than salary
		if (snacksAmount > salary){
			throw new IllegalArgumentException("Cannot spend more on snacks than you earn");
		}

		double bonusPercentage = bonus/100.0 + 1.0;

		return(salary*bonusPercentage - snacksAmount);

	}
}
