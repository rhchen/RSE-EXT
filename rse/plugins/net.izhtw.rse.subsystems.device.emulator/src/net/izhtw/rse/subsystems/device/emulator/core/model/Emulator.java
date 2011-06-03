package net.izhtw.rse.subsystems.device.emulator.core.model;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Platform;


public class Emulator implements IAdaptable{

	private String name = null;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @see org.eclipse.core.runtime.IAdaptable#getAdapter(Class)
	 */
	public Object getAdapter(Class adapter){
		
   	    return Platform.getAdapterManager().getAdapter(this, adapter);	
	
	}
}
