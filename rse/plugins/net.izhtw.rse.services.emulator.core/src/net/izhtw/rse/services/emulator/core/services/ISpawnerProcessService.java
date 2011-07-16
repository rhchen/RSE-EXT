package net.izhtw.rse.services.emulator.core.services;

import java.io.File;
import java.io.IOException;

import net.izhtw.rse.emulator.core.services.IEmulatorProcessService;
import net.izhtw.rse.services.emulator.core.processes.ISpawnerProcess;

import org.eclipse.rse.services.processes.IProcessService;

public interface ISpawnerProcessService extends IEmulatorProcessService{

	public void forkProcess(String cmd, String[] envp, File dir) throws IOException;
	
}
