package com.example.suitsponsor.bean;

import com.example.suitsponsor.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hyman for imooc.com.
 */

public class AddressInfoLab {

    public static List<AddressInfo> generateDatas(){
        List<AddressInfo> addressInfos = new ArrayList<>();
        // http://api.map.baidu.com/lbsapi/getpoint/index.html
        addressInfos.add(new AddressInfo(31.279781, 120.735193, R.drawable.dushuhu, "苏州独墅湖校区3D量体仓",
                "距离18公里"));
        addressInfos.add(new AddressInfo(40.084936, 116.323493, R.drawable.a2, "北京龙禧医院",
                "距离897米"));
        addressInfos.add(new AddressInfo(40.082397, 116.338657, R.drawable.a3, "龙腾苑3区",
                "距离249米"));
        addressInfos.add(new AddressInfo(40.070596, 116.324589, R.drawable.a4, "蓝天嘉园",
                "距离679米"));


        return addressInfos;
    }

}
