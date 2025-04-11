package com.zoe.wan.android.repository.data;

/**
 * 我的收藏：文章列表
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u0013\u0010\u001b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010 \u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJj\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020\t2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020\u0003H\u00d6\u0001J\t\u0010&\u001a\u00020\'H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0013\u0010\u000fR\u0015\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0017\u0010\u000fR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0018\u0010\u000fR\u0015\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0019\u0010\u000f\u00a8\u0006("}, d2 = {"Lcom/zoe/wan/android/repository/data/MyCollectListData;", "", "curPage", "", "datas", "", "Lcom/zoe/wan/android/repository/data/CollectListData;", "offset", "over", "", "pageCount", "size", "total", "(Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getCurPage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDatas", "()Ljava/util/List;", "getOffset", "getOver", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPageCount", "getSize", "getTotal", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/zoe/wan/android/repository/data/MyCollectListData;", "equals", "other", "hashCode", "toString", "", "app_debug"})
public final class MyCollectListData {
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer curPage = null;
    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.zoe.wan.android.repository.data.CollectListData> datas = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer offset = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean over = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer pageCount = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer size = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer total = null;
    
    public MyCollectListData(@org.jetbrains.annotations.Nullable
    java.lang.Integer curPage, @org.jetbrains.annotations.Nullable
    java.util.List<com.zoe.wan.android.repository.data.CollectListData> datas, @org.jetbrains.annotations.Nullable
    java.lang.Integer offset, @org.jetbrains.annotations.Nullable
    java.lang.Boolean over, @org.jetbrains.annotations.Nullable
    java.lang.Integer pageCount, @org.jetbrains.annotations.Nullable
    java.lang.Integer size, @org.jetbrains.annotations.Nullable
    java.lang.Integer total) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getCurPage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.zoe.wan.android.repository.data.CollectListData> getDatas() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getOffset() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getOver() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getPageCount() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getSize() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getTotal() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.zoe.wan.android.repository.data.CollectListData> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.zoe.wan.android.repository.data.MyCollectListData copy(@org.jetbrains.annotations.Nullable
    java.lang.Integer curPage, @org.jetbrains.annotations.Nullable
    java.util.List<com.zoe.wan.android.repository.data.CollectListData> datas, @org.jetbrains.annotations.Nullable
    java.lang.Integer offset, @org.jetbrains.annotations.Nullable
    java.lang.Boolean over, @org.jetbrains.annotations.Nullable
    java.lang.Integer pageCount, @org.jetbrains.annotations.Nullable
    java.lang.Integer size, @org.jetbrains.annotations.Nullable
    java.lang.Integer total) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
}