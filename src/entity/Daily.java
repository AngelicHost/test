package entity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class Daily {

	ArrayList<Project> arr = new ArrayList<Project>();
	
	public void set(Project p){
		arr.add(p);
	}
	
	public Project get(String name){
		Iterator<Project> iter=  arr.listIterator();
		while (iter.hasNext()){
			Project p =  iter.next();
			if (p.getName().equals(name)){
				return p;
			}
		}
		return null;
	}
	/*private Project java = new Project("java");
	private Project thinkingInJava = new Project("thinkinginjava");
	private Project algorithms = new Project("algorithms");
	private Project modian = new Project("modian");
	private Project dianlu = new Project("dianlu");
	private Project gailvlun = new Project("gailvlun");
	private Project jifen = new Project("jifen");
	
	public Project getJava() {
		return java;
	}
	public void setJava(Project java) {
		this.java = java;
	}
	public Project getThinkingInJava() {
		return thinkingInJava;
	}
	public void setThinkingInJava(Project thinkingInJava) {
		this.thinkingInJava = thinkingInJava;
	}
	public Project getAlgorithms() {
		return algorithms;
	}
	public void setAlgorithms(Project algorithms) {
		this.algorithms = algorithms;
	}
	public Project getModian() {
		return modian;
	}
	public void setModian(Project modian) {
		this.modian = modian;
	}
	public Project getDianlu() {
		return dianlu;
	}
	public void setDianlu(Project dianlu) {
		this.dianlu = dianlu;
	}
	public Project getGailvlun() {
		return gailvlun;
	}
	public void setGailvlun(Project gailvlun) {
		this.gailvlun = gailvlun;
	}
	public Project getJifen() {
		return jifen;
	}
	public void setJifen(Project jifen) {
		this.jifen = jifen;
	}*/
	
	
}
