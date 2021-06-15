import javax.swing.*;
import javax.swing.GroupLayout.Alignment;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.LayoutStyle.ComponentPlacement;

public class PinPanel extends JPanel implements ActionListener {
	private ATMFrame root;
	private JButton oneButton;
	private JButton twoButton;
	private JButton threeButton;
	private JButton fourButton;
	private JButton fiveButton;
	private JButton sixButton;
	private JButton sevenButton;
	private JButton eightButton;
	private JButton nineButton;
	private JButton zeroButton;
	private JButton acceptButton;
	private JButton deleteButton;
	private JButton backButton;
	private JTextField pinField;
	private String pinLengthIsOk;
	private JLabel enterPinLabel;

	public PinPanel(ATMFrame root) {
		setBackground(new Color(25, 25, 112));
		this.root = root;

		showLayout();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == oneButton) {
			pinField.setText(pinField.getText() + "1");
		}
		if (e.getSource() == twoButton) {
			pinField.setText(pinField.getText() + "2");
		}
		if (e.getSource() == threeButton) {
			pinField.setText(pinField.getText() + "3");
		}
		if (e.getSource() == fourButton) {
			pinField.setText(pinField.getText() + "4");
		}
		if (e.getSource() == fiveButton) {
			pinField.setText(pinField.getText() + "5");
		}
		if (e.getSource() == sixButton) {
			pinField.setText(pinField.getText() + "6");
		}
		if (e.getSource() == sevenButton) {
			pinField.setText(pinField.getText() + "7");
		}
		if (e.getSource() == eightButton) {
			pinField.setText(pinField.getText() + "8");
		}
		if (e.getSource() == nineButton) {
			pinField.setText(pinField.getText() + "9");
		}
		if (e.getSource() == zeroButton) {
			pinField.setText(pinField.getText() + "0");
		}
		if (e.getSource() == acceptButton) {

			checkPinLength(pinField.getText().toString());
			checkIfPinExists();
		}
		if (e.getSource() == deleteButton) {
			if (pinField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Моля въведете ПИН или натиснете Назад!", "Грешка",
						JOptionPane.ERROR_MESSAGE);
				return;
			} else {
				pinField.setText("" + pinField.getText().substring(0, pinField.getText().length() - 1));
			}
		}
		if (e.getSource() == backButton) {
			this.root.backToWithdrawFromPin();
		}

	}

	public void showLayout() {

		JLabel label = new JLabel(
				"\u041C\u043E\u043B\u044F \u0432\u044A\u0432\u0435\u0434\u0435\u0442\u0435 \u041F\u0418\u041D \u043A\u043E\u0434");
		label.setForeground(Color.WHITE);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 24));

		pinField = new JTextField();
		pinField.setFont(new Font("Tahoma", Font.PLAIN, 24));
		pinField.setColumns(10);

		oneButton = new JButton("1");
		oneButton.setForeground(new Color(25, 25, 112));
		oneButton.setBackground(Color.WHITE);
		oneButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		oneButton.addActionListener(this);

		fourButton = new JButton("4");
		fourButton.setForeground(new Color(25, 25, 112));
		fourButton.setBackground(Color.WHITE);
		fourButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		fourButton.addActionListener(this);

		sevenButton = new JButton("7");
		sevenButton.setForeground(new Color(25, 25, 112));
		sevenButton.setBackground(Color.WHITE);
		sevenButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		sevenButton.addActionListener(this);

		twoButton = new JButton("2");
		twoButton.setForeground(new Color(25, 25, 112));
		twoButton.setBackground(Color.WHITE);
		twoButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		twoButton.addActionListener(this);

		threeButton = new JButton("3");
		threeButton.setForeground(new Color(25, 25, 112));
		threeButton.setBackground(Color.WHITE);
		threeButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		threeButton.addActionListener(this);

		fiveButton = new JButton("5");
		fiveButton.setForeground(new Color(25, 25, 112));
		fiveButton.setBackground(Color.WHITE);
		fiveButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		fiveButton.addActionListener(this);

		sixButton = new JButton("6");
		sixButton.setForeground(new Color(25, 25, 112));
		sixButton.setBackground(Color.WHITE);
		sixButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		sixButton.addActionListener(this);

		eightButton = new JButton("8");
		eightButton.setForeground(new Color(25, 25, 112));
		eightButton.setBackground(Color.WHITE);
		eightButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		eightButton.addActionListener(this);

		nineButton = new JButton("9");
		nineButton.setForeground(new Color(25, 25, 112));
		nineButton.setBackground(Color.WHITE);
		nineButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		nineButton.addActionListener(this);

		zeroButton = new JButton("0");
		zeroButton.setForeground(new Color(25, 25, 112));
		zeroButton.setBackground(Color.WHITE);
		zeroButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		zeroButton.addActionListener(this);

		acceptButton = new JButton("Напред");
		acceptButton.setForeground(new Color(25, 25, 112));
		acceptButton.setBackground(Color.GREEN);
		acceptButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		acceptButton.addActionListener(this);

		deleteButton = new JButton("\u0418\u0437\u0442\u0440\u0438\u0439");
		deleteButton.setForeground(new Color(25, 25, 112));
		deleteButton.setBackground(Color.YELLOW);
		deleteButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		deleteButton.addActionListener(this);

		backButton = new JButton("\u041D\u0430\u0437\u0430\u0434");
		backButton.setForeground(new Color(25, 25, 112));
		backButton.setBackground(Color.RED);
		backButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		backButton.addActionListener(this);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(42)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(zeroButton, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(sevenButton, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(eightButton, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(nineButton, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
							.addGap(323)
							.addComponent(backButton, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(fourButton, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(fiveButton, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(sixButton, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
							.addGap(323)
							.addComponent(deleteButton, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(oneButton, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(twoButton, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(threeButton, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
							.addGap(323)
							.addComponent(acceptButton, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)))
					.addGap(10))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(290, Short.MAX_VALUE)
					.addComponent(pinField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(259))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(101, Short.MAX_VALUE)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 586, GroupLayout.PREFERRED_SIZE)
					.addGap(68))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(pinField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(97)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(oneButton, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
							.addComponent(twoButton, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
							.addComponent(threeButton, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
						.addComponent(acceptButton, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(deleteButton, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(backButton, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(fourButton, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
								.addComponent(fiveButton, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
								.addComponent(sixButton, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(sevenButton, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
								.addComponent(eightButton, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
								.addComponent(nineButton, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(zeroButton, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addGap(115))
		);
		setLayout(groupLayout);

	}

	public void checkPinLength(String text) {
		String pin = pinField.getText().toString();
		if (pin.length() > 4) {
			JOptionPane.showMessageDialog(null, "Пин кода не може да бъде повече от 4 цифри.", "Грешка",
					JOptionPane.ERROR_MESSAGE);
			this.root.isPinLengthGood = false;
			return;
		}
		if (pin.length() < 4) {
			JOptionPane.showMessageDialog(null, "Пин кода не може да бъде по-малко от 4 цифри.", "Грешка",
					JOptionPane.ERROR_MESSAGE);
			this.root.isPinLengthGood = false;
			return;
		}
		//Check if pin code contains only numbers.
		for (char c : pin.toCharArray()) {
			if (!Character.isDigit(c)) {

				JOptionPane.showMessageDialog(null, "Пин кода може да съдържа само цифри.", "Грешка",
						JOptionPane.ERROR_MESSAGE);
				this.root.isPinLengthGood = false;
				return;
			}
		}
		if (pin.length() == 4) {
			this.root.isPinLengthGood = true;
		}
	}

	public void checkIfPinExists() {
		boolean isFound = false;
		boolean enoughFunds = false;

		if (this.root.isPinLengthGood) {
			for (BankAccount bankAccount : this.root.accounts) {
				if (bankAccount.pincode.equals(pinField.getText()) && this.root.isPinLengthGood) {
					isFound = true;
					if ((bankAccount.balance - this.root.chosenAmount) > 0) {

						bankAccount.balance -= this.root.chosenAmount;
						enoughFunds = true;
						this.root.remaningBalance = bankAccount.balance;

					}
					if(enoughFunds) {
					this.root.changeToAfterPinPanel();
					}
				}
			}
			if (!isFound) {
				JOptionPane.showMessageDialog(null, "Потребител с такъв ПИН не съществува!", "Грешка",
						JOptionPane.ERROR_MESSAGE);
				return;
			}
		}
		if (!enoughFunds && isFound) {
			JOptionPane.showMessageDialog(null, "Недостатъчна наличност", "Грешка", JOptionPane.ERROR_MESSAGE);
			return;
		}

	}
}
