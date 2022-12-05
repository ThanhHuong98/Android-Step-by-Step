public class MyImageAdapter extends BaseAdapter{
	.............
	public View getView(int position, View convertView, ViewGroup parent)
		---------
}

* [convertView] is The reused View: Khung nhìn tái sử dụng
<<<If this is null it means that there is no recycled View 
   and we have to create a new one, 
   otherwise we should use it to avoid creating a new>>>
* LayoutInflater is used to get the View object which you define in a layout xml 
  (the root object, normally a LinearLayout, FrameLayout, or RelativeLayout)
* parentView is the view which contained the item's view which getView() generates. 
  Normally it is ListView or Gallery..
Note: don't call this method directly, just need to implement