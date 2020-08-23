package first

class LoopsExample {
	static void main(def arg)
	{
		println "Loop using In"
		for (def i in 1..5)  // in works with collection only
			println i
	   
			println "Loop using upto"
	   1.upto(5)
	   {
		   println "$it"  // it is iteration
	   }
	   
	   println "Loop using times"
	   5.times
	   {
		   println "$it"  // it is iteration
	   }
	   println "Loop using step with increment"
	   
	   1.step(10,2)     //with increment
	   {
		   println "$it"  // it is iteration till 10 by incrementing 2
	   }
	   
	}
}
