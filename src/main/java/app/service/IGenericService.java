package app.service;

import java.util.List;

public interface IGenericService<T> {
	public T create(T obj);
	public T update(T obj);
	public void delete(T obj);
	public void delete(long id);
	public T read(long id);
	public List<T> readAll();
}
