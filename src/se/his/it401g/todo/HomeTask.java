package se.his.it401g.todo;

/**
 * Implements a simple home task type, using the AbstractTask base class. 
 *  
 * This file licensed under the <a href="https://creativecommons.org/licenses/by/4.0/">Creative Commons (CC) BY 4.0 license</a>.
 * 
 * @author Dr. Erik Billing, University of Skovde
 *
 */
public class HomeTask extends AbstractTask {

	@Override
	public String getTaskType() {
		return "Home";
	}

}
