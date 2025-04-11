package com.zoe.wan.android.repository.data;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\\\b\u0086\b\u0018\u00002\u00020\u0001B\u00e9\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\'\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010+J\u0010\u0010X\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010-J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010\\\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010-J\u000b\u0010]\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010^\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u00102J\u0010\u0010_\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010-J\u000b\u0010`\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010g\u001a\u0004\u0018\u00010\u001cH\u00c6\u0003\u00a2\u0006\u0002\u0010IJ\u0010\u0010h\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u00102J\u0010\u0010i\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u00102J\u0010\u0010j\u001a\u0004\u0018\u00010\u001cH\u00c6\u0003\u00a2\u0006\u0002\u0010IJ\u000b\u0010k\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010l\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u00102J\u000b\u0010m\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010n\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u00102J\u0011\u0010o\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$H\u00c6\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010q\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u00102J\u0010\u0010r\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u00102J\u0010\u0010s\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u00102J\u0010\u0010t\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u00102J\u000b\u0010u\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010v\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010-J\u0010\u0010w\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u00102J\u000b\u0010x\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010y\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010-J\u0010\u0010z\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u00102J\u00b8\u0003\u0010{\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010|J\u0013\u0010}\u001a\u00020\u00032\b\u0010~\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u007f\u001a\u00020\u0007H\u00d6\u0001J\n\u0010\u0080\u0001\u001a\u00020\u0005H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010.\u001a\u0004\b,\u0010-R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u00103\u001a\u0004\b1\u00102R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u00100R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010.\u001a\u0004\b5\u0010-R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u00103\u001a\u0004\b6\u00102R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u00100R\u001e\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010.\u001a\u0004\b8\u0010-\"\u0004\b9\u0010:R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u00103\u001a\u0004\b;\u00102R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u00100R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u00100R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u00100R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010.\u001a\u0004\b?\u0010-R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u00100R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u00103\u001a\u0004\bA\u00102R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010.\u001a\u0004\b\u0014\u0010-R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u00100R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u00100R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u00100R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u00100R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u00100R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u00100R\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u00a2\u0006\n\n\u0002\u0010J\u001a\u0004\bH\u0010IR\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u00103\u001a\u0004\bK\u00102R\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u00103\u001a\u0004\bL\u00102R\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u001c\u00a2\u0006\n\n\u0002\u0010J\u001a\u0004\bM\u0010IR\u0013\u0010 \u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u00100R\u0015\u0010!\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u00103\u001a\u0004\bO\u00102R\u0013\u0010\"\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u00100R\u0019\u0010#\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u0013\u0010&\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bS\u00100R\u0015\u0010\'\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u00103\u001a\u0004\bT\u00102R\u0015\u0010(\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u00103\u001a\u0004\bU\u00102R\u0015\u0010)\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u00103\u001a\u0004\bV\u00102R\u0015\u0010*\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u00103\u001a\u0004\bW\u00102\u00a8\u0006\u0081\u0001"}, d2 = {"Lcom/zoe/wan/android/repository/data/HomeListItemData;", "", "adminAdd", "", "apkLink", "", "audit", "", "author", "canEdit", "chapterId", "chapterName", "collect", "courseId", "desc", "descMd", "envelopePic", "fresh", "host", "id", "isAdminAdd", "link", "niceDate", "niceShareDate", "origin", "prefix", "projectLink", "publishTime", "", "realSuperChapterId", "selfVisible", "shareDate", "shareUser", "superChapterId", "superChapterName", "tags", "", "Lcom/zoe/wan/android/repository/data/HomeListTag;", "title", "type", "userId", "visible", "zan", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getAdminAdd", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getApkLink", "()Ljava/lang/String;", "getAudit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAuthor", "getCanEdit", "getChapterId", "getChapterName", "getCollect", "setCollect", "(Ljava/lang/Boolean;)V", "getCourseId", "getDesc", "getDescMd", "getEnvelopePic", "getFresh", "getHost", "getId", "getLink", "getNiceDate", "getNiceShareDate", "getOrigin", "getPrefix", "getProjectLink", "getPublishTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getRealSuperChapterId", "getSelfVisible", "getShareDate", "getShareUser", "getSuperChapterId", "getSuperChapterName", "getTags", "()Ljava/util/List;", "getTitle", "getType", "getUserId", "getVisible", "getZan", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/zoe/wan/android/repository/data/HomeListItemData;", "equals", "other", "hashCode", "toString", "app_debug"})
public final class HomeListItemData {
    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean adminAdd = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String apkLink = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer audit = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String author = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean canEdit = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer chapterId = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String chapterName = null;
    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean collect;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer courseId = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String desc = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String descMd = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String envelopePic = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean fresh = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String host = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer id = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean isAdminAdd = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String link = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String niceDate = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String niceShareDate = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String origin = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String prefix = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String projectLink = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Long publishTime = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer realSuperChapterId = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer selfVisible = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Long shareDate = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String shareUser = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer superChapterId = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String superChapterName = null;
    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.zoe.wan.android.repository.data.HomeListTag> tags = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String title = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer type = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer userId = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer visible = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer zan = null;
    
