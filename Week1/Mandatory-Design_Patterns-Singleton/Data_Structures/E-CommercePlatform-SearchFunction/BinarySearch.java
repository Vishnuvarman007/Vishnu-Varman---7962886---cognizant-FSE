public class BinarySearch {
    public boolean search(Product[] arr, int tar) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid].getProductId()== tar) {
                return true;
            } else if (arr[mid].getProductId()< tar) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
