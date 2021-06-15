import javax.swing.*;
import javax.swing.GroupLayout.Alignment;

import java.awt.Color;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OtherAmmountPanel extends JPanel implements ActionListener {
	private ATMFrame root;
	private JTextField textField;
	private JButton oneLvButton;
	private JButton twoLvButton;
	private JButton threeLvButton;
	private JButton fourLvButton;
	private JButton fiveLvButton;
	private JButton sixLvButton;
	private JButton sevenLvButton;
	private JButton eightLvButton;
	private JButton nineLvButton;
	private JButton zeroLvButton;
	private JLabel messageLabel;
	private JButton acceptButton;
	private JButton delButton;
	private JButton backButton;

	public OtherAmmountPanel(ATMFrame root) {
		setBackground(new Color(25, 25, 112));
		this.root = root;

		showLayout();

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == delButton) {
			if (textField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Моля въведете сума или натиснете Назад!", "Грешка",
						JOptionPane.ERROR_MESSAGE);
				return;
			} else {
				textField.setText("" + textField.getText().substring(0, textField.getText().length() - 1));
			}
		}
		if (e.getSource() == backButton) {
			this.root.changeToWelcomeFromOtherAmount();
		}
		if (e.getSource() == acceptButton) {
			if (textField.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Моля въведете сума или натиснете Назад!", "Грешка",
						JOptionPane.ERROR_MESSAGE);
				return;
			}
			for (char c : textField.getText().toCharArray()) {
				if (!Character.isDigit(c)) {

					JOptionPane.showMessageDialog(null, "Сумата може да съдържа само цифри.", "Грешка",
							JOptionPane.ERROR_MESSAGE);
					this.root.isPinLengthGood = false;
					return;
				}

			}
			// Check if entered sum starts with 0.
			char[] enteredSum = new char[textField.getText().length()];
			enteredSum = textField.getText().toCharArray();
			if (enteredSum[0] == '0') {
				JOptionPane.showMessageDialog(null, "Минималната сума за теглене е 1 лев.", "Грешка",
						JOptionPane.ERROR_MESSAGE);
				this.root.isPinLengthGood = false;
				return;
			}
			// Check if entered sum is more than 0. If it is - change to pin panel.
			this.root.chosenAmount = Double.parseDouble(textField.getText());
			if (this.root.chosenAmount > 0) {
				this.root.changeFromOtherToPin();
			}
			if (this.root.chosenAmount <= 0) {
				JOptionPane.showMessageDialog(null, "Минималната сума за теглене е 1 лев.", "Грешка",
						JOptionPane.ERROR_MESSAGE);
				return;
			}
		}
		if (e.getSource() == oneLvButton) {
			textField.setText(textField.getText() + "1");
		}
		if (e.getSource() == twoLvButton) {
			textField.setText(textField.getText() + "2");
		}
		if (e.getSource() == threeLvButton) {
			textField.setText(textField.getText() + "3");
		}
		if (e.getSource() == fourLvButton) {
			textField.setText(textField.getText() + "4");
		}
		if (e.getSource() == fiveLvButton) {
			textField.setText(textField.getText() + "5");
		}
		if (e.getSource() == sixLvButton) {
			textField.setText(textField.getText() + "6");
		}
		if (e.getSource() == sevenLvButton) {
			textField.setText(textField.getText() + "7");
		}
		if (e.getSource() == eightLvButton) {
			textField.setText(textField.getText() + "8");
		}
		if (e.getSource() == nineLvButton) {
			textField.setText(textField.getText() + "9");
		}
		if (e.getSource() == zeroLvButton) {
			textField.setText(textField.getText() + "0");
		}
	}

	public void showLayout() {
		JLabel label = new JLabel("Моля въведете желаната сума");
		label.setForeground(Color.WHITE);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 24));

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField.setColumns(10);

		oneLvButton = new JButton("1");
		oneLvButton.setForeground(new Color(25, 25, 112));
		oneLvButton.setBackground(Color.WHITE);
		oneLvButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		oneLvButton.addActionListener(this);

		fourLvButton = new JButton("4");
		fourLvButton.setForeground(new Color(25, 25, 112));
		fourLvButton.setBackground(Color.WHITE);
		fourLvButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		fourLvButton.addActionListener(this);

		sevenLvButton = new JButton("7");
		sevenLvButton.setForeground(new Color(25, 25, 112));
		sevenLvButton.setBackground(Color.WHITE);
		sevenLvButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		sevenLvButton.addActionListener(this);

		twoLvButton = new JButton("2");
		twoLvButton.setForeground(new Color(25, 25, 112));
		twoLvButton.setBackground(Color.WHITE);
		twoLvButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		twoLvButton.addActionListener(this);

		threeLvButton = new JButton("3");
		threeLvButton.setForeground(new Color(25, 25, 112));
		threeLvButton.setBackground(Color.WHITE);
		threeLvButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		threeLvButton.addActionListener(this);

		fiveLvButton = new JButton("5");
		fiveLvButton.setForeground(new Color(25, 25, 112));
		fiveLvButton.setBackground(Color.WHITE);
		fiveLvButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		fiveLvButton.addActionListener(this);

		sixLvButton = new JButton("6");
		sixLvButton.setForeground(new Color(25, 25, 112));
		sixLvButton.setBackground(Color.WHITE);
		sixLvButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		sixLvButton.addActionListener(this);

		eightLvButton = new JButton("8");
		eightLvButton.setForeground(new Color(25, 25, 112));
		eightLvButton.setBackground(Color.WHITE);
		eightLvButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		eightLvButton.addActionListener(this);

		nineLvButton = new JButton("9");
		nineLvButton.setForeground(new Color(25, 25, 112));
		nineLvButton.setBackground(Color.WHITE);
		nineLvButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		nineLvButton.addActionListener(this);

		zeroLvButton = new JButton("0");
		zeroLvButton.setForeground(new Color(25, 25, 112));
		zeroLvButton.setBackground(Color.WHITE);
		zeroLvButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		zeroLvButton.addActionListener(this);

		acceptButton = new JButton("Напред");
		acceptButton.setForeground(new Color(25, 25, 112));
		acceptButton.setBackground(Color.GREEN);
		acceptButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		acceptButton.addActionListener(this);

		delButton = new JButton("\u0418\u0437\u0442\u0440\u0438\u0439");
		delButton.setForeground(new Color(25, 25, 112));
		delButton.setBackground(Color.YELLOW);
		delButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		delButton.addActionListener(this);

		backButton = new JButton("\u041D\u0430\u0437\u0430\u0434");
		backButton.setForeground(new Color(25, 25, 112));
		backButton.setBackground(Color.RED);
		backButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		backButton.addActionListener(this);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup().addGap(42)
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(zeroLvButton, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
								.addComponent(sevenLvButton, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(eightLvButton, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(nineLvButton, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
								.addGap(323)
								.addComponent(backButton, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
								.addComponent(fourLvButton, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(fiveLvButton, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(sixLvButton, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
								.addGap(323)
								.addComponent(delButton, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
								.addComponent(oneLvButton, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(twoLvButton, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(threeLvButton, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
								.addGap(323).addComponent(acceptButton, GroupLayout.PREFERRED_SIZE, 155,
										GroupLayout.PREFERRED_SIZE)))
				.addGap(10))
				.addGroup(Alignment.TRAILING,
						groupLayout.createSequentialGroup().addContainerGap(290, Short.MAX_VALUE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addGap(259))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup().addContainerGap(101, Short.MAX_VALUE)
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 586, GroupLayout.PREFERRED_SIZE).addGap(68)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup().addComponent(label, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(
						textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addGap(97)
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(oneLvButton, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
								.addComponent(twoLvButton, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
								.addComponent(threeLvButton, GroupLayout.PREFERRED_SIZE, 53,
										GroupLayout.PREFERRED_SIZE))
						.addComponent(acceptButton, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
				.addGap(6)
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
								.addComponent(delButton, GroupLayout.PREFERRED_SIZE, 53,
										GroupLayout.PREFERRED_SIZE)
								.addGap(6)
								.addComponent(backButton, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup().addGroup(groupLayout
								.createParallelGroup(Alignment.BASELINE)
								.addComponent(fourLvButton, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
								.addComponent(fiveLvButton, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
								.addComponent(sixLvButton, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(sevenLvButton, GroupLayout.PREFERRED_SIZE, 53,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(eightLvButton, GroupLayout.PREFERRED_SIZE, 53,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(nineLvButton, GroupLayout.PREFERRED_SIZE, 53,
												GroupLayout.PREFERRED_SIZE))))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(zeroLvButton, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE).addGap(115)));
		setLayout(groupLayout);

	}

	public void checkIfSumStartsWithZero() {
		char[] enteredSum = new char[textField.getText().length()];

		if (enteredSum[0] == 0) {
			JOptionPane.showMessageDialog(null, "Минималната сума за теглене е 1 лев.", "Грешка",
					JOptionPane.ERROR_MESSAGE);
			this.root.isPinLengthGood = false;
			return;
		}
	}
}
