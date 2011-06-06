package net.izhtw.rse.services.emulator;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

public class SpawnerJob extends Job {

	private Process process;
	
	public SpawnerJob(Process process, String name) {
		
		super(name);
		
		this.process = process;
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		
		try {
			
			this.process.waitFor();
			
			int exitCode = this.process.exitValue();
			
			/*
			 * Implement SpawnerStatus to fix this
			 */
			if(exitCode != 0) return SpawnerStatus.CANCEL_STATUS;
		
		} catch (InterruptedException e) {
			e.printStackTrace();
			return SpawnerStatus.CANCEL_STATUS;
		}
		
		return Status.OK_STATUS;
	}

}
