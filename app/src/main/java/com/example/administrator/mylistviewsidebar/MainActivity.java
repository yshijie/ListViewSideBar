package com.example.administrator.mylistviewsidebar;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.example.administrator.mylistviewsidebar.adapter.MyAdapter;
import com.example.administrator.mylistviewsidebar.dal.StudentDaoFactory;
import com.example.administrator.mylistviewsidebar.entity.Student;
import com.example.administrator.mylistviewsidebar.view.ListViewSideBar;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class MainActivity extends AppCompatActivity implements ListViewSideBar.OnIndexerClickListener {

    private List<Student> students ;
    private MyAdapter adapter ;
    private ListView lvShow ;
    private ListViewSideBar sideBar ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        lvShow = (ListView) findViewById(R.id.lv_listview) ;
        students = new ArrayList<Student>() ;
        adapter = new MyAdapter(students, this) ;
        lvShow.setAdapter(adapter) ;

        sideBar = (ListViewSideBar) findViewById(R.id.lvsb_sort_keys) ;
        sideBar.setOnIndexerClickListener(this) ;

        new LoadDataTask().execute() ;

    }

    @Override
    public void onIndexerClick(int position, String str) {
        int moveToPosition = adapter.getPositionForSection(str.charAt(0)) ;
        lvShow.setSelectionFromTop(moveToPosition, 0) ;
    }

    private class LoadDataTask extends AsyncTask<Object, Object, Object> {

        @Override
        protected Object doInBackground(Object... params) {
            //获取数据
            List<Student> data = StudentDaoFactory.newInstance().getStudentList() ;
            // 排序
            Collections.sort(data, new Comparator<Student>() {
                @Override
                public int compare(Student lhs, Student rhs) {
                    return lhs.getSortKey().compareTo(rhs.getSortKey()) ;
                }
            });
            return data ;
        }

        @Override
        protected void onPostExecute(Object result) {
            List<Student> data = (List<Student>) result ;
            students.addAll(data) ;
            adapter.notifyDataSetChanged() ;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
