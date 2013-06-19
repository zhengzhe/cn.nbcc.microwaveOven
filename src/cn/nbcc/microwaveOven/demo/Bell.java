package cn.nbcc.microwaveOven.demo;
import java.util.ArrayList;
import java.util.List;


public class Bell {
	
	private List<IBellListener> listeners = new ArrayList<IBellListener>();
	
	public void addBellListener(IBellListener listener) {
		listeners.add(listener);
	}
	
	public void removeBellListener(IBellListener listener) {
		if (listeners.contains(listener)) {
			listeners.remove(listener);
		}
	}
	
	public void ring() {
		System.out.println("�����壬������");
		for (IBellListener listener : listeners) {
			listener.onBellRang();
		}
	}

}
