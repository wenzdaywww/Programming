/**
 *
 */
package main.java.designpattern.behaviortype.observer;

import main.java.designpattern.behaviortype.observer.interfaces.Observer;

/**
 * 观察者1
 * @author www
 *
 */
public class Observer1 implements Observer {

	@Override
	public void update() {
		System.out.println("observer1 has received!");
	}

}
