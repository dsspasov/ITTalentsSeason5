/*Класът Call да съдържа следните полета:
priceForAMinute – статично поле, което показва цената на разговор за
минута
caller - показва телефона, от който е направено повикването
receiver - показва телефона, към който е направено повикването
duration - дължината на разговора (в минути)*/
public class Call {
	
	static double priceForCall = 0.0;
	GSM caller;
	GSM receiver;
	int duration;//seconds
}
