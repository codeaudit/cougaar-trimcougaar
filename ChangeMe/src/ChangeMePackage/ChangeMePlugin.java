/*
 * <copyright>
 *  ChangeMeCopyright
 * </copyright>
 */
package ChangeMePackage;

import org.cougaar.core.plugin.AnnotatedSubscriptionsPlugin;

/** 
ChangeMe Example Cougaar Plugin
 **/
public class ChangeMePlugin extends AnnotatedSubscriptionsPlugin {

	/** SetupSubscription method is called once at agent startup.*/
	public void start() {
		super.start();		
		log.shout("ChangeMe, World!");
	}
}
