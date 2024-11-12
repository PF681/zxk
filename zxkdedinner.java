package mhy;

import java.util.Random;

public class zxkdedinner {
    public static void main(String[] args) {
        Random r= new Random();

        //生成四个随机数1-4分别代表4个食堂
        //先用switch循环选食堂
        //再生成0-9十个随机数代表窗口
        //再用switch搞出来一堆窗口
        int st=r.nextInt(4)+1;
        int ck=r.nextInt(10);
        switch (st) {
            case 1:
                System.out.println("北一楼");
                break;
            case 2:
                System.out.println("北二楼");
                break;
            case 3:
                System.out.println("南一楼");
                break;
            case 4:
                System.out.println("南二楼");
                break;
            default:
                System.out.println("未知食堂");
                }
                if (st==1)
            {
                switch (ck){
                    case 0:
                        System.out.println("台湾卤肉饭");
                        break;
                    case 1:
                        System.out.println("热干面烩面");
                        break;
                    case 2:
                        System.out.println("炒米，火锅鱼粉香葱大饼");
                        break;
                    case 3:
                        System.out.println("重庆金牌木桶饭");
                        break;
                    case 4:
                        System.out.println("桂林米粉牛肉面");
                        break;
                    case 5:
                        System.out.println("炒米");
                        break;
                    case 6:
                        System.out.println("川湘木桶饭");
                        break;
                    case 7:
                        System.out.println("下饭冒菜(麻辣烫)");
                        break;
                    case 8:
                        System.out.println("卷饼");
                        break;
                    case 9:
                        System.out.println("自助餐改木桶饭");
                        break;
                    default:
                        System.out.println("程序错误");
                }
            }
        if (st==2)
        {
            switch (ck){
                case 0:
                    System.out.println("豫见麻辣香锅");
                    break;
                case 1:
                    System.out.println("鸡公煲");
                    break;
                case 2:
                    System.out.println("烩面");
                    break;
                case 3:
                    System.out.println("江南香扒饭");
                    break;
                case 4:
                    System.out.println("掘酱面");
                    break;
                case 5:
                    System.out.println("土豆泥扮饭");
                    break;
                case 6:
                    System.out.println("款爷渔粉");
                    break;
                case 7:
                    System.out.println("素位老碗面");
                    break;
                case 8:
                    System.out.println("黄焖鸡米饭");
                    break;
                case 9:
                    System.out.println("川湘木桶饭");
                    break;
                default:
                    System.out.println("程序错误");
            }
        }
        if (st==3)
        {
            switch (ck){
                case 0:
                    System.out.println("螺蛳粉");
                    break;
                case 1:
                    System.out.println("黄焖鸡米饭");
                    break;
                case 2:
                    System.out.println("蛋炒饭");
                    break;
                case 3:
                    System.out.println("胖莎米饭");
                    break;
                case 4:
                    System.out.println("天下好面");
                    break;
                case 5:
                    System.out.println("大碗面");
                    break;
                case 6:
                    System.out.println("百湘木桶饭");
                    break;
                case 7:
                    System.out.println("麻辣烫");
                    break;
                case 8:
                    System.out.println("羊杂面");
                    break;
                case 9:
                    System.out.println("掉渣饼");
                    break;
                default:
                    System.out.println("程序错误");
            }
        }
        if (st==4)
        {
            switch (ck){
                case 0:
                    System.out.println("麻辣香锅");
                    break;
                case 1:
                    System.out.println("feng味");
                    break;
                case 2:
                    System.out.println("王记砂锅");
                    break;
                case 3:
                    System.out.println("宋记木桶饭");
                    break;
                case 4:
                    System.out.println("自选饺子");
                    break;
                case 5:
                    System.out.println("土豆泥拌饭");
                    break;
                case 6:
                    System.out.println("金牌面馆");
                    break;
                case 7:
                    System.out.println("兰州拉面");
                    break;
                case 8:
                    System.out.println("花甲壹号");
                    break;
                case 9:
                    System.out.println("麻辣烫/拌");
                    break;
                default:
                    System.out.println("程序错误");
            }
        }
    }
}
