package entity;


public class Project {

	/*
	 * name:��Ŀ����
	 * date:��Ŀ����
	 * evaluate:��Ŀ����
	 * costTime:���ѵ�ʱ��
	 * what:��ѧ��ʲô
	 */
	private String name;
	private String date;
	private String evaluate;
	private String costTime;
	private String what;
	
	public Project(String name){
		this.name = name;
	}
	public  String getName(){
		return name;
	}
	private boolean ok;

	public boolean isOk() {
		return ok;
	}
	public void setOk(boolean ok) {
		this.ok = ok;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getEvaluate() {
		return evaluate;
	}
	public void setEvaluate(String evaluate) {
		this.evaluate = evaluate;
	}
	public String getCostTime() {
		return costTime;
	}
	public void setCostTime(String costTime) {
		this.costTime = costTime;
	}
	public String getWhat() {
		return what;
	}
	public void setWhat(String what) {
		this.what = what;
	}
	
}
