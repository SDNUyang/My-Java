package M3D28;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*图形界面对象程序小试*/
public class AppFramInOut {
    public static void main(String[] args)
    {
        new AppFram();
    }

}
class AppFram extends JFrame
{
    JTextField in=new JTextField(10);
    JTextField in2=new JTextField(10);
    JButton btn=new JButton("求和");
    JLabel out=new JLabel("显示输出结果的标签");

    /*构造方法（同C++中的构造函数）*/
    public AppFram()
    {
        setLayout(new FlowLayout());//设置对话框的布局方式为（）在这里设为流式布局，就是挨着
        getContentPane().add(in);//在对话框的内容面板上添加用户所定义的内容
        getContentPane().add(in2);
        getContentPane().add(btn);
        getContentPane().add(out);
        btn.addActionListener(new BtnActionAdpter());//事件监听器；使按钮有效，也就是说addActionListener（）括号里面的形式参数是按钮的动作，要干什么事情。
        setSize(500,200);//界面的大小
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);//按下❌按钮程序会结束
        setVisible(true);//显示

    }
    /*动作事件*/
    class BtnActionAdpter implements ActionListener
    {
        public void actionPerformed(ActionEvent e)//动作事件
        {
            String s=in.getText();
            String c=in2.getText();
            double d=Double.parseDouble(s);
            double f=Double.parseDouble(c);
            double sum=d+f;
            out.setText(d+"+"+f+"的和是"+sum);
        }
    }


}

