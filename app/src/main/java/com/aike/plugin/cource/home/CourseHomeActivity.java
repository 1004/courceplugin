package com.aike.plugin.cource.home;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import com.aike.plugin.event.cource.CoureseMainEvent;
import com.aike.plugin.cource.utils.CourseEventBusUtils;
import com.aike.plugin.courceplugin.R;
import com.aike.plugin.event.user.UserHomeEvent;
import com.aike.router.Route;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

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
    CourseEventBusUtils.register(this);
    findViewById(R.id.btn0).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        CourseEventBusUtils.post(new UserHomeEvent());
      }
    });
  }

  @Subscribe(threadMode = ThreadMode.MAIN)
  public void mainEvent(CoureseMainEvent mainEvent) {
    Log.i("CourseHomeActivity","课程插件收到消息");
  }

  @Override
  protected void onDestroy() {
    super.onDestroy();
    CourseEventBusUtils.unregister(this);
  }
}
