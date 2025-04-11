package com.zoe.wan.android.adapter;

/**
 * 搜索返回列表适配器
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016\u00a8\u0006\u000f"}, d2 = {"Lcom/zoe/wan/android/adapter/SearchResultsAdapter;", "Lcom/zoe/wan/base/adapter/BaseRecyclerAdapter;", "Lcom/zoe/wan/android/repository/data/SearchData;", "Lcom/zoe/wan/android/adapter/SearchResultsAdapter$SearchViewHolder;", "()V", "bindHolder", "", "holder", "position", "", "getViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "SearchViewHolder", "app_debug"})
public final class SearchResultsAdapter extends com.zoe.wan.base.adapter.BaseRecyclerAdapter<com.zoe.wan.android.repository.data.SearchData, com.zoe.wan.android.adapter.SearchResultsAdapter.SearchViewHolder> {
    
    public SearchResultsAdapter() {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.zoe.wan.android.adapter.SearchResultsAdapter.SearchViewHolder getViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void bindHolder(@org.jetbrains.annotations.NotNull
    com.zoe.wan.android.adapter.SearchResultsAdapter.SearchViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/zoe/wan/android/adapter/SearchResultsAdapter$SearchViewHolder;", "Lcom/zoe/wan/base/adapter/BaseViewHolder;", "Lcom/zoe/wan/android/databinding/ItemSearchBinding;", "itemSearchBinding", "(Lcom/zoe/wan/android/databinding/ItemSearchBinding;)V", "app_debug"})
    public static final class SearchViewHolder extends com.zoe.wan.base.adapter.BaseViewHolder<com.zoe.wan.android.databinding.ItemSearchBinding> {
        
        public SearchViewHolder(@org.jetbrains.annotations.NotNull
        com.zoe.wan.android.databinding.ItemSearchBinding itemSearchBinding) {
            super(null);
        }
    }
}