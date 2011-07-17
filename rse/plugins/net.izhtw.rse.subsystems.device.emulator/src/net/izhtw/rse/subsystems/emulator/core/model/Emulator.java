package net.izhtw.rse.subsystems.emulator.core.model;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Platform;
import org.eclipse.rse.core.subsystems.AbstractResource;
import org.eclipse.rse.core.subsystems.ISubSystem;


public class Emulator extends AbstractResource implements IAdaptable{

	private String name = null;

	public Emulator(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	/**
//	 * @see org.eclipse.core.runtime.IAdaptable#getAdapter(Class)
//	 */
//	@SuppressWarnings("rawtypes")
//	public Object getAdapter(Class adapter){
//		
//   	    return Platform.getAdapterManager().getAdapter(this, adapter);	
//	
//	}
}
