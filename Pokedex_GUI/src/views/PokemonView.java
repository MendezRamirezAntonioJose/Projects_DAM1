package views;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import DAO.PokemonDAO;
import DAO.UserDAO;
import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerException;
import models.Pokemon;

public class PokemonView {

	private JFrame frame;
	private JLabel lblPokedex;
	private JLabel label;
	private JLabel lblPreviewImage;
	private JPanel pokeInfoPanel;
	private JLabel lblPokeName;
	private JLabel lblPokeDescription;
	private JLabel lblPokeHeigh;
	private JLabel lblPokeWeight;
	private JLabel lblPokeTypes;
	private JLabel lblPokeAbility;
	private JButton btnPokeNext;
	private JButton btnPokePrevious;
	private JButton btnSignOut;
	private JLabel lblPokeNameText;
	private JLabel lblPokeTypesText;
	private JLabel lblPokeAbilityText;
	private JLabel lblPokeHeighText;
	private JLabel lblPokeWeightText;
	private JTextArea lblPokeDescriptionText;
	private JButton btnPlaySoundButton;
	private JLabel lblPokeNum;
	private JButton btnPokeAdmin;
	private JButton btnSearch;
	
	private String username;

	private int indexPokmeonList = 0;
	private ArrayList<Pokemon> allPokemons;
	private JLabel lblPokeCategoryText;
	private JLabel lblPokeCategory;

	/**
	 * Create the application with Admin check support
	 * @param username the username who logged in 
	 */
	public PokemonView(String username) {
		this.username = username;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		allPokemons = new ArrayList<Pokemon>();
		frame = new JFrame();
		frame.setBounds(100, 100, 580, 445);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		setDBPokemons();
		setUIComponents();
		setListeners();
		showPokemon(0);

		frame.setVisible(true);
	}

	private void setDBPokemons() {
		allPokemons = new PokemonDAO().getAllPokemons();
	}

	private void setUIComponents() {
		lblPokedex = new JLabel("Pokedex");
		lblPokedex.setHorizontalAlignment(SwingConstants.CENTER);
		lblPokedex.setForeground(Color.RED);
		lblPokedex.setFont(new Font("Leelawadee", Font.BOLD, 30));
		lblPokedex.setBounds(171, 11, 192, 46);
		frame.getContentPane().add(lblPokedex);

		label = new JLabel();
		label.setBounds(171, 43, -153, 173);
		frame.getContentPane().add(label);

		lblPreviewImage = new JLabel("");
		lblPreviewImage.setBounds(10, 60, 203, 191);
		frame.getContentPane().add(lblPreviewImage);

		pokeInfoPanel = new JPanel();
		pokeInfoPanel.setBorder(new LineBorder(new Color(0, 255, 255), 5, true));
		pokeInfoPanel.setBounds(223, 60, 319, 304);
		frame.getContentPane().add(pokeInfoPanel);
		pokeInfoPanel.setLayout(null);

		lblPokeName = new JLabel("Nombre:");
		lblPokeName.setBounds(10, 11, 59, 14);
		pokeInfoPanel.add(lblPokeName);

		lblPokeDescription = new JLabel("Descripci\u00F3n:");
		lblPokeDescription.setBounds(10, 138, 82, 14);
		pokeInfoPanel.add(lblPokeDescription);

		lblPokeHeigh = new JLabel("Altura:");
		lblPokeHeigh.setBounds(10, 111, 82, 14);
		pokeInfoPanel.add(lblPokeHeigh);

		lblPokeWeight = new JLabel("Peso:");
		lblPokeWeight.setBounds(176, 111, 46, 14);
		pokeInfoPanel.add(lblPokeWeight);

		lblPokeTypes = new JLabel("Tipo:");
		lblPokeTypes.setBounds(10, 36, 65, 14);
		pokeInfoPanel.add(lblPokeTypes);

		lblPokeAbility = new JLabel("Habilidad:");
		lblPokeAbility.setBounds(10, 86, 59, 14);
		pokeInfoPanel.add(lblPokeAbility);

		lblPokeNameText = new JLabel("");
		lblPokeNameText.setBounds(79, 11, 140, 14);
		pokeInfoPanel.add(lblPokeNameText);

		lblPokeTypesText = new JLabel("");
		lblPokeTypesText.setBounds(80, 36, 224, 14);
		pokeInfoPanel.add(lblPokeTypesText);

		lblPokeHeighText = new JLabel("");
		lblPokeHeighText.setBounds(79, 111, 64, 14);
		pokeInfoPanel.add(lblPokeHeighText);

		lblPokeWeightText = new JLabel("");
		lblPokeWeightText.setBounds(232, 111, 77, 14);
		pokeInfoPanel.add(lblPokeWeightText);

		lblPokeDescriptionText = new JTextArea("");
		lblPokeDescriptionText.setWrapStyleWord(true);
		lblPokeDescriptionText.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPokeDescriptionText.setBounds(89, 136, 215, 131);
		lblPokeDescriptionText.setEditable(false);
		lblPokeDescriptionText.setLineWrap(true);
		lblPokeDescriptionText.setOpaque(false);
		pokeInfoPanel.add(lblPokeDescriptionText);

		btnPlaySoundButton = new JButton("Sonido");
		btnPlaySoundButton.setBounds(220, 7, 89, 23);
		pokeInfoPanel.add(btnPlaySoundButton);
		
		lblPokeAbilityText = new JLabel("");
		lblPokeAbilityText.setBounds(79, 86, 225, 14);
		pokeInfoPanel.add(lblPokeAbilityText);
		lblPokeAbilityText.setVerticalAlignment(SwingConstants.TOP);
		
		lblPokeCategoryText = new JLabel("Semilla");
		lblPokeCategoryText.setVerticalAlignment(SwingConstants.TOP);
		lblPokeCategoryText.setBounds(79, 61, 225, 14);
		pokeInfoPanel.add(lblPokeCategoryText);
		
		lblPokeCategory = new JLabel("Categoria:");
		lblPokeCategory.setBounds(10, 61, 59, 14);
		pokeInfoPanel.add(lblPokeCategory);

		btnPokeNext = new JButton("Siguiente");
		btnPokeNext.setBounds(124, 288, 89, 23);
		frame.getContentPane().add(btnPokeNext);

		btnPokePrevious = new JButton("Anterior");
		btnPokePrevious.setBounds(26, 288, 89, 23);
		frame.getContentPane().add(btnPokePrevious);

		btnSignOut = new JButton("Cerrar sesi\u00F3n");
		btnSignOut.setBounds(412, 375, 130, 23);
		frame.getContentPane().add(btnSignOut);
		
		lblPokeNum = new JLabel("N\u00FAmero:");
		lblPokeNum.setHorizontalAlignment(SwingConstants.CENTER);
		lblPokeNum.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPokeNum.setBounds(26, 253, 187, 28);
		frame.getContentPane().add(lblPokeNum);
		
		btnPokeAdmin = new JButton("Panel Admin");
		btnPokeAdmin.setVerticalAlignment(SwingConstants.TOP);
		btnPokeAdmin.setBounds(438, 15, 105, 23);
		frame.getContentPane().add(btnPokeAdmin);
		
		btnSearch = new JButton("Buscar");
		btnSearch.setBounds(75, 322, 89, 23);
		frame.getContentPane().add(btnSearch);
		
		if (!new UserDAO().havePermission(username)) {
			btnPokeAdmin.setVisible(false);
		}
		
	}

