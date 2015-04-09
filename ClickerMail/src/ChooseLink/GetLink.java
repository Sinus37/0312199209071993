package ChooseLink;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class GetLink {

	int scase;
	ArrayList<String> AroundTheMoney = new ArrayList<String>();
	ArrayList<String> AtlantisMails = new ArrayList<String>();
	ArrayList<String> Boni4You = new ArrayList<String>();
	ArrayList<String> Bonimail = new ArrayList<String>();
	ArrayList<String> BoniTV = new ArrayList<String>();
	ArrayList<String> Bonix = new ArrayList<String>();
	ArrayList<String> BonusBunny = new ArrayList<String>();
	ArrayList<String> BonusEmails = new ArrayList<String>();
	ArrayList<String> CashDevil = new ArrayList<String>();
	ArrayList<String> CashMails = new ArrayList<String>();
	ArrayList<String> CashTown = new ArrayList<String>();
	ArrayList<String> DailyCent = new ArrayList<String>();
	ArrayList<String> DodonaMails = new ArrayList<String>();
	ArrayList<String> Dondino = new ArrayList<String>();
	ArrayList<String> DresendMails = new ArrayList<String>();
	ArrayList<String> Dschungel = new ArrayList<String>();
	ArrayList<String> Earnstar = new ArrayList<String>();
	ArrayList<String> eBesucher = new ArrayList<String>();
	ArrayList<String> EliteMailer = new ArrayList<String>();
	ArrayList<String> Euroearn = new ArrayList<String>();
	ArrayList<String> Fairpaidmail = new ArrayList<String>();
	ArrayList<String> Geldboni = new ArrayList<String>();
	ArrayList<String> GongMails = new ArrayList<String>();
	ArrayList<String> IdealShoppen = new ArrayList<String>();
	ArrayList<String> infomails = new ArrayList<String>();
	ArrayList<String> IntermailLive = new ArrayList<String>();
	ArrayList<String> Klickportal24 = new ArrayList<String>();
	ArrayList<String> KronenMailer = new ArrayList<String>();
	ArrayList<String> LiveMails = new ArrayList<String>();
	ArrayList<String> LouisMails = new ArrayList<String>();
	ArrayList<String> Lugrando = new ArrayList<String>();
	ArrayList<String> MailerOne = new ArrayList<String>();
	ArrayList<String> Maxearn = new ArrayList<String>();
	ArrayList<String> MaxMailer = new ArrayList<String>();
	ArrayList<String> MoneyMails24 = new ArrayList<String>();
	ArrayList<String> Paid4 = new ArrayList<String>();
	ArrayList<String> Paidportal24 = new ArrayList<String>();
	ArrayList<String> Profitmails = new ArrayList<String>();
	ArrayList<String> ProvanceMailer = new ArrayList<String>();
	ArrayList<String> Qassa = new ArrayList<String>();
	ArrayList<String> Questler = new ArrayList<String>();
	ArrayList<String> Reading4Money = new ArrayList<String>();
	ArrayList<String> SparMailer = new ArrayList<String>();
	ArrayList<String> Starmailer = new ArrayList<String>();
	ArrayList<String> Unique = new ArrayList<String>();
	ArrayList<String> WhiteAngelMails = new ArrayList<String>();
	ArrayList<String> Wiena = new ArrayList<String>();
	ArrayList<String> XXLpool = new ArrayList<String>();
	ArrayList<String> Ybbo = new ArrayList<String>();

	ArrayList<String> tempContain = new ArrayList<String>();
	ArrayList<ArrayList<String>> AllAL = new ArrayList<ArrayList<String>>();
	String[] finishedLink = new String[2];
	
	
	public void generate() {
		//add all ArrayLists to one ArrayList
		AllAL.add(Ybbo);
		AllAL.add(XXLpool);
		AllAL.add(Wiena);
		AllAL.add(WhiteAngelMails);
		AllAL.add(Unique);
		AllAL.add(Starmailer);
		AllAL.add(Ybbo);
		AllAL.add(SparMailer);
		AllAL.add(Reading4Money);
		AllAL.add(Questler);
		AllAL.add(Qassa);
		AllAL.add(ProvanceMailer);
		AllAL.add(Profitmails);
		AllAL.add(Paidportal24);
		AllAL.add(Paid4);
		AllAL.add(MoneyMails24);
		AllAL.add(MaxMailer);
		AllAL.add(Maxearn);
		AllAL.add(MailerOne);
		AllAL.add(Lugrando);
		AllAL.add(LouisMails);
		AllAL.add(LiveMails);
		AllAL.add(KronenMailer);
		AllAL.add(Klickportal24);
		AllAL.add(IntermailLive);
		AllAL.add(infomails);
		AllAL.add(IdealShoppen);
		AllAL.add(GongMails);
		AllAL.add(Geldboni);
		AllAL.add(Fairpaidmail);
		AllAL.add(Euroearn);
		AllAL.add(EliteMailer);
		AllAL.add(eBesucher);
		AllAL.add(Earnstar);
		AllAL.add(Dschungel);
		AllAL.add(DresendMails);
		AllAL.add(Dondino);
		AllAL.add(DodonaMails);
		AllAL.add(DailyCent);
		AllAL.add(CashTown);
		AllAL.add(CashMails);
		AllAL.add(CashDevil);
		AllAL.add(BonusEmails);
		AllAL.add(BonusBunny);
		AllAL.add(Bonix);
		AllAL.add(BoniTV);
		AllAL.add(Bonimail);
		AllAL.add(Boni4You);
		AllAL.add(AtlantisMails);
		AllAL.add(AroundTheMoney);
	}

	public void setList(String mail, String sender, String kindOf)
			throws IOException {
		System.out.println("Sender: " + sender);
		if (sender.contains("Provence")) {
			scase = 1;
		}
		if (sender.contains("reading")) {
			tempContain.add("www.reading4money.de/paidmail.php");
			Reading4Money.add(getLink(mail, "OneMail", "EndAndMovePointer", tempContain, "mid=0", 5)[0]);
			tempContain.clear();
		}
		if (sender.contains("Qassa")) {
			tempContain.add("www.qassa.de/am.php?h=");
			Qassa.add(getLink(mail, "OneMail", "OnlyMovePointer", tempContain, "", 76)[0]);
			tempContain.clear();
		}
		if (sender.contains("XXLpool")) {
			tempContain.add("http://www.xxlpool.de/postfach.php?userid=");
			XXLpool.add(getLink(mail, "OneMail", "OnlyMovePointer", tempContain, "", 85)[0]);
			tempContain.clear();
		}
		if (sender.contains("bonimail")) {
			tempContain.add("http://www.bonimail.de/link/?");
			Bonimail.add(getLink(mail, "OneMail", "OnlyMovePointer", tempContain, "", 59)[0]);
			tempContain.clear();
		}
		if (sender.contains("fairpaidmail")) {
			tempContain.add("http://www.fairpaidmail.com/on/de/");
			tempContain.add("http://www.fairpaidmail.com/pm/de/");
			for(int i = 0; i < tempContain.size() -1; i++){
				Fairpaidmail.add(getLink(mail, "MoreLinks", "CompleteLine", tempContain, "", 59)[i]);
			}
			tempContain.clear();
		}
		if (sender.contains("Profitmails")) {
			tempContain.add("http://www.profitmails.de/pm.php?");
			Bonimail.add(getLink(mail, "OneMail", "OnlyMovePointer", tempContain, "", 59)[0]);
			tempContain.clear();
		}
		if (sender.contains("info-mails")) {
			tempContain.add("http://www.info-mails.de/klick_profiwin.php?id=199730");
			Bonimail.add(getLink(mail, "OneMail", "OnlyEnd", tempContain, "k=0", 0)[0]);
			tempContain.clear();
		}
		if (sender.contains("bonus-emails")) {
			tempContain.add("http://www.bonus-emails.de/paidklick.php?id=");
			Bonimail.add(getLink(mail, "OneMail", "EndAndMovePointer", tempContain, "target", -2)[0]);
			tempContain.clear();
		}
		if (sender.contains("Questler")) {
			tempContain.add("http://questler.de/link.php?id=");
			Bonimail.add(getLink(mail, "OneMail", "EndAndMovePointer", tempContain, "user=273220", 11)[0]);
			tempContain.clear();
		}
		if (sender.contains("earnstar.de")) {
			tempContain.add("http://www.earnstar.de/link.php?go=");
			Bonimail.add(getLink(mail, "OneMail", "EndAndMovePointer", tempContain, "go=", 31)[0]);
			tempContain.clear();
		}
		if (sender.contains("Gongmails.de")) {
			tempContain.add("http://www.Gongmails.de/questionmail.php?username=cfmap");
			Bonimail.add(getLink(mail, "OneMail", "EndAndMovePointer", tempContain, "cfmap", 19)[0]);
			tempContain.clear();
		}
		if (sender.contains("Cash-Town.de")) {
			tempContain.add("http://cash-town.de/askmail.php?uid=");
			tempContain.add("http://cash-town.de/paidmail.php?username=cfmap&");
			Bonimail.add(getLink(mail, "MoreLinks", "EndAndMovePointer", tempContain, "uid=", 19)[0]);
			tempContain.clear();
		}
		if (sender.contains("Ybbo")) {
			tempContain.add("http://www.ybbo.de/_p.");
			Bonimail.add(getLink(mail, "OneLink", "EndAndMovePointer", tempContain, "rdb=7", 4)[0]);
			tempContain.clear();
		}
		if (sender.contains("Kronen-Mailer")) {
			tempContain.add("http://www.kronen-mailer.de/paidmail.php?username=cfmap");
			Bonimail.add(getLink(mail, "OneLink", "EndAndMovePointer", tempContain, "stan", 15)[0]);
			tempContain.clear();
		}
		if (sender.contains("Live-Mails")) {
			tempContain.add("http://www.live-mails.de/pmail");
			Bonimail.add(getLink(mail, "OneLink", "OnlyEnd", tempContain, "\">", 0)[0]);
			tempContain.clear();
		}
		if (sender.contains("Louis-Mailer")) {
			tempContain.add("www.louis-mailer.de/pmail");
			Bonimail.add(getLink(mail, "OneLink", "EndAndMovePointer", tempContain, ">Bestätigen", -1)[0]);
			tempContain.clear();
		}
		if (sender.contains("Max-Mails")) {
			tempContain.add("www.max-mails.de/pmail");
			Bonimail.add(getLink(mail, "OneLink", "CompleteLine", tempContain, "", 0)[0]);
			tempContain.clear();
		}
		if (sender.contains("Maxearn")) {
			tempContain.add("www.maxearn.de/pmail");
			Bonimail.add(getLink(mail, "OneLink", "EndAndMovePointer", tempContain, ">Bestätigen", -1)[0]);
			tempContain.clear();
		}
		if (sender.contains("Spar-Mailer")) {
			tempContain.add("www.spar-mailer.de/mail.php");
			Bonimail.add(getLink(mail, "OneLink", "OnlyMovePointer", tempContain, "", 59)[0]);
			tempContain.clear();
		}
		if (sender.contains("Paidportal24")) {
			tempContain.add("www.paidportal24.de/pmail.php?");
			Bonimail.add(getLink(mail, "OneLink", "EndAndMovePointer", tempContain, "><img", -1)[0]);
			tempContain.clear();
		}
		if (sender.contains("Cash-mails.eu")) {
			tempContain.add("http://www.cash-mails.eu/");
			Bonimail.add(getLink(mail, "OneLink", "CompleteLine", tempContain, "", 0)[0]);
			tempContain.clear();
		}
		if (sender.contains("EuroEarn.de")) {
			tempContain.add("www.euroearn.de/");
			Bonimail.add(getLink(mail, "OneLink", "CompleteLine", tempContain, "", 0)[0]);
			tempContain.clear();
		}
		if (sender.contains("Unique-Mails")) {
			tempContain.add("http://www.unique-mails.de/index.php?mod=paidmai");
			tempContain.add("http://www.unique-mails.de/index.php?mod=questmail");
			for(int i = 0; i < tempContain.size() -1; i++){
				Bonimail.add(getLink(mail, "OneLink", "CompleteLine", tempContain, "", 0)[i]);
			}
			tempContain.clear();
		}
		if (sender.contains("Money-Mails")) {
			tempContain.add("www.money-mails24.de/index.php?mod=paidmail");
			tempContain.add("www.money-mails24.de/index.php?mod=questmail");
			for(int i = 0; i < tempContain.size() -1; i++){
				Bonimail.add(getLink(mail, "OneLink", "CompleteLine", tempContain, "", 0)[i]);
			}
			tempContain.clear();
		}
		if (sender.contains("Klickportal24")) {
			tempContain.add("www.klickportal24.de/pmail.php?");
			Bonimail.add(getLink(mail, "OneLink", "EndAndMovePointer", tempContain, "><img", -1)[0]);
			tempContain.clear();
		}
		if (sender.contains("Boni4you")) {
			tempContain.add("www.boni4you.de/index.php?mod=bonusmail");
			tempContain.add("www.boni4you.de/index.php?mod=questmail");
			for(int i = 0; i < tempContain.size() -1; i++){
				Bonimail.add(getLink(mail, "OneLink", "CompleteLine", tempContain, "", 0)[i]);
			}
			tempContain.clear();
		}
		if (sender.contains("Intermail-Live")) {
			tempContain.add("www.intermail-live.de/pmail.php?");
			Bonimail.add(getLink(mail, "OneLink", "EndAndMovePointer", tempContain, ">Bestätig", -1)[0]);
			tempContain.clear();
		}
		if (sender.contains("Geldboni")) {
			tempContain.add("www.geldboni.de/index.php?mod=p");
			Bonimail.add(getLink(mail, "OneLink", "CompleteLine", tempContain, "", 0)[0]);
			tempContain.clear();
		}
		if (sender.contains("Bonix")) {
			tempContain.add("http://www.bonix.org/mail.php");
			Bonimail.add(getLink(mail, "OneLink", "CompleteLine", tempContain, "", 0)[0]);
			tempContain.clear();
		}
		if (sender.contains("Dresden-Mails")) {
			tempContain.add("http://www.dresden-mails.de/index.php?mod=questmai");
			tempContain.add("http://www.dresden-mails.de/index.php?mod=paid");
			tempContain.add("http://www.dresden-mails.de/index.php?mod=bonus");
			for(int i = 0; i < tempContain.size() -1; i++){
				Bonimail.add(getLink(mail, "OneLink", "CompleteLine", tempContain, "", 0)[i]);
			}
			tempContain.clear();
		}
		if (sender.contains("boni.tv")) {
			tempContain.add("boni.tv/earn");
			Bonimail.add(getLink(mail, "OneLink", "CompleteLineAndMovePointer", tempContain, "", -3)[0]);
			tempContain.clear();
		}
		if (sender.contains("Lugrando.de")) {
			tempContain.add("http://www.lugrando.de/mail.php");
			Bonimail.add(getLink(mail, "OneLink", "OnlyEnd", tempContain, "><b>", 0)[0]);
			tempContain.add("http://www.lugrando.de/ba_teilnehmen");
			Bonimail.add(getLink(mail, "OneLink", "EndAndMovePointer", tempContain, " ", -1)[0]);
			tempContain.clear();
		}
		if (sender.contains("atlantis-mails")) {
			tempContain.add("http://www.atlantis-mails.de/index.php?mod=questmail");
			tempContain.add("http://www.atlantis-mails.de/index.php?mod=paidmail");
			for(int i = 0; i < tempContain.size() -1; i++){
				Bonimail.add(getLink(mail, "OneLink", "CompleteLine", tempContain, "", 0)[i]);
			}
			tempContain.clear();
		}
		if (sender.contains("ideal-shoppen")) {
			tempContain.add("http://www.ideal-shoppen.de/cbm.");
			Bonimail.add(getLink(mail, "OneLink", "EndAndMovePointer", tempContain, "><", -1)[0]);
			tempContain.clear();
		}
		if (sender.contains("white-angel-mails")) {
			tempContain.add("http://www.white-angel-mails.de/bestaetigen");
			Bonimail.add(getLink(mail, "OneLink", "CompleteLine", tempContain, "", -1)[0]);
			tempContain.clear();
		}
		if (sender.contains("eBesucher.De")) {
			tempContain.add("www.ebesucher.de/mailcheck.php?uid=734228");
			Bonimail.add(getLink(mail, "OneLink", "OnlyEnd", tempContain, "\"", 0)[0]);
			tempContain.clear();
		}
		if (sender.contains("Elite-Mailer")) {
			tempContain.add("http://www.elite-mailer.de/pmail");
			Bonimail.add(getLink(mail, "OneLink", "EndAndMovePointer", tempContain, "><", -1)[0]);
			tempContain.clear();
		}//TODO: FIX
		if (sender.contains("Wiena")) {
			scase = 39;
		}
		if (sender.contains("mailer-")) {
			tempContain.add("mailer-ONE.de/angeboten.php?");
			Bonimail.add(getLink(mail, "OneLink", "EndAndMovePointer", tempContain, "target", -2)[0]);
			tempContain.clear();
		}
		if (sender.contains("Bonus Bunny")) {
			tempContain.add("www.bonus-bunny.de/pmail.php");
			Bonimail.add(getLink(mail, "OneLink", "EndAndMovePointer", tempContain, " target", -1)[0]);
			tempContain.clear();
		}//TODO: FIX
		if (sender.contains("Dodona-Mails")) {
			tempContain.add("www.dodona-mails.de/mail.");
			Bonimail.add(getLink(mail, "OneLink", "EndAndMovePointer", tempContain, " target", -1)[0]);
			tempContain.clear();
			tempContain.add("");
			Bonimail.add(getLink(mail, "OneLink", "EndAndMovePointer", tempContain, " target", -1)[0]);
			tempContain.clear();
		}//TODO: FIX
		if (sender.contains("dondino")) {
			tempContain.add("");
			Bonimail.add(getLink(mail, "OneLink", "CompleteLineAndMovePointer", tempContain, "", -1)[0]);
			tempContain.clear();
		}
		if (sender.contains("DailyCent")) {
			tempContain.add("http://www.dailycent.de/");
			Bonimail.add(getLink(mail, "OneLink", "CompleteLineAndMovePointer", tempContain, "", -1)[0]);
			tempContain.clear();
		}
		if (sender.contains("cashdevil.de")) {
			tempContain.add("http://www.cashdevil.de/paidmail.php?");
			Bonimail.add(getLink(mail, "OneLink", "EndAndMovePointer", tempContain, "\">", -1)[0]);
			tempContain.clear();
		}
		if (sender.contains("Around-the-Money")) {
			tempContain.add("www.around-the-money.de/pf.php?");
			Bonimail.add(getLink(mail, "OneLink", "CompleteLineAndMovePointer", tempContain, "\">", -1)[0]);
			tempContain.clear();
		}
		if (sender.contains("Starmailer.de")) {
			tempContain.add("http://www.Starmailer.de/questionmail.php");
			Bonimail.add(getLink(mail, "OneLink", "CompleteLineAndMovePointer", tempContain, "id=", 11)[0]);
			tempContain.clear();
		}
		if (sender.contains("Dschungel-Mails.de")) {
			tempContain.add("http://www.dschungel-mails.de/pmail.php");
			Bonimail.add(getLink(mail, "OneLink", "CompleteLineAndMovePointer", tempContain, "img", -3)[0]);
			tempContain.clear();
		}
	}
	
	public void open(){
		//construct all ArrayLists in one ArrayList
		generate();
		
		//now start opening the links from all ArrayLists
		for(int i = 0; i < AllAL.size(); i++){
			if(AllAL.get(i) != null){
				for(int j = 0; j < AllAL.get(i).size(); j++){
					try{
						if(AllAL.get(i).get(j) != null){
							Desktop.getDesktop().browse(new URL(AllAL.get(i).get(j)).toURI());
					        System.out.println("Nachricht erfolgreich geöffnet");	
						}
			        } 
					catch(Exception e){
						e.printStackTrace();
					}
				}
			}
		}
		System.out.println("********************************");
		System.out.println("We are done snitch");
	}
	
	
	public String[] getLink(String mail, String ProviderType, String MailType, ArrayList<String> contain, String end, int movePointer){
		//split mail into lines
		String LinkTemp[] = mail.split("\\n+");
		
		//if Provider has more than one type of link (e.g. QuestionMail, PaidMail, etc)
		switch (ProviderType) {
		case "OneLink":
			//differenciate between different types of Providers pattern (e.g. complete line, a specific char 
			//indicating the end of link, etc.)
			switch (MailType) {
			case "OnlyEnd":
				for(int i = 0; i < LinkTemp.length - 1; i++){
					if(LinkTemp[i].contains(contain.get(0))){
						int startLink = LinkTemp[i].indexOf("http");
						int endLink = LinkTemp[i].indexOf(end);
						finishedLink[0] = LinkTemp[i].substring(startLink, endLink);
					}
				}
				break;
				
			case "EndAndMovePointer":
				for(int i = 0; i < LinkTemp.length - 1; i++){
					if(LinkTemp[i].contains(contain.get(0))){
						int startLink = LinkTemp[i].indexOf("http");
						int endLink = LinkTemp[i].indexOf(end);
						finishedLink[0] = LinkTemp[i].substring(startLink, endLink + movePointer);
					}
				}
				break;
				
			case "CompleteLine":
				for(int i = 0; i < LinkTemp.length - 1; i++){
					if(LinkTemp[i].contains(contain.get(0))){
						int startLink = LinkTemp[i].indexOf("http");
						int endLink = LinkTemp[i].length() - 1;
						finishedLink[0] = LinkTemp[i].substring(startLink, endLink);
					}
				}
				break;
				
			case "CompleteLineAndMovePointer":
				for(int i = 0; i < LinkTemp.length - 1; i++){
					if(LinkTemp[i].contains(contain.get(0))){
						int startLink = LinkTemp[i].indexOf("http");
						int endLink = LinkTemp[i].length() - movePointer;
						finishedLink[0] = LinkTemp[i].substring(startLink, endLink);
					}
				}
				break;
				
			case "OnlyMovePointer":
				for(int i = 0; i < LinkTemp.length - 1; i++){
					if(LinkTemp[i].contains(contain.get(0))){
						int startLink = LinkTemp[i].indexOf("http");
						finishedLink[0] = LinkTemp[i].substring(startLink, startLink + movePointer);
					}
				}
				break;

			default:
				System.out.println("No MailType defined yet for " + ProviderType);
			}
			break;
		case "MoreLinks":
			switch (MailType) {
			case "OnlyEnd":
				for(int i = 0; i < contain.size() - 1; i++){
					for(int j = 0; j < LinkTemp.length - 1; j++){
						if(LinkTemp[j].contains(contain.get(i))){
							int startLink = LinkTemp[i].indexOf("http");
							int endLink = LinkTemp[i].indexOf(end);
							finishedLink[i] = LinkTemp[i].substring(startLink, endLink);
						}
					}
				}
				break;
				
			case "EndAndMovePointer":
				for(int i = 0; i < contain.size() - 1; i++){
					for(int j = 0; j < LinkTemp.length - 1; j++){
						if(LinkTemp[j].contains(contain.get(i))){
							int startLink = LinkTemp[i].indexOf("http");
							int endLink = LinkTemp[i].indexOf(end);
							finishedLink[i] = (LinkTemp[i].substring(startLink, endLink + movePointer));
						}
					}
				}
				break;
				
			case "CompleteLine":
				for(int i = 0; i < contain.size() - 1; i++){
					for(int j = 0; j < LinkTemp.length - 1; j++){
						if(LinkTemp[j].contains(contain.get(i))){
							int startLink = LinkTemp[i].indexOf("http");
							int endLink = LinkTemp[i].length() - 1;
							finishedLink[i] = LinkTemp[i].substring(startLink, endLink);
						}
					}
				}
				break;
				
			case "CompleteLineAndMovePointer":
				for(int i = 0; i < contain.size() - 1; i++){
					for(int j = 0; j < LinkTemp.length - 1; j++){
						if(LinkTemp[j].contains(contain.get(i))){
							int startLink = LinkTemp[i].indexOf("http");
							int endLink = LinkTemp[i].length() - movePointer;
							finishedLink[i] = LinkTemp[i].substring(startLink, endLink);
						}
					}
				}
				break;
				
			case "OnlyMovePointer":
				for(int i = 0; i < contain.size() - 1; i++){
					for(int j = 0; j < LinkTemp.length - 1; j++){
						if(LinkTemp[j].contains(contain.get(i))){
							int startLink = LinkTemp[i].indexOf("http");
							finishedLink[i] = LinkTemp[i].substring(startLink, startLink + movePointer);
						}
					}
				}
				break;

			default:
				System.out.println("No MailType defined yet for " + ProviderType);
			}
			break;

		default:
			System.out.println("This ProviderType is not defined yet");
			break;
		}
		
		return finishedLink;
	}
	
	public String replace(String LinkTemp){
		//3D, = am ende einer zeile, am=p; und amp; löschen
		LinkTemp = LinkTemp.replaceAll("amp;", "");
		LinkTemp = LinkTemp.replaceAll("am=p;", "");
		return LinkTemp;
	}
	
}
