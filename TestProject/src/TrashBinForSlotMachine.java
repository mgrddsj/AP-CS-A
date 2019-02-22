import java.awt.Image;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class TrashBinForSlotMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private void rollUntil(int slot1Res,int slot2Res,int slot3Res) throws InterruptedException
	{
		Random rand = new Random();
		boolean slot1Stop = false;
		boolean slot2Stop = false;
		boolean slot3Stop = false;

		//Roll up
		while (!slot1Stop || !slot2Stop || !slot3Stop)
		{
			int temp1 = rand.nextInt(7);
			int temp2 = rand.nextInt(7);
			int temp3 = rand.nextInt(7);

			if (!slot1Stop)
			{
				replace(slot1.get(0), board[0][1]);
				replace(slot1.get(1), board[0][2]);
				replace(slot1.get(2), temp1);
			}	
			if (!slot2Stop)
			{
				replace(slot2.get(0), board[1][1]);
				replace(slot2.get(1), board[1][2]);
				replace(slot2.get(2), temp2);
			}
			if (!slot3Stop)
			{
				replace(slot3.get(0), board[2][1]);
				replace(slot3.get(1), board[2][2]);
				replace(slot3.get(2), temp3);
			}
			
			updateBoard(temp1, temp2, temp3, slot1Stop, slot2Stop, slot3Stop);

			if (board[0][1] == slot1Res)
			{
				slot1Stop = true;
			}
			if (board[1][1] == slot2Res && slot1Stop == true)
			{
				slot2Stop = true;
			}
			if (board[2][1] == slot3Res && slot2Stop == true)
			{
				slot3Stop = true;
			}

			Thread.sleep(1000);
			// TimeUnit.MILLISECONDS.sleep(100);
			// wait(100);

		}
		
		private void updateBoard(int new1,int new2,int new3,boolean slot1,boolean slot2,boolean slot3)
		{
			if (!slot1)
			{
				board[0][0] = board[0][1];
				board[0][1] = board[0][2];
				board[0][2] = new1;
			}
			if (!slot2)
			{
				board[1][0] = board[1][1];
				board[1][1] = board[1][2];
				board[1][2] = new2;
			}
			if (!slot3)
			{
				board[2][0] = board[2][1];
				board[2][1] = board[2][2];
				board[2][2] = new3;
			}
		}
		
		private void replace(JLabel label,int pic)
		{
			// Setup images that needed to be used.
			Image background = new ImageIcon(this.getClass().getResource("/NewNewSlotMachineBackground.jpg")).getImage();
			Image bio = new ImageIcon(this.getClass().getResource("/biology.png")).getImage();
			Image chem = new ImageIcon(this.getClass().getResource("/chemistry.png")).getImage();
			Image chinese = new ImageIcon(this.getClass().getResource("/chinese.png")).getImage();
			Image cs = new ImageIcon(this.getClass().getResource("/cs.png")).getImage();
			Image eng = new ImageIcon(this.getClass().getResource("/english.png")).getImage();
			Image his = new ImageIcon(this.getClass().getResource("/history.png")).getImage();
			Image math = new ImageIcon(this.getClass().getResource("/maths.png")).getImage();
			Image physics = new ImageIcon(this.getClass().getResource("/physics.png")).getImage();
			
			//Add images into list. 
			images.add(background);
			images.add(bio);
			images.add(chem);
			images.add(chinese);
			images.add(cs);
			images.add(eng);
			images.add(his);
			images.add(math);
			images.add(physics);
			
			label.setIcon(new ImageIcon(images.get(pic)));
		}
}
