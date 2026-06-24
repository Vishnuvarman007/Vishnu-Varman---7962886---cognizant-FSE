class LinearSearch{
    public boolean search(Product[] arr,int tar) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getProductId() == tar) {
                return true;
            }
        }
        return false;

    }

}