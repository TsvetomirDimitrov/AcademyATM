import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;

public class WithdrawPanel extends JPanel implements ActionListener {
	private ATMFrame root;
	private JButton tenLevaButton;
	private JButton twentyLevaButton;
	private JButton fiftyLevaButton;
	private JButton oneHundredLevaButton;
	private JButton otherAmount;
	private JButton backButton;
	private JLabel label;

	public WithdrawPanel(ATMFrame root) {
		setBackground(new Color(25, 25, 112));
		this.root = root;

		showLayout();

	}

	public void showLayout() {
		tenLevaButton = new JButton("10");
		tenLevaButton.setForeground(new Color(25, 25, 112));
		tenLevaButton.setBackground(Color.WHITE);
		tenLevaButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		tenLevaButton.addActionListener(this);

		twentyLevaButton = new JButton("20");
		twentyLevaButton.setForeground(new Color(25, 25, 112));
		twentyLevaButton.setBackground(Color.WHITE);
		twentyLevaButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		twentyLevaButton.addActionListener(this);

		fiftyLevaButton = new JButton("50");
		fiftyLevaButton.setForeground(new Color(25, 25, 112));
		fiftyLevaButton.setBackground(Color.WHITE);
		fiftyLevaButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		fiftyLevaButton.addActionListener(this);

		oneHundredLevaButton = new JButton("100");
		oneHundredLevaButton.setForeground(new Color(25, 25, 112));
		oneHundredLevaButton.setBackground(Color.WHITE);
		oneHundredLevaButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		oneHundredLevaButton.addActionListener(this);

		otherAmount = new JButton("\u0414\u0440\u0443\u0433\u0430");
		otherAmount.setForeground(new Color(25, 25, 112));
		otherAmount.setBackground(Color.CYAN);
		otherAmount.setFont(new Font("Tahoma", Font.PLAIN, 24));
		otherAmount.addActionListener(this);

		label = new JLabel(
				"\u041C\u043E\u043B\u044F \u0438\u0437\u0431\u0435\u0440\u0435\u0442\u0435 \u0441\u0443\u043C\u0430 \u0437\u0430 \u0442\u0435\u0433\u043B\u0435\u043D\u0435");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label.setHorizontalAlignment(SwingConstants.CENTER);

		backButton = new JButton("\u041D\u0430\u0437\u0430\u0434");
		backButton.setForeground(new Color(25, 25, 112));
		backButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		backButton.setBackground(Color.RED);
		backButton.addActionListener(this);

		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
						.addComponent(tenLevaButton, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED, 240, Short.MAX_VALUE).addComponent(
								oneHundredLevaButton, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
						.addComponent(twentyLevaButton, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED, 240, Short.MAX_VALUE)
						.addComponent(otherAmount, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
						.addComponent(fiftyLevaButton, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED, 240, Short.MAX_VALUE)
						.addComponent(backButton, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
				.addComponent(label, GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.TRAILING).addGroup(groupLayout
				.createSequentialGroup().addComponent(label, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
				.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(tenLevaButton, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
						.addComponent(oneHundredLevaButton, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE))
				.addGap(45)
				.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(twentyLevaButton, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
						.addComponent(otherAmount, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE))
				.addGap(48)
				.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(fiftyLevaButton, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
						.addComponent(backButton, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE))));
		setLayout(groupLayout);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == tenLevaButton) {
			this.root.chosenAmount = 10;
			this.root.changeToPinPanel();
		}
		if (e.getSource() == twentyLevaButton) {
			this.root.chosenAmount = 20;
			this.root.changeToPinPanel();

		}
		if (e.getSource() == fiftyLevaButton) {
			this.root.chosenAmount = 50;
			this.root.changeToPinPanel();

		}
		if (e.getSource() == oneHundredLevaButton) {
			this.root.chosenAmount = 100;
			this.root.changeToPinPanel();

		}
		if (e.getSource() == otherAmount) {
			this.root.changeToOtherSum();

		}
		if (e.getSource() == backButton) {
			this.root.changeToWelcomeFromWithdraw();
		}

	}
}
