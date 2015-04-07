package UI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.UIManager;

public class CheckBoxGroup extends JPanel {

    private JCheckBox all;
    private List<JCheckBox> checkBoxes;

    public CheckBoxGroup(String... options) {
        checkBoxes = new ArrayList<>(25);
        setLayout(new BorderLayout());
        JPanel header = new JPanel(new FlowLayout(FlowLayout.LEFT, 1, 1));
        all = new JCheckBox("Alle auswählen...");
        all.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (JCheckBox cb : checkBoxes) {
                    cb.setSelected(all.isSelected());
                }
            }
        });
        header.add(all);
        add(header, BorderLayout.NORTH);

        JPanel content = new JPanel(new GridBagLayout());
        content.setBackground(UIManager.getColor("List.background"));
        if (options.length > 0) {

            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridwidth = GridBagConstraints.REMAINDER;
            gbc.anchor = GridBagConstraints.NORTHWEST;
            gbc.weightx = 1;
            for (int index = 0; index < options.length - 1; index++) {
                JCheckBox cb = new JCheckBox(options[index]);
                cb.setOpaque(false);
                checkBoxes.add(cb);
                content.add(cb, gbc);
            }

            JCheckBox cb = new JCheckBox(options[options.length - 1]);
            cb.setOpaque(false);
            checkBoxes.add(cb);
            gbc.weighty = 1;
            content.add(cb, gbc);

        }

        add(new JScrollPane(content));
    }
}
