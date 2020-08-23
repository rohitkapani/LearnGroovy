package first

class SomeOperators {
	static void main(def arg)
	{
		def range = 1..10;
		println(range);
		println(range.get(2));


		//arithmatic operators
		
		assert 9.intdiv(5)==1
		assert 2**3==8 //2 raise to power 3
		
		//Spreaddot operator
		def list = ["Hello", "Test", "Lars"]
		def sizeList = list*.size()
		println sizeList
	}
}
