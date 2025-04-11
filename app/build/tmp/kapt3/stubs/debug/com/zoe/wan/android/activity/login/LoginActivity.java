package com.zoe.wan.android.activity.login;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\f\u001a\u00020\nH\u0002J\b\u0010\r\u001a\u00020\nH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/zoe/wan/android/activity/login/LoginActivity;", "Lcom/zoe/wan/base/BaseActivity;", "Lcom/zoe/wan/android/databinding/ActivityLoginBinding;", "Lcom/zoe/wan/android/activity/login/LoginViewModel;", "()V", "type", "", "getLayoutId", "getViewModelId", "initListener", "", "initLoginView", "initRegisterView", "initViewData", "Companion", "app_debug"})
public final class LoginActivity extends com.zoe.wan.base.BaseActivity<com.zoe.wan.android.databinding.ActivityLoginBinding, com.zoe.wan.android.activity.login.LoginViewModel> {
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String Intent_Type = "intentLoginOrRegister";
    private static final int loginType = 0;
    private static final int registerType = 1;
    private int type;
    @org.jetbrains.annotations.NotNull
    public static final com.zoe.wan.android.activity.login.LoginActivity.Companion Companion = null;
    
    public LoginActivity() {
        super();
    }
    
    @java.lang.Override
    public int getLayoutId() {
        return 0;
    }
    
    @java.lang.Override
    public int getViewModelId() {
        return 0;
    }
    
    @java.lang.Override
    public void initViewData() {
    }
    
    private final void initListener() {
    }
    
    private final void initLoginView() {
    }
    
    private final void initRegisterView() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n\u00a8\u0006\r"}, d2 = {"Lcom/zoe/wan/android/activity/login/LoginActivity$Companion;", "", "()V", "Intent_Type", "", "getIntent_Type", "()Ljava/lang/String;", "loginType", "", "getLoginType", "()I", "registerType", "getRegisterType", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getIntent_Type() {
            return null;
        }
        
        public final int getLoginType() {
            return 0;
        }
        
        public final int getRegisterType() {
            return 0;
        }
    }
}