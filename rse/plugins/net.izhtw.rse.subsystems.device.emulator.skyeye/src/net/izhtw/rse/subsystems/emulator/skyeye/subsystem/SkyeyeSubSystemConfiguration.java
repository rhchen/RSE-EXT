package net.izhtw.rse.subsystems.emulator.skyeye.subsystem;

import org.eclipse.rse.core.IRSESystemType;
import org.eclipse.rse.core.model.IHost;
import org.eclipse.rse.core.subsystems.ISubSystem;
import org.eclipse.rse.internal.core.RSECoreRegistry;
import org.eclipse.rse.services.processes.IProcessService;

import net.izhtw.rse.emulator.core.services.IEmulatorProcessService;
import net.izhtw.rse.emulator.core.services.IEmulatorService;
import net.izhtw.rse.emulator.core.subsystems.IEmulatorProcessServiceSubSystem;
import net.izhtw.rse.emulator.core.subsystems.IEmulatorSubSystemConfiguration;
import net.izhtw.rse.services.emulator.core.services.ISkyeyeService;
import net.izhtw.rse.subsystems.emulator.local.subsystem.impl.EmulatorSubSystemConfiguration;

public class SkyeyeSubSystemConfiguration extends EmulatorSubSystemConfiguration implements IEmulatorSubSystemConfiguration{

	public static final String SUBSYSTEM_CONFIGURATION_ID = "skyeye.emulator";
	
	public static final String systemTypeId = "net.izhtw.rse.systemtype.skyeye";
	
	@Override
	public ISubSystem createSubSystemInternal(IHost conn) {
		
		IEmulatorService service = this.getEmulatorService(conn);
		
		IRSESystemType systemType = RSECoreRegistry.getInstance().getSystemTypeById(systemTypeId);
		
		IProcessService[] processservice = this.getEmulatorProcessService(conn, systemType, IEmulatorProcessServiceSubSystem.class);
		
		SkyeyeSubSystem sss = new SkyeyeSubSystem(conn, getConnectorService(conn), service);
		
		//this.addSubSystem(sss);
		
		return sss;
		
	}

	@Override
	public Class getServiceType() {
		return ISkyeyeService.class;
	}

	@Override
	public boolean supportsFilters() {
		return false;
	}

}
