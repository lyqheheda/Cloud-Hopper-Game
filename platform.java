
/**
 * 在这里给出对类 platform 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
public class platform
{
    
    private int index;//云的编号
    private double xPosition;
    private double yPosition;
    public Alien[] alienHere= new Alien[4];//存在的外星人  
    public platform()
    {   
    }
    public void setindex(int number){
		this.index = number;
    }
    public int getindex(){
		return index;
    }
    public double getYPosition(){
		return yPosition;
    }
    public double getXPosition(){
		return xPosition;
    }
    public void setXPosition(double x){
		this.xPosition = x;
    }
    public void setYPosition(double y){
		this.yPosition = y;
    }//坐标函数，和棋盘外星人对接
    public int numberOfAlien(){
        return alienHere.length();
    }//访问外星人数量
    public Alien getAlien(int i){
        return alienHere[i];
    }//访问外星人
    public void addAlien(Alien a){
		//alienHere.add(a);操作数组加一个外星人元素		
    }
    public void removeAlien(Alien a){
		//alienHere.remove(a);操作数组减一个外星人元素
    }//添加和移除外星人
}
