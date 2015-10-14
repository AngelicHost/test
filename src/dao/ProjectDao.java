package dao;

public interface ProjectDao<T> {
	
	/*
	 * 保存项目数据到数据库
	 */
	public void save(T obj);
	/*
	 * 更新项目数据到数据库
	 */
	public void update(T obj);
	
	/*
	 * 根据项目名称筛选出项目数据
	 */
	public T select(String pName);
	
}
