package ChooseLink;

import java.io.IOException;

import ProviderOpen.OpenAroundTheMoney;
import ProviderOpen.OpenAtlantisMails;
import ProviderOpen.OpenBoni4You;
import ProviderOpen.OpenBoniTV;
import ProviderOpen.OpenBonimail;
import ProviderOpen.OpenBonix;
import ProviderOpen.OpenBonusBunny;
import ProviderOpen.OpenBonusEmails;
import ProviderOpen.OpenCashDevil;
import ProviderOpen.OpenCashMails;
import ProviderOpen.OpenCashTown;
import ProviderOpen.OpenDailyCent;
import ProviderOpen.OpenDodonaMails;
import ProviderOpen.OpenDondino;
import ProviderOpen.OpenDresdenMails;
import ProviderOpen.OpenDschungel;
import ProviderOpen.OpenEarnstar;
import ProviderOpen.OpenEliteMailer;
import ProviderOpen.OpenEuroearn;
import ProviderOpen.OpenFairpaidmail;
import ProviderOpen.OpenGeldboni;
import ProviderOpen.OpenGongMails;
import ProviderOpen.OpenIdealShoppen;
import ProviderOpen.OpenInfomails;
import ProviderOpen.OpenIntermailLive;
import ProviderOpen.OpenKlickportal24;
import ProviderOpen.OpenKronenMailer;
import ProviderOpen.OpenLiveMails;
import ProviderOpen.OpenLouisMailer;
import ProviderOpen.OpenLugrando;
import ProviderOpen.OpenMailerOne;
import ProviderOpen.OpenMaxMailer;
import ProviderOpen.OpenMaxearn;
import ProviderOpen.OpenMoneyMails24;
import ProviderOpen.OpenPaidportal24;
import ProviderOpen.OpenProfitmails;
import ProviderOpen.OpenProvanceMailer;
import ProviderOpen.OpenQassa;
import ProviderOpen.OpenQuestler;
import ProviderOpen.OpenReading4Money;
import ProviderOpen.OpenSparMailer;
import ProviderOpen.OpenStarmailer;
import ProviderOpen.OpenUnique;
import ProviderOpen.OpenWhiteAngelMails;
import ProviderOpen.OpenWiena;
import ProviderOpen.OpenXXLpool;
import ProviderOpen.OpenYbbo;
import ProviderOpen.OpeneBesucher;

public class GetLink {
	
	int scase;
	
	public void generate(){
		//TODO gen all
	}

