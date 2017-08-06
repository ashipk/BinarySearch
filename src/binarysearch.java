
public class binarysearch {
public int bsearch(int a[],int x) {
	int first = 0;
	int last = a.length-1;
	while(first<=last) {
		int mid = (first+last)/2;
		if (x == a[mid]) {
			return mid;
		}
		if (x < a[mid]) {
			last = mid-1;
		}
		if (x > a[mid]) {
			first = mid+1;
		}
	}
	return -1;
}

public static void main(String[] args) {
	int a[] = {10,15,22,28,32,35,37,45,48,52};
	int x = 48;
	binarysearch bs = new binarysearch();
	System.out.println("Position is "+bs.bsearch(a, x));
}
}

