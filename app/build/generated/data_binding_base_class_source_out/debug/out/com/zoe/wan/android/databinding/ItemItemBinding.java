// Generated by data binding compiler. Do not edit!
package com.zoe.wan.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zoe.wan.android.R;
import com.zoe.wan.android.repository.data.CommonItem;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemItemBinding extends ViewDataBinding {
  @NonNull
  public final CardView itemCard;

  @NonNull
  public final TextView itemKeyName;

  @Bindable
  protected CommonItem mItemData;

  protected ItemItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CardView itemCard, TextView itemKeyName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.itemCard = itemCard;
    this.itemKeyName = itemKeyName;
  }

  public abstract void setItemData(@Nullable CommonItem itemData);

  @Nullable
  public CommonItem getItemData() {
    return mItemData;
  }

  @NonNull
  public static ItemItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemItemBinding>inflateInternal(inflater, R.layout.item_item, root, attachToRoot, component);
  }

  @NonNull
  public static ItemItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemItemBinding>inflateInternal(inflater, R.layout.item_item, null, false, component);
  }

  public static ItemItemBinding bind(@NonNull View view) {
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
  public static ItemItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemItemBinding)bind(component, view, R.layout.item_item);
  }
}
