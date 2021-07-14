public class EmailMessage extends Message {
    private String messageBody;
    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }
    @Override
    String submitContent() {
        String status = "";
        status = sendEmail(getSender(), getReceiver(), getMessageBody());
        return status;
    }
    private String sendEmail(String sender, String receiver, String messageBody2) {
        //code to send the email and set return status goes here
        return String.format("Message sent to %s from %s: %s", sender, receiver, messageBody2);
    }

}
