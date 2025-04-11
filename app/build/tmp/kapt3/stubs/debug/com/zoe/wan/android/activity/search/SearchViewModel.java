package com.zoe.wan.android.activity.search;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0010\u001a\u00020\u0011R!\u0010\u0005\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0012"}, d2 = {"Lcom/zoe/wan/android/activity/search/SearchViewModel;", "Lcom/zoe/wan/base/BaseViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "results", "Lcom/zoe/wan/base/SingleLiveEvent;", "", "Lcom/zoe/wan/android/repository/data/SearchData;", "getResults", "()Lcom/zoe/wan/base/SingleLiveEvent;", "searchInput", "Landroidx/databinding/ObservableField;", "", "getSearchInput", "()Landroidx/databinding/ObservableField;", "search", "", "app_debug"})
public final class SearchViewModel extends com.zoe.wan.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull
    private final androidx.databinding.ObservableField<java.lang.String> searchInput = null;
    @org.jetbrains.annotations.NotNull
    private final com.zoe.wan.base.SingleLiveEvent<java.util.List<com.zoe.wan.android.repository.data.SearchData>> results = null;
    
    public SearchViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.databinding.ObservableField<java.lang.String> getSearchInput() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.zoe.wan.base.SingleLiveEvent<java.util.List<com.zoe.wan.android.repository.data.SearchData>> getResults() {
        return null;
    }
    
    public final void search() {
    }
}