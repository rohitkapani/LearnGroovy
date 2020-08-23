package first.keyword

class KeywordImpl implements Trait1,Trait2 {
	
	String doMethod2()
	{
		Trait1.super.doMethod()
	}
	static main (args)
	{
		//def keyword
		def impl = new KeywordImpl() 
		//Trait resolving ambiguity problems
		/*
		 * 1) using sequence of trait implemented, last one is considered
		 * 2) using Trait.super in overridden method
		 * 3) using runtime trait
		 */
		assert impl.doMethod() == 'Do Trait2'
				
		println 'Result 1 -> '+impl.doMethod()
		
		println 'Result 2 -> '+impl.doMethod2()
		
		def impl2 = new KeywordImpl() as Runtime
		
		println 'Result 3 -> '+impl2.runTimeMethod()
		
		//in keyword in collection
		def booleanValue='Rohit' in ['Rohit','Kapani']
		
		print 'in keyword checking in collection type data->' + booleanValue
 
	}
}
