package net.izhtw.rse.subsystems.device.emulator.local.subsystem;

import org.eclipse.rse.core.model.IHost;
import org.eclipse.rse.core.subsystems.IConnectorService;
import org.eclipse.rse.core.subsystems.SubSystemConfiguration;
import org.eclipse.rse.internal.connectorservice.local.LocalConnectorServiceManager;
import org.eclipse.rse.internal.services.local.ILocalService;

@SuppressWarnings("restriction")
public abstract class EmulatorSubSystemConfiguration extends SubSystemConfiguration {

	@Override
	public IConnectorService getConnectorService(IHost host)
	{
		return LocalConnectorServiceManager.getInstance().getConnectorService(host, getServiceImplType());
	}
	
	@Override
	public Class<ILocalService> getServiceImplType()
	{
		return ILocalService.class;
	}
}
