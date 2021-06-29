import javax.swing.*;

public class UI2L {
    public static void send() {
        if (!L2UI.isConnected) {
            JOptionPane.showMessageDialog(null, "还没有连接服务器，无法发送消息！", "错误",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        String message = ChatFrame.textField1.getText().trim();
        if (message == null || message.equals("")) {
            JOptionPane.showMessageDialog(null, "消息不能为空！", "错误",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        //        sendMessage(label1.getText() + "@" + "ALL" + "@" + message);
        ChatFrame.textField1.setText(null);
    }
}
