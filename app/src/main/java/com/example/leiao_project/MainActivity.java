package com.example.leiao_project;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.hjm.bottomtabbar.BottomTabBar;

public class MainActivity extends AppCompatActivity {

    private BottomTabBar bottomTabBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        导航栏
        bottomTabBar=findViewById(R.id.nav_bottom);
        bottomTabBar.init(getSupportFragmentManager())
                .setImgSize(50,50) //图片大小
                .setFontSize(25)//文字大小
                .setTabPadding(2,2,2)//导航之间的距离
                .setChangeColor(Color. 	rgb(255,0,0), Color.rgb(0,0,0))//点击前的颜色和点击后的颜色
                .addTabItem("首页",R.drawable.home_light,R.drawable.home,Home.class)
                .addTabItem("书籍",R.drawable.book_light,R.drawable.book,Book.class)
                .addTabItem("视频",R.drawable.vedio_light,R.drawable.vedio,Vedio.class)
                .addTabItem("我的",R.drawable.my_light,R.drawable.my,My.class)
                .isShowDivider(true);//是否包含分割线
//        导航栏结束

    }
}
