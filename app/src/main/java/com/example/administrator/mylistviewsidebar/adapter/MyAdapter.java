package com.example.administrator.mylistviewsidebar.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.SectionIndexer;
import android.widget.TextView;

import com.example.administrator.mylistviewsidebar.R;
import com.example.administrator.mylistviewsidebar.entity.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Created by Administrator on 2015/12/9 0009.
 */
public class MyAdapter extends BaseAdapter implements SectionIndexer {

    private List<Student> students ;
    private Context context ;

    public MyAdapter(List<Student> students, Context context) {
        this.context = context;
        setData(students) ;
    }

    private void setData(List<Student> students) {
        if(students == null) {
            students = new ArrayList<Student>() ;
        }
        this.students = students ;
    }

    @Override
    public int getCount() {
        return students.size() ;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder ;
        if(convertView == null) {
            holder = new ViewHolder() ;
            convertView = LayoutInflater.from(context).inflate(R.layout.listview_item, null) ;

            holder.tvName = (TextView) convertView.findViewById(R.id.tv_item_name) ;
            holder.tvSortKey = (TextView) convertView.findViewById(R.id.tv_item_sortKey) ;

            convertView.setTag(holder) ;
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Student student = students.get(position) ;

        holder.tvName.setText(student.getName()) ;
        holder.tvSortKey.setText(getFirstChar(student.getSortKey())) ;

        // 使用SectionIndex的解决方案：判断是否显示首字母
        // 1. 获取当前Student的sortKey的首字母
        int section = getSectionForPosition(position) ;
        // 2. 获取当前首字母应该出现的位置
        int sectionPos = getPositionForSection(section) ;
        // 3. 判断当前getView()时的position，是否与当前section应该出现的位置相符
        if(position == sectionPos) {
            holder.tvSortKey.setVisibility(View.VISIBLE) ;
        } else {
            holder.tvSortKey.setVisibility(View.GONE) ;
        }

        return convertView ;
    }

    private class ViewHolder {

        private TextView tvName ;
        private TextView tvSortKey ;

    }

    /**
     * 获取当前位置的首字母
     * @param sortKey
     * @return
     * 		当前位置的首字母
     */
    private CharSequence getFirstChar(String sortKey) {
        return sortKey.substring(0, 1).toUpperCase(Locale.CHINA) ;
    }

    @Override
    public int getPositionForSection(int section) {
        // 为首字母获取位置，即：根据首字母确定该首字母在数据集中的位置
        int position = 0 ;
        for(int i = 0; i < students.size(); i++) {
            // 根据当前循环到的i，获取对应的首字母
            int currentChar = getSectionForPosition(i) ;
            // 判断当次循环到的首字母是否与参数相等，如果相等，则可以确定参数对应的字母应该出现的位置
            if(currentChar == section) {
                position = i ;
                break ;
            }
        }
        return position ;
    }

    @Override
    public int getSectionForPosition(int position) {
        // 获取当前位置的首字母
        return students.get(position).getSortKey().toUpperCase(Locale.CHINA).charAt(0) ;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public Object[] getSections() {
        return new Object[0];
    }

}
