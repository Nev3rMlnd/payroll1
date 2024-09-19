import javax.swing.JOptionPane; 
public class DecisionStructure {

    public static void main(String[] args) {
/*variable declaration & initial value of data*/
String ename = JOptionPane.showInputDialog(null,"Your Name:","PayRoll", JOptionPane.INFORMATION_MESSAGE); 
int    num = Integer.parseInt(JOptionPane.showInputDialog(null,"Your Employee Number:","PayRoll", JOptionPane.INFORMATION_MESSAGE)); 
String estat = JOptionPane.showInputDialog(null,"Enter Your Employee Status:","PayRoll", JOptionPane.INFORMATION_MESSAGE),
       dept = JOptionPane.showInputDialog(null,"Please Enter what deparment are you on:","PayRoll", JOptionPane.INFORMATION_MESSAGE); 
double work = Double.parseDouble(JOptionPane.showInputDialog(null,"How many Days you worked:","PayRoll", JOptionPane.INFORMATION_MESSAGE)),
       drate = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter Your Daily Rate:","PayRoll", JOptionPane.INFORMATION_MESSAGE)),
       tax = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter Your Tax:","PayRoll", JOptionPane.INFORMATION_MESSAGE)),
       sss = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter Your SSS:","PayRoll", JOptionPane.INFORMATION_MESSAGE)),
       ca = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter Your CA:","PayRoll", JOptionPane.INFORMATION_MESSAGE));
        
/* computation */
double gpay = work * drate ,
       npay = gpay - (tax + sss + ca);
        
String output ="\n Employee Name: "+ ename +
"\n Employee Number: " + num + 
        "\n Employee Status:"+ estat.toUpperCase() +
        "\n Deparment: "+ dept +
        "\n Days Worked: "+ work +
        "\n Daily Rate: "+ drate +
        "\n Gross Pay: "+ gpay +
        "\n Less Tax: "+ tax +
        "    \n SSS: " + sss +
        "  \n  CA: " + ca +
        "\n\n Net Pay:" + npay ;
	

        /*display*/
       JOptionPane.showMessageDialog(null, output,"PayRoll", JOptionPane.INFORMATION_MESSAGE);
            }
}