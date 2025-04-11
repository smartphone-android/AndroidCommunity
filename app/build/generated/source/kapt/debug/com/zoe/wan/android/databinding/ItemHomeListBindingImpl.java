package com.zoe.wan.android.databinding;
import com.zoe.wan.android.R;
import com.zoe.wan.android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemHomeListBindingImpl extends ItemHomeListBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.itemHomeLinear, 5);
        sViewsWithIds.put(R.id.itemUserHead, 6);
        sViewsWithIds.put(R.id.itemHomeTopTag, 7);
        sViewsWithIds.put(R.id.itemHomeCollect, 8);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemHomeListBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private ItemHomeListBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[4]
            , (android.widget.ImageView) bindings[8]
            , (androidx.appcompat.widget.LinearLayoutCompat) bindings[5]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[7]
            , (android.widget.ImageView) bindings[6]
            );
        this.itemHomeChapter.setTag(null);
        this.itemHomeListTitle.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.item == variableId) {
            setItem((com.zoe.wan.android.repository.data.HomeListItemData) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItem(@Nullable com.zoe.wan.android.repository.data.HomeListItemData Item) {
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.item);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.zoe.wan.android.repository.data.HomeListItemData item = mItem;
        java.lang.String itemNiceShareDate = null;
        java.lang.String itemAuthor = null;
        java.lang.String itemTitle = null;
        java.lang.String itemSuperChapterName = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (item != null) {
                    // read item.niceShareDate
                    itemNiceShareDate = item.getNiceShareDate();
                    // read item.author
                    itemAuthor = item.getAuthor();
                    // read item.title
                    itemTitle = item.getTitle();
                    // read item.superChapterName
                    itemSuperChapterName = item.getSuperChapterName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.itemHomeChapter, itemSuperChapterName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.itemHomeListTitle, itemTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, itemAuthor);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, itemNiceShareDate);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}