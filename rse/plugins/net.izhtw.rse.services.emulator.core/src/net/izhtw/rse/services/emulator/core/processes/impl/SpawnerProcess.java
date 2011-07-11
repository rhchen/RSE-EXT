package net.izhtw.rse.services.emulator.core.processes.impl;

import java.io.IOException;
import java.io.OutputStream;

import org.eclipse.cdt.core.ICommandLauncher;
import org.eclipse.cdt.internal.core.ProcessClosure;
import org.eclipse.cdt.utils.spawner.Spawner;
import org.eclipse.rse.services.clientserver.processes.IHostProcess;
import org.eclipse.rse.services.processes.AbstractHostProcess;

import net.izhtw.rse.services.emulator.core.processes.ISpawnerProcess;

/**
 * Reference org.eclipse.cdt.core.CommandLauncher
 */
public class SpawnerProcess extends AbstractHostProcess implements IHostProcess, ISpawnerProcess{

	public final static int COMMAND_CANCELED = ICommandLauncher.COMMAND_CANCELED;
	
	public final static int ILLEGAL_COMMAND = ICommandLauncher.ILLEGAL_COMMAND;
	
	public final static int OK = ICommandLauncher.OK;
	
	private Spawner process = null;
	
	protected boolean fShowCommand;
	
	protected String[] fCommandArgs;
	
	private String lineSeparator;
	
	public SpawnerProcess(Spawner process) {
		super();
		this.process = process;
	}

	public int waitAndRead(OutputStream out, OutputStream err) {
		if (fShowCommand) {
			printCommandLine(out);
		}

		if (process == null) {
			return ILLEGAL_COMMAND;
		}

		ProcessClosure closure = new ProcessClosure(process, out, err);
		closure.runBlocking(); // a blocking call
		return OK;
	}
	
	protected void printCommandLine(OutputStream os) {
		if (os != null) {
			String cmd = getCommandLine(getCommandArgs());
			try {
				os.write(cmd.getBytes());
				os.flush();
			} catch (IOException e) {
				// ignore;
			}
		}
	}
	
	protected String getCommandLine(String[] commandArgs) {
		StringBuffer buf = new StringBuffer();
		if (fCommandArgs != null) {
			for (String commandArg : commandArgs) {
				buf.append(commandArg);
				buf.append(' ');
			}
			buf.append(lineSeparator);
		}
		return buf.toString();
	}
	
	public String[] getCommandArgs() {
		return fCommandArgs;
	}
}
