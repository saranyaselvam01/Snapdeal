package snapdealtask.Snapdeal;


public class ScriptPage extends BasePage{
	
	public static void main(String[] args) throws InterruptedException
	{
		launchBrowser();
		loadurl("https://www.snapdeal.com");
		getTitle();
		getCurrentUrl();
		HomePage hp=new HomePage();
		fill(hp.getEntervalue(),"iphone 6");
		btnclick(hp.getSearch());
		SelectPage sp=new SelectPage();
		btnclick(sp.getSelecttitle());
		wait1();
		window();
		windows();
		BuyPage bp=new BuyPage();
		btnclick(bp.getBuynow());
		FormPage fp=new FormPage();
		fill(fp.getPincode(),"621103");
		fill(fp.getFullname(),"saranya");
		fill(fp.getAddress(),"21/A,Pandian Street,palavakkam");
		fill(fp.getLandmark(),"Near Hot Chips");
		fill(fp.getCity(),"Chennai");
		fill(fp.getState(),"TamilNadu");
		fill(fp.getMobile(),"9176670106");
		btnclick(fp.getAddresstype());
		btnclick(fp.getSave());
		PaymentPage pp=new PaymentPage();
		btnclick(pp.getPayment());
		FinalPage ff=new FinalPage();
		fill(ff.getCardnum(),"12341234123412341234");
		SVT(ff.getMonth(),"03");
		SVT(ff.getYear(),"21");
		fill(ff.getCvv(),"123");
}
}
