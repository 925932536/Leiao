package com.example.leiao_project;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;
import com.youth.banner.listener.OnBannerListener;

import java.util.ArrayList;

public class Home extends Fragment implements OnBannerListener {

    private Banner banner;
    private ArrayList<String> list_path;
    private  ArrayList<String> list_title;
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_page, container, false);

//        获取组件
        banner=view.findViewById(R.id.home_banner);
        list_path=new ArrayList<>();//放图片集合
        list_title=new ArrayList<>();//发标题集合
        list_path.add("http://222.85.156.101/data/userfiles/images/21221.jpg");
        list_path.add("http://222.85.156.101/data/userfiles/images/21221.jpg");
        list_path.add("http://222.85.156.101/data/userfiles/images/21221.jpg");
        list_title.add("学习学习");
        list_title.add("学习学习");
        //内置样式 共有6种
        banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR);
        //设置图片加载器，图片加载器在下方
        banner.setImageLoader(new GlideImageLoader());
        //图片网址或地址的集合
        banner.setImages(list_path);
        //图片title的集合
        banner.setBannerTitles(list_title);
        //轮播图动画效果
        banner.setBannerAnimation(Transformer.Default);
        //设置轮播时间
        banner.setDelayTime(3000);
        //是否自动轮播，默认为是
        banner.isAutoPlay(true);
        //设置轮播图小点点的位置
        banner.setIndicatorGravity(BannerConfig.CENTER)
                //以内容可以写成链式
                //轮播图的监听，比较重要
                .setOnBannerListener(this)
                .start();
        return view;
    }

    @Override
    public void OnBannerClick(int position) {

    }
}
