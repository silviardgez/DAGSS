package ds.miniframework;

import java.util.List;
import java.util.Observable;

public abstract class Operation extends Observable {
	private float progress = 0;
	
	public abstract String getName();
	public abstract List<String> getParameters();
	public abstract String execute(List<String> list);
	
	protected void setProgress(float progress){
		this.progress = progress;
		super.setChanged();
		super.notifyObservers();
	}
	
	public float getProgress(){
		return this.progress;
	}
}
