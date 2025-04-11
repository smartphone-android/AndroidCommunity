package com.zoe.wan.android.fragment.mine;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0011\u001a\u00020\u0012R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\t\u00a8\u0006\u0013"}, d2 = {"Lcom/zoe/wan/android/fragment/mine/MineViewModel;", "Lcom/zoe/wan/base/BaseViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "loginState", "Landroidx/databinding/ObservableField;", "", "getLoginState", "()Landroidx/databinding/ObservableField;", "logoutState", "Lcom/zoe/wan/base/SingleLiveEvent;", "getLogoutState", "()Lcom/zoe/wan/base/SingleLiveEvent;", "username", "", "getUsername", "logOut", "", "app_debug"})
public final class MineViewModel extends com.zoe.wan.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.zoe.wan.base.SingleLiveEvent<java.lang.Boolean> logoutState = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.databinding.ObservableField<java.lang.Boolean> loginState = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.databinding.ObservableField<java.lang.String> username = null;
    
    public MineViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.zoe.wan.base.SingleLiveEvent<java.lang.Boolean> getLogoutState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.databinding.ObservableField<java.lang.Boolean> getLoginState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.databinding.ObservableField<java.lang.String> getUsername() {
        return null;
    }
    
    public final void logOut() {
    }
}