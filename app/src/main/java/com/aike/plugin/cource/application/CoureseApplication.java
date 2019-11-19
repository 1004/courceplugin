package com.aike.plugin.cource.application;

import android.app.Application;
import com.aike.eventbus.utils.EventBusUtil;
import com.aike.plugin.cource.utils.CourseEventBusUtils;

/**
 * 创建时间: 2019/11/14 19:39 <br>
 * 作者: xiekongying001 <br>
 * 描述:
 */
public class CoureseApplication extends Application {
  @Override
  public void onCreate() {
    super.onCreate();
    init();
  }

  private void init() {
    CourseEventBusUtils.init();
  }
}
