package com.zoe.wan.android.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \u001c2\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0001:\u0004\u001a\u001b\u001c\u001dB\u0005\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rH\u0016J\u0016\u0010\u0013\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u0010\u0016\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\bJ\u0018\u0010\u0018\u001a\u00020\n2\u0010\u0010\u0019\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0006R\u0018\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/zoe/wan/android/adapter/HomeListAdapter;", "Lcom/zoe/wan/base/adapter/BaseRecyclerAdapter;", "Lcom/zoe/wan/android/repository/data/HomeListItemData;", "Lcom/zoe/wan/base/adapter/BaseViewHolder;", "()V", "collectListener", "Lcom/zoe/wan/base/adapter/AdapterCollectListener;", "homeBannerData", "Lcom/zoe/wan/android/repository/data/HomeBannerData;", "bindHolder", "", "holder", "position", "", "getItemViewType", "getViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "notifyCollectChange", "collect", "", "setBannerData", "bannerData", "setCollectListener", "listener", "BannerAdapter", "BannerViewHolder", "Companion", "MyViewHolder", "app_debug"})
public final class HomeListAdapter extends com.zoe.wan.base.adapter.BaseRecyclerAdapter<com.zoe.wan.android.repository.data.HomeListItemData, com.zoe.wan.base.adapter.BaseViewHolder<?>> {
    private static final int ItemTypeBannerHeader = 0;
    private static final int ItemTypeList = 1;
    private static final int HeaderCount = 1;
    @org.jetbrains.annotations.Nullable
    private com.zoe.wan.android.repository.data.HomeBannerData homeBannerData;
    @org.jetbrains.annotations.Nullable
    private com.zoe.wan.base.adapter.AdapterCollectListener<com.zoe.wan.android.repository.data.HomeListItemData> collectListener;
    @org.jetbrains.annotations.NotNull
    public static final com.zoe.wan.android.adapter.HomeListAdapter.Companion Companion = null;
    
    public HomeListAdapter() {
        super();
    }
    
    public final void setBannerData(@org.jetbrains.annotations.Nullable
    com.zoe.wan.android.repository.data.HomeBannerData bannerData) {
    }
    
    public final void setCollectListener(@org.jetbrains.annotations.Nullable
    com.zoe.wan.base.adapter.AdapterCollectListener<com.zoe.wan.android.repository.data.HomeListItemData> listener) {
    }
    
    /**
     * 收藏状态刷新
     */
    public final void notifyCollectChange(int position, boolean collect) {
    }
    
    /**
     * 判断当前的item类型
     */
    @java.lang.Override
    public int getItemViewType(int position) {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.zoe.wan.base.adapter.BaseViewHolder<?> getViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void bindHolder(@org.jetbrains.annotations.NotNull
    com.zoe.wan.base.adapter.BaseViewHolder<?> holder, int position) {
    }
    
    /**
     * banner适配器
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005J,\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016\u00a8\u0006\u000e"}, d2 = {"Lcom/zoe/wan/android/adapter/HomeListAdapter$BannerAdapter;", "Lcom/youth/banner/adapter/BannerImageAdapter;", "Lcom/zoe/wan/android/repository/data/HomeBannerDataItem;", "homeBannerData", "Lcom/zoe/wan/android/repository/data/HomeBannerData;", "(Lcom/zoe/wan/android/repository/data/HomeBannerData;)V", "onBindView", "", "holder", "Lcom/youth/banner/holder/BannerImageHolder;", "data", "position", "", "size", "app_debug"})
    static final class BannerAdapter extends com.youth.banner.adapter.BannerImageAdapter<com.zoe.wan.android.repository.data.HomeBannerDataItem> {
        
        public BannerAdapter(@org.jetbrains.annotations.Nullable
        com.zoe.wan.android.repository.data.HomeBannerData homeBannerData) {
            super(null);
        }
        
        @java.lang.Override
        public void onBindView(@org.jetbrains.annotations.Nullable
        com.youth.banner.holder.BannerImageHolder holder, @org.jetbrains.annotations.Nullable
        com.zoe.wan.android.repository.data.HomeBannerDataItem data, int position, int size) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/zoe/wan/android/adapter/HomeListAdapter$BannerViewHolder;", "Lcom/zoe/wan/base/adapter/BaseViewHolder;", "Lcom/zoe/wan/android/databinding/ItemHomeBannerBinding;", "itemHomeBannerBinding", "(Lcom/zoe/wan/android/databinding/ItemHomeBannerBinding;)V", "app_debug"})
    public static final class BannerViewHolder extends com.zoe.wan.base.adapter.BaseViewHolder<com.zoe.wan.android.databinding.ItemHomeBannerBinding> {
        
        public BannerViewHolder(@org.jetbrains.annotations.NotNull
        com.zoe.wan.android.databinding.ItemHomeBannerBinding itemHomeBannerBinding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/zoe/wan/android/adapter/HomeListAdapter$Companion;", "", "()V", "HeaderCount", "", "ItemTypeBannerHeader", "ItemTypeList", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/zoe/wan/android/adapter/HomeListAdapter$MyViewHolder;", "Lcom/zoe/wan/base/adapter/BaseViewHolder;", "Lcom/zoe/wan/android/databinding/ItemHomeListBinding;", "itemDatabind", "(Lcom/zoe/wan/android/databinding/ItemHomeListBinding;)V", "app_debug"})
    public static final class MyViewHolder extends com.zoe.wan.base.adapter.BaseViewHolder<com.zoe.wan.android.databinding.ItemHomeListBinding> {
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull
        com.zoe.wan.android.databinding.ItemHomeListBinding itemDatabind) {
            super(null);
        }
    }
}