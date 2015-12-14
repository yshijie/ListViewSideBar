package com.example.administrator.mylistviewsidebar.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import com.example.administrator.mylistviewsidebar.R;

public class ListViewSideBar extends View{

    /**
     * 右侧导航栏显示的字母的数组
     */
    private String[] mIndexers ;
    /**
     * 声明画笔
     */
    private Paint mTextPaint ;
    /**
     * 文字的颜色的字符串
     */
    private String mTextColorString ;
    /**
     * 文字的尺寸
     */
    private float mTextSize ;
    /**
     * 文字的高度，根据现有高度与需要显示的文字的数量计算得到
     */
    private float mTextHeight ;
    /**
     * 文字的尺寸相关数据封装对象，用于计算绘制文字时垂直方向的偏移量
     */
    private Paint.FontMetrics mFontMetrics ;
    /**
     * 控件的宽度
     */
    private int mViewWidth ;
    /**
     * 控件的高度
     */
    private int mViewHeight ;
    /**
     * 当某个Indexer被点击时的监听器对象
     */
    private OnIndexerClickListener mOnIndexerClickListener ;

    /**
     * 构造方法，将在JAVA程序中创建对象时被调用
     * @param context
     */
    public ListViewSideBar(Context context) {
        this(context, null);
    }

    /**
     * 构造方法，将在使用res\layout设计布局时被调用
     * @param context
     * @param attrs
     */
    public ListViewSideBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        // 初始化
        init() ;
    }

    /**
     * 构造方法，将在使用res\layout设计布局时被调用
     * @param context
     * @param attrs
     * @param defStyleAttr
     */
    public ListViewSideBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    /**
     * 初始化
     */
    private void init() {
        // 加载需要被显示的文字
        mIndexers = getResources().getStringArray(R.array.sort_key_array) ;
        // 初始化文字大小
        mTextSize = 16f ;
        // 初始化文字颜色
        mTextColorString = "#666666" ;

        // 初始化画笔
        mTextPaint = new Paint() ;
        mTextPaint.setAntiAlias(true) ;
        mTextPaint.setTextAlign(Paint.Align.CENTER) ;
        mTextPaint.setTextSize(mTextSize) ;
        mTextPaint.setColor(Color.parseColor(mTextColorString)) ;

        // 根据画笔，得到文字尺寸相关的数据
        mFontMetrics = mTextPaint.getFontMetrics() ;
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        // 获取当前控件的尺寸
        mViewWidth = getMeasuredWidth() ;
        mViewHeight = getMeasuredHeight() ;
        // 计算每个文字占据的高度
        mTextHeight = mViewHeight / mIndexers.length ;

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // 绘制文字时水平方向的偏移量，由于画笔已经设置水平居中，则该偏移量为控件宽度的一半
        float x = mViewWidth / 2 ;
        // 绘制文字垂直方向的偏移量
        float y ;
        for (int i = 0; i < mIndexers.length; i++) {
            // 计算当前绘制的文字在垂直方向的偏移量，注：以下代码并没有实现文字在可用空间内垂直居中
            y = i * mTextHeight + mFontMetrics.ascent * -1 ;
            // 执行绘制
            canvas.drawText(mIndexers[i], x, y, mTextPaint) ;

        }

    }

    /**
     * 设置当某个Indexer被点击时的监听器对象
     *
     * @param listener
     *            监听器对象
     */
    public void setOnIndexerClickListener(OnIndexerClickListener listener) {
        this.mOnIndexerClickListener = listener ;
    }

    /**
     * 当点击某个字母时的监听器
     */
    public static interface OnIndexerClickListener {
        /**
         *
         * 当字母导航中的文字被按下时，该方法被自动回调
         *
         * @param position 被按下的文字在列表中的索引
         * @param str 被按下的文字
         */
        void onIndexerClick(int position, String str) ;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        // 判断触屏操作的类型是否是按下
        if(event.getAction() == MotionEvent.ACTION_DOWN) {
            // 获取当前按下的位置
            float y = event.getY() ;
            // 计算当前按下时对应的文字的下标
            int index = (int) (y / mTextHeight) ;
            // 获取当前按下时的文字
            String str = mIndexers[index] ;
            // 回调监听器方法
            if(mOnIndexerClickListener != null) {
                mOnIndexerClickListener.onIndexerClick(index, str) ;
                return true ;
            }
        }
        return super.onTouchEvent(event);
    }
}
