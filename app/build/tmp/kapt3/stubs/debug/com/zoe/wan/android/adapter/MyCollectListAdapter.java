package com.zoe.wan.android.adapter;

/**
 * 我的收藏列表
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u0016\u0010\u0010\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012J\u0018\u0010\u0013\u001a\u00020\b2\u0010\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0006R\u0018\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/zoe/wan/android/adapter/MyCollectListAdapter;", "Lcom/zoe/wan/base/adapter/BaseRecyclerAdapter;", "Lcom/zoe/wan/android/repository/data/CollectListData;", "Lcom/zoe/wan/android/adapter/MyCollectListAdapter$MyCollectListViewHolder;", "()V", "collectListener", "Lcom/zoe/wan/base/adapter/AdapterCollectListener;", "bindHolder", "", "holder", "position", "", "getViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "notifyCollectChange", "collect", "", "setCollectListener", "listener", "MyCollectListViewHolder", "app_debug"})
public final class MyCollectListAdapter extends com.zoe.wan.base.adapter.BaseRecyclerAdapter<com.zoe.wan.android.repository.data.CollectListData, com.zoe.wan.android.adapter.MyCollectListAdapter.MyCollectListViewHolder> {
    @org.jetbrains.annotations.Nullable
    private com.zoe.wan.base.adapter.AdapterCollectListener<com.zoe.wan.android.repository.data.CollectListData> collectListener;
    
    public MyCollectListAdapter() {
        super();
    }
    
    public final void setCollectListener(@org.jetbrains.annotations.Nullable
    com.zoe.wan.base.adapter.AdapterCollectListener<com.zoe.wan.android.repository.data.CollectListData> listener) {
    }
    
    /**
     * 收藏状态刷新
     */
    public final void notifyCollectChange(int position, boolean collect) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.zoe.wan.android.adapter.MyCollectListAdapter.MyCollectListViewHolder getViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void bindHolder(@org.jetbrains.annotations.NotNull
    com.zoe.wan.android.adapter.MyCollectListAdapter.MyCollectListViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/zoe/wan/android/adapter/MyCollectListAdapter$MyCollectListViewHolder;", "Lcom/zoe/wan/base/adapter/BaseViewHolder;", "Lcom/zoe/wan/android/databinding/ItemMyCollectListBinding;", "binding", "(Lcom/zoe/wan/android/databinding/ItemMyCollectListBinding;)V", "app_debug"})
    public static final class MyCollectListViewHolder extends com.zoe.wan.base.adapter.BaseViewHolder<com.zoe.wan.android.databinding.ItemMyCollectListBinding> {
        
        public MyCollectListViewHolder(@org.jetbrains.annotations.NotNull
        com.zoe.wan.android.databinding.ItemMyCollectListBinding binding) {
            super(null);
        }
    }
}