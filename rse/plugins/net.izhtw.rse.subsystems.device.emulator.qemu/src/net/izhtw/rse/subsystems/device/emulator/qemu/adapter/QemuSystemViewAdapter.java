package net.izhtw.rse.subsystems.device.emulator.qemu.adapter;

import net.izhtw.rse.subsystems.device.emulator.qemu.subsystem.QemuSubSystemConfiguration;
import net.izhtw.rse.subsystems.device.emulator.ui.adaptor.EmulatorSystemViewAdapter;

public class QemuSystemViewAdapter extends EmulatorSystemViewAdapter {

	@Override
	public String getSubSystemConfigurationId(Object element) {
		return QemuSubSystemConfiguration.SUBSYSTEM_CONFIGURATION_ID;
	}

}
