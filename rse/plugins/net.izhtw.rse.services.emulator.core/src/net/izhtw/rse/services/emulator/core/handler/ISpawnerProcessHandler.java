package net.izhtw.rse.services.emulator.core.handler;

import java.io.File;
import java.io.IOException;

import net.izhtw.rse.services.emulator.core.processes.impl.SpawnerProcess;

import org.eclipse.rse.services.clientserver.processes.handlers.ProcessHandler;

public interface ISpawnerProcessHandler extends ProcessHandler{

	public final static int COMMAND_CANCELED = 1;
	public final static int ILLEGAL_COMMAND = -1;
	public final static int OK = 0;
	
	public SpawnerProcess exec(String cmd, String[] envp, File dir) throws IOException;
	
}
