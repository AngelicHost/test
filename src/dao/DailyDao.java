package dao;

import java.util.List;

public interface DailyDao<T> {
	/*
	 * ɾ��һ�������
	 */
	public void delete(String date);
	/*
	 * �õ��Ѿ���¼�����ݵ�����
	 */
	public List<String> selectAll();
	/*
	 * �������ڶ�ȡһ�������Ϣ
	 */
    public T selectByDate(String date);	
}
