package com.zoe.wan.android.databinding;
import com.zoe.wan.android.R;
import com.zoe.wan.android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivitySearchBindingImpl extends ActivitySearchBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.searchTitleBar, 2);
        sViewsWithIds.put(R.id.searchBack, 3);
        sViewsWithIds.put(R.id.searchCancel, 4);
        sViewsWithIds.put(R.id.searchListView, 5);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener searchInputandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of searchVm.searchInput.get()
            //         is searchVm.searchInput.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(searchInput);
            // localize variables for thread safety
            // searchVm.searchInput
            androidx.databinding.ObservableField<java.lang.String> searchVmSearchInput = null;
            // searchVm != null
            boolean searchVmJavaLangObjectNull = false;
            // searchVm
            com.zoe.wan.android.activity.search.SearchViewModel searchVm = mSearchVm;
            // searchVm.searchInput.get()
            java.lang.String searchVmSearchInputGet = null;
            // searchVm.searchInput != null
            boolean searchVmSearchInputJavaLangObjectNull = false;



            searchVmJavaLangObjectNull = (searchVm) != (null);
            if (searchVmJavaLangObjectNull) {


                searchVmSearchInput = searchVm.getSearchInput();

                searchVmSearchInputJavaLangObjectNull = (searchVmSearchInput) != (null);
                if (searchVmSearchInputJavaLangObjectNull) {




                    searchVmSearchInput.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ActivitySearchBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ActivitySearchBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatImageView) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[1]
            , (androidx.recyclerview.widget.RecyclerView) bindings[5]
            , (androidx.appcompat.widget.LinearLayoutCompat) bindings[2]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.searchInput.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.searchVm == variableId) {
            setSearchVm((com.zoe.wan.android.activity.search.SearchViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSearchVm(@Nullable com.zoe.wan.android.activity.search.SearchViewModel SearchVm) {
        this.mSearchVm = SearchVm;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.searchVm);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeSearchVmSearchInput((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeSearchVmSearchInput(androidx.databinding.ObservableField<java.lang.String> SearchVmSearchInput, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
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
        androidx.databinding.ObservableField<java.lang.String> searchVmSearchInput = null;
        com.zoe.wan.android.activity.search.SearchViewModel searchVm = mSearchVm;
        java.lang.String searchVmSearchInputGet = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (searchVm != null) {
                    // read searchVm.searchInput
                    searchVmSearchInput = searchVm.getSearchInput();
                }
                updateRegistration(0, searchVmSearchInput);


                if (searchVmSearchInput != null) {
                    // read searchVm.searchInput.get()
                    searchVmSearchInputGet = searchVmSearchInput.get();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.searchInput, searchVmSearchInputGet);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.searchInput, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, searchInputandroidTextAttrChanged);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): searchVm.searchInput
        flag 1 (0x2L): searchVm
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}