	private void setListeners() {
		btnPokeNext.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				nextPokemon();
			}

		});

		btnPokePrevious.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				previousPokemon();
			}

		});

		btnSignOut.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				JOptionPane.showMessageDialog(frame, "You signed out", "INFO", JOptionPane.INFORMATION_MESSAGE);
				new LoginView();
			}

		});

		btnPlaySoundButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				playCustomSound(indexPokmeonList);
			}

		});
		
		btnPokeAdmin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				new AdminView(username);
			}

		});
	}

	private void nextPokemon() {
		if (indexPokmeonList < allPokemons.size() - 1) {
			showPokemon(++indexPokmeonList);
		}

	}

	private void previousPokemon() {
		if (indexPokmeonList > 0) {
			showPokemon(--indexPokmeonList);
		}

	}

	private void showPokemon(int index) {
		String currentNumber = String.valueOf(allPokemons.get(index).getpId());
		String currentName = allPokemons.get(index).getName();
		String currentTypes = allPokemons.get(index).getStringTypes();
		String currentCategory = allPokemons.get(index).getCategory();
		String currentDescription = allPokemons.get(index).getDescription();
		String currentHeight = String.valueOf(allPokemons.get(index).getHeight()) + "m";
		String currentWeight = String.valueOf(allPokemons.get(index).getWeight()) + "kg";
		String currentAbility = allPokemons.get(index).getAbility();
		String currentUrl = allPokemons.get(index).getImageURL();

		lblPokeNum.setText("N�mero: " + currentNumber);
		lblPokeNameText.setText(currentName);
		lblPokeTypesText.setText(currentTypes);
		lblPokeDescriptionText.setText(currentDescription);
		lblPokeHeighText.setText(currentHeight);
		lblPokeWeightText.setText(currentWeight);
		lblPokeAbilityText.setText(currentAbility);
		lblPokeCategoryText.setText(currentCategory);

		// Set preview image.
		BufferedImage img = null;
		try {
			img = ImageIO.read(new URL(currentUrl));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Image dimg = img.getScaledInstance(lblPreviewImage.getWidth(), lblPreviewImage.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon imageIcon = new ImageIcon(dimg);
		lblPreviewImage.setIcon(imageIcon);
	}

	private void playCustomSound(int indexPokmeonList) {
		String soundURL = allPokemons.get(indexPokmeonList).getSoundURL();

		BasicPlayer player = new BasicPlayer();
		try {
		    player.open(new URL(soundURL));
		    player.play();
		} catch (BasicPlayerException | MalformedURLException e) {
		    e.printStackTrace();
		}

	}
}