
public class Ship extends platform
{
   private int side;//飞船的阵营
   public Ship(int number)
    {
        setindex(50);//飞船的坐标都是50
        side=number;
    }
   public double getside(){
		return side;
    }
    public void setside(int number){
		this.side = side;
    }
   boolean identify(Alien a){
       if(this.getside()==a.getside())
       return true;
       else 
       return false;
   }//判断外星人回到哪个飞船时用到
}
