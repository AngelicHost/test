package dao;

import java.util.List;

public interface DailyDao<T> {
	/*
	 * 删除一天的数据
	 */
	public void delete(String date);
	/*
	 * 得到已经记录的数据的日期
	 */
	public List<String> selectAll();
	/*
	 * 根据日期读取一整天的信息
	 */
    public T selectByDate(String date);	
}
