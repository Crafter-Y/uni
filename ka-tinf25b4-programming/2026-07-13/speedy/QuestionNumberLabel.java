package speedy;

import javax.swing.*;
import java.awt.*;

public class QuestionNumberLabel extends JLabel {
    private Status status;

    public QuestionNumberLabel(String message) {
        super(message);
        this.status = Status.PENDING;
        this.setOpaque(true);
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setBackground(this.status.getColor());
        this.setPreferredSize(new Dimension(48, 16));
    }

    public void setStatus(Status status) {
        this.status = status;
        this.setBackground(status.getColor());
    }
}
