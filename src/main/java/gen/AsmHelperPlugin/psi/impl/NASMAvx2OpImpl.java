// This is a generated file. Not intended for manual editing.
package gen.AsmHelperPlugin.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import gen.AsmHelperPlugin.psi.NASMAvx2Op;
import gen.AsmHelperPlugin.psi.NASMVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static gen.AsmHelperPlugin.psi.NASMTypes.*;

public class NASMAvx2OpImpl extends ASTWrapperPsiElement implements NASMAvx2Op {

    public NASMAvx2OpImpl(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull NASMVisitor visitor) {
        visitor.visitAvx2Op(this);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof NASMVisitor) accept((NASMVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public PsiElement getInsAvx2Blend() {
        return findChildByType(INS_AVX2_BLEND);
    }

    @Override
    @Nullable
    public PsiElement getInsAvx2Broadcast() {
        return findChildByType(INS_AVX2_BROADCAST);
    }

    @Override
    @Nullable
    public PsiElement getInsAvx2Gather() {
        return findChildByType(INS_AVX2_GATHER);
    }

    @Override
    @Nullable
    public PsiElement getInsAvx2Simd() {
        return findChildByType(INS_AVX2_SIMD);
    }

}
