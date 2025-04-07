package lesson5;

public /*final*/ enum MyEnum /*extends java.lang.Enum*/ {
	/*public static final MyEnum */SUNDAY("Воскр",true) /* = new MyEnum(0,"SUNDAY") */,
	MONDAY("ПН",false)/* = new MyEnum(1,"MONDAY","ПН") */,
	TUESDAY("ВТ",false),
	WEDNESDAY("СР",false),
	THURSDAY("ЧТ",false),
	FRIDAY("ПТ",false),
	/*public static final MyEnum */	SATURDAY("СБ",true); /* = new MyEnum(6,"SATURDAY") */
	
	private final String russianName;
	private final boolean holiday;
	
	private MyEnum(/*int ordinal, String name,*/final String russianName, final boolean holiday) {
		/*super(ordinal,name)*/
		this.russianName = russianName;
		this.holiday = holiday;
	}
	
	public String getRussianName() {
		return russianName;
	}
	
	public boolean isHoliday() {
		return holiday;
	}
}
