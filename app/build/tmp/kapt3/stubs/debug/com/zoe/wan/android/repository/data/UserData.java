package com.zoe.wan.android.repository.data;

/**
 * 注册或者登录后返回的用户数据
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b0\b\u0086\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u0013J\u0010\u0010\'\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u000b\u0010(\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u000b\u0010+\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u0013\u0010,\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u0013\u0010.\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u000b\u00102\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u00ba\u0001\u00104\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0012\b\u0002\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\nH\u00c6\u0001\u00a2\u0006\u0002\u00105J\u0013\u00106\u001a\u00020\u00032\b\u00107\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00108\u001a\u00020\u0007H\u00d6\u0001J\t\u00109\u001a\u00020\nH\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0015\u0010\f\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b \u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b%\u0010\u001aR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001e\u00a8\u0006:"}, d2 = {"Lcom/zoe/wan/android/repository/data/UserData;", "", "admin", "", "chapterTops", "", "coinCount", "", "collectIds", "email", "", "icon", "id", "nickname", "password", "publicName", "token", "type", "username", "(Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getAdmin", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getChapterTops", "()Ljava/util/List;", "getCoinCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCollectIds", "getEmail", "()Ljava/lang/String;", "getIcon", "getId", "getNickname", "getPassword", "getPublicName", "getToken", "getType", "getUsername", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/zoe/wan/android/repository/data/UserData;", "equals", "other", "hashCode", "toString", "app_debug"})
public final class UserData {
    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean admin = null;
    @org.jetbrains.annotations.Nullable
    private final java.util.List<java.lang.Object> chapterTops = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer coinCount = null;
    @org.jetbrains.annotations.Nullable
    private final java.util.List<java.lang.Object> collectIds = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String email = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String icon = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer id = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String nickname = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String password = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String publicName = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String token = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer type = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String username = null;
    
    public UserData(@org.jetbrains.annotations.Nullable
    java.lang.Boolean admin, @org.jetbrains.annotations.Nullable
    java.util.List<? extends java.lang.Object> chapterTops, @org.jetbrains.annotations.Nullable
    java.lang.Integer coinCount, @org.jetbrains.annotations.Nullable
    java.util.List<? extends java.lang.Object> collectIds, @org.jetbrains.annotations.Nullable
    java.lang.String email, @org.jetbrains.annotations.Nullable
    java.lang.String icon, @org.jetbrains.annotations.Nullable
    java.lang.Integer id, @org.jetbrains.annotations.Nullable
    java.lang.String nickname, @org.jetbrains.annotations.Nullable
    java.lang.String password, @org.jetbrains.annotations.Nullable
    java.lang.String publicName, @org.jetbrains.annotations.Nullable
    java.lang.String token, @org.jetbrains.annotations.Nullable
    java.lang.Integer type, @org.jetbrains.annotations.Nullable
    java.lang.String username) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getAdmin() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.Object> getChapterTops() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getCoinCount() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.Object> getCollectIds() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getIcon() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getNickname() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPassword() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPublicName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getToken() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUsername() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.Object> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.Object> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.zoe.wan.android.repository.data.UserData copy(@org.jetbrains.annotations.Nullable
    java.lang.Boolean admin, @org.jetbrains.annotations.Nullable
    java.util.List<? extends java.lang.Object> chapterTops, @org.jetbrains.annotations.Nullable
    java.lang.Integer coinCount, @org.jetbrains.annotations.Nullable
    java.util.List<? extends java.lang.Object> collectIds, @org.jetbrains.annotations.Nullable
    java.lang.String email, @org.jetbrains.annotations.Nullable
    java.lang.String icon, @org.jetbrains.annotations.Nullable
    java.lang.Integer id, @org.jetbrains.annotations.Nullable
    java.lang.String nickname, @org.jetbrains.annotations.Nullable
    java.lang.String password, @org.jetbrains.annotations.Nullable
    java.lang.String publicName, @org.jetbrains.annotations.Nullable
    java.lang.String token, @org.jetbrains.annotations.Nullable
    java.lang.Integer type, @org.jetbrains.annotations.Nullable
    java.lang.String username) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
}