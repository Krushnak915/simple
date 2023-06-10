package assignment;

public class switchmonth {

	public static void main(String[] args) {
		int day=3;
		String week;
        switch(day){
		case 1:
		week="monday";
		break;
		case 2:
		week="tuesday";
		break;
		case 3:
		week="wensday";
		break;
		case 4:
		week="thursday";
		break;
		case 5:
		week="friday";
		break;
		case 6:
		week="saturday";
		break;
		case 7:
		week="sunday";
		break;
		default:
		week="invalid day";
		break;
		}
		System.out.println(week);

	}

}
