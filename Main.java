package chess;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener {

	JButton btn[][] = new JButton[8][8];
	ActionEvent shikari;
	JButton s1 = new JButton();
	JButton s2 = new JButton();
	boolean whiteMove = true;

//	ImageIcon setOfP[] =new ImageIcon[12];

	ImageIcon Wpawn = new ImageIcon(new ImageIcon(
			"C:\\Users\\yutik\\Desktop\\DeskTop\\JohnPablok Cburnett Chess Zip\\JohnPablok Cburnett Chess set\\PNGs\\No shadow\\128h\\w_pawn_png_128px.png")
			.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));

	ImageIcon Bpawn = new ImageIcon(new ImageIcon(
			"C:\\Users\\yutik\\Desktop\\DeskTop\\JohnPablok Cburnett Chess Zip\\JohnPablok Cburnett Chess set\\PNGs\\No shadow\\128h\\b_pawn_png_128px.png")
			.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
	ImageIcon Wrook = new ImageIcon(new ImageIcon(
			"C:\\Users\\yutik\\Desktop\\DeskTop\\JohnPablok Cburnett Chess Zip\\JohnPablok Cburnett Chess set\\PNGs\\No shadow\\128h\\w_rook_png_128px.png")
			.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
	ImageIcon Brook = new ImageIcon(new ImageIcon(
			"C:\\Users\\yutik\\Desktop\\DeskTop\\JohnPablok Cburnett Chess Zip\\JohnPablok Cburnett Chess set\\PNGs\\No shadow\\128h\\b_rook_png_128px.png")
			.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
	ImageIcon Whrs = new ImageIcon(new ImageIcon(
			"C:\\Users\\yutik\\Desktop\\DeskTop\\JohnPablok Cburnett Chess Zip\\JohnPablok Cburnett Chess set\\PNGs\\No shadow\\128h\\w_knight_png_128px.png")
			.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
	ImageIcon Bhrs = new ImageIcon(new ImageIcon(
			"C:\\Users\\yutik\\Desktop\\DeskTop\\JohnPablok Cburnett Chess Zip\\JohnPablok Cburnett Chess set\\PNGs\\No shadow\\128h\\b_knight_png_128px.png")
			.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
	ImageIcon Wbis = new ImageIcon(new ImageIcon(
			"C:\\Users\\yutik\\Desktop\\DeskTop\\JohnPablok Cburnett Chess Zip\\JohnPablok Cburnett Chess set\\PNGs\\No shadow\\128h\\w_bishop_png_128px.png")
			.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
	ImageIcon Bbis = new ImageIcon(new ImageIcon(
			"C:\\Users\\yutik\\Desktop\\DeskTop\\JohnPablok Cburnett Chess Zip\\JohnPablok Cburnett Chess set\\PNGs\\No shadow\\128h\\b_bishop_png_128px.png")
			.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
	ImageIcon Wking = new ImageIcon(new ImageIcon(
			"C:\\Users\\yutik\\Desktop\\DeskTop\\JohnPablok Cburnett Chess Zip\\JohnPablok Cburnett Chess set\\PNGs\\No shadow\\128h\\w_king_png_128px.png")
			.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
	ImageIcon Bking = new ImageIcon(new ImageIcon(
			"C:\\Users\\yutik\\Desktop\\DeskTop\\JohnPablok Cburnett Chess Zip\\JohnPablok Cburnett Chess set\\PNGs\\No shadow\\128h\\b_king_png_128px.png")
			.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
	ImageIcon Wqueen = new ImageIcon(new ImageIcon(
			"C:\\Users\\yutik\\Desktop\\DeskTop\\JohnPablok Cburnett Chess Zip\\JohnPablok Cburnett Chess set\\PNGs\\No shadow\\128h\\w_queen_png_128px.png")
			.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
	ImageIcon Bqueen = new ImageIcon(new ImageIcon(
			"C:\\Users\\yutik\\Desktop\\DeskTop\\JohnPablok Cburnett Chess Zip\\JohnPablok Cburnett Chess set\\PNGs\\No shadow\\128h\\b_queen_png_128px.png")
			.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));

	MyFrame() {

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLayout(new GridLayout(8, 8));
		createBtn();
		this.setBounds(0, 0, 820, 820);
		this.setResizable(false);

	}

	private void createBtn() {
		byte giveClr = 0;

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				btn[i][j] = new JButton();
				switch (giveClr) {
				case 0:
					btn[i][j].setBackground(new Color(242, 236, 218));
					giveClr = 1;
					break;
				case 1:
					btn[i][j].setBackground(new Color(159, 209, 132));
					giveClr = 0;
					break;

				}

				btn[i][j].setFocusable(false);
				btn[i][j].addActionListener(this);

				this.add(btn[i][j]);

				switch (i) {
				case 1:
					btn[i][j].setIcon(Bpawn);
					break;

				case 6:
					btn[i][j].setIcon(Wpawn);
					break;

				case 0:
					switch (j) {
					case 0:
						btn[i][j].setIcon(Brook);
						break;

					case 1:
						btn[i][j].setIcon(Bhrs);
						break;

					case 2:
						btn[i][j].setIcon(Bbis);
						break;

					case 3:
						btn[i][j].setIcon(Bqueen);
						break;

					case 4:
						btn[i][j].setIcon(Bking);
						break;

					case 5:
						btn[i][j].setIcon(Bbis);
						break;

					case 6:
						btn[i][j].setIcon(Bhrs);
						break;

					case 7:
						btn[i][j].setIcon(Brook);
						break;
					}
					break;

				case 7:
					switch (j) {
					case 0:
						btn[i][j].setIcon(Wrook);
						break;

					case 1:
						btn[i][j].setIcon(Whrs);
						break;

					case 2:
						btn[i][j].setIcon(Wbis);
						break;

					case 3:
						btn[i][j].setIcon(Wqueen);
						break;

					case 4:
						btn[i][j].setIcon(Wking);
						break;

					case 5:
						btn[i][j].setIcon(Wbis);
						break;

					case 6:
						btn[i][j].setIcon(Whrs);
						break;

					case 7:
						btn[i][j].setIcon(Wrook);
						break;
					}
					break;
				}
				// System.out.println(btn[i][j].getIcon());
			}

			switch (giveClr) {
			case 0:
				giveClr = 1;
				break;
			case 1:
				giveClr = 0;
				break;
			}
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (shikari != null) {
			s1 = (JButton) shikari.getSource();
			s2 = (JButton) e.getSource();
			int exImg[] = new int[4];
			if (s1.getIcon() != null && s2.getIcon() != null) {

				exImg = getPosition(s1, s2);
				// killing piece
				if (whiteMove == true && isClrWhite((ImageIcon) s1.getIcon()) == true
						&& isClrWhite((ImageIcon) s2.getIcon()) == false) {
					///
					if (isMovableHere(getPosition(s1, s2),
							movesPossible(whatPieceisThis((ImageIcon) s1.getIcon()), getPosition(s1, s2)))) {
						btn[exImg[2]][exImg[3]].setIcon(btn[exImg[0]][exImg[1]].getIcon());
						btn[exImg[0]][exImg[1]].setIcon(null);
						whiteMove = false;
					}

				} else if (whiteMove == false && isClrWhite((ImageIcon) s1.getIcon()) == false
						&& isClrWhite((ImageIcon) s2.getIcon()) == true) {
					///
					if (isMovableHere(getPosition(s1, s2),
							movesPossible(whatPieceisThis((ImageIcon) s1.getIcon()), getPosition(s1, s2)))) {
						btn[exImg[2]][exImg[3]].setIcon(btn[exImg[0]][exImg[1]].getIcon());
						btn[exImg[0]][exImg[1]].setIcon(null);
						whiteMove = true;
					}

				}
			} else if (s1.getIcon() != null && s2.getIcon() == null) {
				// move piece to empty space
				exImg = getPosition(s1, s2);

				if (whiteMove == true && isClrWhite((ImageIcon) s1.getIcon()) == true) {
					///
					if (isMovableHere(getPosition(s1, s2),
							movesPossible(whatPieceisThis((ImageIcon) s1.getIcon()), getPosition(s1, s2)))) {
						btn[exImg[2]][exImg[3]].setIcon(btn[exImg[0]][exImg[1]].getIcon());
						btn[exImg[0]][exImg[1]].setIcon(null);
						whiteMove = false;
					}

				} else if (whiteMove == false && isClrWhite((ImageIcon) s1.getIcon()) == false) {
					///

					if (isMovableHere(getPosition(s1, s2),
							movesPossible(whatPieceisThis((ImageIcon) s1.getIcon()), getPosition(s1, s2)))) {
						btn[exImg[2]][exImg[3]].setIcon(btn[exImg[0]][exImg[1]].getIcon());
						btn[exImg[0]][exImg[1]].setIcon(null);
						whiteMove = true;
					}

				}
			}
		}

		shikari = e;
	}

	public boolean isClrWhite(ImageIcon i) {
		if (i == Wpawn || i == Wrook || i == Whrs || i == Wbis || i == Wking || i == Wqueen) {
			return true;
		} else {
			return false;
		}

	}

	public int whatPieceisThis(ImageIcon i) {
		if (i == Wpawn || i == Bpawn) {
			return 0;
		}

		if (i == Wrook || i == Brook) {
			return 1;
		}

		if (i == Whrs || i == Bhrs) {
			return 2;
		}

		if (i == Wbis || i == Bbis) {
			return 3;
		}

		if (i == Wqueen || i == Bqueen) {
			return 4;
		}

		if (i == Wking || i == Bking) {
			return 5;
		}

		return 0;
	}

	public int[] getPosition(JButton s1, JButton s2) {
		int[] index = new int[4];
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (btn[i][j] == s1) {
					index[0] = i;
					index[1] = j;
				}

				if (btn[i][j] == s2) {
					index[2] = i;
					index[3] = j;
				}

				if (index.length == 4) {
					return index;
				}
			}
		}
		return index;
	}

	// (whatPisT,getP)
	public int[] movesPossible(int p, int[] index) {

		int[] mvsPss = new int[64];
		int i = index[0];
		int j = index[1];
		int a = 0;

		switch (p) {

		case 0:
			// pawn
			if (whiteMove) {

				if (index[0] == 6) {

					if (obe(i - 1, j) && btn[i--][j].getIcon() == null) {
						mvsPss[a] = i;
						mvsPss[a + 1] = j;
						a++;

					}
					if (obe(i - 1, j) && btn[i--][j].getIcon() == null) {
						mvsPss[a] = i;
						mvsPss[a + 1] = j;
						a++;

					}
				} else {
					if (obe(i - 1, j) && btn[i--][j].getIcon() == null) {
						mvsPss[a] = i;
						mvsPss[a + 1] = j;
						a++;

					}
				}
				////////////////////////////////////////////////

				if (obe(index[0] - 1, index[1] - 1) && btn[index[0] - 1][index[1] - 1].getIcon() != null) {
					mvsPss[a] = i;
					mvsPss[a + 1] = j;
					a++;

				}

				if (obe(index[0] - 1, index[1] + 1) && btn[index[0] - 1][index[1] + 1].getIcon() != null) {
					mvsPss[a] = i;
					mvsPss[a + 1] = j;
					a++;

				}

			} else {

				if (index[0] == 1) {

					if (obe(i + 1, j) && btn[i++][j].getIcon() == null) {
						mvsPss[a] = i;
						mvsPss[a + 1] = j;
						a++;

					}
					if (obe(i + 1, j) && btn[i++][j].getIcon() == null) {
						mvsPss[a] = i;
						mvsPss[a + 1] = j;
						a++;

					}
				} else {
					if (obe(i + 1, j) && btn[i++][j].getIcon() == null) {
						mvsPss[a] = i;
						mvsPss[a + 1] = j;
						a++;

					}
				}
				////////////////////////////////////////////////

				if (obe(index[0] + 1, index[1] + 1) && btn[index[0] + 1][index[1] + 1].getIcon() != null) {
					mvsPss[a] = i;
					mvsPss[a + 1] = j;
					a++;
					;
				}

				if (obe(index[0] + 1, index[1] - 1) && btn[index[0] + 1][index[1] - 1].getIcon() != null) {
					mvsPss[a] = i;
					mvsPss[a + 1] = j;
					a++;

				}

			}

		case 1:
			// rook
			while (obe(i, j + 1) && btn[i][j++].getIcon() == null) {
				mvsPss[a] = i;
				mvsPss[a + 1] = j;
				a++;

			}
			mvsPss[a] = i;
			mvsPss[a + 1] = j;
			i = index[0];
			j = index[1];

			while (obe(i, j - 1) && btn[i][j--].getIcon() == null) {
				mvsPss[a] = i;
				mvsPss[a + 1] = j;
				a++;

			}
			mvsPss[a] = i;
			mvsPss[a + 1] = j;
			i = index[0];
			j = index[1];

			while (obe(i + 1, j) && btn[i++][j].getIcon() == null) {
				mvsPss[a] = i;
				mvsPss[a + 1] = j;
				a++;
				;
			}
			mvsPss[a] = i;
			mvsPss[a + 1] = j;
			i = index[0];
			j = index[1];

			while (obe(i - 1, j) && btn[i--][j].getIcon() == null) {
				mvsPss[a] = i;
				mvsPss[a + 1] = j;
				a++;

			}
			mvsPss[a] = i;
			mvsPss[a + 1] = j;
			i = index[0];
			j = index[1];

			break;

		case 2:
			// knight
			if (obe(index[0] + 1, index[1] + 2) && btn[index[0] + 1][index[1] + 2].getIcon() == null) {
				mvsPss[a] = i;
				mvsPss[a + 1] = j;
				a++;

			}

			if (obe(index[0] - 1, index[1] + 2) && btn[index[0] - 1][index[1] + 2].getIcon() == null) {
				mvsPss[a] = i;
				mvsPss[a + 1] = j;
				a++;

			}

			if (obe(index[0] + 1, index[1] - 2) && btn[index[0] + 1][index[1] - 2].getIcon() == null) {
				mvsPss[a] = i;
				mvsPss[a + 1] = j;
				a++;

			}

			if (obe(index[0] - 1, index[1] - 2) && btn[index[0] - 1][index[1] - 2].getIcon() == null) {
				mvsPss[a] = i;
				mvsPss[a + 1] = j;
				a++;

			}

			if (obe(index[0] + 2, index[1] - 1) && btn[index[0] + 2][index[1] - 1].getIcon() == null) {
				mvsPss[a] = i;
				mvsPss[a + 1] = j;
				a++;

			}

			if (obe(index[0] + 2, index[1] + 1) && btn[index[0] + 2][index[1] + 1].getIcon() == null) {
				mvsPss[a] = i;
				mvsPss[a + 1] = j;
				a++;

			}

			if (obe(index[0] - 2, index[1] - 1) && btn[index[0] - 2][index[1] - 1].getIcon() == null) {
				mvsPss[a] = i;
				mvsPss[a + 1] = j;
				a++;

			}

			if (obe(index[0] - 2, index[1] + 1) && btn[index[0] - 2][index[1] + 1].getIcon() == null) {
				mvsPss[a] = i;
				mvsPss[a + 1] = j;
				a++;

			}

			break;

		case 3:
			// bishop
			while (obe(i + 1, j + 1) && btn[i++][j++].getIcon() == null) {
				mvsPss[a] = i;
				mvsPss[a + 1] = j;
				a++;

			}
			mvsPss[a] = i;
			mvsPss[a + 1] = j;
			i = index[0];
			j = index[1];

			while (obe(i + 1, j - 1) && btn[i++][j--].getIcon() == null) {
				mvsPss[a] = i;
				mvsPss[a + 1] = j;
				a++;

			}
			mvsPss[a] = i;
			mvsPss[a + 1] = j;
			i = index[0];
			j = index[1];

			while (obe(i - 1, j + 1) && btn[i--][j++].getIcon() == null) {
				mvsPss[a] = i;
				mvsPss[a + 1] = j;
				a++;

			}
			mvsPss[a] = i;
			mvsPss[a + 1] = j;
			i = index[0];
			j = index[1];

			while (obe(i - 1, j - 1) && btn[i--][j--].getIcon() == null) {
				mvsPss[a] = i;
				mvsPss[a + 1] = j;
				a++;

			}
			mvsPss[a] = i;
			mvsPss[a + 1] = j;
			i = index[0];
			j = index[1];

			break;

		case 4:
			// queen
			// bishop
			while (obe(i + 1, j + 1) && btn[i++][j++].getIcon() == null) {
				mvsPss[a] = i;
				mvsPss[a + 1] = j;
				a++;

			}
			mvsPss[a] = i;
			mvsPss[a + 1] = j;
			i = index[0];
			j = index[1];

			while (obe(i + 1, j - 1) && btn[i++][j--].getIcon() == null) {
				mvsPss[a] = i;
				mvsPss[a + 1] = j;
				a++;

			}
			mvsPss[a] = i;
			mvsPss[a + 1] = j;
			i = index[0];
			j = index[1];

			while (obe(i - 1, j + 1) && btn[i--][j++].getIcon() == null) {
				mvsPss[a] = i;
				mvsPss[a + 1] = j;
				a++;

			}
			mvsPss[a] = i;
			mvsPss[a + 1] = j;
			i = index[0];
			j = index[1];

			while (obe(i - 1, j - 1) && btn[i--][j--].getIcon() == null) {
				mvsPss[a] = i;
				mvsPss[a + 1] = j;
				a++;

			}
			mvsPss[a] = i;
			mvsPss[a + 1] = j;
			i = index[0];
			j = index[1];

			// rook
			while (obe(i, j + 1) && btn[i][j++].getIcon() == null) {
				mvsPss[a] = i;
				mvsPss[a + 1] = j;
				a++;

			}
			mvsPss[a] = i;
			mvsPss[a + 1] = j;
			i = index[0];
			j = index[1];

			while (obe(i, j - 1) && btn[i][j--].getIcon() == null) {
				mvsPss[a] = i;
				mvsPss[a + 1] = j;
				a++;

			}
			mvsPss[a] = i;
			mvsPss[a + 1] = j;
			i = index[0];
			j = index[1];

			while (obe(i + 1, j) && btn[i++][j].getIcon() == null) {
				mvsPss[a] = i;
				mvsPss[a + 1] = j;
				a++;

			}
			mvsPss[a] = i;
			mvsPss[a + 1] = j;
			i = index[0];
			j = index[1];

			while (obe(i - 1, j) && btn[i--][j].getIcon() == null) {
				mvsPss[a] = i;
				mvsPss[a + 1] = j;
				a++;

			}
			mvsPss[a] = i;
			mvsPss[a + 1] = j;
			i = index[0];
			j = index[1];

			break;

		case 5:
			// king
			i = index[0] - 1;
			j = index[1] - 1;
			for (int x = 0; x < 3; x++) {
				if (obe(i, j) && btn[i][j].getIcon() == null) {
					mvsPss[a] = i;
					mvsPss[a + 1] = j;
					a++;

				}
				j++;
			}
			mvsPss[a] = i;
			mvsPss[a + 1] = j;

			i = index[0];
			j = index[1] - 1;
			for (int x = 0; x < 3; x++) {
				if (obe(i, j) && btn[i][j].getIcon() == null) {
					mvsPss[a] = i;
					mvsPss[a + 1] = j;
					a++;

				}
				j++;
			}
			mvsPss[a] = i;
			mvsPss[a + 1] = j;

			i = index[0] + 1;
			j = index[1] - 1;
			for (int x = 0; x < 3; x++) {
				if (obe(i, j) && btn[i][j].getIcon() == null) {
					mvsPss[a] = i;
					mvsPss[a + 1] = j;
					a++;
				}
				j++;
			}
			mvsPss[a] = i;
			mvsPss[a + 1] = j;
			break;
		}

		return mvsPss;
	}

	// (getPos,movesP)
	public boolean isMovableHere(int[] index, int[] mvsPss) {
		for (int i = 0; i < 64; i = i + 2) {
			if (mvsPss[i] == index[2] && mvsPss[i + 1] == index[3]) {
				return true;
			}
		}
		return false;
	}

	public boolean obe(int i, int j) {

		if (i >= 0 && j >= 0 && i <= 7 && j <= 7) {
			return true;
		}

		return false;

	}

}
