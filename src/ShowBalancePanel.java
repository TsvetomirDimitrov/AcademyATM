import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;

public class ShowBalancePanel extends JPanel implements ActionListener {
	private ATMFrame root;
	private JLabel showBalanceLabel;
	private JLabel balanceLabel;
	private JButton backButton;

	public ShowBalancePanel(ATMFrame root) {
		setBackground(new Color(25, 25, 112));
		this.root = root;

		showLayout();

	}

	public void showLayout() {
		showBalanceLabel = new JLabel("Благодарим ви, че използвахте Academy ATM!");
		showBalanceLabel.setForeground(Color.WHITE);
		showBalanceLabel.setHorizontalAlignment(SwingConstants.CENTER);
		showBalanceLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));

		balanceLabel = new JLabel("Остатък от сметката: " + this.root.currentBalance + " лева.");
		balanceLabel.setForeground(Color.WHITE);
		balanceLabel.setHorizontalAlignment(SwingConstants.CENTER);
		balanceLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));

		backButton = new JButton("Начало");
		backButton.setForeground(new Color(25, 25, 112));
		backButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		backButton.setBackground(Color.WHITE);
		backButton.addActionListener(this);
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(showBalanceLabel, GroupLayout.PREFERRED_SIZE, 803, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(balanceLabel, GroupLayout.DEFAULT_SIZE, 793, Short.MAX_VALUE)))
					.addContainerGap())
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(340, Short.MAX_VALUE)
					.addComponent(backButton, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
					.addGap(338))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(170, Short.MAX_VALUE)
					.addComponent(showBalanceLabel, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(balanceLabel)
					.addGap(53)
					.addComponent(backButton, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(76))
		);
		setLayout(groupLayout);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == backButton) {
			this.root.changeToWelcomeFromFinalBalance();
		}
	}

}
