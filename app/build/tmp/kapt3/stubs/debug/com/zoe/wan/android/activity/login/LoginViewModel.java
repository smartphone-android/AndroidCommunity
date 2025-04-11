package com.zoe.wan.android.activity.login;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\fH\u0002J\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e\u00a8\u0006\u0018"}, d2 = {"Lcom/zoe/wan/android/activity/login/LoginViewModel;", "Lcom/zoe/wan/base/BaseViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "actionState", "Lcom/zoe/wan/base/SingleLiveEvent;", "", "getActionState", "()Lcom/zoe/wan/base/SingleLiveEvent;", "password", "Landroidx/databinding/ObservableField;", "", "getPassword", "()Landroidx/databinding/ObservableField;", "passwordTwice", "getPasswordTwice", "username", "getUsername", "checkNull", "value", "login", "", "register", "app_debug"})
public final class LoginViewModel extends com.zoe.wan.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull
    private final androidx.databinding.ObservableField<java.lang.String> username = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.databinding.ObservableField<java.lang.String> password = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.databinding.ObservableField<java.lang.String> passwordTwice = null;
    @org.jetbrains.annotations.NotNull
    private final com.zoe.wan.base.SingleLiveEvent<java.lang.Boolean> actionState = null;
    
    public LoginViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.databinding.ObservableField<java.lang.String> getUsername() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.databinding.ObservableField<java.lang.String> getPassword() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.databinding.ObservableField<java.lang.String> getPasswordTwice() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.zoe.wan.base.SingleLiveEvent<java.lang.Boolean> getActionState() {
        return null;
    }
    
    /**
     * 注册
     */
    public final void login() {
    }
    
    /**
     * 注册
     */
    public final void register() {
    }
    
    private final boolean checkNull(java.lang.String value) {
        return false;
    }
}