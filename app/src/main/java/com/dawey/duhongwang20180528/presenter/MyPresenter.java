package com.dawey.duhongwang20180528.presenter;

import com.dawey.duhongwang20180528.base.BasePresenter;
import com.dawey.duhongwang20180528.model.MusicData;
import com.dawey.duhongwang20180528.view.MyView;

/**
 * Presenter层,继承自定义的泛型Presenter层（持有view层接口），进行view层与model数据的交互
 */
public class MyPresenter extends BasePresenter<MyView> {
    //声明model层
    private MusicData myModel;

    public MyPresenter() {
        this.myModel = new MusicData();
    }


    //取消绑定，防止内存泄露
    @Override
    public void detach(){
        view = null;
    }
}
