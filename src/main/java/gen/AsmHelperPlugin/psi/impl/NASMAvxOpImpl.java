// This is a generated file. Not intended for manual editing.
package gen.AsmHelperPlugin.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import gen.AsmHelperPlugin.psi.NASMAvxOp;
import gen.AsmHelperPlugin.psi.NASMTypes;
import gen.AsmHelperPlugin.psi.NASMVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class NASMAvxOpImpl extends ASTWrapperPsiElement implements NASMAvxOp {

    public NASMAvxOpImpl(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull NASMVisitor visitor) {
        visitor.visitAvxOp(this);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof NASMVisitor) accept((NASMVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public PsiElement getInsAvxAes() {
        return findChildByType(NASMTypes.INS_AVX_AES);
    }

    @Override
    @Nullable
    public PsiElement getInsAvxArith() {
        return findChildByType(NASMTypes.INS_AVX_ARITH);
    }

    @Override
    @Nullable
    public PsiElement getInsAvxBlend() {
        return findChildByType(NASMTypes.INS_AVX_BLEND);
    }

    @Override
    @Nullable
    public PsiElement getInsAvxCache() {
        return findChildByType(NASMTypes.INS_AVX_CACHE);
    }

    @Override
    @Nullable
    public PsiElement getInsAvxComparison() {
        return findChildByType(NASMTypes.INS_AVX_COMPARISON);
    }

    @Override
    @Nullable
    public PsiElement getInsAvxConversion() {
        return findChildByType(NASMTypes.INS_AVX_CONVERSION);
    }

    @Override
    @Nullable
    public PsiElement getInsAvxFma3() {
        return findChildByType(NASMTypes.INS_AVX_FMA3);
    }

    @Override
    @Nullable
    public PsiElement getInsAvxGeneral() {
        return findChildByType(NASMTypes.INS_AVX_GENERAL);
    }

    @Override
    @Nullable
    public PsiElement getInsAvxLogical() {
        return findChildByType(NASMTypes.INS_AVX_LOGICAL);
    }

    @Override
    @Nullable
    public PsiElement getInsAvxMov() {
        return findChildByType(NASMTypes.INS_AVX_MOV);
    }

    @Override
    @Nullable
    public PsiElement getInsAvxOther() {
        return findChildByType(NASMTypes.INS_AVX_OTHER);
    }

    @Override
    @Nullable
    public PsiElement getInsAvxPacked() {
        return findChildByType(NASMTypes.INS_AVX_PACKED);
    }

}
