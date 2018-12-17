// This is a generated file. Not intended for manual editing.
package gen.AsmHelperPlugin.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import gen.AsmHelperPlugin.psi.NASMSse3Op;
import gen.AsmHelperPlugin.psi.NASMTypes;
import gen.AsmHelperPlugin.psi.NASMVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class NASMSse3OpImpl extends ASTWrapperPsiElement implements NASMSse3Op {

    public NASMSse3OpImpl(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull NASMVisitor visitor) {
        visitor.visitSse3Op(this);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof NASMVisitor) accept((NASMVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public PsiElement getInsSse3Arith() {
        return findChildByType(NASMTypes.INS_SSE3_ARITH);
    }

    @Override
    @Nullable
    public PsiElement getInsSse3General() {
        return findChildByType(NASMTypes.INS_SSE3_GENERAL);
    }

    @Override
    @Nullable
    public PsiElement getInsSse3Other() {
        return findChildByType(NASMTypes.INS_SSE3_OTHER);
    }

}
