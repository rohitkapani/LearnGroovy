package first

class MethodsExample {
	def invokeMethod(String name, Object args) {
		return "called invokeMethod $name $args"
	}

	//no datatype of parameters required , identify at runtime
	//can give default parameters
	def getName(parameter,default_parameter2 = 0, default_parameter3 = 0) {
		parameter+' Kapani'  // by default last statememt is returned
	}
	
	static void main(def arg)
	{
		def x = "Rohit" as String
		def object=new MethodsExample()
		println("Call Name :" +object.getName(x));
		println("Call non existing method :" + x +" " +object.myName(x));
	}
}
