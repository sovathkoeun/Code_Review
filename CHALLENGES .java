
// -------------------------------------------------------------
// CHALLENGE 1       COMMENTS	
// Add comments instead of the TODO
// -------------------------------------------------------------	
List<Fruit> getExpiredFruits(List<Fruit> fruits) {
	
	// ArrayList for store the fruit that expired.
	List<Fruit> result = new ArrayList<>();
	for(Fruit fruit : fruits) {
		if (fruit.isExpired) {
			result.add(fruit);
		} 
	}
	return result;
}

//-------------------------------------------------------------
// CHALLENGE 2           COMMENTS
// Add comments instead of the TODO
// -------------------------------------------------------------	
int getNumberOfExpiredFruits(List<Fruit> fruits) {
	
	// ArrayList for store number of fruit that expired
	List<Fruit> result = new ArrayList<>();
	for(Fruit fruit : fruits) {
		if (fruit.isExpired) {
			result.add(fruit);
		} 
	}
	
	// Variable for store size of ArrayList name result.
	int nbExpiredFruits = result.size();
	
	return nbExpiredFruits;
}

//-------------------------------------------------------------
// CHALLENGE 3          COMMENTS
//   1.  Meanfull names : replace xx, yy, zz, ...
//   2.   Add comments instead of the TODO
// -------------------------------------------------------------	

/**
 * Function to get validate the fruits in each box.
 * @param fruitsBox  pramater of the function
 * @return  return the numbers of the fruit that has expired.
 */
boolean validateTheFruitBox(List<Fruit> fruitsBox) {
	
	//Check fruit boxes that contain BANANA.
	int countBananaExprired = 0;
	for(Fruit fruit : fruitsBox) {
		if (fruit.getType() = "BANANA") {
			countBananaExprired++;
		} 
	}
	
	// Check fruit boxes that contain Green.
	int countGreenExprired = 0;
	for(Fruit fruit : fruitsBox) {
		if (fruit.getType() = "APPLE" && fruit.getColor() = "GREEN") {
			countGreenExprired++;
		} 
	}
	
	
	// Check fruit boxes that contain Lemon.
	int countLemonExprired = 0;
	for(Fruit fruit : fruitsBox) {
		if (fruit.getType() = "ORANGE" || fruit.getType() = "LEMON") {
			countLemonExprired++;
		} 
	}
		
	// Check the number of each expired fruit with condition
	boolean isVAlid = countBananaExprired > 2 &&countGreenExprired> 3 && countLemonExprired>1;
	
	return nbExpiredFruits;
}

//-------------------------------------------------------------
// CHALLENGE 4         DRY
// Refactor the code with a function to remove duplicated code
//		- The function shoud take the following prameters:
// -------------------------------------------------------------	

public static void main(String[] args) {

		// Employee is  list of 3 values : first name, last name, age
		List<String> sopeakEmployee = Arrays.asList("sopeak", "riss", "30");
		
		// Employee is  list of 3 values : first name, last name, age
		List<String> radyEmployee = Arrays.asList("rady", "yyy", "27");
		
		// Employee is  list of 3 values : first name, last name, age
		List<String> ronanEmployee = Arrays.asList("ronan", "ogor", "30");
		
    // Contain all array of employees
		List<List<String>> allEmployees = new ArrayList<List<String>>();
		allEmployees.add(sopeakEmployee);
		allEmployees.add(radyEmployee);
		allEmployees.add(ronanEmployee);
		
    // store string text 
		List<String> texts = Arrays.asList(" first name : ", " last name : ", " age : ");
		
		String result = "";
		String getNameEmployee = "";
		for (int i = 0; i < allEmployees.size(); i++)
		{
		    for (int j = 0; j < allEmployees.get(i).size(); j++)
		    {
		    	getNameEmployee = allEmployees.get(i).get(0);
		    	result = getNameEmployee + texts.get(j) +  allEmployees.get(i).get(j);
		    	System.out.println(result);
		    } 
		}
	}