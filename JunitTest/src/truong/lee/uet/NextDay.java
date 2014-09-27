package truong.lee.uet;

public class NextDay {
	private int day;
	private int month;
	private int year;
	
	
	public NextDay(int day, int month, int year) throws Exception{
		if( day < 1 || day > 31 || month < 1 || month > 12 || year < 1812 || year > 2012){
			 throw new  Exception("Du lieu khong dung");
		}
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public int  checkNextDay(){
		if(this.month == 1 || this.month == 3 || this.month == 5 || this.month== 7 || this.month == 8 || this.month == 10){
			if(this.day < 31){
				this.day += 1;
				return 1;
			}else{
				this.day = 1;
				this.month += 1;
				return 1;
			}
			
		}
		
		if(this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11){
			if(this.day <30){
				this.day += 1;
				return 2;
			}else{
				this.day = 1;
				this.month += 1;
				return 2;
			}
			
		}
		
		if(this.month == 12){
			if(this.day < 31){
				this.day += 1;
				return 3;
			}else{
				this.day = 1;
				this.month = 1;
				if(this.year == 2012){
					System.out.println("2012 is over");
				}else{
					this.year += 1;
				}
				return 3;
			}
			
		}
		
		if(this.month == 2){
			if(this.day <28){
				this.day += 1;
				return 4;
			}else{
				if(this.day == 28){
					if(	((this.year % 4 == 0) && (this.year % 100 != 0)) || (this.year % 400 == 0)){
						this.day = 29;
						return 4;
					}else{
						this.day = 1;
						this.month = 3;
						return 4;
					}
				}else{
					if(this.day == 29){
						this.day = 1;
						this.month = 3;
						return 4;
					}
				}
				return 4;
			}
			
		}
		return 4;
	}
	
	public void print(){
		System.out.println(this.day + " " +this.month + " " + this.year);
	}
}
