package ua.prog.java.lesson8_2;

import java.util.Arrays;

public class StackArray {
	private Object currentObject;
	private int maxStackSize = 10;
	private int currentStackSize;
	private Object[] stack = new Object[0];
	private BlackList instanceOfBlackList;

	public StackArray() {

	}

	public StackArray(BlackList instanceOfBlackList) {
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

	public int getCurrentStackSize() {
		return currentStackSize;
	}

	public void addObject(Object addingObject) {
		System.out.println("Add object: " + addingObject);
		if (this.instanceOfBlackList.getBlackListOfClasses().contains(addingObject.getClass())) {
			System.out.println("Such Class of the current Object is in the Black List.");
			return;
		}

		Object[] updatedStack = new Object[stack.length + 1];

		for (int i = 0; i < stack.length; i++) {
			updatedStack[i] = stack[i];
		}
		updatedStack[stack.length] = addingObject;
		stack = updatedStack.clone();
		currentStackSize = stack.length;
		System.out.println("The Object has been added to Top of Stack.");
	}

	public Object cutObject() {
		System.out.println("Cut object from Top of Stack:");
		if (stack.length == 0) {
			System.out.println("Stack is empty. Nothing to delete.");
			return "Stack is Empty!";
		}

		Object[] updatedStack = new Object[stack.length - 1];

		for (int i = 0; i < updatedStack.length; i++) {
			updatedStack[i] = stack[i];
		}
		Object returnObject = stack[stack.length - 1];
		stack = updatedStack.clone();
		currentStackSize = stack.length;
		System.out.println("The Object has been gotten and deleted from Top of Stack.");
		return returnObject;
	}

	public void deleteObject() {
		System.out.println("Delete Object from Top of Stack:");
		if (stack.length == 0) {
			System.out.println("Stack is empty. Nothing to delete.");
			return;
		}

		Object[] updatedStack = new Object[stack.length - 1];

		for (int i = 0; i < updatedStack.length; i++) {
			updatedStack[i] = stack[i];
		}
		stack = updatedStack.clone();
		currentStackSize = stack.length;
		System.out.println("The Object has been deleted from Top of Stack.");
	}

	public Object readObject() {
		System.out.println("Read Object from Top of Stack:");
		currentStackSize = stack.length;
		System.out.println("The Object has been gotten from Top of Stack.");
		return stack[stack.length - 1];
	}

	@Override
	public String toString() {
		return "StackArray [currentStackSize=" + currentStackSize + ", stack=" + Arrays.toString(stack) + "]";
	}

}
