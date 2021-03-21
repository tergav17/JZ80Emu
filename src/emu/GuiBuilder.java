package emu;

import dash.Dashboard;
import dash.JBTextLabel;

public class GuiBuilder {
    public void buildControlPanel(Dashboard d) {
        JBTextLabel title = new JBTextLabel("Z80 Control Panel", 0, 0, 30, 1, true);
        title.setBoxed(true);

        d.add(title);
    }
}
