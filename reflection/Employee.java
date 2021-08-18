package reflection;

import java.io.Serializable;

public class Employee implements Serializable,Cloneable {
private int id;
/**
 * @return the id
 */
public int getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(int id) {
	this.id = id;
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the position
 */
public String getPosition() {
	return position;
}
/**
 * @param position the position to set
 */
public void setPosition(String position) {
	this.position = position;
}
private String name;
private String position;
public Employee() {
	System.out.println("default constructor called");
}
private Employee(int id, String name, String position) {
	super();
	this.id = id;
	this.name = name;
	this.position = position;
}

}
