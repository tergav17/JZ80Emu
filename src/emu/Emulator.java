package emu;

import dash.Dashboard;

public class Emulator {
    private Dashboard console = new Dashboard(Dashboard.CONSOLE, "Console", 80, 24);
    private Dashboard control = new Dashboard(Dashboard.GENERIC, "Control Panel" , 30, 10);

    GuiBuilder gb = new GuiBuilder();

    public Emulator() {
        console.dashboardExitOnClose();
        control.dashboardExitOnClose();

        gb.buildControlPanel(control);

        console.println("Java Z80 Emulator V1.0");
    }

}
