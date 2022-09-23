class Solution {
    public int dayOfYear(String d) {
        String s_year="";
        for(int i=0;i<=3;i++){
            s_year+=d.charAt(i);
        }
        String s_month="";
        for(int i=5;i<=6;i++){
            s_month+=d.charAt(i);
        }
        String s_day="";
        for(int i=8;i<=9;i++){
            s_day+=d.charAt(i);
        }
        int y=Integer.parseInt(s_year);
        int m=Integer.parseInt(s_month);  
        int dy=Integer.parseInt(s_day);
        int leap=0;
        if(y%100==0){
            if(y%400==0){
                leap=1;
            }
        }
        else if(y%4==0){
            leap=1;
        }
        int days=0;
        for(int i=1;i<m;i++){
            if(i==2){
                if(leap==1){
                    days+=29;
                }
                else{
                    days+=28;
                }
            }
            else if(i==1||i==3||i==5||i==7||i==8||i==10||i==12){
                days+=31;
            }
            else{
                days+=30;
            }
        }
        days=days+dy;
        return (days);
    }
}
