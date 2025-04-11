package com.zoe.wan.android.fragment.home;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J1\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0017\u00a2\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00120\u0016J1\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0017\u00a2\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00120\u0016J\b\u0010\b\u001a\u00020\u0012H\u0002J\u001a\u0010\u001c\u001a\u00020\u00122\u0010\u0010\u001d\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\rH\u0002J&\u0010\u001e\u001a\u00020\u00122\u001c\u0010\u0015\u001a\u0018\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\r\u0012\u0004\u0012\u00020\u00120\u0016H\u0002R\"\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR*\u0010\f\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\r0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\t\"\u0004\b\u0010\u0010\u000b\u00a8\u0006\u001f"}, d2 = {"Lcom/zoe/wan/android/fragment/home/HomeViewModel;", "Lcom/zoe/wan/base/BaseViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "bannerData", "Lcom/zoe/wan/base/SingleLiveEvent;", "Lcom/zoe/wan/android/repository/data/HomeBannerData;", "getBannerData", "()Lcom/zoe/wan/base/SingleLiveEvent;", "setBannerData", "(Lcom/zoe/wan/base/SingleLiveEvent;)V", "homeListData", "", "Lcom/zoe/wan/android/repository/data/HomeListItemData;", "getHomeListData", "setHomeListData", "cancelCollect", "", "id", "", "callback", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "state", "collect", "getHomeList", "topList", "getTopList", "app_debug"})
public final class HomeViewModel extends com.zoe.wan.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull
    private com.zoe.wan.base.SingleLiveEvent<java.util.List<com.zoe.wan.android.repository.data.HomeListItemData>> homeListData;
    @org.jetbrains.annotations.NotNull
    private com.zoe.wan.base.SingleLiveEvent<com.zoe.wan.android.repository.data.HomeBannerData> bannerData;
    
    public HomeViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.zoe.wan.base.SingleLiveEvent<java.util.List<com.zoe.wan.android.repository.data.HomeListItemData>> getHomeListData() {
        return null;
    }
    
    public final void setHomeListData(@org.jetbrains.annotations.NotNull
    com.zoe.wan.base.SingleLiveEvent<java.util.List<com.zoe.wan.android.repository.data.HomeListItemData>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.zoe.wan.base.SingleLiveEvent<com.zoe.wan.android.repository.data.HomeBannerData> getBannerData() {
        return null;
    }
    
    public final void setBannerData(@org.jetbrains.annotations.NotNull
    com.zoe.wan.base.SingleLiveEvent<com.zoe.wan.android.repository.data.HomeBannerData> p0) {
    }
    
    /**
     * 先获取置顶文章列表，获取成功后获取文章列表
     */
    private final void getTopList(kotlin.jvm.functions.Function1<? super java.util.List<com.zoe.wan.android.repository.data.HomeListItemData>, kotlin.Unit> callback) {
    }
    
    private final void getHomeList(java.util.List<com.zoe.wan.android.repository.data.HomeListItemData> topList) {
    }
    
    private final void getBannerData() {
    }
    
    public final void collect(@org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> callback) {
    }
    
    public final void cancelCollect(@org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> callback) {
    }
}