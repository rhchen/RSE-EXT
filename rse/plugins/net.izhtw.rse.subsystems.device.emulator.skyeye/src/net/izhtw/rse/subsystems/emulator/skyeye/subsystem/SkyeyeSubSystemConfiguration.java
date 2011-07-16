package net.izhtw.rse.subsystems.emulator.skyeye.subsystem;

import org.eclipse.rse.core.model.IHost;
import org.eclipse.rse.core.subsystems.ISubSystem;

import net.izhtw.rse.emulator.core.services.IEmulatorService;
import net.izhtw.rse.emulator.core.subsystems.IEmulatorSubSystemConfiguration;
import net.izhtw.rse.services.emulator.core.services.ISkyeyeService;
import net.izhtw.rse.subsystems.emulator.local.subsystem.impl.EmulatorSubSystemConfiguration;

public class SkyeyeSubSystemConfiguration extends EmulatorSubSystemConfiguration implements IEmulatorSubSystemConfiguration{

	public static final String SUBSYSTEM_CONFIGURATION_ID = "skyeye.emulator";
	
	@Override
	public ISubSystem createSubSystemInternal(IHost conn) {
		
		IEmulatorService service = this.getEmulatorService(conn);
		
		SkyeyeSubSystem sss = new SkyeyeSubSystem(conn, getConnectorService(conn), service);
		
		return sss;
		
	}

	@Override
	public Class getServiceType() {
		return ISkyeyeService.class;
	}

	
}
