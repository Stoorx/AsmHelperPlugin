// This is a generated file. Not intended for manual editing.
package gen.AsmHelperPlugin.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import gen.AsmHelperPlugin.psi.NASMSse2Op;
import gen.AsmHelperPlugin.psi.NASMVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static gen.AsmHelperPlugin.psi.NASMTypes.*;

public class NASMSse2OpImpl extends ASTWrapperPsiElement implements NASMSse2Op {

    public NASMSse2OpImpl(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull NASMVisitor visitor) {
        visitor.visitSse2Op(this);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof NASMVisitor) accept((NASMVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public PsiElement getInsSse2Arith() {
        return findChildByType(INS_SSE2_ARITH);
    }

    @Override
    @Nullable
    public PsiElement getInsSse2CacheCtrl() {
        return findChildByType(INS_SSE2_CACHE_CTRL);
    }

    @Override
    @Nullable
    public PsiElement getInsSse2Comparison() {
        return findChildByType(INS_SSE2_COMPARISON);
    }

    @Override
    @Nullable
    public PsiElement getInsSse2Conversion() {
        return findChildByType(INS_SSE2_CONVERSION);
    }

    @Override
    @Nullable
    public PsiElement getInsSse2DataTrans() {
        return findChildByType(INS_SSE2_DATA_TRANS);
    }

    @Override
    @Nullable
    public PsiElement getInsSse2Logical() {
        return findChildByType(INS_SSE2_LOGICAL);
    }

    @Override
    @Nullable
    public PsiElement getInsSse2Other() {
        return findChildByType(INS_SSE2_OTHER);
    }

    @Override
    @Nullable
    public PsiElement getInsSse2SimdInt() {
        return findChildByType(INS_SSE2_SIMD_INT);
    }

}
