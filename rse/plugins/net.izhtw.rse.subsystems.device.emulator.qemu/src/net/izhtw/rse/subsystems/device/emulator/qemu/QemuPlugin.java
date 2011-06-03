package net.izhtw.rse.subsystems.device.emulator.qemu;

import java.io.File;

import net.izhtw.rse.subsystems.device.emulator.core.model.Emulator;
import net.izhtw.rse.subsystems.device.emulator.qemu.adapter.QemuSubSystemConfigurationAdapterFactory;
import net.izhtw.rse.subsystems.device.emulator.qemu.adapter.QemuSystemViewAdapterFactory;

import org.eclipse.core.runtime.IAdapterManager;
import org.eclipse.core.runtime.Platform;
import org.eclipse.rse.ui.SystemBasePlugin;
import org.osgi.framework.BundleContext;

public class QemuPlugin extends SystemBasePlugin {

	public static final String PLUGIN_ID = "net.izhtw.rse.subsystems.device.emulator.qemu";
	
	@Override
	protected void initializeImageRegistry() {
		
		String path = getIconPath();
		
		String FULL_OBJ16 = "full" + File.separator + "obj16";
		
		putImageInRegistry("ICON_QEMU", path + FULL_OBJ16 + File.separator + "monitor_obj.gif");
	}

	@Override
	public void start(BundleContext context) throws Exception {
		
		super.start(context);
		
		IAdapterManager manager = Platform.getAdapterManager();
		
		QemuSystemViewAdapterFactory qemuSystemViewAdapterFactory = new QemuSystemViewAdapterFactory();
		
		manager.registerAdapters(qemuSystemViewAdapterFactory, Emulator.class);
		
		QemuSubSystemConfigurationAdapterFactory adapterFactory = new QemuSubSystemConfigurationAdapterFactory();
		
		adapterFactory.registerWithManager(manager);
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		super.stop(context);
	}

	
}
