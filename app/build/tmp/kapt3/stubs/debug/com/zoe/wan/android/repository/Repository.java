package com.zoe.wan.android.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0013\u0010\f\u001a\u0004\u0018\u00010\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ#\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u0011\u0010\u001d\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u001d\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010\u0015\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ+\u0010 \u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010!\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J9\u0010#\u001a\u0004\u0018\u0001H$\"\u0004\b\u0000\u0010$2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u0002H$\u0018\u00010&2\u0012\b\u0002\u0010\'\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010)\u0018\u00010(H\u0002\u00a2\u0006\u0002\u0010*J,\u0010+\u001a\u00020\u00072\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010&2\u0012\b\u0002\u0010\'\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010)\u0018\u00010(H\u0002J%\u0010,\u001a\u0004\u0018\u00010-2\b\b\u0002\u0010\u0015\u001a\u00020\t2\u0006\u0010.\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u0013\u0010/\u001a\u0004\u0018\u00010\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00060"}, d2 = {"Lcom/zoe/wan/android/repository/Repository;", "", "()V", "Need_login_Code", "", "Success_Code", "cancelCollect", "", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collect", "commonUseWebsite", "Lcom/zoe/wan/android/repository/data/CommonItemListData;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDefaultApi", "Lcom/zoe/wan/android/repository/ApiService;", "getHomeBanner", "Lcom/zoe/wan/android/repository/data/HomeBannerData;", "getHomeList", "Lcom/zoe/wan/android/repository/data/HomeListData;", "pageCount", "getTopHomeList", "Lcom/zoe/wan/android/repository/data/TopHomeListData;", "login", "Lcom/zoe/wan/android/repository/data/UserData;", "username", "password", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logout", "myCollects", "Lcom/zoe/wan/android/repository/data/MyCollectListData;", "register", "passwordTwice", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "responseCall", "T", "response", "Lcom/zoe/wan/http/BaseResponse;", "needLogin", "Lkotlin/Function0;", "", "(Lcom/zoe/wan/http/BaseResponse;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "responseNoDataCall", "search", "Lcom/zoe/wan/android/repository/data/SearchResultsData;", "keyWord", "searchHotKeyList", "app_debug"})
public final class Repository {
    private static final int Success_Code = 0;
    private static final int Need_login_Code = -1001;
    @org.jetbrains.annotations.NotNull
    public static final com.zoe.wan.android.repository.Repository INSTANCE = null;
    
    private Repository() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getHomeList(@org.jetbrains.annotations.NotNull
    java.lang.String pageCount, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.zoe.wan.android.repository.data.HomeListData> $completion) {
        return null;
    }
    
    /**
     * 获取首页置顶列表数据
     */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getTopHomeList(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.zoe.wan.android.repository.data.TopHomeListData> $completion) {
        return null;
    }
    
    /**
     * 首页banner
     */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getHomeBanner(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.zoe.wan.android.repository.data.HomeBannerData> $completion) {
        return null;
    }
    
    /**
     * 常用网站
     */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object commonUseWebsite(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.zoe.wan.android.repository.data.CommonItemListData> $completion) {
        return null;
    }
    
    /**
     * 搜索热词
     */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object searchHotKeyList(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.zoe.wan.android.repository.data.CommonItemListData> $completion) {
        return null;
    }
    
    /**
     * 登录
     */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object login(@org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.zoe.wan.android.repository.data.UserData> $completion) {
        return null;
    }
    
    /**
     * 注册
     */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object register(@org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    java.lang.String passwordTwice, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.zoe.wan.android.repository.data.UserData> $completion) {
        return null;
    }
    
    /**
     * 登出
     */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object logout(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    /**
     * 点击收藏（文章列表）
     */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object collect(@org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    /**
     * 取消收藏（文章列表）
     */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object cancelCollect(@org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    /**
     * 搜索
     */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object search(@org.jetbrains.annotations.NotNull
    java.lang.String pageCount, @org.jetbrains.annotations.NotNull
    java.lang.String keyWord, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.zoe.wan.android.repository.data.SearchResultsData> $completion) {
        return null;
    }
    
    /**
     * 我的收藏：文章列表
     */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object myCollects(@org.jetbrains.annotations.NotNull
    java.lang.String pageCount, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.zoe.wan.android.repository.data.MyCollectListData> $completion) {
        return null;
    }
    
    /**
     * 返回值处理(无data返回情况)
     */
    private final boolean responseNoDataCall(com.zoe.wan.http.BaseResponse<java.lang.Object> response, kotlin.jvm.functions.Function0<kotlin.Unit> needLogin) {
        return false;
    }
    
    /**
     * 返回值处理
     */
    private final <T extends java.lang.Object>T responseCall(com.zoe.wan.http.BaseResponse<T> response, kotlin.jvm.functions.Function0<kotlin.Unit> needLogin) {
        return null;
    }
    
    private final com.zoe.wan.android.repository.ApiService getDefaultApi() {
        return null;
    }
}