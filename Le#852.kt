class Solution {
    fun peakIndexInMountainArray(a: IntArray): Int {
        var right = a.size -1 ; 
        var left = 0 ; 
        while(right > left){
            var mid = left + (right-left)/2;
            if(mid > 0 && mid < a.size - 1 && a[mid] > a[mid-1] && a[mid] > a[mid+1])
               return mid ; 
            if(mid > 0 && a[mid] > a[mid -1] && a[mid] < a[mid+1])
                 left = mid
            if(mid < a.size - 1 && a[mid] > a[mid+1] && a[mid] < a[mid-1])
                 right = mid;
                 }
        return -1; 
    }
}
