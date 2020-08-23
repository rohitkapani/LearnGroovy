package first

class StringAndGStringsImpl {
	static void main(def arg)
	{
		def name = "John"
		def s1 = "Hello $name" // $name will be replaced
		def s2 = 'Hello $name' // $name will not be replaced
		println s1
		println s2
		println s1.class
		println s2.class
		
		// demonstrates object references and method calls
		def date = new Date()
		println "We met at $date"
		
		//string repetition
		String a = "Hello";
		println("Hello"*3);
		println(a*3);
		println(a.next());
		println(a.previous());
		
		
	}
}
