package demoKomplexXmlSaxReader;

//import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Rectangle;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.table.*;


public class MainView extends JFrame
{

	private static final long serialVersionUID = 1L;

	private JPanel jContentPane = null;

	private JScrollPane jScrollPane = null;

	private JTable jTableAdr = null;

	private JButton jButtonUpdate = null;

	private JTextField jTextFieldFilter = null;

	private JLabel jLabelFilter = null;

	/**
	 * This is the default constructor
	 */
	public MainView()
	{
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize()
	{
		this.setContentPane(getJContentPane());
		this.setTitle("JFrame");
		this.setBounds(new Rectangle(0, 0, 1024, 968));
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane()
	{
		if (jContentPane == null)
		{
			jLabelFilter = new JLabel();
			jLabelFilter.setBounds(new Rectangle(20, 20, 51, 31));
			jLabelFilter.setHorizontalAlignment(SwingConstants.RIGHT);
			jLabelFilter.setText("Filter");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(getJScrollPane(), null);
			jContentPane.add(getJButtonUpdate(), null);
			jContentPane.add(getJTextFieldFilter(), null);
			jContentPane.add(jLabelFilter, null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jScrollPane	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane()
	{
		if (jScrollPane == null)
		{
			jScrollPane = new JScrollPane();
			jScrollPane.setBounds(new Rectangle(10, 61, 965, 441));
			jScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			jScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
			jScrollPane.setViewportView(getJTableAdr());
		}
		return jScrollPane;
	}

	/**
	 * This method initializes jTableAdr	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getJTableAdr()
	{
		if (jTableAdr == null)
		{
			jTableAdr = new JTable();
		}
		return jTableAdr;
	}

	/**
	 * This method initializes jButtonUpdate	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonUpdate()
	{
		if (jButtonUpdate == null)
		{
			jButtonUpdate = new JButton();
			jButtonUpdate.setBounds(new Rectangle(580, 20, 122, 31));
			jButtonUpdate.setText("Anzeigen");
		}
		return jButtonUpdate;
	}

	/**
	 * This method initializes jTextFieldFilter	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldFilter()
	{
		if (jTextFieldFilter == null)
		{
			jTextFieldFilter = new JTextField();
			jTextFieldFilter.setBounds(new Rectangle(90, 20, 471, 31));
		}
		return jTextFieldFilter;
	}

	// ////////////////////////////////
	// Manuell zu pflegender Teil
	// ////////////////////////////////
	
	
	// Registrieren des AdrTableModels
	public void setAdrTableModel(AdrTableModel adrTableModel)
	{
		
		getJTableAdr().setModel(adrTableModel);
		
		// Layout-Gestaltung von JTable, nur ansatzweise ausgeführt
		// Bitte noch verfeinern
		getJTableAdr().getColumnModel().getColumn(0).setHeaderValue("ID");
		getJTableAdr().getColumnModel().getColumn(0).setPreferredWidth(50);
		getJTableAdr().getColumnModel().getColumn(1).setHeaderValue("Firma");
		getJTableAdr().getColumnModel().getColumn(1).setPreferredWidth(400);
		getJTableAdr().getColumnModel().getColumn(2).setHeaderValue("Strasse");
		getJTableAdr().getColumnModel().getColumn(2).setPreferredWidth(300);
		getJTableAdr().getColumnModel().getColumn(3).setHeaderValue("PLZ");
		getJTableAdr().getColumnModel().getColumn(3).setPreferredWidth(50);
		getJTableAdr().getColumnModel().getColumn(4).setHeaderValue("Ort");
		getJTableAdr().getColumnModel().getColumn(4).setPreferredWidth(400);
		getJTableAdr().getColumnModel().getColumn(5).setHeaderValue("Land");
		getJTableAdr().getColumnModel().getColumn(6).setHeaderValue("Telefon");
		getJTableAdr().getColumnModel().getColumn(7).setHeaderValue("Telefax");
		getJTableAdr().getColumnModel().getColumn(8).setHeaderValue("Erstkontakt");
		getJTableAdr().getColumnModel().getColumn(9).setHeaderValue("Wiedervorlage");
		getJTableAdr().getColumnModel().getColumn(10).setHeaderValue("Anzahl MA");
	}
	
}
