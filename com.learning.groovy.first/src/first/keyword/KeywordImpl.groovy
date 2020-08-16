package first.keyword
//as keyword
import importPack.ReadyMethod as RM
class KeywordImpl implements Trait1,Trait2 {
	
	String doMethod2()
	{
		Trait1.super.doMethod2()
	}
	static main (args)
	{
		//def keyword
		def impl = new KeywordImpl() as KeywordImpl
		//Trait resolving ambiguity problems
		/*
		 * 1) using sequence of trait implemented, last one is considered
		 * 2) using Trait.super in overridden method
		 * 3) using runtime trait
		 */
		assert impl.doMethod1() == 'Do Trait2'
				
		println 'Result -> '+impl.doMethod1()
		println 'Result -> '+impl.doMethod2()
		
		def impl2 = new KeywordImpl() as Runtime
		
		println 'Result -> '+impl2.runTimeMethod()
		
		//in keyword in collection
		def booleanValue='Rohit' in ['Rohit','Kapani']
		
		print 'in keyword checking in collection type data->' + booleanValue
 
	}
}
