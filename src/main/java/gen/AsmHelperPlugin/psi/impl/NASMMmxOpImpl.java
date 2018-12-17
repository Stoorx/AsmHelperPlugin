// This is a generated file. Not intended for manual editing.
package gen.AsmHelperPlugin.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import gen.AsmHelperPlugin.psi.NASMMmxOp;
import gen.AsmHelperPlugin.psi.NASMVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static gen.AsmHelperPlugin.psi.NASMTypes.*;

public class NASMMmxOpImpl extends ASTWrapperPsiElement implements NASMMmxOp {

    public NASMMmxOpImpl(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull NASMVisitor visitor) {
        visitor.visitMmxOp(this);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof NASMVisitor) accept((NASMVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public PsiElement getInsMmxArith() {
        return findChildByType(INS_MMX_ARITH);
    }

    @Override
    @Nullable
    public PsiElement getInsMmxComparison() {
        return findChildByType(INS_MMX_COMPARISON);
    }

    @Override
    @Nullable
    public PsiElement getInsMmxConversion() {
        return findChildByType(INS_MMX_CONVERSION);
    }

    @Override
    @Nullable
    public PsiElement getInsMmxDataTrans() {
        return findChildByType(INS_MMX_DATA_TRANS);
    }

    @Override
    @Nullable
    public PsiElement getInsMmxLogical() {
        return findChildByType(INS_MMX_LOGICAL);
    }

    @Override
    @Nullable
    public PsiElement getInsMmxRotate() {
        return findChildByType(INS_MMX_ROTATE);
    }

    @Override
    @Nullable
    public PsiElement getInsMmxState() {
        return findChildByType(INS_MMX_STATE);
    }

}
