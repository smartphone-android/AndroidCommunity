package com.zoe.wan.android.activity.web;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00102\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u000f\u001a\u00020\tH\u0014\u00a8\u0006\u0011"}, d2 = {"Lcom/zoe/wan/android/activity/web/WebActivity;", "Lcom/zoe/wan/base/BaseActivity;", "Lcom/zoe/wan/android/databinding/ActivityWebBinding;", "Lcom/zoe/wan/android/activity/web/WebViewModel;", "()V", "getLayoutId", "", "getViewModelId", "initViewData", "", "onKeyDown", "", "keyCode", "event", "Landroid/view/KeyEvent;", "onStop", "Companion", "app_debug"})
public final class WebActivity extends com.zoe.wan.base.BaseActivity<com.zoe.wan.android.databinding.ActivityWebBinding, com.zoe.wan.android.activity.web.WebViewModel> {
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String intentKeyUrl = "intentKeyUrl";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String intentKeyTitle = "intentKeyTitle";
    @org.jetbrains.annotations.NotNull
    public static final com.zoe.wan.android.activity.web.WebActivity.Companion Companion = null;
    
    public WebActivity() {
        super();
    }
    
    @java.lang.Override
    protected void onStop() {
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
    
    /**
     * 假如在webview里按下返回键，优先返回webview内的页面
     */
    @java.lang.Override
    public boolean onKeyDown(int keyCode, @org.jetbrains.annotations.Nullable
    android.view.KeyEvent event) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/zoe/wan/android/activity/web/WebActivity$Companion;", "", "()V", "intentKeyTitle", "", "intentKeyUrl", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}