package com.zoe.wan.android.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J#\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J#\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001b\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ#\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00032\b\b\u0001\u0010\u000f\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J/\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00032\b\b\u0001\u0010\u0012\u001a\u00020\u00052\b\b\u0001\u0010\u0013\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J!\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0001\u0010\u0016\u001a\u00020\u0017H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u0019\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ%\u0010\u001a\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0018\u00010\u00032\b\b\u0003\u0010\u000f\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J9\u0010\u001c\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00032\b\b\u0001\u0010\u0012\u001a\u00020\u00052\b\b\u0001\u0010\u0013\u001a\u00020\u00052\b\b\u0001\u0010\u001d\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ/\u0010\u001f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010 \u0018\u00010\u00032\b\b\u0003\u0010\u000f\u001a\u00020\u00052\b\b\u0001\u0010!\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u001b\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u001b\u0010#\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010$\u0018\u00010\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006%"}, d2 = {"Lcom/zoe/wan/android/repository/ApiService;", "", "cancelCollect", "Lcom/zoe/wan/http/BaseResponse;", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collect", "commonUseWebsite", "Lcom/zoe/wan/android/repository/data/CommonItemListData;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "homeBanner", "Lcom/zoe/wan/android/repository/data/HomeBannerData;", "homeList", "Lcom/zoe/wan/android/repository/data/HomeListData;", "pageCount", "login", "Lcom/zoe/wan/android/repository/data/UserData;", "username", "password", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loginBody", "requestBody", "Lokhttp3/RequestBody;", "(Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logout", "myCollects", "Lcom/zoe/wan/android/repository/data/MyCollectListData;", "register", "repassword", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search", "Lcom/zoe/wan/android/repository/data/SearchResultsData;", "keyWord", "searchHotKey", "topHomeList", "Lcom/zoe/wan/android/repository/data/TopHomeListData;", "app_debug"})
public abstract interface ApiService {
    
    /**
     * 获取首页列表数据
     */
    @retrofit2.http.GET(value = "article/list/{pageCount}/json")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object homeList(@retrofit2.http.Path(value = "pageCount")
    @org.jetbrains.annotations.NotNull
    java.lang.String pageCount, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.zoe.wan.http.BaseResponse<com.zoe.wan.android.repository.data.HomeListData>> $completion);
    
    /**
     * 获取首页置顶列表数据
     */
    @retrofit2.http.GET(value = "article/top/json")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object topHomeList(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.zoe.wan.http.BaseResponse<com.zoe.wan.android.repository.data.TopHomeListData>> $completion);
    
    /**
     * 获取banner数据
     */
    @retrofit2.http.GET(value = "banner/json")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object homeBanner(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.zoe.wan.http.BaseResponse<com.zoe.wan.android.repository.data.HomeBannerData>> $completion);
    
    /**
     * 常用网站
     */
    @retrofit2.http.GET(value = "friend/json")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object commonUseWebsite(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.zoe.wan.http.BaseResponse<com.zoe.wan.android.repository.data.CommonItemListData>> $completion);
    
    /**
     * 搜索热词
     */
    @retrofit2.http.GET(value = "hotkey/json")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object searchHotKey(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.zoe.wan.http.BaseResponse<com.zoe.wan.android.repository.data.CommonItemListData>> $completion);
    
    /**
     * 登录
     */
    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST(value = "user/login")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object login(@retrofit2.http.Field(value = "username")
    @org.jetbrains.annotations.NotNull
    java.lang.String username, @retrofit2.http.Field(value = "password")
    @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.zoe.wan.http.BaseResponse<com.zoe.wan.android.repository.data.UserData>> $completion);
    
    /**
     * 注册
     */
    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST(value = "user/register")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object register(@retrofit2.http.Field(value = "username")
    @org.jetbrains.annotations.NotNull
    java.lang.String username, @retrofit2.http.Field(value = "password")
    @org.jetbrains.annotations.NotNull
    java.lang.String password, @retrofit2.http.Field(value = "repassword")
    @org.jetbrains.annotations.NotNull
    java.lang.String repassword, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.zoe.wan.http.BaseResponse<com.zoe.wan.android.repository.data.UserData>> $completion);
    
    /**
     * 登出
     */
    @retrofit2.http.GET(value = "user/logout/json")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object logout(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.zoe.wan.http.BaseResponse<java.lang.Object>> $completion);
    
    /**
     * 点击收藏（文章列表）
     */
    @retrofit2.http.POST(value = "lg/collect/{id}/json")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object collect(@retrofit2.http.Path(value = "id")
    @org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.zoe.wan.http.BaseResponse<java.lang.Object>> $completion);
    
    /**
     * 取消收藏（文章列表）
     */
    @retrofit2.http.POST(value = "lg/uncollect_originId/{id}/json")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object cancelCollect(@retrofit2.http.Path(value = "id")
    @org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.zoe.wan.http.BaseResponse<java.lang.Object>> $completion);
    
    /**
     * 搜索
     */
    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST(value = "article/query/{pageCount}/json")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object search(@retrofit2.http.Path(value = "pageCount")
    @org.jetbrains.annotations.NotNull
    java.lang.String pageCount, @retrofit2.http.Field(value = "k")
    @org.jetbrains.annotations.NotNull
    java.lang.String keyWord, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.zoe.wan.http.BaseResponse<com.zoe.wan.android.repository.data.SearchResultsData>> $completion);
    
    /**
     * 我的收藏：文章列表
     */
    @retrofit2.http.GET(value = "lg/collect/list/{pageCount}/json")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object myCollects(@retrofit2.http.Path(value = "pageCount")
    @org.jetbrains.annotations.NotNull
    java.lang.String pageCount, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.zoe.wan.http.BaseResponse<com.zoe.wan.android.repository.data.MyCollectListData>> $completion);
    
    /**
     * post body
     */
    @retrofit2.http.POST(value = "")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object loginBody(@retrofit2.http.Body
    @org.jetbrains.annotations.NotNull
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.zoe.wan.http.BaseResponse<java.lang.Object>> $completion);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}