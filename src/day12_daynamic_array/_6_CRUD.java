package day12_daynamic_array;

import java.util.ArrayList;

public interface _6_CRUD<E> {
		void create(E e);
		void update(E e);
		void delete(Integer num);
		E getOne(Integer num);
		E getOne(String name);
		ArrayList<E> queryAll();
}
