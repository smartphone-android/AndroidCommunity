package com.zoe.wan.android;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zoe.wan.android.databinding.ActivityAboutUsBindingImpl;
import com.zoe.wan.android.databinding.ActivityCollectBindingImpl;
import com.zoe.wan.android.databinding.ActivityLoginBindingImpl;
import com.zoe.wan.android.databinding.ActivitySearchBindingImpl;
import com.zoe.wan.android.databinding.ActivityTabBindingImpl;
import com.zoe.wan.android.databinding.ActivityWebBindingImpl;
import com.zoe.wan.android.databinding.FragmentCommonBindingImpl;
import com.zoe.wan.android.databinding.FragmentHomeBindingImpl;
import com.zoe.wan.android.databinding.FragmentMineBindingImpl;
import com.zoe.wan.android.databinding.ItemHomeBannerBindingImpl;
import com.zoe.wan.android.databinding.ItemHomeListBindingImpl;
import com.zoe.wan.android.databinding.ItemItemBindingImpl;
import com.zoe.wan.android.databinding.ItemMyCollectListBindingImpl;
import com.zoe.wan.android.databinding.ItemSearchBindingImpl;
import com.zoe.wan.android.databinding.TabItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYABOUTUS = 1;

  private static final int LAYOUT_ACTIVITYCOLLECT = 2;

  private static final int LAYOUT_ACTIVITYLOGIN = 3;

  private static final int LAYOUT_ACTIVITYSEARCH = 4;

  private static final int LAYOUT_ACTIVITYTAB = 5;

  private static final int LAYOUT_ACTIVITYWEB = 6;

  private static final int LAYOUT_FRAGMENTCOMMON = 7;

  private static final int LAYOUT_FRAGMENTHOME = 8;

  private static final int LAYOUT_FRAGMENTMINE = 9;

  private static final int LAYOUT_ITEMHOMEBANNER = 10;

  private static final int LAYOUT_ITEMHOMELIST = 11;

  private static final int LAYOUT_ITEMITEM = 12;

  private static final int LAYOUT_ITEMMYCOLLECTLIST = 13;

  private static final int LAYOUT_ITEMSEARCH = 14;

  private static final int LAYOUT_TABITEM = 15;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(15);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.zoe.wan.android.R.layout.activity_about_us, LAYOUT_ACTIVITYABOUTUS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.zoe.wan.android.R.layout.activity_collect, LAYOUT_ACTIVITYCOLLECT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.zoe.wan.android.R.layout.activity_login, LAYOUT_ACTIVITYLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.zoe.wan.android.R.layout.activity_search, LAYOUT_ACTIVITYSEARCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.zoe.wan.android.R.layout.activity_tab, LAYOUT_ACTIVITYTAB);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.zoe.wan.android.R.layout.activity_web, LAYOUT_ACTIVITYWEB);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.zoe.wan.android.R.layout.fragment_common, LAYOUT_FRAGMENTCOMMON);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.zoe.wan.android.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.zoe.wan.android.R.layout.fragment_mine, LAYOUT_FRAGMENTMINE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.zoe.wan.android.R.layout.item_home_banner, LAYOUT_ITEMHOMEBANNER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.zoe.wan.android.R.layout.item_home_list, LAYOUT_ITEMHOMELIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.zoe.wan.android.R.layout.item_item, LAYOUT_ITEMITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.zoe.wan.android.R.layout.item_my_collect_list, LAYOUT_ITEMMYCOLLECTLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.zoe.wan.android.R.layout.item_search, LAYOUT_ITEMSEARCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.zoe.wan.android.R.layout.tab_item, LAYOUT_TABITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYABOUTUS: {
          if ("layout/activity_about_us_0".equals(tag)) {
            return new ActivityAboutUsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_about_us is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYCOLLECT: {
          if ("layout/activity_collect_0".equals(tag)) {
            return new ActivityCollectBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_collect is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLOGIN: {
          if ("layout/activity_login_0".equals(tag)) {
            return new ActivityLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_login is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSEARCH: {
          if ("layout/activity_search_0".equals(tag)) {
            return new ActivitySearchBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_search is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYTAB: {
          if ("layout/activity_tab_0".equals(tag)) {
            return new ActivityTabBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_tab is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYWEB: {
          if ("layout/activity_web_0".equals(tag)) {
            return new ActivityWebBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_web is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCOMMON: {
          if ("layout/fragment_common_0".equals(tag)) {
            return new FragmentCommonBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_common is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMINE: {
          if ("layout/fragment_mine_0".equals(tag)) {
            return new FragmentMineBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_mine is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMHOMEBANNER: {
          if ("layout/item_home_banner_0".equals(tag)) {
            return new ItemHomeBannerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_home_banner is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMHOMELIST: {
          if ("layout/item_home_list_0".equals(tag)) {
            return new ItemHomeListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_home_list is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMITEM: {
          if ("layout/item_item_0".equals(tag)) {
            return new ItemItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_item is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMMYCOLLECTLIST: {
          if ("layout/item_my_collect_list_0".equals(tag)) {
            return new ItemMyCollectListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_my_collect_list is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSEARCH: {
          if ("layout/item_search_0".equals(tag)) {
            return new ItemSearchBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_search is invalid. Received: " + tag);
        }
        case  LAYOUT_TABITEM: {
          if ("layout/tab_item_0".equals(tag)) {
            return new TabItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for tab_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(14);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "aboutVm");
      sKeys.put(2, "banner");
      sKeys.put(3, "fragHomeVm");
      sKeys.put(4, "homeVm");
      sKeys.put(5, "item");
      sKeys.put(6, "itemData");
      sKeys.put(7, "itemListVm");
      sKeys.put(8, "itemSearch");
      sKeys.put(9, "loginVm");
      sKeys.put(10, "mineVm");
      sKeys.put(11, "myCollectVm");
      sKeys.put(12, "searchVm");
      sKeys.put(13, "webVM");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(15);

    static {
      sKeys.put("layout/activity_about_us_0", com.zoe.wan.android.R.layout.activity_about_us);
      sKeys.put("layout/activity_collect_0", com.zoe.wan.android.R.layout.activity_collect);
      sKeys.put("layout/activity_login_0", com.zoe.wan.android.R.layout.activity_login);
      sKeys.put("layout/activity_search_0", com.zoe.wan.android.R.layout.activity_search);
      sKeys.put("layout/activity_tab_0", com.zoe.wan.android.R.layout.activity_tab);
      sKeys.put("layout/activity_web_0", com.zoe.wan.android.R.layout.activity_web);
      sKeys.put("layout/fragment_common_0", com.zoe.wan.android.R.layout.fragment_common);
      sKeys.put("layout/fragment_home_0", com.zoe.wan.android.R.layout.fragment_home);
      sKeys.put("layout/fragment_mine_0", com.zoe.wan.android.R.layout.fragment_mine);
      sKeys.put("layout/item_home_banner_0", com.zoe.wan.android.R.layout.item_home_banner);
      sKeys.put("layout/item_home_list_0", com.zoe.wan.android.R.layout.item_home_list);
      sKeys.put("layout/item_item_0", com.zoe.wan.android.R.layout.item_item);
      sKeys.put("layout/item_my_collect_list_0", com.zoe.wan.android.R.layout.item_my_collect_list);
      sKeys.put("layout/item_search_0", com.zoe.wan.android.R.layout.item_search);
      sKeys.put("layout/tab_item_0", com.zoe.wan.android.R.layout.tab_item);
    }
  }
}
