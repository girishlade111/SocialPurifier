package t3;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class d0 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l0 f19941a;
    public final /* synthetic */ d1 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d1 f19942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f19943d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f19944e;

    public d0(l0 l0Var, d1 d1Var, d1 d1Var2, int i2, View view) {
        this.f19941a = l0Var;
        this.b = d1Var;
        this.f19942c = d1Var2;
        this.f19943d = i2;
        this.f19944e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        s0 o0Var;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        l0 l0Var = this.f19941a;
        k0 k0Var = l0Var.f19967a;
        k0Var.c(animatedFraction);
        float fB = k0Var.b();
        PathInterpolator pathInterpolator = g0.f19954d;
        int i2 = Build.VERSION.SDK_INT;
        d1 d1Var = this.b;
        if (i2 >= 34) {
            o0Var = new r0(d1Var);
        } else if (i2 >= 31) {
            o0Var = new q0(d1Var);
        } else if (i2 >= 30) {
            o0Var = new p0(d1Var);
        } else {
            o0Var = i2 >= 29 ? new o0(d1Var) : new m0(d1Var);
        }
        int i10 = 1;
        while (i10 <= 512) {
            int i11 = this.f19943d & i10;
            a1 a1Var = d1Var.f19945a;
            if (i11 == 0) {
                o0Var.c(i10, a1Var.f(i10));
            } else {
                n3.b bVarF = a1Var.f(i10);
                n3.b bVarF2 = this.f19942c.f19945a.f(i10);
                int i12 = bVarF.f15129a;
                int i13 = bVarF.f15131d;
                int i14 = bVarF.f15130c;
                int i15 = bVarF.b;
                float f10 = 1.0f - fB;
                int i16 = (int) (((double) ((i12 - bVarF2.f15129a) * f10)) + 0.5d);
                int i17 = (int) (((double) ((i15 - bVarF2.b) * f10)) + 0.5d);
                int i18 = (int) (((double) ((i14 - bVarF2.f15130c) * f10)) + 0.5d);
                int i19 = (int) (((double) ((i13 - bVarF2.f15131d) * f10)) + 0.5d);
                int iMax = Math.max(0, i12 - i16);
                int iMax2 = Math.max(0, i15 - i17);
                int iMax3 = Math.max(0, i14 - i18);
                int iMax4 = Math.max(0, i13 - i19);
                o0Var.c(i10, (iMax == i16 && iMax2 == i17 && iMax3 == i18 && iMax4 == i19) ? bVarF : n3.b.b(iMax, iMax2, iMax3, iMax4));
            }
            i10 <<= 1;
            l0Var = l0Var;
            d1Var = d1Var;
            fB = fB;
        }
        d1 d1VarB = o0Var.b();
        Collections.singletonList(l0Var);
        g0.f(this.f19944e, d1VarB);
    }
}
