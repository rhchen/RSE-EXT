package net.izhtw.rse.subsystems.device.emulator.skyeye.subsystem;

import org.eclipse.rse.core.model.IHost;
import org.eclipse.rse.core.subsystems.ISubSystem;

import net.izhtw.rse.subsystems.device.emulator.local.subsystem.EmulatorSubSystemConfiguration;

public class SkyeyeSubSystemConfiguration extends
		EmulatorSubSystemConfiguration {

	public static final String SUBSYSTEM_CONFIGURATION_ID = "skyeye.emulator";
	
	@Override
	public ISubSystem createSubSystemInternal(IHost conn) {
		return new SkyeyeSubSystem(conn, getConnectorService(conn));
	}

}
