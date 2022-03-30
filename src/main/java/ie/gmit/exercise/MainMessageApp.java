package ie.gmit.exercise;

import java.io.IOException;
import java.io.PrintWriter;

public class MainMessageApp {

	public static void main(String[] args) throws IOException {

		Formatter formatter = new TextFormatter();

		PrintWriter writer = new PrintWriter(System.out);

		Message msg = new Message("This is a message");
		MessagePrinter printer = new MessagePrinter();
		printer.writeMessage(formatter, writer, msg);
	}

}
