package Task12;

public class MonthUtils {

    public static final Month jan  = new Month("January",30,20);
    public static final Month feb  = new Month("February",30,20);
    public static final Month mar  = new Month("March",30,20);
    public static final Month apr  = new Month("April",30,20);
    public static final Month may  = new Month("May",30,20);
    public static final Month june  = new Month("June",30,20);
    public static final Month july  = new Month("July",30,20);
    public static final Month aug  = new Month("August",30,20);
    public static final Month sep  = new Month("September",30,20);
    public static final Month oct  = new Month("October",30,20);
    public static final Month nov  = new Month("November",30,20);
    public static final Month dec  = new Month("December",30,20);

    public static Month[] getQ1() {
        return new Month[]{jan, feb, mar};
    }
    public static Month[] getHalfYear() {
        return new Month[]{jan, feb, mar, apr, may, june};
    }
    public static Month[] getYear(){
        return new Month []{jan,feb,mar,apr,may,june,july,aug,sep,oct,nov,dec};
    }



}
