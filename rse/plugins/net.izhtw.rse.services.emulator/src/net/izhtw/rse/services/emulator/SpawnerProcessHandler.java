package net.izhtw.rse.services.emulator;

import java.util.HashMap;
import java.util.SortedSet;

import org.eclipse.rse.services.clientserver.processes.IHostProcess;
import org.eclipse.rse.services.clientserver.processes.IHostProcessFilter;
import org.eclipse.rse.services.clientserver.processes.handlers.ProcessHandler;

public class SpawnerProcessHandler implements ProcessHandler {

	HashMap hm = new HashMap();
	
	@Override
	public SortedSet lookupProcesses(IHostProcessFilter rpfs) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IHostProcess kill(IHostProcess process, String type)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
