package net.izhtw.rse.emulator.core.subsystems;

import net.izhtw.rse.emulator.core.services.IEmulatorProcessService;

import org.eclipse.rse.services.processes.IProcessService;
import org.eclipse.rse.subsystems.processes.servicesubsystem.IProcessServiceSubSystem;

public interface IEmulatorProcessServiceSubSystem extends IProcessServiceSubSystem {

	public IEmulatorProcessService getProcessService();
	
}
