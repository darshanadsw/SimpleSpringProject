package org.springframework.chapter1.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {

	private List<Object> list;
	private Set<Object> set;
	private Map<Object,Object> map;
	
	public void setList(List<Object> list) {
		this.list = list;
	}
	public void setSet(Set<Object> set) {
		this.set = set;
	}
	public void setMap(Map<Object, Object> map) {
		this.map = map;
	}
	
	public String toString() {
		return list.toString() + set.toString();
	}
}
