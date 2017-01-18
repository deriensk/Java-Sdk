public class EmployeeTest{
	public static void main(String[] args) {
		Employee emp = new Employee();

		emp.setId(5);
		emp.setName("Ram");
		emp.setEmail("ram@gmail.com");

		System.out.println(emp);
	
		/*int id = emp.getId();
		String name = emp.getName();
		String email = emp.getEmail();

		*/

	}
}

/*>>> class XYZ():
...     x = "attribute has been set"
... 
>>> instance = XYZ()
>>> instance.x
'attribute has been set'
>>> getattr(instance, "x")
'attribute has been set'
>>> setattr(instance, "a", "new attribute has been set")
>>> instance.a
'new attribute has been set'
>>> getattr(instance, "a")
'new attribute has been set'
*/