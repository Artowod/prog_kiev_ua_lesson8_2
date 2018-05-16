package ua.prog.java.lesson8_2;

import java.util.ArrayList;
import java.util.List;

public class BlackList {
	private List<Class<?>> blackListOfClasses = new ArrayList<Class<?>>();
	private Class<?> currentClass;

	public BlackList() {

	}

	public void addClassToBlackList(Class<?> classToBlackList) {
		blackListOfClasses.add(classToBlackList);
	}

	public List<Class<?>> getBlackListOfClasses() {
		return blackListOfClasses;
	}

	public Class<?> getCurrentClass() {
		return currentClass;
	}

	@Override
	public String toString() {
		return "BlackList [blackListOfClasses=" + blackListOfClasses + "]";
	}


}
