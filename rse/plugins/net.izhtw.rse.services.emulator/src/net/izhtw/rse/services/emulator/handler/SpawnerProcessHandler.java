package net.izhtw.rse.services.emulator.handler;

import java.util.HashMap;
import java.util.SortedSet;
import java.util.TreeSet;

import org.eclipse.rse.services.clientserver.processes.HostProcessFilterImpl;
import org.eclipse.rse.services.clientserver.processes.IHostProcess;
import org.eclipse.rse.services.clientserver.processes.IHostProcessFilter;
import org.eclipse.rse.services.clientserver.processes.handlers.ProcessHandler;

public class SpawnerProcessHandler implements ProcessHandler {

	SortedSet hm = new TreeSet();
	
	@Override
	public SortedSet lookupProcesses(IHostProcessFilter rpfs) throws Exception {
		return hm;
	}

	@Override
	public IHostProcess kill(IHostProcess process, String type)
			throws Exception {
		
		HostProcessFilterImpl rpfs = new HostProcessFilterImpl();
		
		rpfs.setPid("" + process.getPid());
		
		SortedSet results = lookupProcesses(rpfs);
		
		if (results == null || results.size() == 0) return null;
		else return (IHostProcess) results.first();
	}

}
