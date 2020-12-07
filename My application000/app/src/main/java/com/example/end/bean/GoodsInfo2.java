package com.example.end.bean;

import com.example.end.R;

import java.util.ArrayList;

public class GoodsInfo2 {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo2() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "iPhone12", "Nova8", "小米10", "OPPO Reno4", "vivo s7", "魅族17Pro","三星s20","红米K30"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "Apple iPhone 12 256GB  移动联通电信4G手机",
            "华为 HUAWEI nova8 6GB+128GB 全网通",
            "小米 10至尊纪念 全网通版 6GB+128GB 亮白色",
            "OPPO Reno4 8G+256G 全网通4G智能手机 玫瑰金",
            "vivo s7 4GB+64GB 全网通4G拍照手机 玫瑰金",
            "魅族 17Pro 8GB+256GB 全网通公开版 星空黑 移动联通电信4G手机",
            "三星 Galaxy s20 智能5G拍照手机 意象白",
            "红米 k30 5G 双模手机Pro索尼学生游戏全屏紫玉幻境"


    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {6888, 3999, 2999, 2899, 2698, 3799,5499,1499};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.apple_s, R.drawable.huawei_s, R.drawable.xiaomi_s,
            R.drawable.oppo_s, R.drawable.vivo_s, R.drawable.meizu_s,R.drawable.samsung_s,R.drawable.redmi_s
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.apple, R.drawable.huawei, R.drawable.xiaomi,
            R.drawable.oppo, R.drawable.vivo, R.drawable.meizu,R.drawable.samsung,R.drawable.redmi
    };


    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo2> getDefaultList() {
        ArrayList<GoodsInfo2> goodsList = new ArrayList<GoodsInfo2>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo2 info = new GoodsInfo2();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}//These codes are from Peter Pang.