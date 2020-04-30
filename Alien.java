public class Alien {
    boolean isSafe = false; //判断是否降落到safe cloud或 lightning cloud上
    boolean moveable = false;
    boolean isFreeze=false;//判断是否降落到dark cloud上
    boolean isFriend; //判断降落到同一片云上的外星人是不是友军
    double xPosition;
    double yPosition;
    int side;//外星人的阵营
    int actionStatus;// 移动方向。1表示向上，-1表示向下
    // boolean isFall  ?是否在rain cloud上 不确定需不需要这个变量

    public Alien() {

    }

    public void moveTo(Cloud cloud) {
        switch(cloud.getIndex)
        case: // 黑云的编号
        case:   break;
        default:{
            this.xPosition=cloud.getXPosition();
        this.yPosition=cloud.getYPosition();
        }
        
        
        
    }

    public void goBack(Ship ship) {
        this.xPosition=ship.getXPosition();
        this.yPosition=ship.getYPosition();
    }

    public int getside(){
        return side;
    }

    public void setActionStatus(int status){
        actionStatus=status;
    }

    public boolean identify(Alien alien){
        if(this.getside()==alien.getside())
        return true;
        else 
        return false;
    }

}