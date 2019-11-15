package com.aike.plugin.cource.home;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.aike.plugin.courceplugin.R;
import com.aike.router.Route;

/**
 * 创建时间: 2019/11/14 19:39 <br>
 * 作者: xiekongying001 <br>
 * 描述:
 */
@Route("xky://course/main")
public class CourseHomeActivity extends Activity {
  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_home_layout);
  }
}
