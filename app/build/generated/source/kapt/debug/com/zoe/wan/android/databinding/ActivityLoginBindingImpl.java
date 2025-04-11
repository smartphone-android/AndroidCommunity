package com.zoe.wan.android.databinding;
import com.zoe.wan.android.R;
import com.zoe.wan.android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityLoginBindingImpl extends ActivityLoginBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.loginOrRegisterBtn, 4);
        sViewsWithIds.put(R.id.registerAction, 5);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener inputPasswordandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of loginVm.password.get()
            //         is loginVm.password.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(inputPassword);
            // localize variables for thread safety
            // loginVm.password.get()
            java.lang.String loginVmPasswordGet = null;
            // loginVm.password != null
            boolean loginVmPasswordJavaLangObjectNull = false;
            // loginVm != null
            boolean loginVmJavaLangObjectNull = false;
            // loginVm.password
            androidx.databinding.ObservableField<java.lang.String> loginVmPassword = null;
            // loginVm
            com.zoe.wan.android.activity.login.LoginViewModel loginVm = mLoginVm;



            loginVmJavaLangObjectNull = (loginVm) != (null);
            if (loginVmJavaLangObjectNull) {


                loginVmPassword = loginVm.getPassword();

                loginVmPasswordJavaLangObjectNull = (loginVmPassword) != (null);
                if (loginVmPasswordJavaLangObjectNull) {




                    loginVmPassword.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener inputPasswordTwiceandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of loginVm.passwordTwice.get()
            //         is loginVm.passwordTwice.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(inputPasswordTwice);
            // localize variables for thread safety
            // loginVm.passwordTwice.get()
            java.lang.String loginVmPasswordTwiceGet = null;
            // loginVm.passwordTwice
            androidx.databinding.ObservableField<java.lang.String> loginVmPasswordTwice = null;
            // loginVm != null
            boolean loginVmJavaLangObjectNull = false;
            // loginVm.passwordTwice != null
            boolean loginVmPasswordTwiceJavaLangObjectNull = false;
            // loginVm
            com.zoe.wan.android.activity.login.LoginViewModel loginVm = mLoginVm;



            loginVmJavaLangObjectNull = (loginVm) != (null);
            if (loginVmJavaLangObjectNull) {


                loginVmPasswordTwice = loginVm.getPasswordTwice();

                loginVmPasswordTwiceJavaLangObjectNull = (loginVmPasswordTwice) != (null);
                if (loginVmPasswordTwiceJavaLangObjectNull) {




                    loginVmPasswordTwice.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener inputUserNameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of loginVm.username.get()
            //         is loginVm.username.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(inputUserName);
            // localize variables for thread safety
            // loginVm.username.get()
            java.lang.String loginVmUsernameGet = null;
            // loginVm.username
            androidx.databinding.ObservableField<java.lang.String> loginVmUsername = null;
            // loginVm != null
            boolean loginVmJavaLangObjectNull = false;
            // loginVm.username != null
            boolean loginVmUsernameJavaLangObjectNull = false;
            // loginVm
            com.zoe.wan.android.activity.login.LoginViewModel loginVm = mLoginVm;



            loginVmJavaLangObjectNull = (loginVm) != (null);
            if (loginVmJavaLangObjectNull) {


                loginVmUsername = loginVm.getUsername();

                loginVmUsernameJavaLangObjectNull = (loginVmUsername) != (null);
                if (loginVmUsernameJavaLangObjectNull) {




                    loginVmUsername.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ActivityLoginBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ActivityLoginBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (androidx.appcompat.widget.AppCompatEditText) bindings[2]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[3]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[1]
            , (androidx.appcompat.widget.AppCompatButton) bindings[4]
            , (android.widget.TextView) bindings[5]
            );
        this.inputPassword.setTag(null);
        this.inputPasswordTwice.setTag(null);
        this.inputUserName.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
        if (BR.loginVm == variableId) {
            setLoginVm((com.zoe.wan.android.activity.login.LoginViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setLoginVm(@Nullable com.zoe.wan.android.activity.login.LoginViewModel LoginVm) {
        this.mLoginVm = LoginVm;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.loginVm);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeLoginVmUsername((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeLoginVmPassword((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeLoginVmPasswordTwice((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeLoginVmUsername(androidx.databinding.ObservableField<java.lang.String> LoginVmUsername, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLoginVmPassword(androidx.databinding.ObservableField<java.lang.String> LoginVmPassword, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLoginVmPasswordTwice(androidx.databinding.ObservableField<java.lang.String> LoginVmPasswordTwice, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        java.lang.String loginVmPasswordGet = null;
        java.lang.String loginVmPasswordTwiceGet = null;
        java.lang.String loginVmUsernameGet = null;
        androidx.databinding.ObservableField<java.lang.String> loginVmUsername = null;
        androidx.databinding.ObservableField<java.lang.String> loginVmPassword = null;
        com.zoe.wan.android.activity.login.LoginViewModel loginVm = mLoginVm;
        androidx.databinding.ObservableField<java.lang.String> loginVmPasswordTwice = null;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (loginVm != null) {
                        // read loginVm.username
                        loginVmUsername = loginVm.getUsername();
                    }
                    updateRegistration(0, loginVmUsername);


                    if (loginVmUsername != null) {
                        // read loginVm.username.get()
                        loginVmUsernameGet = loginVmUsername.get();
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (loginVm != null) {
                        // read loginVm.password
                        loginVmPassword = loginVm.getPassword();
                    }
                    updateRegistration(1, loginVmPassword);


                    if (loginVmPassword != null) {
                        // read loginVm.password.get()
                        loginVmPasswordGet = loginVmPassword.get();
                    }
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (loginVm != null) {
                        // read loginVm.passwordTwice
                        loginVmPasswordTwice = loginVm.getPasswordTwice();
                    }
                    updateRegistration(2, loginVmPasswordTwice);


                    if (loginVmPasswordTwice != null) {
                        // read loginVm.passwordTwice.get()
                        loginVmPasswordTwiceGet = loginVmPasswordTwice.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.inputPassword, loginVmPasswordGet);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.inputPassword, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, inputPasswordandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.inputPasswordTwice, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, inputPasswordTwiceandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.inputUserName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, inputUserNameandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.inputPasswordTwice, loginVmPasswordTwiceGet);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.inputUserName, loginVmUsernameGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): loginVm.username
        flag 1 (0x2L): loginVm.password
        flag 2 (0x3L): loginVm.passwordTwice
        flag 3 (0x4L): loginVm
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}