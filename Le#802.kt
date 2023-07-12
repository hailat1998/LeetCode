class Solution {
    fun eventualSafeNodes(graph: Array<IntArray>): List<Int> {
        if(graph.size > Math.pow(10,4))
           return lostOf();
        val list = mutableListOf<Int>();
        for(i in graph){
            if(graph[i].size == 0){
               list.add(i);
            }else{
                var j = 0;
                for(u in graph[i]){
                    if(graph[u].size == 0){ 
                      j++;
                    }else{
                        break;
                    }
                    }
                    if(j == graph[u].size){
                        list.add(i).distnict()
                }
                }
             }

          val list2 = list.distnict().sort();
          return list2;
    }
}
