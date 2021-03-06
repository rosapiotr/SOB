package gui.LoggedAdminPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddNewBookDialog extends JFrame
{
    private static final String DIALOG_TITLE="Dodawanie książki";

    private class AddNewBookDialogPanel extends JPanel
    {
        private static final String NAME_LABEL_TEXT="Wpisz nazwę";
        private static final String AUTHOR_LABEL_TEXT="Wpisz autora";
        private static final String SIGNATURE_LABEL_TEXT="Wpisz sygnaturę";
        private static final String OK_BUTTON_TEXT="OK";
        private static final String CANCEL_BUTTON_TEXT="NIE";
        private static final String UNDO_BUTTON_TEXT="Cofnij";

        private static final int LABEL_WIDTH=100;
        private static final int LABEL_HEIGHT=15;
        private static final int TEXT_FIELD_WIDTH=300;
        private static final int TEXT_FIELD_HEIGHT=25;


        private JLabel nameLabel;
        private JLabel authorLabel;
        private JLabel signatureLabel;

        private JTextField nameTextField;
        private JTextField authorTextField;
        private JTextField signatureTextField;

        private JButton okButton;
        private JButton cancelButton;
        private JButton undoButton;



        public AddNewBookDialogPanel()
        {
            super();
            this.setLayout(null);

            /*Współrzędne początkowe*/
            int x=50;
            int y=50;
            int step=40;


            nameLabel=new JLabel(NAME_LABEL_TEXT);
            nameLabel.setBounds(x, y, LABEL_WIDTH, LABEL_HEIGHT);
            this.add(nameLabel);

            nameTextField=new JTextField();
            nameTextField.setBounds(x+LABEL_WIDTH+step,  y, TEXT_FIELD_WIDTH, TEXT_FIELD_HEIGHT);
            this.add(nameTextField);

            authorLabel=new JLabel(AUTHOR_LABEL_TEXT);
            authorLabel.setBounds(x, y+=step, LABEL_WIDTH, LABEL_HEIGHT);
            this.add(authorLabel);

            authorTextField=new JTextField();
            authorTextField.setBounds(x+LABEL_WIDTH+step, y, TEXT_FIELD_WIDTH, TEXT_FIELD_HEIGHT);
            this.add(authorTextField);

            signatureLabel=new JLabel(SIGNATURE_LABEL_TEXT);
            signatureLabel.setBounds(x, y+=step, LABEL_WIDTH, LABEL_HEIGHT);
            this.add(signatureLabel);

            signatureTextField=new JTextField();
            signatureTextField.setBounds(x+LABEL_WIDTH+step, y, TEXT_FIELD_WIDTH, TEXT_FIELD_HEIGHT);
            this.add(signatureTextField);

            okButton=new JButton(OK_BUTTON_TEXT);
            okButton.setBounds(x+=50, y+=2*step, 100, 25);
            okButton.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    /*Dodajemy książkę*/
                    dispose();
                }
            });
            this.add(okButton);

            cancelButton=new JButton(CANCEL_BUTTON_TEXT);
            cancelButton.setBounds(x+=120, y, 100, 25);
            cancelButton.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    dispose();
                }
            });
            this.add(cancelButton);

            undoButton=new JButton(UNDO_BUTTON_TEXT);
            undoButton.setBounds(x+120, y, 100, 25 );
            undoButton.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    dispose();
                }
            });
            this.add(undoButton);

        }
    }

    public AddNewBookDialog()
    {
        super();
        setBounds(100, 100, 550, 300);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setTitle(DIALOG_TITLE);
        this.add(new AddNewBookDialogPanel());
        this.setVisible(true);

    }


}
