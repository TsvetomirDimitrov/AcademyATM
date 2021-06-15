import java.util.ArrayList;

import javax.swing.*;
public class ATMFrame extends JFrame {
	private ATMFrame root;
	private JPanel welcomePanel;
	private JPanel withdrawPanel;
	JPanel pinPanel;
	private JPanel checkBalancePanel;
	private JPanel showBalancePanel;
	private JPanel afterPinPanel;
	private JPanel otherAmmountPanel;
	public double chosenAmount;
	public int pinLength;
	public boolean isPinLengthGood;
	public double remaningBalance;
	public double currentBalance;
	public ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
	
	public ATMFrame() {
		super("ATM");
		setSize(800,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		BankAccount account1 = new BankAccount("Ceco", "Cecov", "1234", 10000);
		BankAccount account2 = new BankAccount("Pepo", "Pepov", "4321", 5000);
		BankAccount account3 = new BankAccount("Keko", "Kekov", "4213", 2000);
		BankAccount account4 = new BankAccount("Jijo", "Jijov", "1111", 50);
		accounts.add(account1);
		accounts.add(account2);
		accounts.add(account3);
		accounts.add(account4);
		
		changeToWelcomePanel();
	}
	
	public void changeToWelcomePanel() {
		welcomePanel = new WelcomePanel(this);
		welcomePanel.setSize(getHeight(), getWidth());
		add(welcomePanel);
		
	}

	public void changeToWithdrawPanel() {
		welcomePanel.setVisible(false);
		welcomePanel = null;
		withdrawPanel = new WithdrawPanel(this);
		withdrawPanel.setSize(getHeight(), getWidth());
		add(withdrawPanel);
		
	}
	public void changeToPinPanel() {
		withdrawPanel.setVisible(false);
		withdrawPanel = null;
		pinPanel = new PinPanel(this);
		pinPanel.setSize(getHeight(), getWidth());
		add(pinPanel);
	}
	public void changeToAfterPinPanel() {
		pinPanel.setVisible(false);
		pinPanel = null;
		afterPinPanel = new AfterPinPanel(this);
		afterPinPanel.setSize(getHeight(), getWidth());
		add(afterPinPanel);
		
	}
	public void backToWithdrawFromPin() {
		pinPanel.setVisible(false);
		pinPanel = null;
		withdrawPanel = new WithdrawPanel(this);
		withdrawPanel.setSize(getHeight(), getWidth());
		add(withdrawPanel);
	}
	public void changeToOtherSum() {
		withdrawPanel.setVisible(false);
		withdrawPanel = null;
		otherAmmountPanel = new OtherAmmountPanel(this);
		otherAmmountPanel.setSize(getHeight(), getWidth());
		add(otherAmmountPanel);
	}
	public void changeToWelcomeFromOtherAmount() {
		otherAmmountPanel.setVisible(false);
		otherAmmountPanel = null;
		withdrawPanel = new WithdrawPanel(this);
		withdrawPanel.setSize(getHeight(), getWidth());
		add(withdrawPanel);
		
	}
	public void changeFromOtherToPin() {
		otherAmmountPanel.setVisible(false);
		otherAmmountPanel = null;
		pinPanel = new PinPanel(this);
		pinPanel.setSize(getHeight(), getWidth());
		add(pinPanel);
	}
	public void changeToCheckBalancePanel() {
		welcomePanel.setVisible(false);
		welcomePanel = null;
		checkBalancePanel = new CheckBalancePanel(this);
		checkBalancePanel.setSize(getHeight(), getWidth());
		add(checkBalancePanel);
	}
	public void changeFromBalanceToWelcomePanel() {
		checkBalancePanel.setVisible(false);
		checkBalancePanel = null;
		welcomePanel = new WelcomePanel(this);
		welcomePanel.setSize(getHeight(), getWidth());
		add(welcomePanel);
	}
	public void changeFromBalanceToShowBalance() {
		checkBalancePanel.setVisible(false);
		checkBalancePanel = null;
		showBalancePanel = new ShowBalancePanel(this);
		showBalancePanel.setSize(getHeight(), getWidth());
		add(showBalancePanel);
	}
	public void changeToWelcomeFromWithdraw() {
		withdrawPanel.setVisible(false);
		withdrawPanel = null;
		welcomePanel = new WelcomePanel(this);
		welcomePanel.setSize(getHeight(), getWidth());
		add(welcomePanel);
	}
	public void changeToWelcomeFromFinalBalance() {
		showBalancePanel.setVisible(false);
		showBalancePanel = null;
		welcomePanel = new WelcomePanel(this);
		welcomePanel.setSize(getHeight(), getWidth());
		add(welcomePanel);
	}
	public void changeToWelcomeAfterTransaction() {
		afterPinPanel.setVisible(false);
		afterPinPanel = null;
		welcomePanel = new WelcomePanel(this);
		welcomePanel.setSize(getHeight(), getWidth());
		add(welcomePanel);
	}
	
}
