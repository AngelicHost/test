package dao;

public interface ProjectDao<T> {
	
	/*
	 * ������Ŀ���ݵ����ݿ�
	 */
	public void save(T obj);
	/*
	 * ������Ŀ���ݵ����ݿ�
	 */
	public void update(T obj);
	
	/*
	 * ������Ŀ����ɸѡ����Ŀ����
	 */
	public T select(String pName);
	
}
