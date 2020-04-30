

public class Cloud extends platform
{
    private int function=0;
    public Cloud(int number)
    {
        setindex(number);
		
        /*switch (number){
                case 0:
               function=1;
                break;
                case 1:
                function=2; 
                break;
                case 2:
                
                break;
                case 3:
                
            }*///根据编号确定功能
    }
    public void loadAliean(Alien a){
		addAliean(a);
		a.setaAtionStatus(1);
		event(a);
		forcedOut(a);
    }//外星人降落
    public void forcedOut(Alien a){
        if(alienHere.length()=1 && a.identify(alienHere[0])=false && alienHere[0].getSave=false)//当云上只有一个外星人且外星人势力不同且该外星人可遣返
		alieanHere[0].goback();
    }//遣返，需要函数boolean Aliean.identify(Aliean a) 判断外星人是否势力相同
    public void leaveAlien(Alien a){
	removeAlien(a);
	a.setSave(false);
    }//外星人离开
    
    public void event(Alien a){
        switch (function){
                case 1:
               meetSafeCloud(a);
                break;
                case 2:
                meetDarkCloud(a);
                break;
                case 3:
                meetLightingCloud(a);
                break;
                case 4:
                meetSprongiZone(a);
                case 5:
                meetRainCloud(a);
            }//根据功能确定事件
    }
    private void meetRainCloud(Alien a){
        /*switch (getindex()){
                case 0:
               a.moveTo(Cloud1);//需要函数void Aliean.moveTo(Cloud c) 外星人获取目标云的坐标，移动到对应坐标
                break;
                case 1:
                 a.moveTo(Cloud2);
                break;
                case 2:
                a.moveTo(Cloud3);
                break;
                
                
            }*/
        leaveAlien(a);    
    }//雨云，根据编号去具体的云
    
    private void meetSafeCloud(Alien a){
         a.setSave(true);//需要变量save表示外星人是否安全
    }//安全云
    private void meetDarkCloud(Alien a){
        a.setmoveable(false);//需要变量moveable表示外星人是否能移动
    }//黑云
    private void meetLightingCloud(Alien a){
        a.goback();//需要函数void Aliean.goback()使外星人回到飞船
        leaveAliean(a);
    }//雷云
    private void meetSprongiZone(Alien a){
        a.setSave(true);
        a.setaAtionStatus(-1);//需要变量AtionStatus表示外星人移动方向
    }//弹簧区
}