	public void setList(String mail, String sender, String kindOf) throws IOException {
		System.out.println("Sender: " + sender);
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
		if (sender.contains("Money-Mails")){
			scase = 25;
		}
		if (sender.contains("Klickportal24")){
			scase = 26;
		}
		if (sender.contains("Boni4you")){
			scase = 27;
		}
		if (sender.contains("Intermail-Live")){
			scase = 28;
		}
		if (sender.contains("Geldboni")){
			scase = 29;
		}
		if (sender.contains("Bonix")){
			scase = 30;
		}
		if (sender.contains("Dresden-Mails")){
			scase = 31;
		}
		if (sender.contains("boni.tv")){
			scase = 32;
		}
		if (sender.contains("Lugrando.de")){
			scase = 33;
		}
		if (sender.contains("atlantis-mails")){
			scase = 34;
		}
		if (sender.contains("ideal-shoppen")){
			scase = 35;
		}
		if (sender.contains("white-angel-mails")){
			scase = 36;
		}
		if (sender.contains("eBesucher.De")){
			scase = 37;
		}
		if (sender.contains("Elite-Mailer")){
			scase = 38; 
		}
		if (sender.contains("Wiena")){
			scase = 39;
		}
		if (sender.contains("mailer-")){
			scase = 40;
		}
		if (sender.contains("Bonus Bunny")){
			scase = 41;
		}
		if (sender.contains("Dodona-Mails")) {
			scase = 42;
		}
		if (sender.contains("dondino")) {
			scase = 43;
		}
		if (sender.contains("DailyCent")) {
			scase = 44;
		}
		if (sender.contains("cashdevil.de")) {
			scase = 45;
		}
		if (sender.contains("Around-the-Money")) {
			scase = 46;
		}
		if (sender.contains("Starmailer.de")) {
			scase = 47;
		}
		if (sender.contains("Dschungel-Mails.de")) {
			scase = 48;
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
			case 25 : System.out.println("Email erhalten von Money-Mails");
					OpenMoneyMails24 money = new OpenMoneyMails24();
					money.open(mail);
					scase = 0;
					break; 
			case 26 : System.out.println("Email erhalten von Klickportal24");
					OpenKlickportal24 klick = new OpenKlickportal24();
					klick.open(mail);
					scase = 0;
					break;
			case 27 : System.out.println("Email erhalten von Boni4You");
					OpenBoni4You boni4 = new OpenBoni4You();
					boni4.open(mail);
					scase = 0;
					break;
			case 28 : System.out.println("Email erhalten von Intermail-Live");
					OpenIntermailLive inter = new OpenIntermailLive();
					inter.open(mail);
					scase = 0;
					break;
			case 29 : System.out.println("Email erhalten von Geldboni");
					OpenGeldboni geld = new OpenGeldboni();
					geld.open(mail);
					scase = 0;
					break;
			case 30 : System.out.println("Email erhalten von Bonix");
					OpenBonix bonix = new OpenBonix();
					bonix.open(mail);
					scase = 0;
					break;
			case 31 : System.out.println("Email erhalten von Dresden-Mails");
					OpenDresdenMails dresden = new OpenDresdenMails();
					dresden.open(mail);
					scase = 0;
					break;
			case 32 : System.out.println("Email erhalten von BoniTV");
					OpenBoniTV tv = new OpenBoniTV();
					tv.open(mail);
					scase = 0;
					break;
			case 33 : System.out.println("Email erhalten von Lugrando");
					OpenLugrando lug = new OpenLugrando();
					lug.open(mail);
					scase = 0;
					break;
			case 34 : System.out.println("Email erhalten von Atlantis-Mails");
					OpenAtlantisMails atlan = new OpenAtlantisMails();
					atlan.open(mail);
					scase = 0;
					break;
			case 35 : System.out.println("Email erhalten von Ideal-Shoppen");
					OpenIdealShoppen shop = new OpenIdealShoppen();
					shop.open(mail);
					scase = 0;
					break;
			case 36 : System.out.println("Email erhalten von White-Angle-Mails");
					OpenWhiteAngelMails white = new OpenWhiteAngelMails();
					white.open(mail);
					scase = 0;
					break;
			case 37 : System.out.println("Email erhalten von eBesucher");
					OpeneBesucher ebesucher = new OpeneBesucher();
					ebesucher.open(mail);
					scase = 0;
					break;
			case 38 : System.out.println("Email erhalten von EliteMailer");
					OpenEliteMailer elite = new OpenEliteMailer();
					elite.open(mail);
					scase = 0;
					break;
			case 39 : System.out.println("Email erhalten von Wiena");
					OpenWiena wiena = new OpenWiena();
					wiena.open(mail);
					scase = 0;
					break;
			case 40 : System.out.println("Email erhalten von mailer-ONE");
					OpenMailerOne one = new OpenMailerOne();
					one.open(mail);
					scase = 0;
					break;
			case 41 : System.out.println("Email erhalten von Bonus Bunny");
					OpenBonusBunny bunny = new OpenBonusBunny();
					bunny.open(mail);
					scase = 0;
					break;
			case 42 : System.out.println("Email erhalten von Dodona-Mails");
					OpenDodonaMails dodona = new OpenDodonaMails();
					dodona.open(mail, sender);
					scase = 0;
					break;
			case 43 : System.out.println("Email erhalten von Dondino");
					OpenDondino don = new OpenDondino();
					don.open(mail);
					scase = 0;
					break;
			case 44 : System.out.println("Email erhalten von DailyCent");
					OpenDailyCent daily = new OpenDailyCent();
					daily.open(mail);
					scase = 0;
					break;
			case 45 : System.out.println("Email erhalten von CashDevil");
					OpenCashDevil devil = new OpenCashDevil();
					devil.open(mail);
					scase = 0;
					break;
			case 46 : System.out.println("Email erhalten von Around-The-Money");
					OpenAroundTheMoney around = new OpenAroundTheMoney();
					around.open(mail);
					scase = 0;
					break;
			case 47 : System.out.println("Email erhalten von Starmailer");
					OpenStarmailer star = new OpenStarmailer();
					star.open(mail);
					scase = 0;
					break;
			case 48 : System.out.println("Email erhalten von Dschungel-Mails");
					OpenDschungel dschungel = new OpenDschungel();
					dschungel.open(mail);
					scase = 0;
					break;
					
					
			default : System.out.println("Kein bekannter Absender");
		}				
	}
}