    public HomeListItemData(@org.jetbrains.annotations.Nullable
    java.lang.Boolean adminAdd, @org.jetbrains.annotations.Nullable
    java.lang.String apkLink, @org.jetbrains.annotations.Nullable
    java.lang.Integer audit, @org.jetbrains.annotations.Nullable
    java.lang.String author, @org.jetbrains.annotations.Nullable
    java.lang.Boolean canEdit, @org.jetbrains.annotations.Nullable
    java.lang.Integer chapterId, @org.jetbrains.annotations.Nullable
    java.lang.String chapterName, @org.jetbrains.annotations.Nullable
    java.lang.Boolean collect, @org.jetbrains.annotations.Nullable
    java.lang.Integer courseId, @org.jetbrains.annotations.Nullable
    java.lang.String desc, @org.jetbrains.annotations.Nullable
    java.lang.String descMd, @org.jetbrains.annotations.Nullable
    java.lang.String envelopePic, @org.jetbrains.annotations.Nullable
    java.lang.Boolean fresh, @org.jetbrains.annotations.Nullable
    java.lang.String host, @org.jetbrains.annotations.Nullable
    java.lang.Integer id, @org.jetbrains.annotations.Nullable
    java.lang.Boolean isAdminAdd, @org.jetbrains.annotations.Nullable
    java.lang.String link, @org.jetbrains.annotations.Nullable
    java.lang.String niceDate, @org.jetbrains.annotations.Nullable
    java.lang.String niceShareDate, @org.jetbrains.annotations.Nullable
    java.lang.String origin, @org.jetbrains.annotations.Nullable
    java.lang.String prefix, @org.jetbrains.annotations.Nullable
    java.lang.String projectLink, @org.jetbrains.annotations.Nullable
    java.lang.Long publishTime, @org.jetbrains.annotations.Nullable
    java.lang.Integer realSuperChapterId, @org.jetbrains.annotations.Nullable
    java.lang.Integer selfVisible, @org.jetbrains.annotations.Nullable
    java.lang.Long shareDate, @org.jetbrains.annotations.Nullable
    java.lang.String shareUser, @org.jetbrains.annotations.Nullable
    java.lang.Integer superChapterId, @org.jetbrains.annotations.Nullable
    java.lang.String superChapterName, @org.jetbrains.annotations.Nullable
    java.util.List<com.zoe.wan.android.repository.data.HomeListTag> tags, @org.jetbrains.annotations.Nullable
    java.lang.String title, @org.jetbrains.annotations.Nullable
    java.lang.Integer type, @org.jetbrains.annotations.Nullable
    java.lang.Integer userId, @org.jetbrains.annotations.Nullable
    java.lang.Integer visible, @org.jetbrains.annotations.Nullable
    java.lang.Integer zan) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getAdminAdd() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getApkLink() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getAudit() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAuthor() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getCanEdit() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getChapterId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getChapterName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getCollect() {
        return null;
    }
    
