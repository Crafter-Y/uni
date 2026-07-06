package chorona;

import javax.swing.*;
import java.awt.*;

public class CellButton extends JButton {
    private double dose;

    public CellButton(double dose, boolean polluter) {
        this.setPreferredSize(new Dimension(80,80));
        if (polluter) {
            this.setBorder(BorderFactory.createLineBorder(Color.BLACK,4));
        }

        setDose(dose);
    }

    public void setDose(double dose) {
        this.dose = dose;
        Chorona.updateButtonForDose(this, dose);
    }

    public double getDose() {
        return dose;
    }
}
