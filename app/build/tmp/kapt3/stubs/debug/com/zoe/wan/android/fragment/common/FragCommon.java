package com.zoe.wan.android.fragment.common;

/**
 * 搜索热点、常用网站
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/zoe/wan/android/fragment/common/FragCommon;", "Lcom/zoe/wan/base/BaseFragment;", "Lcom/zoe/wan/android/databinding/FragmentCommonBinding;", "Lcom/zoe/wan/android/fragment/common/CommonListViewModel;", "()V", "hotKeyListAdapter", "Lcom/zoe/wan/android/adapter/CommonItemListAdapter;", "websiteListAdapter", "getLayoutId", "", "getViewModelId", "initListView", "", "initViewData", "app_debug"})
public final class FragCommon extends com.zoe.wan.base.BaseFragment<com.zoe.wan.android.databinding.FragmentCommonBinding, com.zoe.wan.android.fragment.common.CommonListViewModel> {
    @org.jetbrains.annotations.NotNull
    private com.zoe.wan.android.adapter.CommonItemListAdapter websiteListAdapter;
    @org.jetbrains.annotations.NotNull
    private com.zoe.wan.android.adapter.CommonItemListAdapter hotKeyListAdapter;
    
    public FragCommon() {
        super();
    }
    
    @java.lang.Override
    public int getLayoutId() {
        return 0;
    }
    
    @java.lang.Override
    public int getViewModelId() {
        return 0;
    }
    
    @java.lang.Override
    public void initViewData() {
    }
    
    private final void initListView() {
    }
}