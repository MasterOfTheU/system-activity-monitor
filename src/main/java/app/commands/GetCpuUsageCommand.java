package app.commands;

import app.commands.receivers.CPUIndicator;

/**
 * Command for printing cpu recent usage.
 */
public class GetCpuUsageCommand implements Command {

    private CPUIndicator indicator;

    public GetCpuUsageCommand(CPUIndicator indicator) {
        this.indicator = indicator;
    }

    @Override
    public void execute() {
        this.indicator.getInfo();
    }

}
