package com.yc.model.Iterator;

import java.util.ArrayList;

/**
 * @author cfun
 * @description 项目迭代器
 * @date 2019-11-05
 */
public class ProjectIterator implements IProjectIterator {
    //所有的项目都存到rrayList
    private ArrayList<IProject> projectList = new ArrayList<IProject>();
    private int currentItem = 0;

    //构造函数传入projectList
    public ProjectIterator(ArrayList<IProject> projectList) {
        this.projectList = projectList;
    }

    @Override
    public boolean hasNext() {
        boolean b = true;
        if (this.currentItem >= projectList.size()) {
            b = false;
        }
        return b;
    }

    //取得下一个值
    @Override
    public Object next() {
        return (IProject) this.projectList.get(this.currentItem++);

    }

    //删除一个对象
    public void remove() {
    }
}
