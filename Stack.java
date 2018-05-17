package ua.prog.java.lesson8_2;

import java.util.ArrayList;
import java.util.List;

public class Stack {
	private Object currentObject;
	private int maxStackSize = 10;
	private int currentStackSize;
	private List<Object> stack = new ArrayList<Object>();
	private BlackList instanceOfBlackList;

	public Stack() {

	}

	public Stack(BlackList instanceOfBlackList) {
		this.instanceOfBlackList = instanceOfBlackList;
	}

	public int getMaxStackSize() {
		return maxStackSize;
	}

	public void setMaxStackSize(int maxStackSize) {
		this.maxStackSize = maxStackSize;
	}

	public Object getCurrentObject() {
		return currentObject;
	}

	public List<Object> getStack() {
		return stack;
	}

	public int getCurrentStackSize() {
		return currentStackSize;
	}

	public void addObject(Object addingObject) {
		if(this.instanceOfBlackList.getBlackListOfClasses().contains(addingObject.getClass())) {
			System.out.println("Such Class of the current Object is in the Black List.");
			return;
		}
		stack.add(addingObject);
		currentStackSize = stack.size();
		System.out.println("The Object has been added to Top of Stack.");
	}

	public Object cutObject() {
		Object cuttedObjectFromTop = new Object();
		cuttedObjectFromTop = stack.get(stack.size()-1);
		stack.remove(stack.size()-1);
		currentStackSize = stack.size();
		System.out.println("The Object has been gotten and deleted from Top of Stack.");
		return cuttedObjectFromTop;
	}
	
	public void deleteObject() {
		if(stack.get(stack.size()-1)!=null) {
			stack.remove(stack.size()-1);
			System.out.println("The Object has been deleted from Top of Stack.");
		}
			currentStackSize = stack.size();
		
	}

	public Object readObject() {
		System.out.println("The Object has been gotten from Top of Stack.");
		currentStackSize = stack.size();
		return stack.get(stack.size()-1);
	}

	@Override
	public String toString() {
		return "Stack [currentStackSize=" + currentStackSize + ", stack=" + stack + "]";
	}

	

}
