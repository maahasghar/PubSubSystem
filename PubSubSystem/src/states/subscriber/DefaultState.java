/**@author Maah Asghar*/

package states.subscriber;

import events.AbstractEvent;

public class DefaultState implements IState{

	public void handleEvent(AbstractEvent event, String channelName) {
		System.out.println(event + "has been handled on" + channelName);
		
	}

}
