package kr.co.softcampus.beans;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class TestBean {
	
//	List
	private List<String> list1;
	private List<Integer> list2;
	private List<DataBean> list3;
	
//	Set
	private Set<String> set1;
	private Set<Integer> set2;
	private Set<DataBean> set3;
	
//	Map
	private Map<String, Object> map1;
	
//	Properties
	private Properties prop1;

	
	
	
	
//	List get/set
	public List<String> getList1() {
		return list1;
	}

	public void setList1(List<String> list1) {
		this.list1 = list1;
	}

	public List<Integer> getList2() {
		return list2;
	}

	public void setList2(List<Integer> list2) {
		this.list2 = list2;
	}

	public List<DataBean> getList3() {
		return list3;
	}

//	Set set/get
	public void setList3(List<DataBean> list3) {
		this.list3 = list3;
	}

	public Set<String> getSet1() {
		return set1;
	}

	public void setSet1(Set<String> set1) {
		this.set1 = set1;
	}

	public Set<Integer> getSet2() {
		return set2;
	}

	public void setSet2(Set<Integer> set2) {
		this.set2 = set2;
	}

	public Set<DataBean> getSet3() {
		return set3;
	}

	public void setSet3(Set<DataBean> set3) {
		this.set3 = set3;
	}

//	Map set/get
	public Map<String, Object> getMap1() {
		return map1;
	}

	public void setMap1(Map<String, Object> map1) {
		this.map1 = map1;
	}

//	Properties set/get
	public Properties getProp1() {
		return prop1;
	}

	public void setProp1(Properties prop1) {
		this.prop1 = prop1;
	}
	
	
	

}
