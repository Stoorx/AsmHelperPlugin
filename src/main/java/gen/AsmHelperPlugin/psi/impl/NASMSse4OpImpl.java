// This is a generated file. Not intended for manual editing.
package gen.AsmHelperPlugin.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import gen.AsmHelperPlugin.psi.NASMSse4Op;
import gen.AsmHelperPlugin.psi.NASMVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static gen.AsmHelperPlugin.psi.NASMTypes.*;

public class NASMSse4OpImpl extends ASTWrapperPsiElement implements NASMSse4Op {

    public NASMSse4OpImpl(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull NASMVisitor visitor) {
        visitor.visitSse4Op(this);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof NASMVisitor) accept((NASMVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public PsiElement getInsSse4Arith() {
        return findChildByType(INS_SSE4_ARITH);
    }

    @Override
    @Nullable
    public PsiElement getInsSse4Blend() {
        return findChildByType(INS_SSE4_BLEND);
    }

    @Override
    @Nullable
    public PsiElement getInsSse4Conversion() {
        return findChildByType(INS_SSE4_CONVERSION);
    }

    @Override
    @Nullable
    public PsiElement getInsSse4DataTrans() {
        return findChildByType(INS_SSE4_DATA_TRANS);
    }

    @Override
    @Nullable
    public PsiElement getInsSse4InsExt() {
        return findChildByType(INS_SSE4_INS_EXT);
    }

    @Override
    @Nullable
    public PsiElement getInsSse4Other() {
        return findChildByType(INS_SSE4_OTHER);
    }

    @Override
    @Nullable
    public PsiElement getInsSse4PackedFp() {
        return findChildByType(INS_SSE4_PACKED_FP);
    }

    @Override
    @Nullable
    public PsiElement getInsSse4PackedInt() {
        return findChildByType(INS_SSE4_PACKED_INT);
    }

}
