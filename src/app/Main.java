package app;

public class Main {
    public static void main(String[] args) {
        MsgPrint printer = new MsgPrint();

        MsgPrint.Msg msg1 = new MsgPrint.Msg("Привіт", "Валера");

        MsgPrint.Msg msg2 = new MsgPrint.Msg("Добрий день", null);

        MsgPrint.Msg msg3 = new MsgPrint.Msg(null, null);

        printer.print(msg1);
        printer.print(msg2);
        printer.print(msg3);
    }
}