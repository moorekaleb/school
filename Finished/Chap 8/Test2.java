class Count2
{
	private int hour;
	private int minute;
	private int second;
	public Count2()
	{
		this(0,0,0);
	}
	public Count2(int hour)
	{
		this(hour,0,0);
	}
	public Count2(int hour, int minute)
	{
		this(hour,minute,0);
	}
	public Count2(int hour, int minute, int second)
	{
		if(hour < 0 || hour >= 24)
			throw new IllegalArgumentException("hour must be 0-23");
		if(minute < 0 || minute >= 60)
			throw new IllegalArgumentException("minute must be 0-59");
		if(second < 0 || second >= 60)
			throw new IllegalArgumentException("second must be 0-59");
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	public Count2(Count2 time)
	{
		this(time.getHour(), time.getMinute(), time.getSecond());
	}
	public void setTime(int hour, int minute, int second)
	{
		if(hour < 0 || hour >= 24)
			throw new IllegalArgumentException("hour must be 0-23");
		if(minute < 0 || minute >= 60)
			throw new IllegalArgumentException("minute must be 0-59");
		if(second < 0 || second >= 60)
			throw new IllegalArgumentException("second must be 0-59");
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	public void setHour(int hour)
	{
		if(hour < 0 || hour >= 24)
			throw new IllegalArgumentException("hour must be 0-23");
		this.hour = hour;
	}
	public void setMinute(int minute)
	{
		if(minute < 0 || minute >= 60)
			throw new IllegalArgumentException("minute must be 0-59");
		this.minute = minute;
	}
	public void setSecond(int second)
	{
		if(second < 0 || second >= 60)
			throw new IllegalArgumentException("second must be 0-59");
		this.second = second;
	}
	public int getHour()
	{
		return hour;
	}
	public int getMinute()
	{
		return minute;
	}
	public int getSecond()
	{
		return second;
	}
	public String toUniversalString()
	{
		return String.format("%02d:%02d:%02d", getHour(), getMinute(), 
			getSecond());
	}
	public String toString()
	{
		return String.format("%d:%02d:%02d %s", ((getHour() == 0 || 
			getHour() == 12) ? 12 : getHour() % 12), 
			getMinute(), getSecond(), 
			(getHour() < 12 ? "AM" : "PM"));
	}
	public void tick()
	{
		if(this.second == 59)
		{
			this.second = 0;
			this.incrementMinute();
			return;
		}
		this.second += 1;
		return;
	}
	public void incrementMinute()
	{
		if(this.minute == 59)
		{
			this.minute = 0;
			this.incrementHour();
			return;
		}
		this.minute += 1;
		return;
	}
	public void incrementHour()
	{
		if(this.hour == 23)
		{
			this.hour = 0;
			return;
		}
		this.hour += 1;
		return;
	}
}

public class Test2
{
	public static void main(String[] args)
	{
		Count2 T = new Count2(22, 58, 59);
		System.out.printf("Time now:		%s (i.e. %s)%n", 
			T.toUniversalString(), T);
		T.incrementMinute();
		System.out.printf("Time after 1 minute:	%s (i.e. %s)%n",
			T.toUniversalString(), T);
		T.incrementHour();
		System.out.printf("Time after 1 hour:	%s (i.e. %s)%n",
			T.toUniversalString(), T);
		T.tick();
		System.out.printf("Time going to new day: %s (i.e. %s)%n",
			T.toUniversalString(), T);
	}
}