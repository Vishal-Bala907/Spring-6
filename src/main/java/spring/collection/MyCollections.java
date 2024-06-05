package spring.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class MyCollections {
	private List<String> list;
	private Map<Integer, String> map;
	private Set<String> set;

//	private Prop
	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Map<Integer, String> getMap() {
		return map;
	}

	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}

	public Set<String> getSet() {
		return set;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

}
