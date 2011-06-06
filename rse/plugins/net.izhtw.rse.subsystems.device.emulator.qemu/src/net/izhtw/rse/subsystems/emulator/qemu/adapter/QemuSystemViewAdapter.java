package net.izhtw.rse.subsystems.emulator.qemu.adapter;

import net.izhtw.rse.subsystems.emulator.local.adapter.EmulatorSystemViewAdapter;
import net.izhtw.rse.subsystems.emulator.qemu.subsystem.QemuSubSystemConfiguration;

public class QemuSystemViewAdapter extends EmulatorSystemViewAdapter {

	@Override
	public String getSubSystemConfigurationId(Object element) {
		return QemuSubSystemConfiguration.SUBSYSTEM_CONFIGURATION_ID;
	}

}
