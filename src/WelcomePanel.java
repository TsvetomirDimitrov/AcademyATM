import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.Font;

public class WelcomePanel extends JPanel implements ActionListener {
	
	private ATMFrame root;
	private JButton withdrawButton;
	private JButton checkBalanceButton;
	private JLabel welcomeLabel;

	public WelcomePanel(ATMFrame root) {
		setBackground(new Color(25, 25, 112));
		this.root = root;
		
		showLayout();
		
	}
	
	public void showLayout() {
		withdrawButton = new JButton("\u0422\u0435\u0433\u043B\u0435\u043D\u0435");
		withdrawButton.setForeground(new Color(25, 25, 112));
		withdrawButton.setBackground(Color.WHITE);
		withdrawButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		withdrawButton.addActionListener(this);

		checkBalanceButton = new JButton("\u0411\u0430\u043B\u0430\u043D\u0441");
		checkBalanceButton.setForeground(new Color(25, 25, 112));
		checkBalanceButton.setBackground(Color.WHITE);
		checkBalanceButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		checkBalanceButton.addActionListener(this);
		welcomeLabel = new JLabel("\u0414\u043E\u0431\u0440\u0435 \u0434\u043E\u0448\u043B\u0438 \u0432 Academy ATM!");
		welcomeLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		welcomeLabel.setForeground(new Color(255, 255, 255));
		welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(withdrawButton, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 315, Short.MAX_VALUE)
					.addComponent(checkBalanceButton, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE))
				.addComponent(welcomeLabel, GroupLayout.DEFAULT_SIZE, 737, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(welcomeLabel)
					.addGap(105)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(checkBalanceButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(withdrawButton, GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
					.addContainerGap(242, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == withdrawButton) {
			
			this.root.changeToWithdrawPanel();
			
		}
		if(e.getSource() == checkBalanceButton) {
			this.root.changeToCheckBalancePanel();
		}
		
	}
}
