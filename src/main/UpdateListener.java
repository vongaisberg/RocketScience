/**
 * 
 */
package main;

import java.util.EventListener;

/**
 * @author Maximilian
 *
 */
public interface UpdateListener extends EventListener {
	// event dispatch methods
	public void hitBy(UpdateEvent ue);

}