class Time2
{
	private long sec;
	public Time2()
	{
		this(0,0,0);
	}
	public Time2(int hour)
	{
		this(hour,0,0);
	}
	public Time2(int hour, int minute)
	{
		this(hour,minute,0);
	}
	public Time2(int hour, int minute, int second)
	{
		if(hour < 0 || hour >= 24)
			throw new IllegalArgumentException("hour must be 0-23");
		if(minute < 0 || minute >= 59)
			throw new IllegalArgumentException("minute must be 0-59");
		if(second < 0 || second >= 59)
			throw new IllegalArgumentException("second must be 0-59");
		this.sec = hour * 3600 + minute * 60 + second;
	}
	public Time2(Time2 time)
	{
		this(time.getHour(), time.getMinute(), time.getSecond());
	}
	public void setTime(int hour, int minute, int second)
	{
		if(hour < 0 || hour >= 24)
			throw new IllegalArgumentException("hour must be 0-23");
		if(minute < 0 || minute >= 59)
			throw new IllegalArgumentException("minute must be 0-59");
		if(second < 0 || second >= 59)
			throw new IllegalArgumentException("second must be 0-59");
		this.sec = hour * 60 * 60 + minute * 60 + second;
	}
	public void setHour(int hour)
	{
		if(hour < 0 || hour >= 24)
			throw new IllegalArgumentException("hour must be 0-23");
		int curr_hours = this.getHour();
		this.sec -= curr_hours * 3600;
		this.sec += hour * 3600;
	}
	public void setMinute(int minute)
	{
		if(minute < 0 || minute >= 59)
			throw new IllegalArgumentException("minute must be 0-59");
		int curr_minutes = this.getMinute();
		this.sec -= curr_minutes * 60;
		this.sec += minute * 60;
	}
	public void setSecond(int second)
	{
		if(second < 0 || second >= 59)
			throw new IllegalArgumentException("second must be 0-59");
		int curr_seconds = this.getSecond();
		this.sec -= curr_seconds;
		this.sec += second;
	}
	public int getHour()
	{
		return (int)this.sec / 3600;
	}
	public int getMinute()
	{
		int hours = this.getHour();
		int rem = (int)this.sec - hours * 3600;
		return rem / 60;
	}
	public int getSecond()
	{
		int hours = this.getHour();
		int minutes = this.getMinute();
		return (int)this.sec - hours * 3600 - minutes * 60;
	}
	public String toUniversalString()
	{
		return String.format("%02d:%02d:%02d", this.getHour(), this.getMinute(), 
			this.getSecond());
	}
	public String toString()
	{
		return String.format("%d:%02d:%02d %s", ((this.getHour() == 0 || 
			this.getHour() == 12) ? 12 : this.getHour() % 12), 
			this.getMinute(), this.getSecond(), 
			(this.getHour() < 12 ? "AM" : "PM"));
	}
}

public class Time2Test
{
	public static void main(String[] args)
	{
		Time2 t1 = new Time2();
		Time2 t2 = new Time2(2);
		Time2 t3 = new Time2(21, 34);
		Time2 t4 = new Time2(12, 25, 42);
		Time2 t5 = new Time2(t4);
		
		System.out.println("Constructed with:");
		displayTime("t1: all default arguments", t1);
		displayTime("t2: hour specified; default minute and second", t2);
		displayTime("t3: hour and minute specified; default second", t3);
		displayTime("t4: hour, minute and second specified", t4);
		displayTime("t5: Time2 object t4 specified", t5);
		
		try
		{
			Time2 t6 = new Time2(27, 74, 99);
		}
		catch(IllegalArgumentException e)
		{
			System.out.printf("%nException while initializing t6: %s%n",
				e.getMessage());
		}
	}
	private static void displayTime(String header, Time2 t)
	{
		System.out.printf("%s%n 	%s%n	%s%n", header, t.toUniversalString(),
			t.toString());
	}
}