    public final void setCollect(@org.jetbrains.annotations.Nullable
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getCourseId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDesc() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDescMd() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getEnvelopePic() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getFresh() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getHost() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean isAdminAdd() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLink() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getNiceDate() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getNiceShareDate() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getOrigin() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPrefix() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getProjectLink() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getPublishTime() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getRealSuperChapterId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getSelfVisible() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getShareDate() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getShareUser() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getSuperChapterId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSuperChapterName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.zoe.wan.android.repository.data.HomeListTag> getTags() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getUserId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getVisible() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getZan() {
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
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component24() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component25() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long component26() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component27() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component28() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component29() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.zoe.wan.android.repository.data.HomeListTag> component30() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component31() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component32() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component33() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component34() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component35() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.zoe.wan.android.repository.data.HomeListItemData copy(@org.jetbrains.annotations.Nullable
    java.lang.Boolean adminAdd, @org.jetbrains.annotations.Nullable
    java.lang.String apkLink, @org.jetbrains.annotations.Nullable
    java.lang.Integer audit, @org.jetbrains.annotations.Nullable
    java.lang.String author, @org.jetbrains.annotations.Nullable
    java.lang.Boolean canEdit, @org.jetbrains.annotations.Nullable
    java.lang.Integer chapterId, @org.jetbrains.annotations.Nullable
    java.lang.String chapterName, @org.jetbrains.annotations.Nullable
    java.lang.Boolean collect, @org.jetbrains.annotations.Nullable
    java.lang.Integer courseId, @org.jetbrains.annotations.Nullable
    java.lang.String desc, @org.jetbrains.annotations.Nullable
    java.lang.String descMd, @org.jetbrains.annotations.Nullable
    java.lang.String envelopePic, @org.jetbrains.annotations.Nullable
    java.lang.Boolean fresh, @org.jetbrains.annotations.Nullable
    java.lang.String host, @org.jetbrains.annotations.Nullable
    java.lang.Integer id, @org.jetbrains.annotations.Nullable
    java.lang.Boolean isAdminAdd, @org.jetbrains.annotations.Nullable
    java.lang.String link, @org.jetbrains.annotations.Nullable
    java.lang.String niceDate, @org.jetbrains.annotations.Nullable
    java.lang.String niceShareDate, @org.jetbrains.annotations.Nullable
    java.lang.String origin, @org.jetbrains.annotations.Nullable
    java.lang.String prefix, @org.jetbrains.annotations.Nullable
    java.lang.String projectLink, @org.jetbrains.annotations.Nullable
    java.lang.Long publishTime, @org.jetbrains.annotations.Nullable
    java.lang.Integer realSuperChapterId, @org.jetbrains.annotations.Nullable
    java.lang.Integer selfVisible, @org.jetbrains.annotations.Nullable
    java.lang.Long shareDate, @org.jetbrains.annotations.Nullable
    java.lang.String shareUser, @org.jetbrains.annotations.Nullable
    java.lang.Integer superChapterId, @org.jetbrains.annotations.Nullable
    java.lang.String superChapterName, @org.jetbrains.annotations.Nullable
    java.util.List<com.zoe.wan.android.repository.data.HomeListTag> tags, @org.jetbrains.annotations.Nullable
    java.lang.String title, @org.jetbrains.annotations.Nullable
    java.lang.Integer type, @org.jetbrains.annotations.Nullable
    java.lang.Integer userId, @org.jetbrains.annotations.Nullable
    java.lang.Integer visible, @org.jetbrains.annotations.Nullable
    java.lang.Integer zan) {
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