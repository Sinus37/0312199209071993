package ChooseLink;

import java.io.IOException;

import ProviderOpen.OpenBonimail;
import ProviderOpen.OpenBonusEmails;
import ProviderOpen.OpenCashMails;
import ProviderOpen.OpenCashTown;
import ProviderOpen.OpenEarnstar;
import ProviderOpen.OpenEuroearn;
import ProviderOpen.OpenFairpaidmail;
import ProviderOpen.OpenGongMails;
import ProviderOpen.OpenInfomails;
import ProviderOpen.OpenKronenMailer;
import ProviderOpen.OpenLiveMails;
import ProviderOpen.OpenLouisMailer;
import ProviderOpen.OpenMaxMailer;
import ProviderOpen.OpenMaxearn;
import ProviderOpen.OpenPaidportal24;
import ProviderOpen.OpenProfitmails;
import ProviderOpen.OpenProvanceMailer;
import ProviderOpen.OpenQassa;
import ProviderOpen.OpenQuestler;
import ProviderOpen.OpenReading4Money;
import ProviderOpen.OpenSparMailer;
import ProviderOpen.OpenUnique;
import ProviderOpen.OpenXXLpool;
import ProviderOpen.OpenYbbo;

public class GetLink {
	
	int scase;
	
	public void generate(){
		//TODO gen all
	}

	public void setList(String mail, String sender, String kindOf) throws IOException {
		System.out.println(sender);
		if(sender.contains("Provence")){
			 scase = 1;	
		}
		if(sender.contains("reading")){
			 scase = 2;
		}
		if(sender.contains("Qassa")){
			 scase = 3;
		}
		if(sender.contains("XXLpool")){
			 scase = 4;
		}
		if(sender.contains("bonimail")){
			 scase = 5;
		}
		if(sender.contains("fairpaidmail")){
			 scase = 6;
		}
		if(sender.contains("Profitmails")){
			 scase = 7;
		}
		if(sender.contains("info-mails")){
			 scase = 8;
		}
		if(sender.contains("bonus-emails")){
			 scase = 9;
		}
		if(sender.contains("Questler")){
			 scase = 10;
		}
		if(sender.contains("earnstar.de")){
			 scase = 11;
		}
		if(sender.contains("Gongmails.de")){
			 scase = 12;
		}
		if(sender.contains("Cash-Town.de")){
			 scase = 13;
		}
		if(sender.contains("Ybbo")){
			 scase = 14;
		}
		if(sender.contains("Kronen-Mailer")){
			 scase = 15;
		}
		if(sender.contains("Live-Mails")){
			 scase = 16;
		}
		if(sender.contains("Louis-Mailer")){
			 scase = 17;
		}
		if(sender.contains("Max-Mails")){
			scase = 18;
		}
		if (sender.contains("Maxearn")){
			scase = 19;
		}
		if (sender.contains("Spar-Mailer")){
			scase = 20;
		}
		if (sender.contains("Paidportal24")){
			scase = 21;
		}
		if (sender.contains("Cash-mails.eu")){
			scase = 22;
		}
		if (sender.contains("EuroEarn.de")){
			scase = 23;
		}
		if (sender.contains("Unique-Mails")){
			scase = 24;
		}
		
		switch(scase){
			case 1: System.out.println("Email erhalten von Provence");
					@SuppressWarnings("unused")
					OpenProvanceMailer prov = new OpenProvanceMailer();
					//prov.open(mail);
					scase = 0;
					break;
			case 2 : System.out.println("Email erhalten von Reading4Money");
					OpenReading4Money r4m = new OpenReading4Money();
					r4m.open(mail, kindOf);
					scase = 0;
					break;
			case 3 : System.out.println("Email erhalten von Quassa");
					OpenQassa qassa = new OpenQassa();
					qassa.open(mail);
					scase = 0;
					break;
			case 4 : System.out.println("Email erhalten von XXLpool");
					OpenXXLpool xxl = new OpenXXLpool();
					xxl.open(mail);
					scase = 0;
					break;
			case 5 : System.out.println("Email erhalten von bonimail");
					OpenBonimail boni = new OpenBonimail();
					boni.open(mail);
					scase = 0;
					break;
			case 6 : System.out.println("Email erhalten von fairpaidmail");
					OpenFairpaidmail fair = new OpenFairpaidmail();
					fair.open(mail);
					scase = 0;
					break;
			case 7 : System.out.println("Email erhalten von Profitmails");
					OpenProfitmails prof = new OpenProfitmails();
					prof.open(mail);
					scase = 0;
					break;
			case 8 : System.out.println("Email erhalten von InfoMails");
					OpenInfomails info = new OpenInfomails();
					info.open(mail);
					scase = 0;
					break;
			case 9 : System.out.println("Email erhalten von BonusEmails");
					OpenBonusEmails bonus = new OpenBonusEmails();
					bonus.open(mail);
					scase = 0;
					break;
			case 10 : System.out.println("Email erhalten von Questler");
					OpenQuestler open = new OpenQuestler();
					open.open(mail);
					scase = 0;
					break;
			case 11 : System.out.println("Email erhalten von Earnstar");
					OpenEarnstar earn = new OpenEarnstar();
					earn.open(mail);
					scase = 0;
					break;
			case 12 : System.out.println("Email erhalten von Gongmails");
					OpenGongMails gang = new OpenGongMails();
					gang.open(mail);
					scase = 0;
					break;
			case 13 : System.out.println("Email erhalten von Cash-Zown");
					OpenCashTown cash = new OpenCashTown();
					cash.open(mail);
					scase = 0;
					break;
			case 14 : System.out.println("Email erhalten von YBBO");
					OpenYbbo ybbo = new OpenYbbo();
					ybbo.open(mail);
					scase = 0;
					break;
			case 15 : System.out.println("Email erhalten von Kronen-Mailer");
					OpenKronenMailer krone = new OpenKronenMailer();
					krone.open(mail);
					scase = 0;
					break;
			case 16 : 	System.out.println("Email erhalten von Live-Mails");
					OpenLiveMails live = new OpenLiveMails();
					live.open(mail);
					scase = 0;
					break;
			case 17 : System.out.println("Email erhalten von Louis-Mailer");
					OpenLouisMailer louis = new OpenLouisMailer();
					louis.open(mail);
					scase = 0;
					break;
			case 18 : System.out.println("Email erhalten von Max-Mailer");
					OpenMaxMailer max = new OpenMaxMailer();
					max.open(mail);
					scase = 0;
					break;
			case 19 :  System.out.println("Email erhalten von Maxearn");
					OpenMaxearn maxe = new OpenMaxearn();
					maxe.open(mail);
					scase = 0;
					break;
			case 20 : System.out.println("Email erhalten von Spar-Mailer");
					OpenSparMailer spar = new OpenSparMailer();
					spar.open(mail);
					scase = 0;
					break;
			case 21 : System.out.println("Email erhalten von Paidportal24");
					OpenPaidportal24 paid = new OpenPaidportal24();
					paid.open(mail);
					scase = 0;
					break;
			case 22 : System.out.println("Email erhalten von Cash-Mails");
					OpenCashMails cashm = new OpenCashMails();
					cashm.open(mail);
					scase = 0;
					break;
			case 23 : System.out.println("Email erhalten von EuroEarn");
					OpenEuroearn euro = new OpenEuroearn();
					euro.open(mail);
					scase = 0;
					break;
			case 24 : System.out.println("Email erhalten von Unique-Mails");
					OpenUnique uni = new OpenUnique();
					uni.open(mail);
					scase = 0;
			break;
			default : System.out.println("Kein bekannter Absender");
		}				
	}
}
