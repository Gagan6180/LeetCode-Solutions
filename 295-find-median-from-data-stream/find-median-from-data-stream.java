class MedianFinder {

    PriorityQueue<Integer>maxHeap;
    PriorityQueue<Integer>minHeap;

    public MedianFinder() {
       
       maxHeap = new PriorityQueue<>((a,b) -> (b-a));
       minHeap = new PriorityQueue<>();

    }
    
    public void addNum(int num) {
        
        maxHeap.add(num);
        if(!maxHeap.isEmpty() && !minHeap.isEmpty() && maxHeap.peek() > minHeap.peek()){
            int val = maxHeap.poll();
            minHeap.add(val);
        }
        if(maxHeap.size() > minHeap.size()+1){
            int val = maxHeap.poll();
            minHeap.add(val);
        }
        if(maxHeap.size()+1 < minHeap.size() ){
            int val = minHeap.poll();
            maxHeap.add(val);
        }
    }
    
    public double findMedian() {
        
        if(maxHeap.size() > minHeap.size()){
            return maxHeap.peek();
        }
        else if(maxHeap.size() < minHeap.size()){
            return minHeap.peek();
        }
        else{
            return (maxHeap.peek() + minHeap.peek()) / 2.0;
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */