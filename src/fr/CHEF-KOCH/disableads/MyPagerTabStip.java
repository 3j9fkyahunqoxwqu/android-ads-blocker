package fr.tvbarthel.disableservice;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;

public class MyPagerTabStip
  extends ViewGroup
{
  private int a = 12;
  private int c = 1;
  private int f;
  private final int h;
  private int j = 2;
  private float k;
  private int l = 4;
  private final int m;
  private ViewPager mViewPager;
  private ViewPager.OnPageChangeListener mViewPagerPageChangeListener;
  private final int n;
  private Paint o;
  private ViewPager.OnPageChangeListener onPageChangeListener = new UnderlinePageIndicator(this);
  private int size = 10;
  private int t;
  private final int timer = 452984831;
  private int u;
  private Paint w;
  
  public MyPagerTabStip(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public MyPagerTabStip(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public MyPagerTabStip(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setWillNotDraw(false);
    paramContext = paramContext.getResources();
    paramInt = paramContext.getColor(2131165188);
    n = paramInt;
    m = paramInt;
    h = -1;
    t = ((int)paramContext.getDimension(2131230739));
    o = new Paint();
    o.setColor(n);
    float f1 = getDisplayMetricsdensity;
    j = ((int)(j * f1));
    c = ((int)(c * f1));
    a = ((int)(a * f1));
    l = ((int)(l * f1));
    size = ((int)(f1 * size));
    w = new Paint();
    w.setStrokeWidth(c);
    w.setColor(452984831);
  }
  
  private void a()
  {
    PagerAdapter localPagerAdapter = mViewPager.getAdapter();
    f = localPagerAdapter.getCount();
    Context localContext = getContext();
    int i = 0;
    if (i >= f) {
      return;
    }
    TextView localTextView = new TextView(localContext);
    localTextView.setText(localPagerAdapter.getPageTitle(i));
    localTextView.setGravity(17);
    localTextView.setSingleLine();
    localTextView.setTextSize(0, t);
    localTextView.setBackgroundResource(2130837591);
    localTextView.setOnClickListener(new g(this, i));
    if (u == i) {}
    for (int i1 = m;; i1 = h)
    {
      localTextView.setTextColor(i1);
      addView(localTextView, new ViewGroup.LayoutParams(-2, -1));
      i += 1;
      break;
    }
  }
  
  private void onDraw()
  {
    PagerAdapter localPagerAdapter = mViewPager.getAdapter();
    int i = 0;
    if (i >= f) {
      return;
    }
    TextView localTextView = (TextView)getChildAt(i);
    localTextView.setText(localPagerAdapter.getPageTitle(i));
    if (i == u) {
      localTextView.setTextColor(m);
    }
    for (;;)
    {
      i += 1;
      break;
      localTextView.setTextColor(h);
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int i1 = getWidth() / f;
    int i2 = getHeight();
    o.setColor(n);
    float f1 = k;
    float f2 = i1;
    float f3 = i2 - l;
    float f4 = k;
    paramCanvas.drawRect(f2 * f1, f3, i1 * (1.0F + f4), i2, o);
    int i = 0;
    for (;;)
    {
      if (i >= f - 1)
      {
        o.setColor(452984831);
        paramCanvas.drawRect(0.0F, i2 - j, getWidth(), i2, o);
        return;
      }
      paramCanvas.drawLine((i + 1) * i1, a, (i + 1) * i1, i2 - a, w);
      i += 1;
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = getChildCount();
    paramInt1 = 0;
    for (;;)
    {
      if (paramInt1 >= i) {
        return;
      }
      View localView = getChildAt(paramInt1);
      int i1 = paramInt3 / i;
      localView.layout(i1 * paramInt1, paramInt2, i1 * (paramInt1 + 1), paramInt4);
      paramInt1 += 1;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    measureChildren(paramInt1, paramInt2);
    setMeasuredDimension(View.MeasureSpec.getSize(paramInt1), View.MeasureSpec.getSize(paramInt2));
  }
  
  public void setViewPager(ViewPager paramViewPager)
  {
    mViewPager = paramViewPager;
    u = mViewPager.getCurrentItem();
    mViewPager.setOnPageChangeListener(onPageChangeListener);
    mViewPager.setPageMargin(size);
    a();
  }
}
