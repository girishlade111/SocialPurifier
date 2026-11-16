package m;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class t extends ViewGroup {
    public boolean A;
    public int[] B;
    public int[] C;
    public Drawable D;
    public int E;
    public int F;
    public int G;
    public int H;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f10215t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f10216u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f10217v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f10218w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f10219x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f10220y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f10221z;

    public t(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, 0);
        this.f10215t = true;
        this.f10216u = -1;
        this.f10217v = 0;
        this.f10219x = 8388659;
        int[] iArr = j.a.f8563f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        t3.a0.a(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(1, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i10 = typedArrayObtainStyledAttributes.getInt(0, -1);
        if (i10 >= 0) {
            setGravity(i10);
        }
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(2, true);
        if (!z10) {
            setBaselineAligned(z10);
        }
        this.f10221z = typedArrayObtainStyledAttributes.getFloat(4, -1.0f);
        this.f10216u = typedArrayObtainStyledAttributes.getInt(3, -1);
        this.A = typedArrayObtainStyledAttributes.getBoolean(7, false);
        setDividerDrawable((!typedArrayObtainStyledAttributes.hasValue(5) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(5, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(5) : c.a.m(context, resourceId));
        this.G = typedArrayObtainStyledAttributes.getInt(8, 0);
        this.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a(Canvas canvas, int i2) {
        this.D.setBounds(getPaddingLeft() + this.H, i2, (getWidth() - getPaddingRight()) - this.H, this.F + i2);
        this.D.draw(canvas);
    }

    public final void b(Canvas canvas, int i2) {
        this.D.setBounds(i2, getPaddingTop() + this.H, this.E + i2, (getHeight() - getPaddingBottom()) - this.H);
        this.D.draw(canvas);
    }

    public final boolean c(int i2) {
        if (i2 == 0) {
            return (this.G & 1) != 0;
        }
        int childCount = getChildCount();
        int i10 = this.G;
        if (i2 == childCount) {
            return (i10 & 4) != 0;
        }
        if ((i10 & 2) != 0) {
            for (int i11 = i2 - 1; i11 >= 0; i11--) {
                if (getChildAt(i11).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof s;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        int i2 = this.f10218w;
        if (i2 == 0) {
            return new s(-2, -2);
        }
        if (i2 == 1) {
            return new s(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof s) {
            return new s((s) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new s((ViewGroup.MarginLayoutParams) layoutParams) : new s(layoutParams);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i2;
        if (this.f10216u < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i10 = this.f10216u;
        if (childCount <= i10) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i10);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f10216u == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f10217v;
        if (this.f10218w == 1 && (i2 = this.f10219x & 112) != 48) {
            if (i2 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f10220y) / 2;
            } else if (i2 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f10220y;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((s) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f10216u;
    }

    public Drawable getDividerDrawable() {
        return this.D;
    }

    public int getDividerPadding() {
        return this.H;
    }

    public int getDividerWidth() {
        return this.E;
    }

    public int getGravity() {
        return this.f10219x;
    }

    public int getOrientation() {
        return this.f10218w;
    }

    public int getShowDividers() {
        return this.G;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f10221z;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i2;
        int bottom;
        if (this.D == null) {
            return;
        }
        int i10 = 0;
        if (this.f10218w == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i10 < virtualChildCount) {
                View childAt = getChildAt(i10);
                if (childAt != null && childAt.getVisibility() != 8 && c(i10)) {
                    a(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((s) childAt.getLayoutParams())).topMargin) - this.F);
                }
                i10++;
            }
            if (c(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                if (childAt2 == null) {
                    bottom = (getHeight() - getPaddingBottom()) - this.F;
                } else {
                    bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((s) childAt2.getLayoutParams())).bottomMargin;
                }
                a(canvas, bottom);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z10 = c0.f10182a;
        boolean z11 = getLayoutDirection() == 1;
        while (i10 < virtualChildCount2) {
            View childAt3 = getChildAt(i10);
            if (childAt3 != null && childAt3.getVisibility() != 8 && c(i10)) {
                s sVar = (s) childAt3.getLayoutParams();
                b(canvas, z11 ? childAt3.getRight() + ((LinearLayout.LayoutParams) sVar).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) sVar).leftMargin) - this.E);
            }
            i10++;
        }
        if (c(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                s sVar2 = (s) childAt4.getLayoutParams();
                if (z11) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) sVar2).leftMargin;
                    i2 = this.E;
                    right = left - i2;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) sVar2).rightMargin;
                }
            } else if (z11) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i2 = this.E;
                right = left - i2;
            }
            b(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Code duplicated, block: B:229:0x04de  */
    /* JADX WARN: Code duplicated, block: B:232:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:234:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:236:0x0500  */
    /* JADX WARN: Code duplicated, block: B:238:0x0521  */
    /* JADX WARN: Code duplicated, block: B:244:0x0531  */
    /* JADX WARN: Code duplicated, block: B:247:0x0538 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:249:0x053b  */
    /* JADX WARN: Code duplicated, block: B:251:0x0542 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:253:0x0545  */
    /* JADX WARN: Code duplicated, block: B:368:0x0793  */
    /* JADX WARN: Code duplicated, block: B:64:0x013f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x0142  */
    /* JADX WARN: Code duplicated, block: B:68:0x0148 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x014b  */
    @Override // android.view.View
    public void onMeasure(int i2, int i10) {
        int i11;
        int i12;
        int i13;
        int iMax;
        int i14;
        int baseline;
        int i15;
        int i16;
        int[] iArr;
        int i17;
        int i18;
        boolean z10;
        boolean z11;
        s sVar;
        View view;
        int i19;
        int[] iArr2;
        int i20;
        int i21;
        boolean z12;
        int i22;
        int measuredHeight;
        boolean z13;
        boolean z14;
        int iMax2;
        int i23;
        int baseline2;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        boolean z15;
        int i29;
        int i30;
        int i31;
        View view2;
        boolean z16;
        t tVar = this;
        int i32 = -2;
        int iMax3 = 0;
        int i33 = 1073741824;
        int i34 = 8;
        if (tVar.f10218w == 1) {
            tVar.f10220y = 0;
            int virtualChildCount = tVar.getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i10);
            int i35 = tVar.f10216u;
            boolean z17 = tVar.A;
            int i36 = 0;
            int iMax4 = 0;
            int iMax5 = 0;
            boolean z18 = false;
            int i37 = 0;
            boolean z19 = false;
            boolean z20 = true;
            float f10 = 0.0f;
            int iMax6 = 0;
            while (i36 < virtualChildCount) {
                int i38 = mode;
                View childAt = tVar.getChildAt(i36);
                if (childAt == null) {
                    tVar.f10220y = tVar.f10220y;
                } else {
                    if (childAt.getVisibility() != i34) {
                        if (tVar.c(i36)) {
                            tVar.f10220y += tVar.F;
                        }
                        s sVar2 = (s) childAt.getLayoutParams();
                        float f11 = ((LinearLayout.LayoutParams) sVar2).weight;
                        f10 += f11;
                        if (mode2 == i33 && ((LinearLayout.LayoutParams) sVar2).height == 0 && f11 > 0.0f) {
                            int i39 = tVar.f10220y;
                            tVar.f10220y = Math.max(i39, ((LinearLayout.LayoutParams) sVar2).topMargin + i39 + ((LinearLayout.LayoutParams) sVar2).bottomMargin);
                            view2 = childAt;
                            i28 = mode2;
                            i29 = i35;
                            z15 = z17;
                            i30 = i36;
                            z18 = true;
                            i31 = i38;
                        } else {
                            if (((LinearLayout.LayoutParams) sVar2).height != 0 || f11 <= 0.0f) {
                                i27 = Integer.MIN_VALUE;
                            } else {
                                ((LinearLayout.LayoutParams) sVar2).height = i32;
                                i27 = 0;
                            }
                            i28 = mode2;
                            z15 = z17;
                            i29 = i35;
                            i30 = i36;
                            i31 = i38;
                            tVar.measureChildWithMargins(childAt, i2, 0, i10, f10 == 0.0f ? tVar.f10220y : 0);
                            if (i27 != Integer.MIN_VALUE) {
                                ((LinearLayout.LayoutParams) sVar2).height = i27;
                            }
                            int measuredHeight2 = childAt.getMeasuredHeight();
                            int i40 = tVar.f10220y;
                            view2 = childAt;
                            tVar.f10220y = Math.max(i40, i40 + measuredHeight2 + ((LinearLayout.LayoutParams) sVar2).topMargin + ((LinearLayout.LayoutParams) sVar2).bottomMargin);
                            if (z15) {
                                iMax6 = Math.max(measuredHeight2, iMax6);
                            }
                        }
                        if (i29 >= 0 && i29 == i30 + 1) {
                            tVar.f10217v = tVar.f10220y;
                        }
                        if (i30 < i29 && ((LinearLayout.LayoutParams) sVar2).weight > 0.0f) {
                            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        }
                        if (i31 == 1073741824 || ((LinearLayout.LayoutParams) sVar2).width != -1) {
                            z16 = false;
                        } else {
                            z16 = true;
                            z19 = true;
                        }
                        int i41 = ((LinearLayout.LayoutParams) sVar2).leftMargin + ((LinearLayout.LayoutParams) sVar2).rightMargin;
                        int measuredWidth = view2.getMeasuredWidth() + i41;
                        iMax3 = Math.max(iMax3, measuredWidth);
                        int measuredState = view2.getMeasuredState();
                        boolean z21 = z16;
                        int iCombineMeasuredStates = View.combineMeasuredStates(i37, measuredState);
                        if (z20) {
                            i37 = iCombineMeasuredStates;
                            boolean z22 = ((LinearLayout.LayoutParams) sVar2).width == -1;
                            if (((LinearLayout.LayoutParams) sVar2).weight > 0.0f) {
                                if (!z21) {
                                    i41 = measuredWidth;
                                }
                                iMax5 = Math.max(iMax5, i41);
                            } else {
                                if (!z21) {
                                    i41 = measuredWidth;
                                }
                                iMax4 = Math.max(iMax4, i41);
                            }
                            z20 = z22;
                        } else {
                            i37 = iCombineMeasuredStates;
                        }
                        if (((LinearLayout.LayoutParams) sVar2).weight > 0.0f) {
                            if (!z21) {
                                i41 = measuredWidth;
                            }
                            iMax5 = Math.max(iMax5, i41);
                        } else {
                            if (!z21) {
                                i41 = measuredWidth;
                            }
                            iMax4 = Math.max(iMax4, i41);
                        }
                        z20 = z22;
                    }
                    i36 = i30 + 1;
                    i35 = i29;
                    mode = i31;
                    z17 = z15;
                    mode2 = i28;
                    i32 = -2;
                    i33 = 1073741824;
                    i34 = 8;
                }
                i28 = mode2;
                i29 = i35;
                z15 = z17;
                i30 = i36;
                i31 = i38;
                i36 = i30 + 1;
                i35 = i29;
                mode = i31;
                z17 = z15;
                mode2 = i28;
                i32 = -2;
                i33 = 1073741824;
                i34 = 8;
            }
            int i42 = mode;
            int i43 = mode2;
            boolean z23 = z17;
            int i44 = i37;
            int i45 = i10;
            if (tVar.f10220y > 0 && tVar.c(virtualChildCount)) {
                tVar.f10220y += tVar.F;
            }
            if (z23 && (i43 == Integer.MIN_VALUE || i43 == 0)) {
                tVar.f10220y = 0;
                for (int i46 = 0; i46 < virtualChildCount; i46++) {
                    View childAt2 = tVar.getChildAt(i46);
                    if (childAt2 == null) {
                        tVar.f10220y = tVar.f10220y;
                    } else if (childAt2.getVisibility() != 8) {
                        s sVar3 = (s) childAt2.getLayoutParams();
                        int i47 = tVar.f10220y;
                        tVar.f10220y = Math.max(i47, i47 + iMax6 + ((LinearLayout.LayoutParams) sVar3).topMargin + ((LinearLayout.LayoutParams) sVar3).bottomMargin);
                    }
                }
            }
            int paddingBottom = tVar.getPaddingBottom() + tVar.getPaddingTop() + tVar.f10220y;
            tVar.f10220y = paddingBottom;
            int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, tVar.getSuggestedMinimumHeight()), i45, 0);
            int i48 = (iResolveSizeAndState & 16777215) - tVar.f10220y;
            if (z18 || (i48 != 0 && f10 > 0.0f)) {
                float f12 = tVar.f10221z;
                if (f12 > 0.0f) {
                    f10 = f12;
                }
                tVar.f10220y = 0;
                int iCombineMeasuredStates2 = i44;
                int i49 = 0;
                while (i49 < virtualChildCount) {
                    View childAt3 = tVar.getChildAt(i49);
                    if (childAt3.getVisibility() == 8) {
                        i49 = i49;
                    } else {
                        s sVar4 = (s) childAt3.getLayoutParams();
                        float f13 = ((LinearLayout.LayoutParams) sVar4).weight;
                        if (f13 > 0.0f) {
                            int i50 = (int) ((i48 * f13) / f10);
                            f10 -= f13;
                            i48 -= i50;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, tVar.getPaddingRight() + tVar.getPaddingLeft() + ((LinearLayout.LayoutParams) sVar4).leftMargin + ((LinearLayout.LayoutParams) sVar4).rightMargin, ((LinearLayout.LayoutParams) sVar4).width);
                            if (((LinearLayout.LayoutParams) sVar4).height == 0) {
                                i26 = 1073741824;
                                if (i43 == 1073741824) {
                                    if (i50 <= 0) {
                                        i50 = 0;
                                    }
                                    childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i50, 1073741824));
                                }
                                iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                            } else {
                                i26 = 1073741824;
                            }
                            int measuredHeight3 = childAt3.getMeasuredHeight() + i50;
                            if (measuredHeight3 < 0) {
                                measuredHeight3 = 0;
                            }
                            childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight3, i26));
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                        }
                        int i51 = ((LinearLayout.LayoutParams) sVar4).leftMargin + ((LinearLayout.LayoutParams) sVar4).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i51;
                        iMax3 = Math.max(iMax3, measuredWidth2);
                        if (i42 != 1073741824) {
                            i25 = -1;
                            if (((LinearLayout.LayoutParams) sVar4).width == -1) {
                                measuredWidth2 = i51;
                            }
                        } else {
                            i25 = -1;
                        }
                        iMax4 = Math.max(iMax4, measuredWidth2);
                        boolean z24 = z20 && ((LinearLayout.LayoutParams) sVar4).width == i25;
                        int i52 = tVar.f10220y;
                        tVar.f10220y = Math.max(i52, childAt3.getMeasuredHeight() + i52 + ((LinearLayout.LayoutParams) sVar4).topMargin + ((LinearLayout.LayoutParams) sVar4).bottomMargin);
                        z20 = z24;
                    }
                    i49++;
                }
                tVar.f10220y = tVar.getPaddingBottom() + tVar.getPaddingTop() + tVar.f10220y;
                i44 = iCombineMeasuredStates2;
            } else {
                iMax4 = Math.max(iMax4, iMax5);
                if (z23 && i43 != 1073741824) {
                    for (int i53 = 0; i53 < virtualChildCount; i53++) {
                        View childAt4 = tVar.getChildAt(i53);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((s) childAt4.getLayoutParams())).weight > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(iMax6, 1073741824));
                        }
                    }
                }
            }
            if (z20 || i42 == 1073741824) {
                iMax4 = iMax3;
            }
            tVar.setMeasuredDimension(View.resolveSizeAndState(Math.max(tVar.getPaddingRight() + tVar.getPaddingLeft() + iMax4, tVar.getSuggestedMinimumWidth()), i2, i44), iResolveSizeAndState);
            if (z19) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(tVar.getMeasuredWidth(), 1073741824);
                int i54 = 0;
                while (i54 < virtualChildCount) {
                    View childAt5 = tVar.getChildAt(i54);
                    if (childAt5.getVisibility() != 8) {
                        s sVar5 = (s) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) sVar5).width == -1) {
                            int i55 = ((LinearLayout.LayoutParams) sVar5).height;
                            ((LinearLayout.LayoutParams) sVar5).height = childAt5.getMeasuredHeight();
                            tVar.measureChildWithMargins(childAt5, iMakeMeasureSpec, 0, i45, 0);
                            ((LinearLayout.LayoutParams) sVar5).height = i55;
                        }
                    }
                    i54++;
                    i45 = i10;
                }
                return;
            }
            return;
        }
        int i56 = i2;
        tVar.f10220y = 0;
        int virtualChildCount2 = tVar.getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i56);
        int mode4 = View.MeasureSpec.getMode(i10);
        if (tVar.B == null || tVar.C == null) {
            tVar.B = new int[4];
            tVar.C = new int[4];
        }
        int[] iArr3 = tVar.B;
        int[] iArr4 = tVar.C;
        iArr3[3] = -1;
        char c10 = 2;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z25 = tVar.f10215t;
        boolean z26 = tVar.A;
        boolean z27 = mode3 == 1073741824;
        float f14 = 0.0f;
        boolean z28 = true;
        int i57 = 0;
        int i58 = 0;
        int i59 = 0;
        int iMax7 = 0;
        int iMax8 = 0;
        int iCombineMeasuredStates3 = 0;
        boolean z29 = false;
        boolean z30 = false;
        while (i57 < virtualChildCount2) {
            char c11 = c10;
            View childAt6 = tVar.getChildAt(i57);
            if (childAt6 == null) {
                tVar.f10220y = tVar.f10220y;
                i18 = i57;
                i23 = i59;
                iArr2 = iArr3;
                iArr = iArr4;
                z10 = z25;
                z11 = z26;
            } else {
                int i60 = i58;
                if (childAt6.getVisibility() == 8) {
                    i56 = i2;
                    i18 = i57;
                    i23 = i59;
                    iArr = iArr4;
                    z10 = z25;
                    z11 = z26;
                    i58 = i60;
                    iArr2 = iArr3;
                } else {
                    if (tVar.c(i57)) {
                        tVar.f10220y += tVar.E;
                    }
                    s sVar6 = (s) childAt6.getLayoutParams();
                    float f15 = ((LinearLayout.LayoutParams) sVar6).weight;
                    f14 += f15;
                    int i61 = i57;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) sVar6).width == 0 && f15 > 0.0f) {
                        int i62 = tVar.f10220y;
                        int i63 = ((LinearLayout.LayoutParams) sVar6).leftMargin;
                        if (z27) {
                            tVar.f10220y = i63 + ((LinearLayout.LayoutParams) sVar6).rightMargin + i62;
                        } else {
                            tVar.f10220y = Math.max(i62, i62 + i63 + ((LinearLayout.LayoutParams) sVar6).rightMargin);
                        }
                        if (z25) {
                            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(iMakeMeasureSpec2, iMakeMeasureSpec2);
                            view = childAt6;
                            z10 = z25;
                            z11 = z26;
                            i19 = i60;
                            i18 = i61;
                            sVar = sVar6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i56 = i2;
                            i20 = i59;
                            i17 = iMax7;
                        } else {
                            view = childAt6;
                            z10 = z25;
                            z11 = z26;
                            z30 = true;
                            i19 = i60;
                            i18 = i61;
                            i21 = 1073741824;
                            sVar = sVar6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i56 = i2;
                            i20 = i59;
                            i17 = iMax7;
                        }
                        if (mode4 == i21 && ((LinearLayout.LayoutParams) sVar).height == -1) {
                            z12 = true;
                            z29 = true;
                        } else {
                            z12 = false;
                        }
                        i22 = ((LinearLayout.LayoutParams) sVar).topMargin + ((LinearLayout.LayoutParams) sVar).bottomMargin;
                        measuredHeight = view.getMeasuredHeight() + i22;
                        iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
                        if (z10) {
                            baseline2 = view.getBaseline();
                            z13 = z12;
                            if (baseline2 != -1) {
                                i24 = ((LinearLayout.LayoutParams) sVar).gravity;
                                if (i24 < 0) {
                                    i24 = tVar.f10219x;
                                }
                                int i64 = (((i24 & 112) >> 4) & (-2)) >> 1;
                                iArr2[i64] = Math.max(iArr2[i64], baseline2);
                                iArr[i64] = Math.max(iArr[i64], measuredHeight - baseline2);
                            }
                        } else {
                            z13 = z12;
                        }
                        int iMax9 = Math.max(i19, measuredHeight);
                        if (z28 || ((LinearLayout.LayoutParams) sVar).height != -1) {
                            z14 = false;
                        } else {
                            z14 = true;
                        }
                        if (((LinearLayout.LayoutParams) sVar).weight > 0.0f) {
                            if (!z13) {
                                i22 = measuredHeight;
                            }
                            iMax7 = Math.max(i17, i22);
                            iMax2 = i20;
                        } else {
                            if (!z13) {
                                i22 = measuredHeight;
                            }
                            iMax2 = Math.max(i20, i22);
                            iMax7 = i17;
                        }
                        int i65 = iMax2;
                        i58 = iMax9;
                        i23 = i65;
                        z28 = z14;
                    } else {
                        if (((LinearLayout.LayoutParams) sVar6).width != 0 || f15 <= 0.0f) {
                            i16 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) sVar6).width = -2;
                            i16 = 0;
                        }
                        iArr = iArr4;
                        i17 = iMax7;
                        i18 = i61;
                        z10 = z25;
                        z11 = z26;
                        int i66 = i16;
                        sVar = sVar6;
                        view = childAt6;
                        i19 = i60;
                        i56 = i2;
                        iArr2 = iArr3;
                        i20 = i59;
                        tVar.measureChildWithMargins(view, i56, f14 == 0.0f ? tVar.f10220y : 0, i10, 0);
                        if (i66 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) sVar).width = i66;
                        }
                        int measuredWidth3 = view.getMeasuredWidth();
                        int i67 = tVar.f10220y;
                        int i68 = ((LinearLayout.LayoutParams) sVar).leftMargin;
                        if (z27) {
                            tVar.f10220y = i68 + measuredWidth3 + ((LinearLayout.LayoutParams) sVar).rightMargin + i67;
                        } else {
                            tVar.f10220y = Math.max(i67, i67 + measuredWidth3 + i68 + ((LinearLayout.LayoutParams) sVar).rightMargin);
                        }
                        if (z11) {
                            iMax8 = Math.max(measuredWidth3, iMax8);
                        }
                    }
                    i21 = 1073741824;
                    if (mode4 == i21) {
                        z12 = false;
                    } else {
                        z12 = false;
                    }
                    i22 = ((LinearLayout.LayoutParams) sVar).topMargin + ((LinearLayout.LayoutParams) sVar).bottomMargin;
                    measuredHeight = view.getMeasuredHeight() + i22;
                    iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
                    if (z10) {
                        baseline2 = view.getBaseline();
                        z13 = z12;
                        if (baseline2 != -1) {
                            i24 = ((LinearLayout.LayoutParams) sVar).gravity;
                            if (i24 < 0) {
                                i24 = tVar.f10219x;
                            }
                            int i69 = (((i24 & 112) >> 4) & (-2)) >> 1;
                            iArr2[i69] = Math.max(iArr2[i69], baseline2);
                            iArr[i69] = Math.max(iArr[i69], measuredHeight - baseline2);
                        }
                    } else {
                        z13 = z12;
                    }
                    int iMax10 = Math.max(i19, measuredHeight);
                    if (z28) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                    if (((LinearLayout.LayoutParams) sVar).weight > 0.0f) {
                        if (!z13) {
                            i22 = measuredHeight;
                        }
                        iMax7 = Math.max(i17, i22);
                        iMax2 = i20;
                    } else {
                        if (!z13) {
                            i22 = measuredHeight;
                        }
                        iMax2 = Math.max(i20, i22);
                        iMax7 = i17;
                    }
                    int i610 = iMax2;
                    i58 = iMax10;
                    i23 = i610;
                    z28 = z14;
                }
            }
            i59 = i23;
            i57 = i18 + 1;
            c10 = c11;
            iArr3 = iArr2;
            iArr4 = iArr;
            z25 = z10;
            z26 = z11;
        }
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        char c12 = c10;
        boolean z31 = z25;
        boolean z32 = z26;
        int i70 = i58;
        int i71 = i59;
        int i72 = iMax7;
        if (tVar.f10220y > 0 && tVar.c(virtualChildCount2)) {
            tVar.f10220y += tVar.E;
        }
        int i73 = iArr5[1];
        int iMax11 = (i73 == -1 && iArr5[0] == -1 && iArr5[c12] == -1 && iArr5[3] == -1) ? i70 : Math.max(i70, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c12]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i73, iArr5[c12]))));
        if (z32 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
            tVar.f10220y = 0;
            for (int i74 = 0; i74 < virtualChildCount2; i74++) {
                View childAt7 = tVar.getChildAt(i74);
                if (childAt7 == null) {
                    tVar.f10220y = tVar.f10220y;
                } else if (childAt7.getVisibility() != 8) {
                    s sVar7 = (s) childAt7.getLayoutParams();
                    int i75 = tVar.f10220y;
                    if (z27) {
                        tVar.f10220y = ((LinearLayout.LayoutParams) sVar7).leftMargin + iMax8 + ((LinearLayout.LayoutParams) sVar7).rightMargin + i75;
                    } else {
                        tVar.f10220y = Math.max(i75, i75 + iMax8 + ((LinearLayout.LayoutParams) sVar7).leftMargin + ((LinearLayout.LayoutParams) sVar7).rightMargin);
                    }
                }
            }
        }
        int paddingRight = tVar.getPaddingRight() + tVar.getPaddingLeft() + tVar.f10220y;
        tVar.f10220y = paddingRight;
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, tVar.getSuggestedMinimumWidth()), i56, 0);
        int i76 = (iResolveSizeAndState2 & 16777215) - tVar.f10220y;
        if (z30 || (i76 != 0 && f14 > 0.0f)) {
            float f16 = tVar.f10221z;
            if (f16 > 0.0f) {
                f14 = f16;
            }
            iArr5[3] = -1;
            iArr5[c12] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[c12] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            tVar.f10220y = 0;
            iMax11 = -1;
            int i77 = 0;
            while (i77 < virtualChildCount2) {
                View childAt8 = tVar.getChildAt(i77);
                if (childAt8 == null || childAt8.getVisibility() == 8) {
                    iResolveSizeAndState2 = iResolveSizeAndState2;
                } else {
                    s sVar8 = (s) childAt8.getLayoutParams();
                    float f17 = ((LinearLayout.LayoutParams) sVar8).weight;
                    if (f17 > 0.0f) {
                        int i78 = (int) ((i76 * f17) / f14);
                        f14 -= f17;
                        i76 -= i78;
                        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i10, tVar.getPaddingBottom() + tVar.getPaddingTop() + ((LinearLayout.LayoutParams) sVar8).topMargin + ((LinearLayout.LayoutParams) sVar8).bottomMargin, ((LinearLayout.LayoutParams) sVar8).height);
                        if (((LinearLayout.LayoutParams) sVar8).width == 0) {
                            i15 = 1073741824;
                            if (mode3 == 1073741824) {
                                if (i78 <= 0) {
                                    i78 = 0;
                                }
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(i78, 1073741824), childMeasureSpec2);
                            }
                            iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt8.getMeasuredState() & (-16777216));
                        } else {
                            i15 = 1073741824;
                        }
                        int measuredWidth4 = childAt8.getMeasuredWidth() + i78;
                        if (measuredWidth4 < 0) {
                            measuredWidth4 = 0;
                        }
                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i15), childMeasureSpec2);
                        iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt8.getMeasuredState() & (-16777216));
                    }
                    int i79 = tVar.f10220y;
                    if (z27) {
                        tVar.f10220y = childAt8.getMeasuredWidth() + ((LinearLayout.LayoutParams) sVar8).leftMargin + ((LinearLayout.LayoutParams) sVar8).rightMargin + i79;
                    } else {
                        tVar.f10220y = Math.max(i79, childAt8.getMeasuredWidth() + i79 + ((LinearLayout.LayoutParams) sVar8).leftMargin + ((LinearLayout.LayoutParams) sVar8).rightMargin);
                    }
                    boolean z33 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) sVar8).height == -1;
                    int i80 = ((LinearLayout.LayoutParams) sVar8).topMargin + ((LinearLayout.LayoutParams) sVar8).bottomMargin;
                    int measuredHeight4 = childAt8.getMeasuredHeight() + i80;
                    iMax11 = Math.max(iMax11, measuredHeight4);
                    if (!z33) {
                        i80 = measuredHeight4;
                    }
                    int iMax12 = Math.max(i71, i80);
                    if (z28) {
                        i14 = -1;
                        boolean z34 = ((LinearLayout.LayoutParams) sVar8).height == -1;
                        if (!z31 && (baseline = childAt8.getBaseline()) != i14) {
                            int i81 = ((LinearLayout.LayoutParams) sVar8).gravity;
                            if (i81 < 0) {
                                i81 = tVar.f10219x;
                            }
                            int i82 = (((i81 & 112) >> 4) & (-2)) >> 1;
                            iArr5[i82] = Math.max(iArr5[i82], baseline);
                            iArr6[i82] = Math.max(iArr6[i82], measuredHeight4 - baseline);
                        }
                        z28 = z34;
                        i71 = iMax12;
                    } else {
                        i14 = -1;
                    }
                    if (!z31) {
                    }
                    z28 = z34;
                    i71 = iMax12;
                }
                i77++;
                iResolveSizeAndState2 = iResolveSizeAndState2;
            }
            i11 = iResolveSizeAndState2;
            i12 = -16777216;
            tVar.f10220y = tVar.getPaddingRight() + tVar.getPaddingLeft() + tVar.f10220y;
            int i83 = iArr5[1];
            if (i83 == -1 && iArr5[0] == -1 && iArr5[c12] == -1 && iArr5[3] == -1) {
                i13 = 0;
            } else {
                i13 = 0;
                iMax11 = Math.max(iMax11, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c12]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i83, iArr5[c12]))));
            }
            iMax = i71;
        } else {
            iMax = Math.max(i71, i72);
            if (z32 && mode3 != 1073741824) {
                for (int i84 = 0; i84 < virtualChildCount2; i84++) {
                    View childAt9 = tVar.getChildAt(i84);
                    if (childAt9 != null && childAt9.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((s) childAt9.getLayoutParams())).weight > 0.0f) {
                        childAt9.measure(View.MeasureSpec.makeMeasureSpec(iMax8, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i11 = iResolveSizeAndState2;
            i12 = -16777216;
            i13 = 0;
        }
        if (!z28 && mode4 != 1073741824) {
            iMax11 = iMax;
        }
        tVar.setMeasuredDimension(i11 | (iCombineMeasuredStates3 & i12), View.resolveSizeAndState(Math.max(tVar.getPaddingBottom() + tVar.getPaddingTop() + iMax11, tVar.getSuggestedMinimumHeight()), i10, iCombineMeasuredStates3 << 16));
        if (z29) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(tVar.getMeasuredHeight(), 1073741824);
            int i85 = i13;
            while (i85 < virtualChildCount2) {
                View childAt10 = tVar.getChildAt(i85);
                if (childAt10.getVisibility() != 8) {
                    s sVar9 = (s) childAt10.getLayoutParams();
                    if (((LinearLayout.LayoutParams) sVar9).height == -1) {
                        int i86 = ((LinearLayout.LayoutParams) sVar9).width;
                        ((LinearLayout.LayoutParams) sVar9).width = childAt10.getMeasuredWidth();
                        tVar.measureChildWithMargins(childAt10, i56, 0, iMakeMeasureSpec3, 0);
                        ((LinearLayout.LayoutParams) sVar9).width = i86;
                    }
                }
                i85++;
                tVar = this;
                i56 = i2;
            }
        }
    }

    public void setBaselineAligned(boolean z10) {
        this.f10215t = z10;
    }

    public void setBaselineAlignedChildIndex(int i2) {
        if (i2 >= 0 && i2 < getChildCount()) {
            this.f10216u = i2;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.D) {
            return;
        }
        this.D = drawable;
        if (drawable != null) {
            this.E = drawable.getIntrinsicWidth();
            this.F = drawable.getIntrinsicHeight();
        } else {
            this.E = 0;
            this.F = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i2) {
        this.H = i2;
    }

    public void setGravity(int i2) {
        if (this.f10219x != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.f10219x = i2;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i2) {
        int i10 = i2 & 8388615;
        int i11 = this.f10219x;
        if ((8388615 & i11) != i10) {
            this.f10219x = i10 | ((-8388616) & i11);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z10) {
        this.A = z10;
    }

    public void setOrientation(int i2) {
        if (this.f10218w != i2) {
            this.f10218w = i2;
            requestLayout();
        }
    }

    public void setShowDividers(int i2) {
        if (i2 != this.G) {
            requestLayout();
        }
        this.G = i2;
    }

    public void setVerticalGravity(int i2) {
        int i10 = i2 & 112;
        int i11 = this.f10219x;
        if ((i11 & 112) != i10) {
            this.f10219x = i10 | (i11 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f10) {
        this.f10221z = Math.max(0.0f, f10);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new s(getContext(), attributeSet);
    }
}
