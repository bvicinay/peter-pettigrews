package edu.gatech.oad.antlab.person;

/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string 
 *
 * @author Bob
 * @version 1.1
 */
public class Person2 {
    /** Holds the persons real name */
    private String name;
	 	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
	 public Person2(String pname) {
	   name = pname;
	 }
	/**
	 * This method should take the string
	 * input and return its characters in
	 * random order.
	 * given "gtg123b" it should return
	 * something like "g3tb1g2".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	public String calc(String input) {
	  //Person 2 put your implementation here

		char[] arr = input.toCharArray();
		ArrayList<Character> inputString = new ArrayList<Character>();
		String str = "";

		for (int i = 0; i < arr.length; i++) {
			inputString.add(arr[i]);
		}

		str = getRandomStr(inputString, str);


	  return str;
	}

	private String getRandomStr(ArrayList<Character> inputString, String str) {

		if (inputString.size() == 1) {
			return str += inputString.remove(0);
		}

		Random rand = new Random();

		str += inputString.remove(rand.nextInt(inputString.size()));

		return getRandomStr(inputString, str);
	}
	
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}
}
