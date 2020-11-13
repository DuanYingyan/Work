package com.example.shoppingcart.bean;

import com.example.shoppingcart.R;
import java.util.ArrayList;

public class Goods {

    public int image;
    public String name;
    public String desc;

    public Goods(int image, String name, String desc) {
        this.image = image;
        this.name = name;
        this.desc = desc;
    };

    private static int[] iconArray = {
            R.drawable.apple_s, R.drawable.huawei_s, R.drawable.xiaomi_s,
            R.drawable.oppo_s, R.drawable.vivo_s, R.drawable.meizu_s,R.drawable.samsung_s,R.drawable.redmi_s
    };

    private static String[] NameArray = {
            "iPhone12", "Nova8", "小米10", "OPPO Reno4", "vivo s7", "魅族17Pro","三星s20","红米K30"
    };
    // 声明一个手机商品的描述数组
    private static String[] descArray = {
            "Apple iPhone 12 256GB  移动联通电信4G手机",
            "华为 HUAWEI nova8 6GB+128GB 全网通",
            "小米 10至尊纪念 全网通版 6GB+128GB 亮白色",
            "OPPO Reno4 8G+256G 全网通4G智能手机 玫瑰金",
            "vivo s7 4GB+64GB 全网通4G拍照手机 玫瑰金",
            "魅族 17Pro 8GB+256GB 全网通公开版 星空黑 移动联通电信4G手机",
            "三星 Galaxy s20 智能5G拍照手机 意象白",
            "红米 k30 5G 双模手机Pro索尼学生游戏全屏紫玉幻境"


    };

    public static ArrayList<Goods> getDefaultList() {
        ArrayList<Goods> planetList = new ArrayList<Goods>();
        for (int i = 0; i < iconArray.length; i++) {
            planetList.add(new Goods(iconArray[i], NameArray[i], descArray[i]));
        }
        return planetList;
    }
}