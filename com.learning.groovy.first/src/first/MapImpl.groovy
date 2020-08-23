package first

class MapImpl {
	static void main(def arg)
	{
      def emptyMap 	=[ : ]
	  assert emptyMap.size()==0
	  def map = [Jim:"Knopf", Thomas:"Edison"]
	   for (entry in map)
	   {
	   print entry.key +"->"
	   println entry.value
	   }
	   
	}
}
