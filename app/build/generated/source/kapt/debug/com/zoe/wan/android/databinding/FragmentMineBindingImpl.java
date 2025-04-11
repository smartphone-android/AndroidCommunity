package com.zoe.wan.android.databinding;
import com.zoe.wan.android.R;
import com.zoe.wan.android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentMineBindingImpl extends FragmentMineBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.mineUserLinear, 3);
        sViewsWithIds.put(R.id.mineUserHead, 4);
        sViewsWithIds.put(R.id.mineCollect, 5);
        sViewsWithIds.put(R.id.mineAboutUs, 6);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentMineBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FragmentMineBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[6]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (androidx.appcompat.widget.AppCompatButton) bindings[2]
            , (com.google.android.material.imageview.ShapeableImageView) bindings[4]
            , (androidx.appcompat.widget.LinearLayoutCompat) bindings[3]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mineLoginOut.setTag(null);
        this.mineUserName.setTag(null);
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
        if (BR.mineVm == variableId) {
            setMineVm((com.zoe.wan.android.fragment.mine.MineViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMineVm(@Nullable com.zoe.wan.android.fragment.mine.MineViewModel MineVm) {
        this.mMineVm = MineVm;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.mineVm);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeMineVmLoginState((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeMineVmUsername((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeMineVmLoginState(androidx.databinding.ObservableField<java.lang.Boolean> MineVmLoginState, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeMineVmUsername(androidx.databinding.ObservableField<java.lang.String> MineVmUsername, int fieldId) {
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
        boolean androidxDatabindingViewDataBindingSafeUnboxMineVmLoginStateGet = false;
        com.zoe.wan.android.fragment.mine.MineViewModel mineVm = mMineVm;
        int mineVmLoginStateViewVISIBLEViewGONE = 0;
        java.lang.String mineVmUsernameGet = null;
        androidx.databinding.ObservableField<java.lang.Boolean> mineVmLoginState = null;
        androidx.databinding.ObservableField<java.lang.String> mineVmUsername = null;
        java.lang.Boolean mineVmLoginStateGet = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (mineVm != null) {
                        // read mineVm.loginState
                        mineVmLoginState = mineVm.getLoginState();
                    }
                    updateRegistration(0, mineVmLoginState);


                    if (mineVmLoginState != null) {
                        // read mineVm.loginState.get()
                        mineVmLoginStateGet = mineVmLoginState.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(mineVm.loginState.get())
                    androidxDatabindingViewDataBindingSafeUnboxMineVmLoginStateGet = androidx.databinding.ViewDataBinding.safeUnbox(mineVmLoginStateGet);
                if((dirtyFlags & 0xdL) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxMineVmLoginStateGet) {
                            dirtyFlags |= 0x20L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(mineVm.loginState.get()) ? View.VISIBLE : View.GONE
                    mineVmLoginStateViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxMineVmLoginStateGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (mineVm != null) {
                        // read mineVm.username
                        mineVmUsername = mineVm.getUsername();
                    }
                    updateRegistration(1, mineVmUsername);


                    if (mineVmUsername != null) {
                        // read mineVm.username.get()
                        mineVmUsernameGet = mineVmUsername.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            this.mineLoginOut.setVisibility(mineVmLoginStateViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mineUserName, mineVmUsernameGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): mineVm.loginState
        flag 1 (0x2L): mineVm.username
        flag 2 (0x3L): mineVm
        flag 3 (0x4L): null
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(mineVm.loginState.get()) ? View.VISIBLE : View.GONE
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(mineVm.loginState.get()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}