package fr.tvbarthel.disableservice;

import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.View;

class UnderlinePageIndicator
  implements ViewPager.OnPageChangeListener
{
  UnderlinePageIndicator(MyPagerTabStip paramMyPagerTabStip) {}
  
  public void onPageScrollStateChanged(int paramInt) {}
  
  public void onPageScrolled(int paramInt1, float paramFloat, int paramInt2)
  {
    MyPagerTabStip.a(mViewPager, paramInt1 + paramFloat);
    mViewPager.invalidate();
  }
  
  public void onPageSelected(int paramInt)
  {
    MyPagerTabStip.d(mViewPager, paramInt);
    MyPagerTabStip.access$getUpdateSelection(mViewPager);
    if (MyPagerTabStip.access$getMViewPagerPageChangeListener(mViewPager) != null) {
      MyPagerTabStip.access$getMViewPagerPageChangeListener(mViewPager).onPageSelected(paramInt);
    }
  }
}
