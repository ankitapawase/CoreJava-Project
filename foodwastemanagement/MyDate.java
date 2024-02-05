package foodwastemanagement;

 class MyDate {
	int dd,mm,yy;
	public MyDate(int dd, int mm, int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	public void display() {
		System.out.println("Date : "+dd+"-"+mm+"-"+yy);
	}
	@Override
	public String toString() {
		return dd + "-" + mm + "-" + yy;
	}
}
