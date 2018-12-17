// This is a generated file. Not intended for manual editing.
package gen.AsmHelperPlugin.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import gen.AsmHelperPlugin.psi.NASMSseOp;
import gen.AsmHelperPlugin.psi.NASMTypes;
import gen.AsmHelperPlugin.psi.NASMVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class NASMSseOpImpl extends ASTWrapperPsiElement implements NASMSseOp {

    public NASMSseOpImpl(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull NASMVisitor visitor) {
        visitor.visitSseOp(this);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof NASMVisitor) accept((NASMVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public PsiElement getInsSseArith() {
        return findChildByType(NASMTypes.INS_SSE_ARITH);
    }

    @Override
    @Nullable
    public PsiElement getInsSseCacheCtrl() {
        return findChildByType(NASMTypes.INS_SSE_CACHE_CTRL);
    }

    @Override
    @Nullable
    public PsiElement getInsSseComparison() {
        return findChildByType(NASMTypes.INS_SSE_COMPARISON);
    }

    @Override
    @Nullable
    public PsiElement getInsSseConversion() {
        return findChildByType(NASMTypes.INS_SSE_CONVERSION);
    }

    @Override
    @Nullable
    public PsiElement getInsSseDataTrans() {
        return findChildByType(NASMTypes.INS_SSE_DATA_TRANS);
    }

    @Override
    @Nullable
    public PsiElement getInsSseLogical() {
        return findChildByType(NASMTypes.INS_SSE_LOGICAL);
    }

    @Override
    @Nullable
    public PsiElement getInsSseOther() {
        return findChildByType(NASMTypes.INS_SSE_OTHER);
    }

    @Override
    @Nullable
    public PsiElement getInsSsePrefetch() {
        return findChildByType(NASMTypes.INS_SSE_PREFETCH);
    }

    @Override
    @Nullable
    public PsiElement getInsSseSimdInt() {
        return findChildByType(NASMTypes.INS_SSE_SIMD_INT);
    }

    @Override
    @Nullable
    public PsiElement getInsSseState() {
        return findChildByType(NASMTypes.INS_SSE_STATE);
    }

}
