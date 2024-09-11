/**
 * 
 */
package slideDeckChallenges;

import java.util.ArrayList;

/**
 * 
 */
public class MountainDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mountain m1 = new Mountain();
		
		m1.setName("Everest");
		m1.setHeight(8998);
		
		Mountain m2 = new Mountain();
		m2.setName("K2");
		m2.setHeight(7899);
		
		ArrayList<Mountain> mountains = new ArrayList<Mountain>();
		
		mountains.add(m1);
		mountains.add(m2);
		
		for (Mountain mountain : mountains) {
			System.out.println("Name : " + mountain.getName() + " \tHeight : " + mountain.getHeight());
		}
	}

}
