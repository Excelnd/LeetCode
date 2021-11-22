import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class KthLargest {
	private PriorityQueue<Integer> pq;
	private static int k;

	public KthLargest(int k, int[] nums) {
		this.k = k;
		pq = new PriorityQueue<Integer>();

		for (int num : nums) {
			pq.offer(num);
		}

		while (pq.size() > k) {
			pq.poll();
		}

	}

	public int add(int val) {
		pq.offer(val);

		while (pq.size() > k) {
			pq.poll();
		}

//		System.out.println(pq.peek());
		return pq.peek();
	}

//	public static void main(String[] args) {
//		int[] nums = { 4, 5, 8, 2 };
//		KthLargest kthLargest = new KthLargest(3, nums);
//
//		kthLargest.add(3);
//		kthLargest.add(5);
//		kthLargest.add(10);
//		kthLargest.add(9);
//		kthLargest.add(4);
//
//	}

}