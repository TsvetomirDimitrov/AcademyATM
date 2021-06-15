import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
public class AfterPinPanel extends JPanel implements ActionListener{
	
	private ATMFrame root;
	private JLabel thankYouLabel;
	private JLabel remainingBalanceLabel;
	private JButton backButton;
	
	public AfterPinPanel(ATMFrame root) {
		setBackground(new Color(25, 25, 112));
		this.root = root;
		
		 thankYouLabel = new JLabel("\u0411\u043B\u0430\u0433\u043E\u0434\u0430\u0440\u0438\u043C \u0432\u0438, \u0447\u0435 \u0438\u0437\u043F\u043E\u043B\u0437\u0432\u0430\u0445\u0442\u0435 Academy ATM!");
		 thankYouLabel.setForeground(Color.WHITE);
		thankYouLabel.setHorizontalAlignment(SwingConstants.CENTER);
		thankYouLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		 remainingBalanceLabel = new JLabel("Остатък от сметката: " + this.root.remaningBalance);
		 remainingBalanceLabel.setForeground(Color.WHITE);
		remainingBalanceLabel.setHorizontalAlignment(SwingConstants.CENTER);
		remainingBalanceLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		backButton = new JButton("Начало");
		backButton.setBackground(Color.WHITE);
		backButton.setForeground(new Color(25, 25, 112));
		backButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		backButton.addActionListener(this);
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(324)
					.addComponent(backButton)
					.addContainerGap())
				.addComponent(remainingBalanceLabel, GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE)
				.addComponent(thankYouLabel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(155)
					.addComponent(thankYouLabel, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(remainingBalanceLabel)
					.addGap(51)
					.addComponent(backButton)
					.addContainerGap(105, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == backButton) {
			this.root.changeToWelcomeAfterTransaction();
		}
	}
	
	
	
}
