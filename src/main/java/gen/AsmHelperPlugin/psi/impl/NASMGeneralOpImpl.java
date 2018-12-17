// This is a generated file. Not intended for manual editing.
package gen.AsmHelperPlugin.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import gen.AsmHelperPlugin.psi.NASMGeneralOp;
import gen.AsmHelperPlugin.psi.NASMVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static gen.AsmHelperPlugin.psi.NASMTypes.*;

public class NASMGeneralOpImpl extends ASTWrapperPsiElement implements NASMGeneralOp {

    public NASMGeneralOpImpl(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull NASMVisitor visitor) {
        visitor.visitGeneralOp(this);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof NASMVisitor) accept((NASMVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public PsiElement getInsBinaryArith() {
        return findChildByType(INS_BINARY_ARITH);
    }

    @Override
    @Nullable
    public PsiElement getInsBinaryLogical() {
        return findChildByType(INS_BINARY_LOGICAL);
    }

    @Override
    @Nullable
    public PsiElement getInsBinaryOther() {
        return findChildByType(INS_BINARY_OTHER);
    }

    @Override
    @Nullable
    public PsiElement getInsBinaryRotate() {
        return findChildByType(INS_BINARY_ROTATE);
    }

    @Override
    @Nullable
    public PsiElement getInsBinarySet() {
        return findChildByType(INS_BINARY_SET);
    }

    @Override
    @Nullable
    public PsiElement getInsBitManipulation() {
        return findChildByType(INS_BIT_MANIPULATION);
    }

    @Override
    @Nullable
    public PsiElement getInsControlTrans() {
        return findChildByType(INS_CONTROL_TRANS);
    }

    @Override
    @Nullable
    public PsiElement getInsDataTransMov() {
        return findChildByType(INS_DATA_TRANS_MOV);
    }

    @Override
    @Nullable
    public PsiElement getInsDataTransOther() {
        return findChildByType(INS_DATA_TRANS_OTHER);
    }

    @Override
    @Nullable
    public PsiElement getInsDataTransXchg() {
        return findChildByType(INS_DATA_TRANS_XCHG);
    }

    @Override
    @Nullable
    public PsiElement getInsDecimalArith() {
        return findChildByType(INS_DECIMAL_ARITH);
    }

    @Override
    @Nullable
    public PsiElement getInsFlagControl() {
        return findChildByType(INS_FLAG_CONTROL);
    }

    @Override
    @Nullable
    public PsiElement getInsInputOutput() {
        return findChildByType(INS_INPUT_OUTPUT);
    }

    @Override
    @Nullable
    public PsiElement getInsMiscOther() {
        return findChildByType(INS_MISC_OTHER);
    }

    @Override
    @Nullable
    public PsiElement getInsRngRand() {
        return findChildByType(INS_RNG_RAND);
    }

    @Override
    @Nullable
    public PsiElement getInsSegRegs() {
        return findChildByType(INS_SEG_REGS);
    }

    @Override
    @Nullable
    public PsiElement getInsStringData() {
        return findChildByType(INS_STRING_DATA);
    }

}
