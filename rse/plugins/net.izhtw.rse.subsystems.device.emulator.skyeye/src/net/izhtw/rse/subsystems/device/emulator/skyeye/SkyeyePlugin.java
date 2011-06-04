package net.izhtw.rse.subsystems.device.emulator.skyeye;

import java.io.File;

import org.eclipse.core.runtime.IAdapterManager;
import org.eclipse.core.runtime.Platform;
import org.eclipse.rse.ui.SystemBasePlugin;
import org.osgi.framework.BundleContext;

import net.izhtw.rse.subsystems.device.emulator.core.model.Emulator;
import net.izhtw.rse.subsystems.device.emulator.skyeye.adapter.SkyeyeSubSystemConfigurationAdapterFactory;
import net.izhtw.rse.subsystems.device.emulator.skyeye.adapter.SkyeyeSystemViewAdapterFactory;

public class SkyeyePlugin extends SystemBasePlugin {

	public static final String PLUGIN_ID = "net.izhtw.rse.subsystems.device.emulator.skyeye";

	@Override
	protected void initializeImageRegistry() {
		
		String path = getIconPath();
		
		String FULL_OBJ16 = "full" + File.separator + "obj16";
		
		putImageInRegistry("ICON_SKYEYE", path + FULL_OBJ16 + File.separator + "monitor_obj.gif");
		
	}

	@Override
	public void start(BundleContext context) throws Exception {
		
		super.start(context);
		
		IAdapterManager manager = Platform.getAdapterManager();
		
		SkyeyeSystemViewAdapterFactory systemViewAdapterFactory = new SkyeyeSystemViewAdapterFactory();
		
		manager.registerAdapters(systemViewAdapterFactory, Emulator.class);
		
		SkyeyeSubSystemConfigurationAdapterFactory adapterFactory = new SkyeyeSubSystemConfigurationAdapterFactory();
		
		adapterFactory.registerWithManager(manager);
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		super.stop(context);
	}

	
}
