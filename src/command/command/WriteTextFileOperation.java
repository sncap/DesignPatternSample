package command.command;

import command.receiver.TextFile;

public class WriteTextFileOperation implements TextFileOperation{

    private final TextFile textFile;

    public WriteTextFileOperation(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public String execute() {
        return textFile.write();
    }
}
