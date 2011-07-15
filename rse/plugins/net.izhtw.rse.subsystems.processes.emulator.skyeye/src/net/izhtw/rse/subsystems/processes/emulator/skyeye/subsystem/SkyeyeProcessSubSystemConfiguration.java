package net.izhtw.rse.subsystems.processes.emulator.skyeye.subsystem;

import net.izhtw.rse.services.emulator.local.LocalSpawnerProcessService;
import net.izhtw.rse.subsystems.processes.emulator.local.adapter.EmulatorProcessAdapter;
import net.izhtw.rse.subsystems.processes.emulator.local.subsystem.EmulatorProcessSubSystemConfiguration;

import org.eclipse.rse.core.model.IHost;
import org.eclipse.rse.core.subsystems.ISubSystemConfiguration;
import org.eclipse.rse.services.processes.IProcessService;
import org.eclipse.rse.subsystems.processes.core.subsystem.IHostProcessToRemoteProcessAdapter;

public class SkyeyeProcessSubSystemConfiguration extends
		EmulatorProcessSubSystemConfiguration implements
		ISubSystemConfiguration {

	@Override
	public IProcessService createProcessService(IHost host) {
		return new LocalSpawnerProcessService();
	}

	@Override
	public IHostProcessToRemoteProcessAdapter getHostProcessAdapter() {
		if (_hostProcessAdapter == null)
		{
			_hostProcessAdapter =  new EmulatorProcessAdapter();
		}
		return _hostProcessAdapter;
	}
}
