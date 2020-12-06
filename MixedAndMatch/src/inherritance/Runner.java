package inherritance;


/*Inheritance = inherite all codes , that is not static.
 * Parent does not inherite from the child.
 * Child can only one parent, it can inherite one time only.
 * A child will get the trait from parent and grandparent and the parent before.
 */

public class Runner {

	public static void main(String[] args) {
		
		
		Parent p = new Parent();
		Child c = new Child();
		Parent.sleep();
		
		}

}
