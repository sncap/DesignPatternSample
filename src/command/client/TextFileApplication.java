package command.client;

import command.command.OpenTextFileOperation;
import command.command.SaveTextFileOperation;
import command.command.TextFileOperation;
import command.command.WriteTextFileOperation;
import command.invoker.TextFileOperationExecutor;
import command.receiver.TextFile;

public class TextFileApplication {

    public static void main(String[] args) {

        TextFileOperation openTextFileOperation = new OpenTextFileOperation(new TextFile("file1.txt"));
        TextFileOperation saveTextFileOperation = new SaveTextFileOperation(new TextFile("file2.txt"));
        TextFileOperationExecutor textFileOperationExecutor = new TextFileOperationExecutor();
        TextFileOperation writeCommand = new WriteTextFileOperation(new TextFile("file3.txt"));

        //지금이다!
        System.out.println(textFileOperationExecutor.executeOperation(openTextFileOperation));
        System.out.println(textFileOperationExecutor.executeOperation(writeCommand));
        System.out.println(textFileOperationExecutor.executeOperation(saveTextFileOperation));

    }
}
