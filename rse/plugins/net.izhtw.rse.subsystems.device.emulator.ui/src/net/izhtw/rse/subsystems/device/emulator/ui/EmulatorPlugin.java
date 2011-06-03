package net.izhtw.rse.subsystems.device.emulator.ui;

import java.io.File;

import org.eclipse.rse.ui.SystemBasePlugin;

public class EmulatorPlugin extends SystemBasePlugin {

	public static final String PLUGIN_ID = "net.izhtw.rse.subsystems.device.emulator.ui";
	
	private static EmulatorPlugin plugin = null;

	public EmulatorPlugin() {
		super();
		plugin = this;
	}

	@Override
	protected void initializeImageRegistry() {
		
		String path = getIconPath();
		
		String FULL_OBJ16 = "full" + File.separator + "obj16";
		
		putImageInRegistry("ICON_QEMU", path + FULL_OBJ16 + File.separator + "monitor_obj.gif");
		
	}

	/**
	 * Returns the shared instance.
	 * @return the shared instance
	 */
	public static EmulatorPlugin getDefault() {
		return plugin;
	}
}
