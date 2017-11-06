package ds.calculator;

import java.util.List;

import ds.miniframework.Operation;

public class ProtectedOperation extends Operation {
	private LicenseManager lm = new LicenseManager();
	private Operation protectedOperation;
	
	public ProtectedOperation(Operation protectedOperation){
		this.protectedOperation = protectedOperation;
	}
	

	@Override
	public String getName() {
		return this.protectedOperation.getName();
	}

	@Override
	public List<String> getParameters() {
		return this.protectedOperation.getParameters();
	}

	@Override
	public String execute(List<String> params) {
		if(this.lm.checkIsFullVersion()){
			super.setChanged();
			super.notifyObservers();
			return this.protectedOperation.execute(params);
		} else {
			return "Need full version";
		}
	}
}
