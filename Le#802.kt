class Solution {
    fun eventualSafeNodes(graph: Array<IntArray>): List<Int> {
        if(graph.size > Math.pow(10,4))
           return lostOf();
        val list = mutableListOf<Int>();
    var g=0;
        for(i in graph){
        g++
            if(i.size == 0){
               list.add(g);
            }else{
                var j = 0;
		var h = 0;
                while(h < i.size){
                    if(graph[i[h]].size == 0){ 
                      j++;
                    }else{
                        break;
                    }
			h++;
                    }
                    if(j == i.size){
                        list.add(g);
                }
                }
             }

          val list2 = list.distnict().sorted();
          return list2;
    }
}
