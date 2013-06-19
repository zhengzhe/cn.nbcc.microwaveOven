package cn.nbcc.microwaveOven.demo;

public class Student implements IBellListener {

	@Override
	public void onBellRang() {
		System.out.println("学生坐好，等待上课");

	}

}
