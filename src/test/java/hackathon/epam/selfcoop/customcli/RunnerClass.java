package hackathon.epam.selfcoop.customcli;

import picocli.CommandLine;

@CommandLine.Command(
        name = "runner",
        description = "run gherkin tests"
)
public class RunnerClass implements Runnable{
    public static void main(String[] args) {
        CommandLine.run(new RunnerClass(), args);
    }

    @Override
    public void run() {

    }
}
