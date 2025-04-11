package com.zoe.wan.android.databinding;
import com.zoe.wan.android.R;
import com.zoe.wan.android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityAboutUsBindingImpl extends ActivityAboutUsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.aboutUsBack, 3);
    }
    // views
    @NonNull
    private final androidx.appcompat.widget.LinearLayoutCompat mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityAboutUsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ActivityAboutUsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.appcompat.widget.AppCompatImageView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.aboutUsHtmlText.setTag(null);
        this.aboutUsVersion.setTag(null);
        this.mboundView0 = (androidx.appcompat.widget.LinearLayoutCompat) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.aboutVm == variableId) {
            setAboutVm((com.zoe.wan.android.activity.about.AboutUsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setAboutVm(@Nullable com.zoe.wan.android.activity.about.AboutUsViewModel AboutVm) {
        this.mAboutVm = AboutVm;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.aboutVm);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeAboutVmVersion((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeAboutVmHtmlText((androidx.databinding.ObservableField<android.text.Spanned>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeAboutVmVersion(androidx.databinding.ObservableField<java.lang.String> AboutVmVersion, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeAboutVmHtmlText(androidx.databinding.ObservableField<android.text.Spanned> AboutVmHtmlText, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        java.lang.String aboutVmVersionGet = null;
        androidx.databinding.ObservableField<java.lang.String> aboutVmVersion = null;
        androidx.databinding.ObservableField<android.text.Spanned> aboutVmHtmlText = null;
        com.zoe.wan.android.activity.about.AboutUsViewModel aboutVm = mAboutVm;
        android.text.Spanned aboutVmHtmlTextGet = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (aboutVm != null) {
                        // read aboutVm.version
                        aboutVmVersion = aboutVm.getVersion();
                    }
                    updateRegistration(0, aboutVmVersion);


                    if (aboutVmVersion != null) {
                        // read aboutVm.version.get()
                        aboutVmVersionGet = aboutVmVersion.get();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (aboutVm != null) {
                        // read aboutVm.htmlText
                        aboutVmHtmlText = aboutVm.getHtmlText();
                    }
                    updateRegistration(1, aboutVmHtmlText);


                    if (aboutVmHtmlText != null) {
                        // read aboutVm.htmlText.get()
                        aboutVmHtmlTextGet = aboutVmHtmlText.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.aboutUsHtmlText, aboutVmHtmlTextGet);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.aboutUsVersion, aboutVmVersionGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): aboutVm.version
        flag 1 (0x2L): aboutVm.htmlText
        flag 2 (0x3L): aboutVm
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}