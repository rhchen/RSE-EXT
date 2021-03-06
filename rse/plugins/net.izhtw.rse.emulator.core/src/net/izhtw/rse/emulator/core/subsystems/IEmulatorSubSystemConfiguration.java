package net.izhtw.rse.emulator.core.subsystems;

import net.izhtw.rse.emulator.core.services.IEmulatorProcessService;
import net.izhtw.rse.emulator.core.services.IEmulatorService;

import org.eclipse.rse.core.IRSESystemType;
import org.eclipse.rse.core.model.IHost;
import org.eclipse.rse.core.subsystems.ISubSystemConfiguration;
import org.eclipse.rse.services.processes.IProcessService;

public interface IEmulatorSubSystemConfiguration extends ISubSystemConfiguration{

	public IEmulatorService getEmulatorService(IHost host);
	
	public IProcessService[] getEmulatorProcessService(IHost host, IRSESystemType systemType, Class clazz);
}
