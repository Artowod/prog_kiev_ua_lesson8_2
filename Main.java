package ua.prog.java.lesson8_2;

public class Main {

	public static void main(String[] args) {
		
		BlackList instanceOfBlackList = new BlackList();
		instanceOfBlackList.addClassToBlackList(SpaceShip.class);
		Stack objectsStack = new Stack(instanceOfBlackList);
		
		MineCraft gameOne = new MineCraft("1.7.10");
		SpaceShip shipOne = new SpaceShip("Inteceptor", 60, 1000);
		HomoSapiens humanOne = new HomoSapiens(40,"Asia");
		
		objectsStack.addObject(gameOne);
		objectsStack.addObject(shipOne);
		objectsStack.addObject(humanOne);
		objectsStack.addObject(gameOne);
		objectsStack.addObject(shipOne);
		System.out.println(objectsStack.toString());
		
		System.out.println();
		
		Object getObjectFromTopOfStack =  objectsStack.readObject();
		System.out.println("Object from Top Of Stack: " + getObjectFromTopOfStack.toString());
		System.out.println(objectsStack.toString());
		
		System.out.println();
		
		objectsStack.deleteObject();
		getObjectFromTopOfStack =  objectsStack.readObject();
		System.out.println("Object from Top Of Stack: " + getObjectFromTopOfStack.toString());
		System.out.println(objectsStack.toString());
		
		System.out.println();
		
		getObjectFromTopOfStack =  objectsStack.cutObject();
		System.out.println("Cutted Object: " + getObjectFromTopOfStack.toString());
		System.out.println(objectsStack.toString());

	}

}
