// Generated by data binding compiler. Do not edit!
package com.zoe.wan.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.zoe.wan.android.R;
import com.zoe.wan.android.activity.collect.MyCollectViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityCollectBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatImageView collectBack;

  @NonNull
  public final RecyclerView collectListView;

  @Bindable
  protected MyCollectViewModel mMyCollectVm;

  protected ActivityCollectBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatImageView collectBack, RecyclerView collectListView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.collectBack = collectBack;
    this.collectListView = collectListView;
  }

  public abstract void setMyCollectVm(@Nullable MyCollectViewModel myCollectVm);

  @Nullable
  public MyCollectViewModel getMyCollectVm() {
    return mMyCollectVm;
  }

  @NonNull
  public static ActivityCollectBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_collect, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityCollectBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityCollectBinding>inflateInternal(inflater, R.layout.activity_collect, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityCollectBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_collect, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityCollectBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityCollectBinding>inflateInternal(inflater, R.layout.activity_collect, null, false, component);
  }

  public static ActivityCollectBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityCollectBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityCollectBinding)bind(component, view, R.layout.activity_collect);
  }
}
