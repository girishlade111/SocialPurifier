package y8;

import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f23631a = new f();

    /* JADX WARN: Code duplicated, block: B:23:0x004b  */
    /* JADX WARN: Code duplicated, block: B:31:0x005e A[Catch: all -> 0x00cf, TRY_LEAVE, TryCatch #5 {all -> 0x00cf, blocks: (B:5:0x000f, B:7:0x0013, B:19:0x0037, B:21:0x0040, B:31:0x005e, B:41:0x007c, B:51:0x0099, B:65:0x00c8, B:49:0x0093, B:39:0x0076, B:29:0x0058, B:17:0x0031, B:11:0x001f, B:14:0x0029, B:44:0x0089, B:34:0x006b, B:24:0x004d, B:54:0x00a5, B:57:0x00af, B:59:0x00b5, B:62:0x00bc), top: B:85:0x000f, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0069  */
    /* JADX WARN: Code duplicated, block: B:37:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x007c A[Catch: all -> 0x00cf, TRY_LEAVE, TryCatch #5 {all -> 0x00cf, blocks: (B:5:0x000f, B:7:0x0013, B:19:0x0037, B:21:0x0040, B:31:0x005e, B:41:0x007c, B:51:0x0099, B:65:0x00c8, B:49:0x0093, B:39:0x0076, B:29:0x0058, B:17:0x0031, B:11:0x001f, B:14:0x0029, B:44:0x0089, B:34:0x006b, B:24:0x004d, B:54:0x00a5, B:57:0x00af, B:59:0x00b5, B:62:0x00bc), top: B:85:0x000f, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0087  */
    /* JADX WARN: Code duplicated, block: B:47:0x0090  */
    /* JADX WARN: Code duplicated, block: B:51:0x0099 A[Catch: all -> 0x00cf, TRY_LEAVE, TryCatch #5 {all -> 0x00cf, blocks: (B:5:0x000f, B:7:0x0013, B:19:0x0037, B:21:0x0040, B:31:0x005e, B:41:0x007c, B:51:0x0099, B:65:0x00c8, B:49:0x0093, B:39:0x0076, B:29:0x0058, B:17:0x0031, B:11:0x001f, B:14:0x0029, B:44:0x0089, B:34:0x006b, B:24:0x004d, B:54:0x00a5, B:57:0x00af, B:59:0x00b5, B:62:0x00bc), top: B:85:0x000f, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:57:0x00af A[Catch: all -> 0x00c7, TryCatch #4 {all -> 0x00c7, blocks: (B:54:0x00a5, B:57:0x00af, B:59:0x00b5, B:62:0x00bc), top: B:83:0x00a5, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00b5 A[Catch: all -> 0x00c7, TryCatch #4 {all -> 0x00c7, blocks: (B:54:0x00a5, B:57:0x00af, B:59:0x00b5, B:62:0x00bc), top: B:83:0x00a5, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0089 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x00a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    public static final boolean b(View view) {
        boolean z10;
        boolean z11;
        TextView textView;
        boolean z12;
        TextView textView2;
        boolean z13;
        TextView textView3;
        String strJ;
        boolean zMatches;
        f fVar = f23631a;
        Set set = p9.a.f16774a;
        if (set.contains(f.class)) {
            return false;
        }
        try {
            if (!(view instanceof TextView)) {
                return false;
            }
            TextView textView4 = (TextView) view;
            if (set.contains(fVar)) {
                z10 = false;
            } else {
                try {
                    z10 = textView4.getInputType() == 128 ? true : textView4.getTransformationMethod() instanceof PasswordTransformationMethod;
                } catch (Throwable th) {
                    p9.a.a(th, fVar);
                    z10 = false;
                }
            }
            if (!z10 && !fVar.a((TextView) view)) {
                TextView textView5 = (TextView) view;
                if (p9.a.f16774a.contains(fVar)) {
                    z11 = false;
                    if (!z11) {
                        textView = (TextView) view;
                        if (p9.a.f16774a.contains(fVar)) {
                            z12 = false;
                            if (!z12) {
                                textView2 = (TextView) view;
                                if (p9.a.f16774a.contains(fVar)) {
                                    z13 = false;
                                    if (!z13) {
                                        textView3 = (TextView) view;
                                        if (p9.a.f16774a.contains(fVar)) {
                                            zMatches = false;
                                        } else {
                                            try {
                                                if (textView3.getInputType() == 32) {
                                                    zMatches = true;
                                                } else {
                                                    strJ = g.j(textView3);
                                                    if (strJ != null || strJ.length() == 0) {
                                                        zMatches = false;
                                                    } else {
                                                        zMatches = Patterns.EMAIL_ADDRESS.matcher(strJ).matches();
                                                    }
                                                }
                                            } catch (Throwable th2) {
                                                p9.a.a(th2, fVar);
                                            }
                                        }
                                        if (!zMatches) {
                                            return false;
                                        }
                                    }
                                } else {
                                    try {
                                        if (textView2.getInputType() == 3) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                    } catch (Throwable th3) {
                                        p9.a.a(th3, fVar);
                                    }
                                    if (!z13) {
                                        textView3 = (TextView) view;
                                        if (p9.a.f16774a.contains(fVar)) {
                                            zMatches = false;
                                        } else if (textView3.getInputType() == 32) {
                                            zMatches = true;
                                        } else {
                                            strJ = g.j(textView3);
                                            if (strJ != null) {
                                                zMatches = false;
                                            } else {
                                                zMatches = false;
                                            }
                                        }
                                        if (!zMatches) {
                                            return false;
                                        }
                                    }
                                }
                            }
                        } else {
                            try {
                                if (textView.getInputType() == 112) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                            } catch (Throwable th4) {
                                p9.a.a(th4, fVar);
                            }
                            if (!z12) {
                                textView2 = (TextView) view;
                                if (p9.a.f16774a.contains(fVar)) {
                                    z13 = false;
                                    if (!z13) {
                                        textView3 = (TextView) view;
                                        if (p9.a.f16774a.contains(fVar)) {
                                            zMatches = false;
                                        } else if (textView3.getInputType() == 32) {
                                            zMatches = true;
                                        } else {
                                            strJ = g.j(textView3);
                                            if (strJ != null) {
                                                zMatches = false;
                                            } else {
                                                zMatches = false;
                                            }
                                        }
                                        if (!zMatches) {
                                            return false;
                                        }
                                    }
                                } else {
                                    if (textView2.getInputType() == 3) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    if (!z13) {
                                        textView3 = (TextView) view;
                                        if (p9.a.f16774a.contains(fVar)) {
                                            zMatches = false;
                                        } else if (textView3.getInputType() == 32) {
                                            zMatches = true;
                                        } else {
                                            strJ = g.j(textView3);
                                            if (strJ != null) {
                                                zMatches = false;
                                            } else {
                                                zMatches = false;
                                            }
                                        }
                                        if (!zMatches) {
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    try {
                        if (textView5.getInputType() == 96) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    } catch (Throwable th5) {
                        p9.a.a(th5, fVar);
                    }
                    if (!z11) {
                        textView = (TextView) view;
                        if (p9.a.f16774a.contains(fVar)) {
                            z12 = false;
                            if (!z12) {
                                textView2 = (TextView) view;
                                if (p9.a.f16774a.contains(fVar)) {
                                    z13 = false;
                                    if (!z13) {
                                        textView3 = (TextView) view;
                                        if (p9.a.f16774a.contains(fVar)) {
                                            zMatches = false;
                                        } else if (textView3.getInputType() == 32) {
                                            zMatches = true;
                                        } else {
                                            strJ = g.j(textView3);
                                            if (strJ != null) {
                                                zMatches = false;
                                            } else {
                                                zMatches = false;
                                            }
                                        }
                                        if (!zMatches) {
                                            return false;
                                        }
                                    }
                                } else {
                                    if (textView2.getInputType() == 3) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    if (!z13) {
                                        textView3 = (TextView) view;
                                        if (p9.a.f16774a.contains(fVar)) {
                                            zMatches = false;
                                        } else if (textView3.getInputType() == 32) {
                                            zMatches = true;
                                        } else {
                                            strJ = g.j(textView3);
                                            if (strJ != null) {
                                                zMatches = false;
                                            } else {
                                                zMatches = false;
                                            }
                                        }
                                        if (!zMatches) {
                                            return false;
                                        }
                                    }
                                }
                            }
                        } else {
                            if (textView.getInputType() == 112) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (!z12) {
                                textView2 = (TextView) view;
                                if (p9.a.f16774a.contains(fVar)) {
                                    z13 = false;
                                    if (!z13) {
                                        textView3 = (TextView) view;
                                        if (p9.a.f16774a.contains(fVar)) {
                                            zMatches = false;
                                        } else if (textView3.getInputType() == 32) {
                                            zMatches = true;
                                        } else {
                                            strJ = g.j(textView3);
                                            if (strJ != null) {
                                                zMatches = false;
                                            } else {
                                                zMatches = false;
                                            }
                                        }
                                        if (!zMatches) {
                                            return false;
                                        }
                                    }
                                } else {
                                    if (textView2.getInputType() == 3) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    if (!z13) {
                                        textView3 = (TextView) view;
                                        if (p9.a.f16774a.contains(fVar)) {
                                            zMatches = false;
                                        } else if (textView3.getInputType() == 32) {
                                            zMatches = true;
                                        } else {
                                            strJ = g.j(textView3);
                                            if (strJ != null) {
                                                zMatches = false;
                                            } else {
                                                zMatches = false;
                                            }
                                        }
                                        if (!zMatches) {
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return true;
        } catch (Throwable th6) {
            p9.a.a(th6, f.class);
            return false;
        }
    }

    public final boolean a(TextView textView) {
        int i2;
        if (p9.a.f16774a.contains(this)) {
            return false;
        }
        try {
            String strJ = g.j(textView);
            Pattern patternCompile = Pattern.compile("\\s");
            patternCompile.getClass();
            strJ.getClass();
            String strReplaceAll = patternCompile.matcher(strJ).replaceAll("");
            strReplaceAll.getClass();
            int length = strReplaceAll.length();
            if (length >= 12 && length <= 19) {
                int i10 = length - 1;
                if (i10 >= 0) {
                    boolean z10 = false;
                    i2 = 0;
                    while (true) {
                        int i11 = i10 - 1;
                        char cCharAt = strReplaceAll.charAt(i10);
                        if (!Character.isDigit(cCharAt)) {
                            return false;
                        }
                        int iDigit = Character.digit((int) cCharAt, 10);
                        if (iDigit < 0) {
                            throw new IllegalArgumentException("Char " + cCharAt + " is not a decimal digit");
                        }
                        if (z10 && (iDigit = iDigit * 2) > 9) {
                            iDigit = (iDigit % 10) + 1;
                        }
                        i2 += iDigit;
                        z10 = !z10;
                        if (i11 < 0) {
                            break;
                        }
                        i10 = i11;
                    }
                } else {
                    i2 = 0;
                }
                if (i2 % 10 == 0) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            p9.a.a(th, this);
            return false;
        }
    }
}
