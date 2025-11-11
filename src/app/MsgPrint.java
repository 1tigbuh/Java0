package app;

public class MsgPrint implements Printer {
    public static class Msg {
        private String txt;
        private String sender;

        public Msg(String txt, String sender) {
            this.txt = txt;
            this.sender = sender;
        }
        public String getTxt() {
            return txt;
        }
        public String getSender() {
            return sender;
        }
        public void setSender(String sender) {
            this.sender = sender;
        }
        public void setTxt(String txt) {
            this.txt = txt;
        }
    }
    @Override
    public void print(Msg msg) {
        if (msg == null || (msg.getTxt() == null && msg.getSender() == null)) {
            Printer emptyMsg = new Printer() {
                @Override
                public void print(Msg m) {
                    System.out.println("Опрацьовується пусте повідомлення від анонімного користувача..");
                }
            };
            emptyMsg.print(null);
            return;
        }

        if (msg.getSender() == null || msg.getSender().isEmpty()) {
            System.out.println("Анонімний користувач відправив повідомлення: " + msg.getTxt());
        } else {
            System.out.println("Користувач " + msg.getSender() + " відправив повідомлення: " + msg.getTxt());
        }
    }
}