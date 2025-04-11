package com.zoe.wan.android.activity.collect;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J1\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0011\u00a2\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\f0\u0010J\b\u0010\u0015\u001a\u00020\fH\u0002R\u001f\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0016"}, d2 = {"Lcom/zoe/wan/android/activity/collect/MyCollectViewModel;", "Lcom/zoe/wan/base/BaseViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "collectList", "Lcom/zoe/wan/base/SingleLiveEvent;", "", "Lcom/zoe/wan/android/repository/data/CollectListData;", "getCollectList", "()Lcom/zoe/wan/base/SingleLiveEvent;", "cancelCollect", "", "id", "", "callback", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "state", "myCollects", "app_debug"})
public final class MyCollectViewModel extends com.zoe.wan.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.zoe.wan.base.SingleLiveEvent<java.util.List<com.zoe.wan.android.repository.data.CollectListData>> collectList = null;
    
    public MyCollectViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.zoe.wan.base.SingleLiveEvent<java.util.List<com.zoe.wan.android.repository.data.CollectListData>> getCollectList() {
        return null;
    }
    
    private final void myCollects() {
    }
    
    public final void cancelCollect(@org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> callback) {
    }
}