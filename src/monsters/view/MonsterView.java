package monsters.view;

import javax.swing.JOptionPane;
import monsters.controller.MonsterAppController;

public class MonsterView
{
	private MonsterAppController baseController;

	public MonsterView(MonsterAppController baseController)
	{
		this.baseController = baseController;
	}

	public void displayInformation()
	{
		JOptionPane.showMessageDialog(null, "POPUP!");
		JOptionPane.showMessageDialog(null, "I made a monster, its name is " + baseController.getMyMonster().getName());
		JOptionPane.showMessageDialog(null, baseController.getMyMonster().getName() + " has " + baseController.getMyMonster().getArmCount() + " arms");
		JOptionPane.showMessageDialog(null, "He also has " + baseController.getMyMonster().getNumberOfLegs() + " legs");
		JOptionPane.showMessageDialog(null, "and he has "+ baseController.getMyMonster().getAmountOfHair() + " hair length" );
		JOptionPane.showMessageDialog(null, "He also has " + baseController.getMyMonster().getEyeCount() + " eyes.");
	}

}
