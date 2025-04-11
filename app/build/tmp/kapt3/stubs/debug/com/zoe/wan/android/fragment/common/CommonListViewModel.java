package com.zoe.wan.android.fragment.common;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002R(\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR(\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\f\u00a8\u0006\u0013"}, d2 = {"Lcom/zoe/wan/android/fragment/common/CommonListViewModel;", "Lcom/zoe/wan/base/BaseViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "commonUseWebsiteList", "Lcom/zoe/wan/base/SingleLiveEvent;", "", "Lcom/zoe/wan/android/repository/data/CommonItem;", "getCommonUseWebsiteList", "()Lcom/zoe/wan/base/SingleLiveEvent;", "setCommonUseWebsiteList", "(Lcom/zoe/wan/base/SingleLiveEvent;)V", "hotKeyList", "getHotKeyList", "setHotKeyList", "commonWebSiteList", "", "searchHotKeyList", "app_debug"})
public final class CommonListViewModel extends com.zoe.wan.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull
    private com.zoe.wan.base.SingleLiveEvent<java.util.List<com.zoe.wan.android.repository.data.CommonItem>> hotKeyList;
    @org.jetbrains.annotations.NotNull
    private com.zoe.wan.base.SingleLiveEvent<java.util.List<com.zoe.wan.android.repository.data.CommonItem>> commonUseWebsiteList;
    
    public CommonListViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.zoe.wan.base.SingleLiveEvent<java.util.List<com.zoe.wan.android.repository.data.CommonItem>> getHotKeyList() {
        return null;
    }
    
    public final void setHotKeyList(@org.jetbrains.annotations.NotNull
    com.zoe.wan.base.SingleLiveEvent<java.util.List<com.zoe.wan.android.repository.data.CommonItem>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.zoe.wan.base.SingleLiveEvent<java.util.List<com.zoe.wan.android.repository.data.CommonItem>> getCommonUseWebsiteList() {
        return null;
    }
    
    public final void setCommonUseWebsiteList(@org.jetbrains.annotations.NotNull
    com.zoe.wan.base.SingleLiveEvent<java.util.List<com.zoe.wan.android.repository.data.CommonItem>> p0) {
    }
    
    private final void commonWebSiteList() {
    }
    
    private final void searchHotKeyList() {
    }
}