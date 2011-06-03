package net.izhtw.rse.subsystems.device.emulator.qemu.subsystem;

import org.eclipse.rse.core.model.IHost;
import org.eclipse.rse.core.subsystems.IConnectorService;
import org.eclipse.rse.core.subsystems.ISubSystem;
import org.eclipse.rse.core.subsystems.SubSystemConfiguration;
import org.eclipse.rse.internal.connectorservice.local.LocalConnectorServiceManager;
import org.eclipse.rse.internal.services.local.ILocalService;

public class QemuSubSystemConfiguration extends SubSystemConfiguration {

	public static final String SUBSYSTEM_CONFIGURATION_ID = "qemu.emulator";
	
	@Override
	public ISubSystem createSubSystemInternal(IHost conn) {
		return new QemuSubSystem(conn, getConnectorService(conn));
	}

	public IConnectorService getConnectorService(IHost host)
	{
		return LocalConnectorServiceManager.getInstance().getConnectorService(host, getServiceImplType());
	}
	
	public Class getServiceImplType()
	{
		return ILocalService.class;
	}
}
