package net.izhtw.rse.subsystems.emulator.qemu.subsystem;

import net.izhtw.rse.emulator.core.services.IEmulatorProcessService;
import net.izhtw.rse.emulator.core.services.IEmulatorService;
import net.izhtw.rse.emulator.core.subsystems.IEmulatorProcessServiceSubSystem;
import net.izhtw.rse.emulator.core.subsystems.IEmulatorSubSystemConfiguration;
import net.izhtw.rse.services.emulator.core.services.IQemuService;
import net.izhtw.rse.subsystems.emulator.local.subsystem.impl.EmulatorSubSystemConfiguration;

import org.eclipse.rse.core.IRSESystemType;
import org.eclipse.rse.core.filters.ISystemFilter;
import org.eclipse.rse.core.filters.ISystemFilterPool;
import org.eclipse.rse.core.filters.ISystemFilterPoolManager;
import org.eclipse.rse.core.model.IHost;
import org.eclipse.rse.core.subsystems.ISubSystem;
import org.eclipse.rse.internal.core.RSECoreRegistry;
import org.eclipse.rse.services.processes.IProcessService;

public class QemuSubSystemConfiguration extends EmulatorSubSystemConfiguration implements IEmulatorSubSystemConfiguration{

	public static final String SUBSYSTEM_CONFIGURATION_ID = "qemu.emulator";
	
	public static final String systemTypeId = "net.izhtw.rse.systemtype.qemu";
	
	@Override
	public ISubSystem createSubSystemInternal(IHost conn) {
		
		IEmulatorService service = this.getEmulatorService(conn);
		
		IRSESystemType systemType = RSECoreRegistry.getInstance().getSystemTypeById(systemTypeId);
		
		IProcessService[] processservice = this.getEmulatorProcessService(conn, systemType, IEmulatorProcessServiceSubSystem.class);
		
		return new QemuSubSystem(conn, getConnectorService(conn), service);
	}

	@Override
	public Class getServiceType() {
		return IQemuService.class;
	}

	@Override
	protected ISystemFilterPool createDefaultFilterPool(
			ISystemFilterPoolManager mgr) {
		
		ISystemFilterPool defaultPool = null;
		
		try {
		
			defaultPool = mgr.createSystemFilterPool(getDefaultFilterPoolName(mgr.getName(), getId()), true); // true=>is deletable by user
			
			String[] strings = new String[] { "*" }; //$NON-NLS-1$
			
			ISystemFilter filter = mgr.createSystemFilter(defaultPool,"ARM Core", strings );
		
		} catch (Exception exc) {}
		
		return defaultPool;
	}

}
