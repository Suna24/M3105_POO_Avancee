package structure.pont2;

public class BridgePattern { 
	
    public static void main(String[] args) {
    	
        Vehicle vehicle1 = new Car(new Produce(), new Assemble()); 
        vehicle1.manufacture(); 
    
        Vehicle vehicle2 = new Bike(new Produce(), new Assemble()); 
        vehicle2.manufacture(); 
    } 
} 

//Questions

//Roles g�n�riques
//Car and Bike --> RefinedAbstraction
//Produce and Assemble --> ConcreteImplementor
//Workshop --> Implementor
