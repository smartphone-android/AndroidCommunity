package com.zoe.wan.android.databinding;
import com.zoe.wan.android.R;
import com.zoe.wan.android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityWebBindingImpl extends ActivityWebBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.webViewBack, 2);
        sViewsWithIds.put(R.id.webView, 3);
    }
    // views
    @NonNull
    private final androidx.appcompat.widget.LinearLayoutCompat mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityWebBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ActivityWebBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.webkit.WebView) bindings[3]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (androidx.appcompat.widget.LinearLayoutCompat) bindings[0];
        this.mboundView0.setTag(null);
        this.webViewTitle.setTag(null);
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
        if (BR.webVM == variableId) {
            setWebVM((com.zoe.wan.android.activity.web.WebViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setWebVM(@Nullable com.zoe.wan.android.activity.web.WebViewModel WebVM) {
        this.mWebVM = WebVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.webVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeWebVMWebTitle((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeWebVMWebTitle(androidx.databinding.ObservableField<java.lang.String> WebVMWebTitle, int fieldId) {
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
        com.zoe.wan.android.activity.web.WebViewModel webVM = mWebVM;
        java.lang.String webVMWebTitleGet = null;
        androidx.databinding.ObservableField<java.lang.String> webVMWebTitle = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (webVM != null) {
                    // read webVM.webTitle
                    webVMWebTitle = webVM.getWebTitle();
                }
                updateRegistration(0, webVMWebTitle);


                if (webVMWebTitle != null) {
                    // read webVM.webTitle.get()
                    webVMWebTitleGet = webVMWebTitle.get();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.webViewTitle, webVMWebTitleGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): webVM.webTitle
        flag 1 (0x2L): webVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}