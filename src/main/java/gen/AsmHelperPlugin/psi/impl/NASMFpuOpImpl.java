// This is a generated file. Not intended for manual editing.
package gen.AsmHelperPlugin.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import gen.AsmHelperPlugin.psi.NASMFpuOp;
import gen.AsmHelperPlugin.psi.NASMVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static gen.AsmHelperPlugin.psi.NASMTypes.*;

public class NASMFpuOpImpl extends ASTWrapperPsiElement implements NASMFpuOp {

    public NASMFpuOpImpl(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull NASMVisitor visitor) {
        visitor.visitFpuOp(this);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof NASMVisitor) accept((NASMVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public PsiElement getInsFpuBasicArith() {
        return findChildByType(INS_FPU_BASIC_ARITH);
    }

    @Override
    @Nullable
    public PsiElement getInsFpuComparison() {
        return findChildByType(INS_FPU_COMPARISON);
    }

    @Override
    @Nullable
    public PsiElement getInsFpuControl() {
        return findChildByType(INS_FPU_CONTROL);
    }

    @Override
    @Nullable
    public PsiElement getInsFpuDataTrans() {
        return findChildByType(INS_FPU_DATA_TRANS);
    }

    @Override
    @Nullable
    public PsiElement getInsFpuLoad() {
        return findChildByType(INS_FPU_LOAD);
    }

    @Override
    @Nullable
    public PsiElement getInsFpuState() {
        return findChildByType(INS_FPU_STATE);
    }

    @Override
    @Nullable
    public PsiElement getInsFpuTranscend() {
        return findChildByType(INS_FPU_TRANSCEND);
    }

}
