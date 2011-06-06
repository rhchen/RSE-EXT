package net.izhtw.rse.subsystems.emulator.skyeye.adapter;

import net.izhtw.rse.subsystems.emulator.local.adapter.EmulatorSystemViewAdapter;
import net.izhtw.rse.subsystems.emulator.skyeye.subsystem.SkyeyeSubSystemConfiguration;

public class SkyeyeSystemViewAdapter extends EmulatorSystemViewAdapter {

	@Override
	public String getSubSystemConfigurationId(Object element) {
		return SkyeyeSubSystemConfiguration.SUBSYSTEM_CONFIGURATION_ID;
	}

}
